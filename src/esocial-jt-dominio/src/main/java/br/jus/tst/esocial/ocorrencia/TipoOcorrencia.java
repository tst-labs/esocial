package br.jus.tst.esocial.ocorrencia;

import java.util.Arrays;

import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocial.ocorrencia.dados.TabelaAmbiente;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCargo;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCarreira;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaHorario;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;

public enum TipoOcorrencia {

	INFORMACOES_EMPREGADOR(InformacoesEmpregador.class), 
	TABELA_ESTABELECIMENTO(TabelaEstabelecimento.class), 
	TABELA_RUBRICA(TabelaRubrica.class), 
	TABELA_LOTACAO(TabelaLotacao.class), 
	TABELA_CARGO(TabelaCargo.class), 
	TABELA_CARREIRA(TabelaCarreira.class), 
	TABELA_FUNCAO(TabelaFuncao.class), 
	TABELA_HORARIO(TabelaHorario.class),
	TABELA_AMBIENTE(TabelaAmbiente.class),
	TABELA_PROCESSO(TabelaProcesso.class), 
	ADMISSAO_TRABALHADOR(Admissao.class),
	ALTERACAO_CADASTRAL(AltCadastral.class),
	ALTERACAO_CONTRATUAL(AltContratual.class),
	AFASTAMENTO_TEMPORARIO(AfastTemp.class),
	DESLIGAMENTO(Deslig.class),
	REINTEGRACAO(Reintegr.class),
	TSV_INICIO(TSVInicio.class),
	REMUNERACAO_RGPS(Remun.class);	

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
