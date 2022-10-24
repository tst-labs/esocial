package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocial.esquemas.eventos.exprisco.ESocial;
import br.jus.tst.esocial.esquemas.eventos.exprisco.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.ExpRisco;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ExpRiscoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import org.springframework.stereotype.Component;

@Component
public class GeradorXmlExpRisco extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtExpRisco.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		ESocial.EvtExpRisco evtExpRisco = ExpRiscoMapper.INSTANCE.comoEvtExpRisco((ExpRisco) ocorrencia.getDadosOcorrencia());
		evtExpRisco.setId(evento.getIdEvento());
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtExpRisco.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtExpRisco(evtExpRisco);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
