package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import java.math.BigInteger;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

public class ProcAdmJudFap {

	private byte tpProc;

	@Length(min = 1, max = 20)
	private String nrProc;

	@Min(1)
	@Max(14)
	private BigInteger codSusp;

	public byte getTpProc() {
		return tpProc;
	}

	/**
	 * Preencher com o código correspondente ao tipo de processo: 1 -
	 * Administrativo; 2 - Judicial. Valores Válidos: 1, 2.
	 **/
	public ProcAdmJudFap setTpProc(byte tpProc) {
		this.tpProc = tpProc;
		return this;
	}

	public String getNrProc() {
		return nrProc;
	}

	/**
	 * 
	 * Informar um número de processo cadastrado através do evento S-1070, cujo
	 * {indMatProc} seja igual a [1]. Validação: Deve ser um número de processo
	 * administrativo ou judicial válido e existente na Tabela de Processos
	 * (S-1070).
	 * 
	 */
	public ProcAdmJudFap setNrProc(String nrProc) {
		this.nrProc = nrProc;
		return this;
	}

	public BigInteger getCodSusp() {
		return codSusp;
	}

	/**
	 * Código do Indicativo da Suspensão, atribuído pelo empregador.
	 * <p>
	 * Validação:
	 * </p>
	 * A informação prestada deve estar de acordo com o que foi informado em
	 * S-1070.
	 * 
	 * @param codSusp
	 * @return ProcAdmJudRat
	 */
	public ProcAdmJudFap setCodSusp(BigInteger codSusp) {
		this.codSusp = codSusp;
		return this;
	}
}
