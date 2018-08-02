package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaProcessoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaProcesso extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabProcesso.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabProcesso evtTabProcesso = converteTabProcesso(ocorrencia);
		evtTabProcesso.setId(evento.getIdEvento());
		evtTabProcesso.setIdeEvento(gerarIdeEvento());
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

	private TIdeCadastro gerarIdeEvento() {
		TIdeCadastro ideEvento = new TIdeCadastro();
		ideEvento.setTpAmb(getAmbiente().codigo());
		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
		return ideEvento;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
