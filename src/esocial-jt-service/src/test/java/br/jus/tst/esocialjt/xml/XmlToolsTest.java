package br.jus.tst.esocialjt.xml;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XmlToolsTest {

	@Test
	public void deveRetornarTextoEntreTags() {
		String texto = "<inicio>RESPOSTA TESTE</inicio>";

		String retorno = XmlTools.retornaValor("<inicio>", "</inicio>", texto);
		assertEquals("RESPOSTA TESTE", retorno);

	}

	public void deveTransformarXmlemString() {

		Element node = null;
		try {
			node = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new ByteArrayInputStream("<inicio>RESPOSTA TESTE</inicio>".getBytes())).getDocumentElement();
		} catch (SAXException | IOException | ParserConfigurationException e) {
			e.printStackTrace();
		}

		String retorno = XmlTools.asString(node);
		assertEquals("<inicio>RESPOSTA TESTE</inicio>", retorno);

	}

}
