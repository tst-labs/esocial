package br.jus.tst.esocialjt.xml.gerador;

import java.beans.Statement;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
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
	private TipoAmbiente AMBIENTE;
	
	@Value("${esocialjt.aplicativoEmpregador:1}")
	private byte APLICATIVO_DO_EMPREGADOR;

	@Autowired
	private BuildProperties buildProperties;
	
	@Autowired
	private AssinadorXml assinadorXml;
	
	@Autowired
	private ValidadorXml validadorXml;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GeradorXml.class);
	
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
	
	protected <T extends Object> T preencherConstantes(T ideEvento) {
		try {
			new Statement(ideEvento, "setTpAmb", new Object[]{AMBIENTE.codigo()}).execute();
			new Statement(ideEvento, "setProcEmi", new Object[]{APLICATIVO_DO_EMPREGADOR}).execute();
			new Statement(ideEvento, "setVerProc", new Object[]{buildProperties.getVersion()}).execute();
		} catch (Exception e) {
			LOGGER.debug(e.getMessage(), e);	
		}
		return ideEvento;
	}

	public abstract Object criarObjetoESocial(Evento evento) throws GeracaoXmlException;
	
	public abstract String getArquivoXSD();
}
