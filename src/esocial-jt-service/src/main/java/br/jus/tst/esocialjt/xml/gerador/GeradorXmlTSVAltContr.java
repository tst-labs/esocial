package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TSVAltContrMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTSVAltContr extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtTSVAltContr.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtTSVAltContr evtTSVAltContr = TSVAltContrMapper.INSTANCE.comoEvtTSVAltContr((TSVAltContr) ocorrencia.getDadosOcorrencia());
		evtTSVAltContr.setId(evento.getIdEvento());
		
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtTSVAltContr.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtTSVAltContr(evtTSVAltContr);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
