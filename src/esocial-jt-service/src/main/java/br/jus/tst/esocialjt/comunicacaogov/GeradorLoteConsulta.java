package br.jus.tst.esocialjt.comunicacaogov;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.springframework.stereotype.Component;

import br.jus.esocialjt.comunicacao.consulta.ESocial;
import br.jus.esocialjt.comunicacao.consulta.ESocial.ConsultaLoteEventos;
import br.jus.esocialjt.comunicacao.wsdl.ServicoConsultarLoteEventosStub;
import br.jus.esocialjt.comunicacao.wsdl.ServicoConsultarLoteEventosStub.ConsultarLoteEventos;

@Component
public class GeradorLoteConsulta {

	public ConsultarLoteEventos gerarConsultaLoteEventos(String protocolo) throws XMLStreamException, JAXBException {
		ESocial eSocial = new ESocial();
		ConsultaLoteEventos consultar = new ConsultaLoteEventos();
		consultar.setProtocoloEnvio(protocolo);
		eSocial.setConsultaLoteEventos(consultar);
		return gerarDistEnvioEsocial(eSocial);
	}

	private ServicoConsultarLoteEventosStub.ConsultarLoteEventos gerarDistEnvioEsocial(ESocial eSocial)
			throws XMLStreamException, JAXBException {
		ServicoConsultarLoteEventosStub.ConsultarLoteEventos distEnvioESocial = new ServicoConsultarLoteEventosStub.ConsultarLoteEventos();
		distEnvioESocial.setConsulta(getMsgLoteConsulta(marshal(eSocial)));
		return distEnvioESocial;
	}

	private ServicoConsultarLoteEventosStub.Consulta_type0 getMsgLoteConsulta(String xmlSoap)
			throws XMLStreamException {
		ServicoConsultarLoteEventosStub.Consulta_type0 dadosMsgTypeCLE = new ServicoConsultarLoteEventosStub.Consulta_type0();
		OMElement omeCLE = AXIOMUtil.stringToOM(xmlSoap);
		dadosMsgTypeCLE.setExtraElement(omeCLE);
		return dadosMsgTypeCLE;
	}

	private String marshal(Object instance) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(instance.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.marshal(instance, sw);
		return sw.toString();
	}
}
