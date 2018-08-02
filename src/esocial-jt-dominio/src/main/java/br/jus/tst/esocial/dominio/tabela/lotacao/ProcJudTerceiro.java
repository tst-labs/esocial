package br.jus.tst.esocial.dominio.tabela.lotacao;

import java.math.BigInteger;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Informações sobre a existência de processos judiciais, com sentença/decisão
 * favorável ao contribuinte, relativos às contribuições destinadas a outras
 * Entidades e Fundos.
 *
 */
public class ProcJudTerceiro {

	@NotNull
	@Length(min = 4, max = 4)
	private String codTerc;

	@NotNull
	@Length(max = 20)
	private String nrProcJud;

	@NotNull
	@Digits(integer = 14, fraction = 0)
	private BigInteger codSusp;

	public BigInteger getCodSusp() {
		return codSusp;
	}

	/**
	 * Código do Indicativo da Suspensão, atribuído pelo empregador em S-1070.
	 * </br>
	 * </br>
	 * <b>Validação:</b> A informação prestada deve estar de acordo com o que
	 * foi informado em <b>S-1070</b>.
	 * 
	 * @param codSusp
	 */
	public ProcJudTerceiro setCodSusp(BigInteger codSusp) {
		this.codSusp = codSusp;
		return this;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

	/**
	 * Informar um número de processo judicial cadastrado através do evento
	 * <b>S- 1070</b>, cujo {indMatProc} seja igual a [1].</br>
	 * </br>
	 * <b>Validação:</b> Deve ser um número de processo válido e deve existir na
	 * tabela de processos <b>(S-1070)</b>.
	 * 
	 * @param nrProcJud
	 * @return
	 */
	public ProcJudTerceiro setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}

	public String getCodTerc() {
		return codTerc;
	}

	/**
	 * Informar o Código de Terceiro </br>
	 * </br>
	 * <b>Validação:</b> Deve ser um código de terceiro válido e compatível com
	 * o FPAS/Terceiros informado no registro superior, conforme <b>Tabela
	 * 4</b>.
	 * 
	 * @param codTerc
	 * @return ProcJudTerceiro
	 */
	public ProcJudTerceiro setCodTerc(String codTerc) {
		this.codTerc = codTerc;
		return this;
	}

}
