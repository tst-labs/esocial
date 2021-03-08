package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TSVInicioMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTSVInicio extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtTSVInicio.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtTSVInicio evtTSVInicio = TSVInicioMapper.INSTANCE.comoEvtTSVInicio((TSVInicio) ocorrencia.getDadosOcorrencia());
		evtTSVInicio.setId(evento.getIdEvento());
		
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtTSVInicio.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtTSVInicio(evtTSVInicio);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
