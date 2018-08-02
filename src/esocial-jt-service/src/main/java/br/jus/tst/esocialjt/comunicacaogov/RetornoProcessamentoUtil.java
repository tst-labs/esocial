package br.jus.tst.esocialjt.comunicacaogov;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import br.jus.esocialjt.comunicacao.retorno.processamento.ESocial;
import br.jus.esocialjt.comunicacao.retorno.processamento.ESocial.RetornoProcessamentoLoteEventos.RetornoEventos;
import br.jus.esocialjt.comunicacao.retorno.processamento.ESocial.RetornoProcessamentoLoteEventos.RetornoEventos.Evento;
import br.jus.tst.esocialjt.xml.GeradorXmlToObject;

public class RetornoProcessamentoUtil {
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
}
