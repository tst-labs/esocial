package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocial.esquemas.eventos.cat.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cat.TIdeEventoTrab;
import br.jus.tst.esocial.ocorrencia.dados.CAT;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CatMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import org.springframework.stereotype.Component;

@Component
public class GeradorXmlCat extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCAT.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		ESocial.EvtCAT evtCat = CatMapper.INSTANCE.comoEvtCAT((CAT) ocorrencia.getDadosOcorrencia());
		evtCat.setId(evento.getIdEvento());
		TIdeEventoTrab ideEvento = new TIdeEventoTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCat.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCAT(evtCat);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
