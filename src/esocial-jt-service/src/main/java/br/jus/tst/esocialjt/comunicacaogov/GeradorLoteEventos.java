package br.jus.tst.esocialjt.comunicacaogov;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Component;
import org.springframework.xml.transform.StringResult;

import br.jus.esocialjt.comunicacao.wsdl.EnviarLoteEventos;
import br.jus.esocialjt.comunicacao.wsdl.EnviarLoteEventos.LoteEventos;

@Component
public class GeradorLoteEventos {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GeradorLoteEventos.class);
	
	public String gerarLoteEventos(String lote, Marshaller marshaller) {
		lote = lote.replaceFirst("(<\\?.*?\\?>)", "");
		String pacote = "";
		
		LoteEventos loteEventos = new LoteEventos();
		EnviarLoteEventos enviarLoteEventos = new EnviarLoteEventos();
		enviarLoteEventos.setLoteEventos(loteEventos);
		
		JAXBElement<String> replace = new JAXBElement<>(new QName("REPLACE"), String.class, "");
		loteEventos.setAny(replace);
		
		String envelope = marshal(marshaller, enviarLoteEventos);
		pacote = envelope.replaceFirst("(<REPLACE.*?REPLACE>)", lote);
		return pacote;
	}


	private String marshal(Marshaller marshaller, EnviarLoteEventos enviarLoteEventos) {
		StreamResult result = new StringResult();
		try {
			marshaller.marshal(enviarLoteEventos, result);
		} catch (XmlMappingException | IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return result.toString();
	}
}
