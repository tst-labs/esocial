package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.AltCadastralMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlAltCadastral extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtAltCadastral.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtAltCadastral evtAltCadastral = AltCadastralMapper.INSTANCE.comoEvtAltCadastral((AltCadastral) ocorrencia.getDadosOcorrencia());
		evtAltCadastral.setId(evento.getIdEvento());
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtAltCadastral.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial. setEvtAltCadastral(evtAltCadastral);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
