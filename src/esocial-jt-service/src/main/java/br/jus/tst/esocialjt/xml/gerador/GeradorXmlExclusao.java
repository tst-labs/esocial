package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.IdeEvento;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ExclusaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlExclusao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_05/evtExclusao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtExclusao evtExclusao = ExclusaoMapper.INSTANCE.comoEvtExclusao((Exclusao) ocorrencia.getDadosOcorrencia());
		evtExclusao.setId(evento.getIdEvento());
		evtExclusao.setIdeEvento(preencherConstantes(new IdeEvento()));

		ESocial eSocial = new ESocial();
		eSocial.setEvtExclusao(evtExclusao);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
