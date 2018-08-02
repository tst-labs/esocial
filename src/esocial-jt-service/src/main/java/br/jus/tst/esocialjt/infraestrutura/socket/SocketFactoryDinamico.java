package br.jus.tst.esocialjt.infraestrutura.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketFactoryDinamico implements ProtocolSocketFactory {

	private static final Logger LOGGER = LoggerFactory.getLogger(SocketFactoryDinamico.class);
	private SSLContext ssl = null;
	private X509Certificate certificate;
	private PrivateKey privateKey;
	private String fileCacerts;
	private char[] cacertsKey;
	private ProxyParams proxyParams;

	public SocketFactoryDinamico(X509Certificate certificate, PrivateKey privateKey, ProxyParams proxyParams) {
		this.certificate = certificate;
		this.privateKey = privateKey;
		this.proxyParams = proxyParams;
	}

	private SSLContext createSSLContext() {

		SSLContext sslContext = null;

		try {
			KeyManager[] keyManagers = createKeyManagers();
			TrustManager[] trustManagers = createTrustManagers();
			sslContext = SSLContext.getInstance("TLS");
			sslContext.init(keyManagers, trustManagers, null);

		} catch (KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException
				| IOException e) {
			LOGGER.error(e.getMessage(), e);
		}

		return sslContext;
	}

	private SSLContext getSSLContext() {
		if (ssl == null) {
			ssl = createSSLContext();
		}
		return ssl;
	}

	@Override
	public Socket createSocket(String host, int port, InetAddress localAddress, int localPort,
			HttpConnectionParams params) throws IOException {

		if (params == null) {
			throw new IllegalArgumentException("Parameters may not be null");
		}

		Socket socket = null;

		if (proxyParams.usaProxy()) {

			SSLTunnelSocketFactory socketfactoryTunel = new SSLTunnelSocketFactory(proxyParams.getProxyServ(),
					proxyParams.getProxyPort(), getSSLContext());

			try {
				PasswordAuthentication passwordAuthentication = getAuthentication();
				socket = socketfactoryTunel.createSocket(host, port, passwordAuthentication);

			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		} else {
			socket = getSSLContext().getSocketFactory().createSocket(host, port);
			((SSLSocket)socket).startHandshake();
		}

		return socket;
	}

	private PasswordAuthentication getAuthentication() {
		PasswordAuthentication passwordAuthentication = null;
		
		if(StringUtils.isNoneBlank(proxyParams.getProxyUser())){
			String proxyUser = proxyParams.getProxyUser();
			char[] proxyPass = proxyParams.getProxyPass().toCharArray();
			passwordAuthentication = new PasswordAuthentication(proxyUser, proxyPass);
		}
		
		return passwordAuthentication;
	}

	@Override
	public Socket createSocket(String host, int port, InetAddress clientHost, int clientPort) throws IOException {
		return getSSLContext().getSocketFactory().createSocket(host, port, clientHost, clientPort);
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException {
		return getSSLContext().getSocketFactory().createSocket(host, port);
	}

	private KeyManager[] createKeyManagers() {
		HSKeyManager keyManager = new HSKeyManager(certificate, privateKey);
		return new KeyManager[] { keyManager };
	}

	private TrustManager[] createTrustManagers()
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		KeyStore trustStore = KeyStore.getInstance("JKS");
		
		InputStream stream;
		
		if (StringUtils.isBlank(fileCacerts)) {
			stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("eSocialCacerts");
		} else {
			stream = new FileInputStream(fileCacerts);
		}

		trustStore.load(stream, cacertsKey);
		TrustManagerFactory trustManagerFactory = TrustManagerFactory
				.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(trustStore);
		return trustManagerFactory.getTrustManagers();
	}

	public void setFileCacerts(String fileCacerts) {
		this.fileCacerts = fileCacerts;
	}

	public void setCacertsKey(char[] cacertsKey) {
		this.cacertsKey = cacertsKey;
	}
}