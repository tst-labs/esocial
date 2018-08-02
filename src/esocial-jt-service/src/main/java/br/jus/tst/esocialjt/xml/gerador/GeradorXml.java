package br.jus.tst.esocialjt.xml.gerador;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import br.jus.tst.esocialjt.negocio.exception.ValidacaoXMLException;
import br.jus.tst.esocialjt.xml.AssinadorXml;
import br.jus.tst.esocialjt.xml.ValidadorXml;

@Component
public abstract class GeradorXml {
	
	@Value("${esocialjt.ambiente}")
	private TipoAmbiente ambiente;
	
	@Autowired
	private AssinadorXml assinadorXml;
	
	@Autowired
	private ValidadorXml validadorXml;
	
	public String gerarXml(Evento evento) throws GeracaoXmlException {
		Object objetoEsocial = criarObjetoESocial(evento);
		try {
			String xml = marshal(objetoEsocial);
			String xmlAssinado = assinadorXml.assinar(xml);
			validadorXml.validar(xmlAssinado, getArquivoXSD());
			return xmlAssinado;
		} catch (JAXBException | ValidacaoXMLException e) {
			throw new GeracaoXmlException(evento, "Não foi possível gerar o XML - " + e.getMessage(), e);
		} 
	}

	private String marshal(Object instance) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(instance.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.marshal(instance, sw);
		return sw.toString();
	}
	
	public String getVersao() {
		return Constantes.VERSAO_ESQUEMAS_ESOCIAL;
	}
	
	public TipoAmbiente getAmbiente() {
		return ambiente;
	}

	public abstract Object criarObjetoESocial(Evento evento) throws GeracaoXmlException;
	
	public abstract String getArquivoXSD();
}
