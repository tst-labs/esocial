package br.jus.tst.esocial.ocorrencia;

import java.util.Arrays;

import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
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
	TABELA_PROCESSO(TabelaProcesso.class), 
	TABELA_HORARIO(TabelaHorario.class),
	ADMISSAO_TRABALHADOR(Admissao.class);

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
