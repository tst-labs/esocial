package br.jus.tst.esocialjt.comunicacaogov;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.jus.esocialjt.comunicacao.lote.eventos.retorno.processamento.ESocial;
import br.jus.esocialjt.comunicacao.lote.eventos.retorno.processamento.ESocial.RetornoProcessamentoLoteEventos.RetornoEventos;
import br.jus.esocialjt.comunicacao.lote.eventos.retorno.processamento.ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento;
import br.jus.tst.esocialjt.xml.GeradorXmlToObject;

public class RetornoProcessamentoUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(RetornoProcessamento.class);

	public List<Element> obterElementosDeEventos(String xmlRetorno) {
		List<Element> elementos = new ArrayList<>();
		
		GeradorXmlToObject geradorXmlToObject = new GeradorXmlToObject();
		ESocial eSocial = geradorXmlToObject.convertXMLToObject(ESocial.class, xmlRetorno);	

		RetornoEventos retornoEventos = eSocial.getRetornoProcessamentoLoteEventos().getRetornoEventos();
		if (retornoEventos != null) {
			for (Evento evt : retornoEventos.getEvento()) {
				Element elemento = evt.getRetornoEvento().getAny();
				elementos.add(elemento);
			}
		}
		return elementos;
	}

	public List<Element> obterElementosDeEventosTotalizadores(String xmlRetorno) {

		List<Element> elementos = new ArrayList<>();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			
			DocumentBuilder docBuilder = dbFactory.newDocumentBuilder(); 
			Document doc = docBuilder.parse(new InputSource(new StringReader(xmlRetorno))); 
			
			NodeList nodeList = doc.getElementsByTagName("tot");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					elementos.add((Element) node);
				}
			}
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			LOGGER.error(e.getCause().getMessage(), e);
		}
		
		
		return elementos;
	}

}
