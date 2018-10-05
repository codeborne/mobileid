package com.codeborne.security.mobileid.test;

import com.codeborne.security.mobileid.MobileIDSession;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MobileIDAuthenticatorStubTest {
    private MobileIDAuthenticatorStub stub = new MobileIDAuthenticatorStub();

    @Test
    public void emulatesMobileIdSession_withConstantUserData_and_givenPhoneNumber() {
        MobileIDSession mobileIDSession = stub.startLogin(null, null, "+372516273849");

        assertThat(mobileIDSession.sessCode, equalTo(516273849));
        assertThat(mobileIDSession.firstName, equalTo("Tõnis"));
        assertThat(mobileIDSession.lastName, equalTo("Jäägup"));
        assertThat(mobileIDSession.personalCode, equalTo("37259180809"));
    }
}