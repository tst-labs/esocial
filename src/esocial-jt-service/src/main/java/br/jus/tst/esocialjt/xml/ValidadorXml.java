package br.jus.tst.esocialjt.xml;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import br.jus.tst.esocialjt.negocio.exception.ValidacaoXMLException;;

@Component
public class ValidadorXml {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ValidadorXml.class);

	public void validar(String xml, String schemaFile) throws ValidacaoXMLException {
		
		LOGGER.debug("Validando XMLs junto ao esquema");
		
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(classLoader.getResource(schemaFile));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new StringReader(xml)));
			
		} catch (SAXException e) {
			String descricao = "O XML é inválido em relação ao esquema";
			throw new ValidacaoXMLException(descricao + " - " + e.getMessage(), e);
			
		} catch (IOException e) {
			String descricao = "Erro ao ler texto do XML";
			throw new ValidacaoXMLException(descricao + " - " + e.getMessage(), e);
		}
	}
}
