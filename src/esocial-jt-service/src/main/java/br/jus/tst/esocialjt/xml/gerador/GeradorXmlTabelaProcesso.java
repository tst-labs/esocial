package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TIdeEventoEvtTab;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaProcessoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaProcesso extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtTabProcesso.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabProcesso evtTabProcesso = converteTabProcesso(ocorrencia);
		evtTabProcesso.setId(evento.getIdEvento());
		evtTabProcesso.setIdeEvento(preencherConstantes(new TIdeEventoEvtTab()));
		eSocial.setEvtTabProcesso(evtTabProcesso);

		return eSocial;
	}

	private EvtTabProcesso converteTabProcesso(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabProcesso evtTabProcesso;
		TabelaProcesso tabelaProcesso = (TabelaProcesso) ocorrencia.getDadosOcorrencia();
		TabelaProcessoMapper mapper = TabelaProcessoMapper.INSTANCE;

		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabProcesso = mapper.comoEvtTabProcessoInclusao(tabelaProcesso);
			break;

		case ALTERACAO:
			evtTabProcesso = mapper.comoEvtTabProcessoAlteracao(tabelaProcesso);
			break;

		case EXCLUSAO:
			evtTabProcesso = mapper.comoEvtTabProcessoExclusao(tabelaProcesso);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtTabProcesso;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
