package com.codeborne.security.mobileid;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CheckCertificateTest {

  private static final String TEST_DIGIDOC_SERVICE_URL = "https://tsp.demo.sk.ee/";
  private MobileIDAuthenticator digiDocService = new MobileIDAuthenticator(TEST_DIGIDOC_SERVICE_URL);

  @Before
  public void setUp() {
    System.setProperty("javax.net.ssl.trustStore", "test/keystore.jks");
  }

  @Ignore
  @Test
  public void testCheckCertificate() {
    String certificate = "-----BEGIN CERTIFICATE-----\n*removed*\n-----END CERTIFICATE-----";

    MobileIDSession session = digiDocService.checkCertificate(certificate);

    assertThat(session.firstName, is("Chuck"));
    assertThat(session.lastName, is("Norris"));
    assertThat(session.personalCode, is("38105060708"));
  }
}
