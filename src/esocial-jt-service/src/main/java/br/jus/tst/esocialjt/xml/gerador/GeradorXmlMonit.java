package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocial.esquemas.eventos.monit.ESocial;
import br.jus.tst.esocial.esquemas.eventos.monit.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.Monit;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.MonitMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import org.springframework.stereotype.Component;

@Component
public class GeradorXmlMonit extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtMonit.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		ESocial.EvtMonit evtMonit = MonitMapper.INSTANCE.comoEvtMonit((Monit) ocorrencia.getDadosOcorrencia());
		evtMonit.setId(evento.getIdEvento());
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtMonit.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtMonit(evtMonit);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
