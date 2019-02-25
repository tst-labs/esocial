package br.jus.tst.esocialjt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.xml.assinatura.AssinadorXml;

@Primary
@Component
public class AssinadorXmlMock extends AssinadorXml {
	
	@Override
	public String assinar(String xml) {
		return xml.replace("</eSocial>", snippetAssinatura() + "</eSocial>");
	}
	
	private String snippetAssinatura() {
		return 
		"<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">" + 
			"<SignedInfo>" + 
				"<CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></CanonicalizationMethod>" +
				"<SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"></SignatureMethod>" +
				"<Reference URI=\"\">" +
					"<Transforms>" +
						"<Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"></Transform>" +
						"<Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></Transform>" +
					"</Transforms>" +
					"<DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"></DigestMethod>" +
					"<DigestValue>uljgDdxiU1LH3bQ0wfrRxee5sS1UMTVvJgiWVzw0QJ4=</DigestValue>" +
				"</Reference>" +
			"</SignedInfo>" +
			"<SignatureValue>uljgDdxiU1LH3bQ0wfrRxee5sS1UMTVvJgiWVzw0QJ4=</SignatureValue>" +
			"<KeyInfo>" +
				"<X509Data>" +
					"<X509Certificate>uljgDdxiU1LH3bQ0wfrRxee5sS1UMTVvJgiWVzw0QJ4=</X509Certificate>" +
				"</X509Data>" +
			"</KeyInfo>" +
		"</Signature>";
	}
}
