package br.jus.tst.esocial.dominio.tabela.lotacao;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Informações de FPAS e Terceiros relativas à lotação tributária
 *
 */
public class FpasLotacao {

	@NotNull
	private BigInteger fpas;

	@NotNull
	@Length(min = 4, max = 4)
	private String codTercs;

	@Length(min = 4, max = 4)
	private String codTercsSusp;


	private InfoProcJudTerceiros infoProcJudTerceiros;
	
	public String getCodTercsSusp() {
		return codTercsSusp;
	}

	/**
	 * Informar o código combinado dos Terceiros para os quais o recolhimento
	 * está suspenso em virtude de processos Judiciais. </br>
	 * </br>
	 * <b> Exemplo:</b> Se o contribuinte possui decisões de processos para
	 * suspensão de recolhimentos ao Sesi (0008) e ao Sebrae (0064), deve
	 * informar o código combinado das duas entidades, ou seja, 0072. </br>
	 * </br>
	 * <b>Validação:</b> Deve ser um código consistente com a <b>Tabela 4</b>.
	 * Deve haver um processo em {procJudTerceiro} para cada código de Terceiro
	 * cujo recolhimento esteja suspenso. Informações sobre a existência de pro
	 * 
	 * @param codTercsSusp
	 * @return
	 */
	public FpasLotacao setCodTercsSusp(String codTercsSusp) {
		this.codTercsSusp = codTercsSusp;
		return this;
	}

	public String getCodTercs() {
		return codTercs;
	}

	/**
	 * Preencher com o código de Terceiros, conforme tabela 4, já considerando a
	 * existência de eventuais convênios para recolhimento direto. </br>
	 * <b>Exemplo: </b>Se o contribuinte está enquadrado com FPAS 507, cujo
	 * código cheio de Terceiros é 0079, se possuir convênio com Senai deve
	 * informar o código 0075. </br>
	 * </br>
	 * <b>Validação:</b></br>
	 * O código de terceiros informado deve ser compatível com o código de FPAS
	 * informado, conforme <b>tabela 4</b>.
	 * 
	 * @param codTercs
	 * @return
	 */
	public FpasLotacao setCodTercs(String codTercs) {
		this.codTercs = codTercs;
		return this;
	}

	public BigInteger getFpas() {
		return fpas;
	}

	/**
	 * Preencher com o código relativo ao FPAS. </br>
	 * </br>
	 * <b>Validação:</b> Deve ser um código FPAS válido, conforme <b>tabela
	 * 4</b>.
	 * 
	 * @param fpas
	 * @return
	 */
	public FpasLotacao setCodigoFpas(BigInteger fpas) {
		this.fpas = fpas;
		return this;
	}

	public InfoProcJudTerceiros getInfoProcJudTerceiros() {
		return infoProcJudTerceiros;
	}

	public FpasLotacao setInfoProcJudTerceiros(InfoProcJudTerceiros infoProcJudTerceiros) {
		this.infoProcJudTerceiros = infoProcJudTerceiros;
		return this;
	}

	public FpasLotacao setFpas(BigInteger fpas) {
		this.fpas = fpas;
		return this;
	}
	
}
