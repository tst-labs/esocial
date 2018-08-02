package br.jus.tst.esocialjt.xml;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AssinadorTagXml {

	private static final Logger LOGGER = LoggerFactory.getLogger(AssinadorTagXml.class);

	public void assinarTag(XMLSignatureFactory fac, ArrayList<Transform> transformList, PrivateKey privateKey,
			KeyInfo ki, Document doc, int i) {

		NodeList elements = doc.getLastChild().getChildNodes();
		Element el = (Element) elements.item(i);
		el.setIdAttribute("Id", true);

		Reference ref;
		SignedInfo si;
		try {

			ref = fac.newReference("", fac.newDigestMethod("http://www.w3.org/2001/04/xmlenc#sha256", null),
					transformList, null, null);
			si = fac.newSignedInfo(
					fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null),
					fac.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", null),
					Collections.singletonList(ref));

			XMLSignature signature = fac.newXMLSignature(si, ki);

			DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());
			signature.sign(dsc);

		} catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException | MarshalException
				| XMLSignatureException ex) {
			LOGGER.error("Erro ao assinar", ex);
		}
	}
}
