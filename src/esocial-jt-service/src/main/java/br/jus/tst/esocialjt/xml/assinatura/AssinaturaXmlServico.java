package br.jus.tst.esocialjt.xml.assinatura;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.xml.security.Init;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.ElementProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.jus.tst.esocialjt.certificado.Certificado;
import br.jus.tst.esocialjt.xml.XMLDocumentBuilderFactory;

@Service
public class AssinaturaXmlServico {

	@Autowired
	private Certificado certificado;

	private static final Logger LOGGER = LoggerFactory.getLogger(AssinaturaXmlServico.class);

	private final String signatureMethod = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
	private final String[] transformList = { 
			"http://www.w3.org/2000/09/xmldsig#enveloped-signature",
			"http://www.w3.org/TR/2001/REC-xml-c14n-20010315" };
	private final String digestMethod = "http://www.w3.org/2001/04/xmlenc#sha256";

	public String assinar(String xml) {
		String signedXML = null;
		try {
			Init.init();
			ElementProxy.setDefaultPrefix(Constants.SignatureSpecNS, "");

			final Document doc = getDocumentBuilder().parse(new InputSource(new StringReader(xml)));

			XMLSignature sig = new XMLSignature(doc, null, signatureMethod);
			doc.getDocumentElement().appendChild(sig.getElement());

			final Transforms transforms = criarTransformacoes(transformList, doc);
			sig.addDocument("", transforms, digestMethod);

			sig.addKeyInfo(certificado.getX509Certificate());
			sig.sign(certificado.getPrivateKey());

			signedXML = getDocString(doc);
		} catch (XMLSecurityException | SAXException | IOException | ParserConfigurationException
				| TransformerFactoryConfigurationError | TransformerException ex) {
			LOGGER.error("Erro ao assinar", ex);
		}
		return signedXML;
	}

	private Transforms criarTransformacoes(String[] transformList, final Document doc) throws TransformationException {
		final Transforms transforms = new Transforms(doc);
		for (String transformUri : transformList) {
			transforms.addTransform(transformUri);
		}
		return transforms;
	}

	private String getDocString(Document doc)
			throws TransformerFactoryConfigurationError, TransformerException, UnsupportedEncodingException {

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer trans = tf.newTransformer();
		trans.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		trans.transform(new DOMSource(doc), new StreamResult(os));

		return os.toString("UTF-8");
	}

	private DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
		return new XMLDocumentBuilderFactory().getDocumentBuilder();
	}
}
