package br.jus.tst.esocialjt.xml;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlToObjectTest {

	@Autowired
	GeradorXmlToObject geradorXmlToObject;

	private final static String XML_RETORNO = "<eSocial xmlns=\"http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
			+ "<retornoEnvioLoteEventos>\n" + "<ideEmpregador>\n" + "<tpInsc>1</tpInsc>\n"
			+ "<nrInsc>00509968000148</nrInsc>\n" + "</ideEmpregador>\n" + "<ideTransmissor>\n" + "<tpInsc>1</tpInsc>\n"
			+ "<nrInsc>00509968000148</nrInsc>\n" + "</ideTransmissor>\n" + "<status>\n"
			+ "<cdResposta>201</cdResposta>\n" + "<descResposta>Lote Recebido com Sucesso.</descResposta>\n"
			+ "</status>\n" + "<dadosRecepcaoLote>\n" + "<dhRecepcao>2017-10-27T12:04:03.8423764-02:00</dhRecepcao>\n"
			+ "<versaoAplicativoRecepcao>0.1.0-A0214</versaoAplicativoRecepcao>\n"
			+ "<protocoloEnvio>1.2.201710.0000000000000184022</protocoloEnvio>\n" + "</dadosRecepcaoLote>\n"
			+ "</retornoEnvioLoteEventos>\n" + "</eSocial>";

	@Test
	public void deveConverterUmXMLEmObjeto() {
		final br.jus.esocialjt.comunicacao.retorno.envio.ESocial retorno = geradorXmlToObject
				.convertXMLToObject(br.jus.esocialjt.comunicacao.retorno.envio.ESocial.class, XML_RETORNO);

		assertThat(retorno).isNotNull();
		assertThat(retorno.getRetornoEnvioLoteEventos()).isNotNull();
		assertThat(retorno.getRetornoEnvioLoteEventos().getIdeEmpregador().getNrInsc()).isEqualTo("00509968000148");
		assertThat(retorno.getRetornoEnvioLoteEventos().getIdeEmpregador().getTpInsc()).isEqualTo(1);
		assertThat(retorno.getRetornoEnvioLoteEventos().getStatus().getCdResposta()).isEqualTo(201);
	}

}
