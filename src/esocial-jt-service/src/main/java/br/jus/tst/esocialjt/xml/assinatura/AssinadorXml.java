package br.jus.tst.esocialjt.xml.assinatura;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.infraestrutura.Http;

@Component
public class AssinadorXml {

	private static final Logger LOGGER = LoggerFactory.getLogger(AssinadorXml.class);

	@Value("${esocialjt.urlServicoAssinatura:}")
	String urlServicoAssinatura;
	
	@Autowired
	AssinaturaXmlServico servico;

	public String assinar(String xml) {
		String signedXML = null;

		if (isNotBlank(urlServicoAssinatura)) {
			signedXML = assinarRemoto(xml, signedXML);
		} else {
			signedXML = assinarLocal(xml);
		}
		
		return signedXML;
	}
	
	private String assinarRemoto(String xml, String signedXML) {
		try {
			signedXML = new Http().post(urlServicoAssinatura, xml);
		} catch (IOException ex) {
			LOGGER.error("Erro ao assinar em " + urlServicoAssinatura, ex);
		}
		return signedXML;
	}

	private String assinarLocal(String xml) {
		return servico.assinar(xml);
	}
}
