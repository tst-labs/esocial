package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao;
import br.jus.tst.esocial.esquemas.eventos.cessao.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.Cessao;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CessaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCessao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCessao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCessao evtCessao = CessaoMapper.INSTANCE.comoEvtCessao((Cessao) ocorrencia.getDadosOcorrencia());
		evtCessao.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCessao.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCessao(evtCessao);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
