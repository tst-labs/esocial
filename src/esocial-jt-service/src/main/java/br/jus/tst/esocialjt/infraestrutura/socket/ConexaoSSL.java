package br.jus.tst.esocialjt.infraestrutura.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import org.apache.commons.httpclient.protocol.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.certificado.Certificado;

@Component
public class ConexaoSSL {

	private static final String HTTPS = "https";
	private static final Logger LOGGER = LoggerFactory.getLogger(ConexaoSSL.class);
	private static final int SSL_PORT = 443;
	
	public void configurarSslUtilizandoCertificado(Certificado certificado, ProxyParams proxyParams) {
		
		try (InputStream in = new FileInputStream(new File(certificado.getPathArquivoCertificado()))) {
			KeyStore ks = KeyStore.getInstance("pkcs12");

			ks.load(in, certificado.getSenhaCertificado());
			String alias = ks.aliases().nextElement();
			ks.isKeyEntry(alias);

			X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);
			PrivateKey privateKey = (PrivateKey) ks.getKey(alias, certificado.getSenhaCertificado());
			SocketFactoryDinamico socketFactoryDinamico = new SocketFactoryDinamico(certificate, privateKey, proxyParams);
			socketFactoryDinamico.setFileCacerts(certificado.getPathArquivoCacerts());
			socketFactoryDinamico.setCacertsKey(certificado.getSenhaCacerts());

			Protocol protocol = new Protocol(HTTPS, socketFactoryDinamico, SSL_PORT);
			Protocol.registerProtocol(HTTPS, protocol);

		} catch (CertificateException | KeyStoreException | UnrecoverableKeyException | NoSuchAlgorithmException
				| IOException ex) {
			LOGGER.error(ex.getMessage(), ex);
		}
	}
}
