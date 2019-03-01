package br.jus.tst.esocialjt.comunicacaogov;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.certificado.Certificado;

@Configuration
public class ComunicacaoConfig {
	
	@Autowired
	Certificado certificado;
	
	@Value("${esocialjt.ambiente}")
	private TipoAmbiente ambiente;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ComunicacaoConfig.class);
	
	@Bean
	public ComunicacaoServico consultarLoteCliente(Jaxb2Marshaller marshaller) {
		ComunicacaoServico servico = new ComunicacaoServico();
		servico.setMarshaller(marshaller);
		servico.setUnmarshaller(marshaller);
		
		if(certificado.existeConfiguracaoCertificado()) {
			servico.setMessageSender(getHttpsMessageSender());
		}
		
		servico.setActionEnviarLoteGov(ComunicacaoParametros.ENVIAR_ACTION);
		servico.setActionConsultaLoteGov(ComunicacaoParametros.CONSULTAR_ACTION);
		if(ambiente == TipoAmbiente.PRODUCAO_RESTRITA) {
			servico.setUrlEnviarLoteGov(ComunicacaoParametros.URL_ENVIAR_LOTE_EVENTOS_PRODUCAO_RESTRITA);
			servico.setUrlConsultaLoteGov(ComunicacaoParametros.URL_CONSULTAR_LOTE_EVENTOS_PRODUCAO_RESTRITA);
		}
		
		if(ambiente == TipoAmbiente.PRODUCAO) {
			servico.setUrlEnviarLoteGov(ComunicacaoParametros.URL_ENVIAR_LOTE_EVENTOS_PRODUCAO);
			servico.setUrlConsultaLoteGov(ComunicacaoParametros.URL_CONSULTAR_LOTE_EVENTOS_PRODUCAO);
		}
		
		return servico;
	}
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setCheckForXmlRootElement(false);
		marshaller.setContextPaths(
				br.jus.esocialjt.comunicacao.wsdl.EnviarLoteEventos.class.getPackage().getName(),
				br.jus.esocialjt.comunicacao.lote.eventos.consulta.ESocial.class.getPackage().getName()
			);
		return marshaller;
	}
	
	private WebServiceMessageSender getHttpsMessageSender() {
		HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
		try {
			KeyStore ks = loadKeyStore();
			KeyManagerFactory keyManagerFactory = KeyManagerFactory
					.getInstance(KeyManagerFactory.getDefaultAlgorithm());
			keyManagerFactory.init(ks, certificado.getSenhaCertificado());

			messageSender.setKeyManagers(keyManagerFactory.getKeyManagers());
			messageSender.setTrustManagers(createTrustManagers());
			messageSender.setHostnameVerifier((String hostname, SSLSession session) -> true);
		} catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException
				| UnrecoverableKeyException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return messageSender;
	}

	private TrustManager[] createTrustManagers() throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
		KeyStore trustStore = KeyStore.getInstance("JKS");
		InputStream stream;
		if (StringUtils.isNotBlank(certificado.getPathArquivoCacerts())) {
			stream = new FileInputStream(certificado.getPathArquivoCacerts());
		} else {
			stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("eSocialCacerts");
		}
		trustStore.load(stream, certificado.getSenhaCacerts());
		TrustManagerFactory trustManagerFactory = TrustManagerFactory
				.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(trustStore);
		return trustManagerFactory.getTrustManagers();
	}

	private KeyStore loadKeyStore() throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException {
		File fileCertificado = new File(certificado.getPathArquivoCertificado());
		try (FileInputStream keyStoreStream = new FileInputStream(fileCertificado)) {
			KeyStore keyStore = KeyStore.getInstance("pkcs12");
			keyStore.load(keyStoreStream, certificado.getSenhaCertificado());
			return keyStore;
		}
	}
}
