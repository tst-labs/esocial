package br.jus.tst.esocial.dominio.tabela.carreira;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.jus.tst.esocial.validacao.CheckDate;

public class IdeCarreira {

	@NotNull
	@Valid
	@Length(min = 1, max = 30)
	private String codCarreira;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public String getCodCarreira() {
		return codCarreira;
	}

	/**
	 * Informar o código atribuído pela empresa para o cargo.</br>
	 * </br>
	 * <b>Validação:</b> O código atribuído não pode conter a expressão
	 * "eSocial" nas 7 primeiras posições.
	 * 
	 * @param codCarreira
	 * @return
	 */
	public IdeCarreira setCodCarreira(String codCarreira) {
		this.codCarreira = codCarreira;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	/**
	 * Preencher com o mês e ano de início da validade das informações prestadas
	 * no evento, no formato AAAA-MM.</br>
	 * </br>
	 * <b>Validação:</b> Deve ser uma data válida, igual ou posterior à data
	 * inicial de implantação do eSocial, no formato AAAA-MM.
	 * 
	 * @param iniValid
	 * @return IdeCarreira
	 */
	public IdeCarreira setIniValid(String iniValid) {
		this.iniValid = iniValid;
		return this;
	}

	public String getFimValid() {
		return fimValid;
	}

	/**
	 * Preencher com o mês e ano de término da validade das informações, se
	 * houver.</br>
	 * </br>
	 * <b>Validação:</b> Se informado, deve estar no formato AAAA-MM e ser um
	 * período igual ou posterior a Data inicio.
	 * 
	 * @param fimValid
	 * @return IdeCarreira
	 */
	public IdeCarreira setFimValid(String fimValid) {
		this.fimValid = fimValid;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeCarreira)) {
			return false;
		}
		IdeCarreira castOther = (IdeCarreira) other;
		return new EqualsBuilder().append(codCarreira, castOther.codCarreira).append(iniValid, castOther.iniValid)
				.append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(codCarreira).append(iniValid).append(fimValid).toHashCode();
	}	
}
