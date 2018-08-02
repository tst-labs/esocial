package br.jus.tst.esocial.dominio.tabela.rubrica;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

public class IdeRubrica {

	@NotNull
	@Size(min = 1, max = 30)
	private String codRubr;

	@NotNull
	@Size(min = 1, max = 8)
	private String ideTabRubr;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public String getCodRubr() {
		return codRubr;
	}

	/**
	 * Informar o código atribuído pela empresa e que identifica a rubrica em
	 * sua folha de pagamento.
	 * 
	 * @param codigoRubrica
	 * @return IdentificacaoRubrica
	 */
	public IdeRubrica setCodRubr(String codigoRubrica) {
		this.codRubr = codigoRubrica;
		return this;
	}

	public String getIdeTabRubr() {
		return ideTabRubr;
	}

	/**
	 * Preencher com o identificador da tabela de rubricas no âmbito do
	 * empregador.
	 * 
	 * @param identificadorTabelaRubrica
	 * @return IdentificacaoRubrica
	 */
	public IdeRubrica setIdeTabRubr(String identificadorTabelaRubrica) {
		this.ideTabRubr = identificadorTabelaRubrica;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	public IdeRubrica setIniValid(String dataInicio) {
		this.iniValid = dataInicio;
		return this;
	}

	public String getFimValid() {
		return fimValid;
	}

	public IdeRubrica setFimValid(String dataFim) {
		this.fimValid = dataFim;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeRubrica)) {
			return false;
		}
		IdeRubrica castOther = (IdeRubrica) other;
		return new EqualsBuilder().append(codRubr, castOther.codRubr)
				.append(ideTabRubr, castOther.ideTabRubr)
				.append(iniValid, castOther.iniValid).append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(codRubr).append(ideTabRubr).append(iniValid)
				.append(fimValid).toHashCode();
	}

}
