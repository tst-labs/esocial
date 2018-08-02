package br.jus.tst.esocialjt.comunicacaogov;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RetornoEnvioTest {

	@Test
	public void deveGerarRespostaAPartirXml() {
		
		String xmlRetorno = LeitorXML.lerRetornoEnvio("sucesso.xml");
		
		RetornoEnvio retorno = new RetornoEnvio(xmlRetorno);
		
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(retorno.getXmlRetorno()).isEqualTo(xmlRetorno);
		soft.assertThat(retorno.getProtocolo()).isEqualTo("1.2.201711.0000000000000037150");
		soft.assertThat(retorno.getCodigoResposta()).isEqualTo(201l);
		soft.assertAll();
	}
}
