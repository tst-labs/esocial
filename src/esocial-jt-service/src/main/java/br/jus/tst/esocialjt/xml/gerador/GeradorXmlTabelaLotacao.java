package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaLotacaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaLotacao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabLotacao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabLotacao evtTabLotacao = selecionaMapper(ocorrencia);
		evtTabLotacao.setId(evento.getIdEvento());
		evtTabLotacao.setIdeEvento(gerarIdeEvento());
		eSocial.setEvtTabLotacao(evtTabLotacao);

		return eSocial;
		
	}

	private EvtTabLotacao selecionaMapper(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabLotacao evtTabLotacao;
		TabelaLotacao tabelaLotacao = (TabelaLotacao) ocorrencia.getDadosOcorrencia();
		TabelaLotacaoMapper mapper = TabelaLotacaoMapper.INSTANCE;

		
		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabLotacao = mapper.comoEvtTabLotacaoInclusao(tabelaLotacao);
			break;

		case ALTERACAO:
			evtTabLotacao = mapper.comoEvtTabLotacaoAlteracao(tabelaLotacao);
			break;

		case EXCLUSAO:
			evtTabLotacao = mapper.comoEvtTabLotacaoExclusao(tabelaLotacao);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtTabLotacao;
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
