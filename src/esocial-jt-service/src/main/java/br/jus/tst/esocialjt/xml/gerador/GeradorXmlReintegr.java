package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial;
import br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr;
import br.jus.tst.esocial.esquemas.eventos.reintegr.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ReintegrMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlReintegr extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtReintegr.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtReintegr evtReintegr = ReintegrMapper.INSTANCE.comoEvtReintegr((Reintegr) ocorrencia.getDadosOcorrencia());
		evtReintegr.setId(evento.getIdEvento());
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtReintegr.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtReintegr(evtReintegr);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
