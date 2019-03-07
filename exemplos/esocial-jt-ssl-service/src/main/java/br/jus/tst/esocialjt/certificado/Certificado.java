package br.jus.tst.esocialjt.certificado;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Certificado {

	private String pathArquivoCertificado;
	private String pathArquivoCacerts;
	private char[] senhaCertificado;
	private char[] senhaCacerts;

	private KeyStore keyStore;
	private X509Certificate x509Certificate;
	private Key privateKey;
	private String alias;
	private KeyManager[] keyManagers;
	private TrustManager[] trustManagers;

	private static final Logger LOGGER = LoggerFactory.getLogger(Certificado.class);

	public Certificado(String pathArquivoCertificado, String pathArquivoCacerts, char[] senhaCertificado,
			char[] senhaCacerts) {
		super();
		this.pathArquivoCertificado = pathArquivoCertificado;
		this.pathArquivoCacerts = pathArquivoCacerts;
		this.senhaCertificado = senhaCertificado;
		this.senhaCacerts = senhaCacerts;
	}

	public KeyManager[] getKeyManagers() {
		if (keyManagers == null) {
			try {
				KeyManagerFactory keyManagerFactory = KeyManagerFactory
						.getInstance(KeyManagerFactory.getDefaultAlgorithm());
				keyManagerFactory.init(getKeyStore(), getSenhaCertificado());
				keyManagers = keyManagerFactory.getKeyManagers();
			} catch (NoSuchAlgorithmException | UnrecoverableKeyException | KeyStoreException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return keyManagers;
	}

	public TrustManager[] getTrustManagers() {
		if (trustManagers == null) {
			try {
				KeyStore trustStore = KeyStore.getInstance("JKS");
				InputStream stream;
				if (StringUtils.isNotBlank(getPathArquivoCacerts())) {
					stream = new FileInputStream(getPathArquivoCacerts());
				} else {
					stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("eSocialCacerts");
				}
				trustStore.load(stream, getSenhaCacerts());
				TrustManagerFactory trustManagerFactory = TrustManagerFactory
						.getInstance(TrustManagerFactory.getDefaultAlgorithm());
				trustManagerFactory.init(trustStore);
				trustManagers = trustManagerFactory.getTrustManagers();
			} catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return trustManagers;
	}

	public Key getPrivateKey() {
		if (privateKey == null) {
			try {
				privateKey = getKeyStore().getKey(getAlias(), getSenhaCertificado());
			} catch (UnrecoverableKeyException | KeyStoreException | NoSuchAlgorithmException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return privateKey;
	}

	public X509Certificate getX509Certificate() {
		if (x509Certificate == null) {
			try {
				x509Certificate = (X509Certificate) getKeyStore().getCertificate(getAlias());
			} catch (KeyStoreException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return x509Certificate;
	}

	private String getAlias() {
		if (alias == null) {
			try {
				alias = getKeyStore().aliases().nextElement();
			} catch (KeyStoreException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return alias;
	}

	public boolean existeConfiguracaoCertificado() {
		return StringUtils.isNotBlank(pathArquivoCertificado);
	}

	private KeyStore getKeyStore() {
		if (keyStore == null) {
			File fileCertificado = new File(getPathArquivoCertificado());
			try (FileInputStream keyStoreStream = new FileInputStream(fileCertificado)) {
				keyStore = KeyStore.getInstance("pkcs12");
				keyStore.load(keyStoreStream, getSenhaCertificado());
			} catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return keyStore;
	}

	private String getPathArquivoCertificado() {
		return pathArquivoCertificado;
	}

	private String getPathArquivoCacerts() {
		return pathArquivoCacerts;
	}

	private char[] getSenhaCertificado() {
		return senhaCertificado;
	}

	private char[] getSenhaCacerts() {
		return senhaCacerts;
	}
}
