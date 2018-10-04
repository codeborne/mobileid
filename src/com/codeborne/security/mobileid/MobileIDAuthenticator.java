package com.codeborne.security.mobileid;

import com.codeborne.security.AuthenticationException;
import com.codeborne.security.digidoc.DigiDocServicePortType;
import com.codeborne.security.digidoc.DigiDocService_Service;
import com.codeborne.security.digidoc.DigiDocService_ServiceLocator;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import static com.codeborne.security.AuthenticationException.Code.*;

/**
 * Authenticates with Mobile-ID.<br>
 * Can be used as a preconfigured singleton (eg Spring bean).<br>
 * <p>Use {@link #startLogin} to initiate the login session and display challenge to the user,
 * then {@link #waitForLogin(MobileIDSession)} to wait for the authentication to complete.</p>
 * <p>Various setters can be used to configure the behaviour.</p>
 */
public class MobileIDAuthenticator {
  private String language = "EST";
  private String serviceName = "Testimine";
  private String loginMessage = "";
  private int retryCount = 60;
  private int pollIntervalMs = 3000;
  private final String messagingMode = "asynchClientServer";

  DigiDocServicePortType service;

  public MobileIDAuthenticator() {
  }

  public MobileIDAuthenticator(String digidocServiceURL) {
    setDigidocServiceURL(digidocServiceURL);
  }

  public MobileIDAuthenticator(String digidocServiceURL, String serviceName) {
    setDigidocServiceURL(digidocServiceURL);
    this.serviceName = serviceName;
  }

  public MobileIDAuthenticator(URL digidocServiceURL) {
    setDigidocServiceURL(digidocServiceURL);
  }

  public MobileIDAuthenticator(URL digidocServiceURL, String serviceName) {
    setDigidocServiceURL(digidocServiceURL);
    this.serviceName = serviceName;
  }

  public final MobileIDAuthenticator setDigidocServiceURL(String digidocServiceURL) {
    try {
      return setDigidocServiceURL(new URL(digidocServiceURL));
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  public final MobileIDAuthenticator setDigidocServiceURL(URL digidocServiceURL) {
    DigiDocService_Service digiDocService = new DigiDocService_ServiceLocator();
    try {
      service = digiDocService.getDigiDocService(digidocServiceURL);
    }
    catch (ServiceException e) {
      throw new RuntimeException("Failed to initialize Mobile-ID support", e);
    }
    return this;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public void setLoginMessage(String loginMessage) {
    this.loginMessage = loginMessage;
  }

  public void setRetryCount(int retryCount) {
    this.retryCount = retryCount;
  }

  public void setPollIntervalMs(int pollIntervalMs) {
    this.pollIntervalMs = pollIntervalMs;
  }

  /**
   * Initiates the login session. Note: returned session already contains user's info, but the authenticity is not yet verified.
   *
   * @param personalCode user's personal code
   * @param countryCode  two letter country code, eg EE
   * @throws AuthenticationException is authentication unsuccessful
   * @return MobileIDSession instance containing CHALLENGE ID that should be shown to the user
   */
  public MobileIDSession startLogin(String personalCode, String countryCode) {
    return startLogin(personalCode, countryCode, null);
  }

  /**
   * Initiates the login session. Note: returned session already contains user's info, but the authenticity is not yet verified.
   *
   * @param phone phone number <b>with country code</b> (eg "+37255667788" or "37255667788").
   * @throws AuthenticationException is authentication unsuccessful
   * @return MobileIDSession instance containing CHALLENGE ID that should be shown to the user
   */
  public MobileIDSession startLogin(String phone) {
    return startLogin(null, null, phone);
  }

  protected MobileIDSession startLogin(String personalCode, String countryCode, String phone) {
    if (service == null) {
      throw new IllegalStateException("digidocServiceURL is not initialized");
    }

    IntHolder sessCode = new IntHolder();
    StringHolder result = new StringHolder();
    StringHolder firstName = new StringHolder();
    StringHolder lastName = new StringHolder();
    StringHolder personalCodeHolder = new StringHolder();
    StringHolder challenge = new StringHolder();

    try {
      service.mobileAuthenticate(personalCode, countryCode, normalizePhoneNumber(phone), language, serviceName, loginMessage, generateSPChallenge(),
              messagingMode, 0, false, false, sessCode, result,
              personalCodeHolder, firstName, lastName, new StringHolder(), new StringHolder(), new StringHolder(), challenge,
              new StringHolder(), new StringHolder());
    }
    catch (RemoteException e) {
      throw new AuthenticationException(e);
    }

    if (!"OK".equals(result.value))
      throw new AuthenticationException(valueOf(result.value));

    return new MobileIDSession(sessCode.value, challenge.value, firstName.value, lastName.value, personalCodeHolder.value);
  }

  String normalizePhoneNumber(String phone) {
    return phone != null && phone.startsWith("+") ? phone.substring(1) : phone;
  }

  protected String generateSPChallenge() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 20; i++) sb.append((int) (Math.random() * 10));
    return sb.toString();
  }

  /**
   * Waits until user confirms their identity using the mobile device.
   * <p>This is a blocking version of {@link #isLoginComplete(MobileIDSession)}
   *
   * @param session previously returned by {@link #startLogin}
   * @throws AuthenticationException is authentication unsuccessful
   * @return MobileIDSession instance containing user name and personal code
   */
  public MobileIDSession waitForLogin(MobileIDSession session) {
    int tryCount = 0;
    while (sleep(pollIntervalMs) && !isLoginComplete(session) && tryCount < retryCount) {
        tryCount++;
    }
    if (tryCount >= retryCount)
      throw new AuthenticationException(valueOf(getLoginStatus(session).value));
    return session;
  }

  /**
   * Checks whether login is already complete.
   * <p>This is a non-blocking version of {@link #waitForLogin(MobileIDSession)}
   *
   * @param session previously returned by {@link #startLogin}
   * @return true if login successful
   */
  public boolean isLoginComplete(MobileIDSession session) {
    StringHolder status = getLoginStatus(session);
    if ("OUTSTANDING_TRANSACTION".equals(status.value))
      return false;
    else if ("USER_AUTHENTICATED".equals(status.value))
      return true;
    else
      throw new AuthenticationException(valueOf(status.value));
  }

  private StringHolder getLoginStatus(MobileIDSession session) {
    StringHolder status = new StringHolder("OUTSTANDING_TRANSACTION");
    try {
      service.getMobileAuthenticateStatus(session.sessCode, false, status, new StringHolder());
    }
    catch (RemoteException e) {
      throw new AuthenticationException(e);
    }
    return status;
  }

  boolean sleep(int sleepTimeMilliseconds) {
    try {
      Thread.sleep(sleepTimeMilliseconds);
      return true;
    }
    catch (InterruptedException e) {
      return false;
    }
  }
}
