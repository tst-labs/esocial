package br.jus.tst.esocialjt.xml;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.jus.tst.esocialjt.certificado.Certificado;

@Component
public class AssinadorXml {

	private static final Logger LOGGER = LoggerFactory.getLogger(AssinadorXml.class);

	@Autowired
	Certificado certificado;

	public String assinar(String xml) {

		LOGGER.debug("Assinando XMLs");

		String docString = null;

		try (FileInputStream keyStoreStream = new FileInputStream(new File(certificado.getPathArquivoCertificado()))) {
			Document doc = assinar(xml, certificado.getSenhaCertificado(), keyStoreStream);
			docString = getDocString(doc);
		} catch (ParserConfigurationException | NoSuchAlgorithmException | InvalidAlgorithmParameterException
				| KeyStoreException | IOException | CertificateException | UnrecoverableEntryException | SAXException
				| TransformerException ex) {
			LOGGER.error("Erro ao assinar", ex);
		}

		return docString;
	}

	private Document assinar(String xml, char[] senha, FileInputStream keyStoreStream)
			throws ParserConfigurationException, SAXException, IOException, NoSuchAlgorithmException,
			InvalidAlgorithmParameterException, KeyStoreException, CertificateException, UnrecoverableEntryException {

		DocumentBuilder builder = getDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(xml)));
		XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
		ArrayList<Transform> transformList = getTransformList(fac);

		KeyStore ks = KeyStore.getInstance("pkcs12");
		ks.load(keyStoreStream, senha);

		String alias = ks.aliases().nextElement();
		KeyStore.PrivateKeyEntry keyEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias,
				new KeyStore.PasswordProtection(senha));
		X509Certificate cert = (X509Certificate) keyEntry.getCertificate();

		List<Serializable> x509Content = new ArrayList<>();
		x509Content.add(cert);
		KeyInfoFactory kif = fac.getKeyInfoFactory();
		X509Data xd = kif.newX509Data(x509Content);
		KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));

		assinarTag(fac, transformList, keyEntry.getPrivateKey(), ki, doc, 0);
		return doc;
	}

	private ArrayList<Transform> getTransformList(XMLSignatureFactory fac)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
		ArrayList<Transform> transformList = new ArrayList<>();
		TransformParameterSpec tps = null;
		Transform envelopedTransform = fac.newTransform(Transform.ENVELOPED, tps);
		Transform c14NTransform = fac.newTransform("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", tps);

		transformList.add(envelopedTransform);
		transformList.add(c14NTransform);
		return transformList;
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

	private void assinarTag(XMLSignatureFactory fac, ArrayList<Transform> transformList, PrivateKey privateKey,
			KeyInfo ki, Document doc, int i) {
		new AssinadorTagXml().assinarTag(fac, transformList, privateKey, ki, doc, i);
	}
}
