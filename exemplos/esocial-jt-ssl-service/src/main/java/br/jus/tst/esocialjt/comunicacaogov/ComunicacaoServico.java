package br.jus.tst.esocialjt.comunicacaogov;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.xml.transform.StringResult;
import org.w3c.dom.Element;

import br.jus.tst.esocialjt.comunicacao.wsdl.ConsultarLoteEventos;
import br.jus.tst.esocialjt.comunicacao.wsdl.ConsultarLoteEventosResponse;
import br.jus.tst.esocialjt.comunicacao.wsdl.EnviarLoteEventosResponse;
import br.jus.tst.esocialjt.xml.XmlTools;

public class ComunicacaoServico extends WebServiceGatewaySupport {
	
	private String urlConsultaLoteGov;
	private String actionConsultaLoteGov;
	private String urlEnviarLoteGov;
	private String actionEnviarLoteGov;
	
	
	public String enviarLote(String lote) throws XmlMappingException, IOException {
		String pacote = new GeradorLoteEventos().gerarLoteEventos(lote, getMarshaller());
	
		StreamSource source = new StreamSource(new StringReader(pacote));
		StreamResult result = new StringResult();
		
		getWebServiceTemplate()
			.sendSourceAndReceiveToResult(getUrlEnviarLoteGov(), 
					source, 
					new SoapActionCallback(getActionEnviarLoteGov()), 
					result);
		
		EnviarLoteEventosResponse resposta = (EnviarLoteEventosResponse) getUnmarshaller()
				.unmarshal(new StreamSource(new StringReader(result.toString())));
		
		Element element = (Element)resposta.getEnviarLoteEventosResult().getAny();
		return XmlTools.asString(element);
	}
	
	public String consultarLote(String protocolo) throws IOException{
		ConsultarLoteEventos consultarLoteEventos = new GeradorLoteConsulta().gerarConsulta(protocolo);
		ConsultarLoteEventosResponse resposta = (ConsultarLoteEventosResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						getUrlConsultaLoteGov(), 
						consultarLoteEventos,
						new SoapActionCallback(getActionConsultaLoteGov())
					);

		Element element = (Element)resposta.getConsultarLoteEventosResult().getAny();
		return XmlTools.asString(element);
	}
	
	public String getUrlConsultaLoteGov() {
		return urlConsultaLoteGov;
	}

	public void setUrlConsultaLoteGov(String urlConsultaLoteGov) {
		this.urlConsultaLoteGov = urlConsultaLoteGov;
	}

	public String getActionConsultaLoteGov() {
		return actionConsultaLoteGov;
	}

	public void setActionConsultaLoteGov(String actionConsultaLoteGov) {
		this.actionConsultaLoteGov = actionConsultaLoteGov;
	}

	public String getUrlEnviarLoteGov() {
		return urlEnviarLoteGov;
	}

	public void setUrlEnviarLoteGov(String urlEnviarLoteGov) {
		this.urlEnviarLoteGov = urlEnviarLoteGov;
	}

	public String getActionEnviarLoteGov() {
		return actionEnviarLoteGov;
	}

	public void setActionEnviarLoteGov(String actionEnviarLoteGov) {
		this.actionEnviarLoteGov = actionEnviarLoteGov;
	}
}
