package br.jus.tst.esocialjt.xml;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.jus.esocialjt.comunicacao.envio.ESocial;
import br.jus.esocialjt.comunicacao.envio.ESocial.EnvioLoteEventos.Eventos;
import br.jus.esocialjt.comunicacao.envio.TArquivoEsocial;
import br.jus.esocialjt.comunicacao.envio.TIdeEmpregador;
import br.jus.esocialjt.comunicacao.envio.TIdeTransmissor;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorLote {
	
	public String gerarXmlLote(Lote lote) throws GeracaoXmlException {
		List<EnvioEvento> enviosEvento = lote.getEnviosEvento();
		
		Evento eventoReferencia = enviosEvento.stream()
				.findFirst()
				.map(EnvioEvento::getEvento)
				.orElseThrow(() -> new GeracaoXmlException("Nenhum evento válido para geração do lote"));
				
		GrupoTipoEvento grupo = eventoReferencia.getTipoEvento().getGrupoTipoEvento();
		String cnpj = eventoReferencia.getOcorrencia().getDadosOcorrencia().getIdeEmpregador().getNrInsc();

		List<String> xmls = enviosEvento.stream()
				.map(EnvioEvento::getXmlEvento)
				.collect(Collectors.toList());
		
		return gerarLote(xmls, grupo, cnpj);
	}

	public String gerarLote(Collection<String> xmlsEventos, GrupoTipoEvento grupo, String cnpj)
			throws GeracaoXmlException {
		if (!this.validarLimitesGeracaolote(xmlsEventos)) {
			throw new GeracaoXmlException(
					"Não é possível gerar lotes com mais de " + Constantes.LIMITE_EVENTOS_LOTE + " eventos");
		}
		try {

			ESocial eSocial = new ESocial();
			ESocial.EnvioLoteEventos envioLoteEventos = new ESocial.EnvioLoteEventos();
			envioLoteEventos.setGrupo(grupo.getId().intValue());
			envioLoteEventos.setIdeEmpregador(gerarEmpregador(cnpj));
			envioLoteEventos.setIdeTransmissor(gerarTransmissor(cnpj));
			envioLoteEventos.setEventos(getEventosArquivoEsocial(xmlsEventos));
			eSocial.setEnvioLoteEventos(envioLoteEventos);
			return marshal(eSocial);
		} catch (JAXBException | SAXException | IOException | ParserConfigurationException e) {
			throw new GeracaoXmlException("Não foi possível gerar o XML do lote", e);
		}
	}

	private boolean validarLimitesGeracaolote(Collection<String> xmlEventos) {
		boolean resultado = (xmlEventos != null && xmlEventos.size() <= Constantes.LIMITE_EVENTOS_LOTE);
		return resultado;
	}

	private TIdeEmpregador gerarEmpregador(String cnpj) {
		TIdeEmpregador empregador = new TIdeEmpregador();
		empregador.setNrInsc(cnpj);
		empregador.setTpInsc((byte) 1);

		return empregador;
	}

	private TIdeTransmissor gerarTransmissor(String cnpj) {
		TIdeTransmissor transmissor = new TIdeTransmissor();
		transmissor.setNrInsc(cnpj);
		transmissor.setTpInsc((byte) 1);
		return transmissor;
	}

	private Eventos getEventosArquivoEsocial(Collection<String> xmlEvento)
			throws SAXException, IOException, ParserConfigurationException {
		Eventos eventos = new Eventos();
		Document doc = null;
		XMLDocumentBuilderFactory dbf = new XMLDocumentBuilderFactory();

		String idEvento = null;
		for (String xml : xmlEvento) {
			if (xml != null) {
				TArquivoEsocial arquivoEsocial = new TArquivoEsocial();
				doc = dbf.getDocumentBuilder().parse(new InputSource(new StringReader(xml)));
				idEvento = xml.substring(xml.indexOf("ID1"), xml.indexOf("ID1") + 36);
				arquivoEsocial.setId(idEvento);
				arquivoEsocial.setAny(doc.getDocumentElement());
				eventos.getEvento().add(arquivoEsocial);
			}
		}
		return eventos;
	}

	private String marshal(Object instance) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(instance.getClass());
		Marshaller marshaller = context.createMarshaller();
		StringWriter sw = new StringWriter();
		marshaller.marshal(instance, sw);
		String xml = sw.toString();
		return XmlTools.modificaValor("<eSocial:", "xmlns=", " ", xml.replace("</eSocial:eSocial>", "</eSocial>"));
	}

}
