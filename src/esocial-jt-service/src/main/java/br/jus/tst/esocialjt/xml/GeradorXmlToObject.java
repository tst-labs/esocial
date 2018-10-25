package br.jus.tst.esocialjt.xml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GeradorXmlToObject {
	private static final Logger LOGGER = LoggerFactory.getLogger(GeradorXmlToObject.class);

	public GeradorXmlToObject() {
		// Construtor default
	}

	public <T> T convertXMLToObject(Class<T> clazz, String xml) {
		T instance = null;
		try {
			JAXBContext context = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			instance = (clazz.cast(unmarshaller.unmarshal(new StringReader(xml))));
		} catch (JAXBException ex) {
			LOGGER.error(ex.getCause().getMessage(), ex);
		}
		return instance;
	}

}
