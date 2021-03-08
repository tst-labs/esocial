package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao;
import br.jus.tst.esocial.esquemas.eventos.admissao.TIdeEventoTrabAdmissao;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.AdmissaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlAdmissao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtAdmissao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtAdmissao evtAdmissao = AdmissaoMapper.INSTANCE.comoEvtAdmissao((Admissao) ocorrencia.getDadosOcorrencia());
		evtAdmissao.setId(evento.getIdEvento());
		TIdeEventoTrabAdmissao ideEvento = new TIdeEventoTrabAdmissao();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtAdmissao.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtAdmissao(evtAdmissao);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
