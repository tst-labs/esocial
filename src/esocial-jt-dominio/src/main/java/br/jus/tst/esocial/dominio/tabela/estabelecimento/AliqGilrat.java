package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.validacao.OneOf;

/**
 * 
 * Informações de Apuração da alíquota Gilrat do Estabelecimento
 *
 */
public class AliqGilrat {

	@NotNull
	@Valid
	@OneOf({ 1, 2, 3 })
	private BigInteger aliqRat;

	@Valid
	@Digits(integer = 5, fraction = 4)
	@DecimalMin(value = "0.00")
	private BigDecimal fap;

	@Valid
	@Digits(integer = 5, fraction = 4)
	@DecimalMin(value = "0.00")
	private BigDecimal aliqRatAjust;

	@Valid
	private ProcAdmJudRat procAdmJudRat;

	@Valid
	private ProcAdmJudFap procAdmJudFap;

	public ProcAdmJudFap getProcAdmJudFap() {
		return procAdmJudFap;
	}

	/**
	 * Registro que identifica, em caso de existência, o processo
	 * administrativo/judicial em que houve decisão ou sentença favorável ao
	 * contribuinte suspendendo ou alterando a alíquota FAP aplicável ao
	 * contribuinte.
	 * 
	 * @param procAdmJudFap
	 * @return AliqGilrat
	 */
	public AliqGilrat setProcAdmJudFap(ProcAdmJudFap procAdmJudFap) {
		this.procAdmJudFap = procAdmJudFap;
		return this;
	}

	public ProcAdmJudRat getProcAdmJudRat() {
		return procAdmJudRat;
	}

	/**
	 * Registro que identifica, em caso de existência, o processo administrativo
	 * ou judicial em que houve decisão/sentença favorável ao contribuinte
	 * modificando a alíquota RAT da empresa.
	 * 
	 * @param procAdmJudRat
	 */
	public AliqGilrat setProcAdmJudRat(ProcAdmJudRat procAdmJudRat) {
		this.procAdmJudRat = procAdmJudRat;
		return this;
	}

	public BigDecimal getAliqRatAjust() {
		return aliqRatAjust;
	}

	public AliqGilrat setAliqRatAjust(BigDecimal aliqRatAjust) {
		this.aliqRatAjust = aliqRatAjust;
		return this;
	}

	public BigDecimal getFap() {
		return fap;
	}

	/**
	 * Fator Acidentário de Prevenção - FAP.
	 * <p>
	 * Validação:
	 * </p>
	 * Preenchimento obrigatório pela Pessoa Jurídica. Não preencher para Pessoa
	 * Física. O FAP informado deve corresponder àquele definido pelo Órgão
	 * Governamental Competente para o estabelecimento. A divergência só é
	 * permitida se houver processo informado em {procAdmJudFap}. Deve ser um
	 * número maior ou igual a 0,5000 e menor ou igual a 2,0000
	 * 
	 */
	public AliqGilrat setFap(BigDecimal fap) {
		this.fap = fap;
		return this;
	}

	public BigInteger getAliqRat() {
		return aliqRat;
	}

	/**
	 * 
	 * 
	 * Preencher com a alíquota definida na legislação vigente para a atividade
	 * (CNAE) preponderante. A divergência só é permitida se existir o registro
	 * complementar com informações sobre o processo administrativo/judicial que
	 * permite a aplicação de alíquotas diferentes.
	 * <p>
	 * Validação:
	 * </p>
	 * Deve ser igual a 1, 2 ou 3. Se a alíquota informada for diferente da
	 * definida na legislação vigente para o CNAE informado deverá haver
	 * informações de processo em {procAdmJudRat}
	 */
	public AliqGilrat setAliqRat(BigInteger aliqRat) {
		this.aliqRat = aliqRat;
		return this;
	}

}
