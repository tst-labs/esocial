package br.jus.tst.esocialjt.xml;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XmlToolsTest {

	@Test
	public void deveTransformarXmlemString() {

		Element node = null;
		try {
			node = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new ByteArrayInputStream("<inicio>RESPOSTA TESTE</inicio>".getBytes())).getDocumentElement();
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}

		String retorno = XmlTools.asString(node);
		
		assertThat(retorno).isEqualTo("<inicio>RESPOSTA TESTE</inicio>");
	}

}
