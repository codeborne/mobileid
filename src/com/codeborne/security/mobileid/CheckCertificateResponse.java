package com.codeborne.security.mobileid;

import java.io.Serializable;

public class CheckCertificateResponse implements Serializable {
    public final String firstName;
    public final String lastName;
    public final String personalCode;

    public CheckCertificateResponse(String firstName, String lastName, String personalCode) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.personalCode = personalCode;
    }

    public String getFullName() {
      return firstName + "\u00A0" + lastName;
    }

    @Override
    public String toString() {
      return firstName + ":::" + lastName + ":::" + personalCode;
    }

    public static CheckCertificateResponse fromString(String serializedMobileIDSession) {
      String[] tokens = serializedMobileIDSession.split(":::");
      return new CheckCertificateResponse(tokens[0], tokens[1], tokens[2]);
    }
  }
