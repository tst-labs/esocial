package br.jus.tst.esocial.ocorrencia;

import java.util.Arrays;

import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import br.jus.tst.esocial.ocorrencia.dados.ReabreEvPer;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;

public enum TipoOcorrencia {

	INFORMACOES_EMPREGADOR(InformacoesEmpregador.class), 
	TABELA_ESTABELECIMENTO(TabelaEstabelecimento.class), 
	TABELA_RUBRICA(TabelaRubrica.class), 
	TABELA_LOTACAO(TabelaLotacao.class), 
	TABELA_PROCESSO(TabelaProcesso.class), 
	ADMISSAO_TRABALHADOR(Admissao.class),
	ALTERACAO_CADASTRAL(AltCadastral.class),
	ALTERACAO_CONTRATUAL(AltContratual.class),
	AFASTAMENTO_TEMPORARIO(AfastTemp.class),
	DESLIGAMENTO(Deslig.class),
	REINTEGRACAO(Reintegr.class),
	TSV_INICIO(TSVInicio.class),
	TSV_ALTERACAO_CONTRATUAL(TSVAltContr.class),
	TSV_TERMINO(TSVTermino.class),
	REMUNERACAO_RGPS(Remun.class),
	REMUNERACAO_RPPS(RmnRPPS.class),
	BENEFICIO_RPPS(BenPrRP.class),
	PAGAMENTOS(Pgtos.class),
	REABERTURA_PERIODICOS(ReabreEvPer.class),
	FECHAMENTO_PERIODICOS(FechaEvPer.class),
	EXCLUSAO(Exclusao.class);

	private final Class<? extends DadosOcorrencia> estruturaDadosOcorrencia;

	private TipoOcorrencia(Class<? extends DadosOcorrencia> estruturaDadosOcorrencia) {
		this.estruturaDadosOcorrencia = estruturaDadosOcorrencia;
	}

	public static TipoOcorrencia getTipoOcorrencia(String tipo) {
		return Arrays.asList(TipoOcorrencia.values()).stream()
				.filter(tipoOcorrencia -> tipoOcorrencia.toString().equalsIgnoreCase(tipo))
				.findFirst()
				.orElse(null);
	}

	public Class<? extends DadosOcorrencia> getEstruturaDadosOcorrencia() {
		return estruturaDadosOcorrencia;
	}

}
