package com.codeborne.security.mobileid.test;

import com.codeborne.security.AuthenticationException;
import com.codeborne.security.mobileid.MobileIDAuthenticator;
import com.codeborne.security.mobileid.MobileIDSession;

import static java.lang.Integer.parseInt;

public class MobileIDAuthenticatorStub extends MobileIDAuthenticator {
  public long loginTimeMs = 1000;
  public String firstName = "Tõnis";
  public String lastName = "Jäägup";
  public String personalCode = "37259180809";

  public MobileIDAuthenticatorStub() {
  }

  public MobileIDAuthenticatorStub(long loginTimeMs, String firstName, String lastName) {
    this.loginTimeMs = loginTimeMs;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  protected MobileIDSession startLogin(String personalCode, String countryCode, String phone) {
    if (phone == null || phone.length() < 5) {
      throw new AuthenticationException(AuthenticationException.Code.INVALID_INPUT, "Invalid PhoneNo", null);
    }
    else if (phone.startsWith("+37255")) {
      throw new AuthenticationException(AuthenticationException.Code.NO_AGREEMENT, "User is not a Mobile-ID client", null);
    }
    return new MobileIDSession(parseInt(phone.replaceFirst("\\+372(.*)", "$1")), "1234", firstName, lastName, personalCode == null ? this.personalCode : personalCode);
  }

  @Override
  public MobileIDSession waitForLogin(MobileIDSession session) {
    String phone = "+372" + session.sessCode;
    if (phone.startsWith("+37256")) {
      throw new AuthenticationException(AuthenticationException.Code.USER_CANCEL);
    }
    try {
      Thread.sleep(loginTimeMs);
    } catch (InterruptedException ignore) {
    }
    return session;
  }
}
