package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TSVTerminoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTSVTermino extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTSVTermino.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtTSVTermino evtTSVTermino = TSVTerminoMapper.INSTANCE.comoEvtTSVTermino((TSVTermino) ocorrencia.getDadosOcorrencia());
		evtTSVTermino.setId(evento.getIdEvento());
		preencherConstantes(evtTSVTermino.getIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtTSVTermino(evtTSVTermino);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
