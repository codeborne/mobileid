package com.codeborne.security.mobileid;

import com.codeborne.security.AuthenticationException;
import com.codeborne.security.AuthenticationException.Code;
import com.codeborne.security.digidoc.DigiDocServicePortType;
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;
import java.rmi.RemoteException;

import static com.codeborne.security.AuthenticationException.Code.OUTSTANDING_TRANSACTION;
import static com.codeborne.security.AuthenticationException.Code.USER_AUTHENTICATED;
import static java.lang.String.valueOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class MobileIDAuthenticatorTest {
  private MobileIDAuthenticator mid = new MobileIDAuthenticator();

  @Before
  public void setUp() throws RemoteException {
    mid.service = mockAuthentication("OK", "Bruce", "Willis", "38105060708", "4567", 123);
    mid.setLoginMessage("Wanna login?");
  }

  @Test
  public void loginByPhone() throws RemoteException {
    MobileIDSession session = mid.startLogin("+37255667788");
    assertThat(session.firstName, equalTo("Bruce"));
    assertThat(session.lastName, equalTo("Willis"));
    assertThat(session.personalCode, equalTo("38105060708"));
    assertThat(session.sessCode, equalTo(123));
    assertThat(session.challenge, equalTo("4567"));

    verify(mid.service).mobileAuthenticate(eq(null), eq(null), eq("37255667788"), eq("EST"),
        eq("Testimine"), eq("Wanna login?"), anyString(), eq("asynchClientServer"), eq(0), eq(false), eq(false), any(IntHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class));
  }

  @Test
  public void removesPlusFromPhoneNumber() {
    assertThat(mid.normalizePhoneNumber("+37255667788"), equalTo("37255667788"));

    assertThat(mid.normalizePhoneNumber(null), nullValue());
    assertThat(mid.normalizePhoneNumber(""), equalTo(""));
    assertThat(mid.normalizePhoneNumber("37255667788"), equalTo("37255667788"));
    assertThat(mid.normalizePhoneNumber("55667788"), equalTo("55667788"));
  }

  @Test
  public void loginByPersonalCode() throws RemoteException {
    MobileIDSession session = mid.startLogin("38105060708", "EE");
    assertThat(session.firstName, equalTo("Bruce"));
    assertThat(session.lastName, equalTo("Willis"));
    assertThat(session.personalCode, equalTo("38105060708"));
    assertThat(session.sessCode, equalTo(123));
    assertThat(session.challenge, equalTo("4567"));

    verify(mid.service).mobileAuthenticate(eq("38105060708"), eq("EE"), eq(null), eq("EST"),
        eq("Testimine"), eq("Wanna login?"), anyString(), eq("asynchClientServer"), eq(0), eq(false), eq(false), any(IntHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class));
  }

  @Test(expected = AuthenticationException.class)
  public void throwsAuthenticationExceptionInCaseOfError() throws RemoteException, AuthenticationException {
    mid.service = mockError(100, "37255667788");
    mid.startLogin("+37255667788");
  }

  @Test
  public void waitsIfStatusOutstandingTransaction() throws Exception {
    mid.service = mockStatus(OUTSTANDING_TRANSACTION);
    MobileIDSession session = new MobileIDSession(123, "1234", "Bob", "Boboff", "1234567890");
    assertFalse(mid.isLoginComplete(session));

    mid = spy(mid);
    doReturn(true).when(mid).sleep(anyInt());
    try {
      mid.waitForLogin(session);
      fail();
    }
    catch (AuthenticationException e) {
      assertEquals(OUTSTANDING_TRANSACTION, e.getCode());
    }
  }

  @Test
  public void loginCompleteIfStatusUserAuthenticated() throws Exception {
    mid.service = mockStatus(USER_AUTHENTICATED);
    assertTrue(mid.isLoginComplete(new MobileIDSession(123, "1234", "Bob", "Boboff", "1234567890")));
  }

  private DigiDocServicePortType mockStatus(final Code status) throws RemoteException {
    DigiDocServicePortType service = mock(DigiDocServicePortType.class);
    doAnswer((Answer<Object>) invocation -> {
      ((StringHolder)invocation.getArguments()[2]).value = status.toString();
      return null;
    }).when(service).getMobileAuthenticateStatus(anyInt(), eq(false), any(StringHolder.class), any(StringHolder.class));
    return service;
  }

  private DigiDocServicePortType mockAuthentication(String result, String firstName, String lastName,
                                                    String personalCode, String challenge, int sessCode) throws RemoteException {
    DigiDocServicePortType service = mock(DigiDocServicePortType.class);
    Answer<Object> answer = invocation -> {
      ((IntHolder) invocation.getArguments()[11]).value = sessCode;
      ((StringHolder) invocation.getArguments()[12]).value = result;
      ((StringHolder) invocation.getArguments()[13]).value = personalCode;
      ((StringHolder) invocation.getArguments()[14]).value = firstName;
      ((StringHolder) invocation.getArguments()[15]).value = lastName;
      ((StringHolder) invocation.getArguments()[19]).value = challenge;
      return null;
    };
    doAnswer(answer).when(service).mobileAuthenticate(anyString(), anyString(), isNull(), anyString(),
        anyString(), anyString(), anyString(), anyString(), anyInt(), anyBoolean(), anyBoolean(), any(IntHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class));
    doAnswer(answer).when(service).mobileAuthenticate(isNull(), isNull(), anyString(), anyString(),
        anyString(), anyString(), anyString(), anyString(), anyInt(), anyBoolean(), anyBoolean(), any(IntHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class));

    return service;
  }

  private DigiDocServicePortType mockError(int errorCode, String phoneNumber) throws RemoteException {
    DigiDocServicePortType service = mock(DigiDocServicePortType.class);
    doThrow(new RemoteException(valueOf(errorCode)))
    .when(service).mobileAuthenticate(isNull(), isNull(), eq(phoneNumber), anyString(),
        anyString(), anyString(), anyString(), anyString(), anyInt(), anyBoolean(), anyBoolean(), any(IntHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class),
        any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class), any(StringHolder.class));

    return service;
  }
}
