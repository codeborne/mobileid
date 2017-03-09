package com.codeborne.security.mobileid;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class MobileIDSignerTest {

	private static final String TEST_DIGIDOC_SERVICE_URL = "https://tsp.demo.sk.ee/";
	private MobileIDAuthenticator signer = new MobileIDAuthenticator(TEST_DIGIDOC_SERVICE_URL);

	@Before
	public void setUp() {
		System.setProperty("javax.net.ssl.trustStore", "test/keystore.jks");
	}

	@Test
	@Ignore
	public void startSession_createSignedDoc_addDataFile_mobileSign_getStatusInfo_getSignedDoc_closeSession() throws IOException {
		// startSession
		MobileIdSignatureSession session = signer.startSession();
		assertThat(session.sessCode, is(not(0)));

		// createSignedDoc
		session = signer.createSignedDoc(session);
		assertThat(session.signedDocInfo, is(notNullValue()));
		assertThat(session.signedDocInfo.getFormat(), is("BDOC"));
		assertThat(session.signedDocInfo.getVersion(), is("2.1"));

		// addDataFile
		String fileContent = "Test";
		byte[] fileContentBytes = fileContent.getBytes(StandardCharsets.UTF_8);

		session = signer.addDataFile(session, "test.txt", "text/plain", fileContentBytes);

		assertThat(session.signedDocInfo.getDataFileInfo(0), is(notNullValue()));
		assertThat(session.signedDocInfo.getDataFileInfo(0).getFilename(), is("test.txt"));
		assertThat(session.signedDocInfo.getDataFileInfo(0).getMimeType(), is("text/plain"));
		assertThat(session.signedDocInfo.getDataFileInfo(0).getSize(), is(4));
		assertThat(session.signedDocInfo.getDataFileInfo(0).getContentType(), is("EMBEDDED_BASE64"));

		// mobileSign
		session = signer.mobileSign(session, "38112310010", "55555555");

		// getStatusInfo
		String status = signer.getStatusInfo(session);
		assertThat(status, is("SIGNATURE"));

		// getSignedDoc
		session = signer.getSignedDoc(session);
		assertThat(session.signedDocData, is(notNullValue()));

		byte[] bytes = Base64.getDecoder().decode(session.signedDocData.replaceAll("\n", "").getBytes());
		Path path = Paths.get("signedTestFile.bdoc");
		Files.write(path, bytes);

		// closeSession
		signer.closeSession(session);
	}

	@Test
	public void startSign_getSignedFile() throws Exception {
		MobileIdSignatureFile file = new MobileIdSignatureFile("test.txt", "text/plain", "Test".getBytes());
		MobileIdSignatureSession session = signer.startSign(file, "38112310010", "55555555");

		byte[] signedFile = signer.getSignedFile(session);
		assertThat(signedFile, is(notNullValue()));
	}
}
