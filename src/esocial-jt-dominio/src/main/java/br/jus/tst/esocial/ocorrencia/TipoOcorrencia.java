package br.jus.tst.esocial.ocorrencia;

import br.jus.tst.esocial.ocorrencia.dados.*;

import java.util.Arrays;

public enum TipoOcorrencia {

	INFORMACOES_EMPREGADOR(InformacoesEmpregador.class), 
	TABELA_ESTABELECIMENTO(TabelaEstabelecimento.class), 
	TABELA_RUBRICA(TabelaRubrica.class), 
	TABELA_LOTACAO(TabelaLotacao.class), 
	TABELA_PROCESSO(TabelaProcesso.class), 
	ADMISSAO_TRABALHADOR(Admissao.class),
	CESSAO(Cessao.class),
	ALTERACAO_CADASTRAL(AltCadastral.class),
	ALTERACAO_CONTRATUAL(AltContratual.class),
	AFASTAMENTO_TEMPORARIO(AfastTemp.class),
	DESLIGAMENTO(Deslig.class),
	REINTEGRACAO(Reintegr.class),
	TSV_INICIO(TSVInicio.class),
	TSV_ALTERACAO_CONTRATUAL(TSVAltContr.class),
	TSV_TERMINO(TSVTermino.class),
	CADASTRO_BENEFICIARIO_INI(CdBenefIn.class),
	CADASTRO_BENEFICIARIO_ALT(CdBenefAlt.class),
	CADASTRO_BENEFICIO_INI(CdBenIn.class),
	CADASTRO_BENEFICIO_ALT(CdBenAlt.class),
	CADASTRO_BENEFICIO_TERM(CdBenTerm.class),
	REATIVACAO_BENEFICIO(ReativBen.class),
	REMUNERACAO_RGPS(Remun.class),
	REMUNERACAO_RPPS(RmnRPPS.class),
	BENEFICIO_RPPS(BenPrRP.class),
	PAGAMENTOS(Pgtos.class),
	REABERTURA_PERIODICOS(ReabreEvPer.class),
	FECHAMENTO_PERIODICOS(FechaEvPer.class),
	EXCLUSAO(Exclusao.class),
	EXP_RISCO(ExpRisco.class),
	CAT(br.jus.tst.esocial.ocorrencia.dados.CAT.class),
	MONIT(Monit.class);

	private final Class<? extends DadosOcorrencia> estruturaDadosOcorrencia;

	private TipoOcorrencia(Class<? extends DadosOcorrencia> estruturaDadosOcorrencia) {
		this.estruturaDadosOcorrencia = estruturaDadosOcorrencia;
	}

	public static TipoOcorrencia getTipoOcorrencia(String tipo) {
		return Arrays.stream(TipoOcorrencia.values())
				.filter(tipoOcorrencia -> tipoOcorrencia.toString().equalsIgnoreCase(tipo))
				.findFirst()
				.orElse(null);
	}

	public Class<? extends DadosOcorrencia> getEstruturaDadosOcorrencia() {
		return estruturaDadosOcorrencia;
	}

}
