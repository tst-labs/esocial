package br.jus.tst.esocialjt.comunicacaogov;

import javax.net.ssl.SSLSession;

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
	TipoAmbiente ambiente;
	
	@Bean
	public ComunicacaoServico criarComunicacaoServico(Jaxb2Marshaller marshaller) {
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
				br.jus.tst.esocialjt.comunicacao.wsdl.EnviarLoteEventos.class.getPackage().getName(),
				br.jus.tst.esocialjt.comunicacao.lote.eventos.consulta.ESocial.class.getPackage().getName()
			);
		return marshaller;
	}
	
	private WebServiceMessageSender getHttpsMessageSender() {
		HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
		messageSender.setKeyManagers(certificado.getKeyManagers());
		messageSender.setTrustManagers(certificado.getTrustManagers());
		messageSender.setHostnameVerifier((String hostname, SSLSession session) -> true);
		return messageSender;
	}
}
