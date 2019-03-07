package br.jus.tst.esocialjt.xml.assinatura;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import br.jus.tst.esocialjt.AssinadorXmlMock;

public class AssinadorXmlTest {

	private AssinadorXml assinadorXml;
	
	private String xml = "<eSocial>Some content</eSocial>";
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(8189); 
	
	@Before
	public void init() {
		String xmlAssinado = new AssinadorXmlMock().assinar(xml);

		assinadorXml = new AssinadorXml();
		AssinaturaXmlServico mock = mock(AssinaturaXmlServico.class);
		assinadorXml.servico = mock;
		when(mock.assinar(xml)).thenReturn(xmlAssinado + "Local");
		
		stubFor(any(urlEqualTo("/assinar"))
				.willReturn(aResponse().withStatus(200)
						.withHeader("Content-Type", "text/xml")
						.withBody(xmlAssinado + "Remoto")));
	}
	
	@Test
	public void deveAssinarRemotoSeHaUrlServicoAssinatura() {
		assinadorXml.urlServicoAssinatura = "http://localhost:8189/assinar";
		String xmlAssinado = assinadorXml.assinar(xml);
		assertThat(xmlAssinado).contains("Signature").contains("Remoto");
	}
	
	@Test
	public void deveAssinarLocalmenteSeNaoHaUrlServicoAssinatura() {
		assinadorXml.urlServicoAssinatura = null;
		String xmlAssinado = assinadorXml.assinar(xml);
		assertThat(xmlAssinado).contains("Signature").contains("Local");
	}
	
}
