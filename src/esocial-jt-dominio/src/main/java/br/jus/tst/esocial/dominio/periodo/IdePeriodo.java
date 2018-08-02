package br.jus.tst.esocial.dominio.periodo;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

/**
 * Período de validade das informações
 *
 */
public class IdePeriodo {

	@NotNull
	@CheckDate(dateFormat = "YYYY-mm")
	private String iniValid;
	@CheckDate(dateFormat = "YYYY-mm")
	private String fimValid;

	/**
	 * Preencher com o mês e ano de início da validade das informações prestadas
	 * no evento, no formato AAAA-MM. Validação: Deve ser uma data válida, igual
	 * ou posterior à data inicial de implantação do eSocial, no formato
	 * AAAA-MM.
	 *
	 * @param iniValid
	 */
	public IdePeriodo setIniValid(String dataInicio) {
		this.iniValid = dataInicio;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	/**
	 * Preencher com o mês e ano de início da validade das informações prestadas
	 * no evento, no formato AAAA-MM. Validação: Deve ser uma data válida, igual
	 * ou posterior à data inicial de implantação do eSocial, no formato
	 * AAAA-MM. Deixar em branco para os dados ativos
	 * 
	 * @param fimValid
	 */
	public void setFimValid(String dataFim) {
		this.fimValid = dataFim;
	}

	public String getFimValid() {
		return fimValid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fimValid == null) ? 0 : fimValid.hashCode());
		result = prime * result + ((iniValid == null) ? 0 : iniValid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdePeriodo other = (IdePeriodo) obj;
		return new EqualsBuilder()
				.append(iniValid, other.iniValid)
				.append(fimValid, other.fimValid)
				.isEquals();
	}
}
