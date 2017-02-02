package com.codeborne.security.mobileid;

import com.codeborne.security.digidoc.SignedDocInfo;

public class MobileIdSignatureSession {

	public final int sessCode;

	public final SignedDocInfo signedDocInfo;

	public final String challenge;

	public final String signedDocData;

	public MobileIdSignatureSession(int sessCode) {
		this(sessCode, null);
	}

	public MobileIdSignatureSession(int sessCode, SignedDocInfo signedDocInfo) {
		this(sessCode, signedDocInfo, null);
	}

	public MobileIdSignatureSession(int sessCode, SignedDocInfo signedDocInfo, String challenge) {
		this(sessCode, signedDocInfo, challenge, null);
	}

	public MobileIdSignatureSession(int sessCode, SignedDocInfo signedDocInfo, String challenge, String signedDocData) {
		this.sessCode = sessCode;
		this.signedDocInfo = signedDocInfo;
		this.challenge = challenge;
		this.signedDocData = signedDocData;
	}

	@Override
	public String toString() {
		return "MobileIdSignatureSession{" +
				"sessCode=" + sessCode +
				", signedDocInfo=" + signedDocInfo +
				", challenge='" + challenge + '\'' +
				", signedDocData='" + signedDocData + '\'' +
				'}';
	}
}
