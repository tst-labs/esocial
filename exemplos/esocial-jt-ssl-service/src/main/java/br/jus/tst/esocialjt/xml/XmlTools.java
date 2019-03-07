package br.jus.tst.esocialjt.xml;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public final class XmlTools {

	private XmlTools() {
	}
	
	public static String asString(Node node) {
		StringWriter writer = new StringWriter();
		try {
			Transformer trans = TransformerFactory.newInstance().newTransformer();
			trans.setOutputProperty(OutputKeys.INDENT, "yes");
			trans.setOutputProperty(OutputKeys.VERSION, "1.0");
			if (!(node instanceof Document)) {
				trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			}
			trans.transform(new DOMSource(node), new StreamResult(writer));
		} catch (final TransformerConfigurationException ex) {
			throw new IllegalStateException(ex);
		} catch (final TransformerException ex) {
			throw new IllegalArgumentException(ex);
		}
		return writer.toString().trim();
	}

}
