package br.jus.tst.esocialjt.comunicacaogov;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.springframework.stereotype.Component;

import br.jus.esocialjt.comunicacao.wsdl.ServicoEnviarLoteEventosStub;

@Component
public class GeradorLoteEventos {

	public ServicoEnviarLoteEventosStub.EnviarLoteEventos gerarLoteEventos(String lote) throws XMLStreamException {
		ServicoEnviarLoteEventosStub.EnviarLoteEventos distEnvioEsocial = new ServicoEnviarLoteEventosStub.EnviarLoteEventos();
		distEnvioEsocial.setLoteEventos(getMsgLoteEvento(lote));
		return distEnvioEsocial;
	}

	private ServicoEnviarLoteEventosStub.LoteEventos_type0 getMsgLoteEvento(String xmlSoap) throws XMLStreamException {
		ServicoEnviarLoteEventosStub.LoteEventos_type0 msgLoteEvento = new ServicoEnviarLoteEventosStub.LoteEventos_type0();
		OMElement ome = AXIOMUtil.stringToOM(xmlSoap);
		msgLoteEvento.setExtraElement(ome);
		return msgLoteEvento;
	}
}
