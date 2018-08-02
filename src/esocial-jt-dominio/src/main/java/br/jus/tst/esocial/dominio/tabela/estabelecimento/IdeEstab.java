package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

public class IdeEstab {
	@NotNull
	private byte tpInsc;

	@NotNull
	@Pattern(regexp = "\\d{8,15}")
	private String nrInsc;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public String getNrInsc() {
		return nrInsc;
	}

	public IdeEstab setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
		return this;
	}

	public byte getTpInsc() {
		return tpInsc;
	}

	public IdeEstab setTpInsc(byte tpInsc) {
		this.tpInsc = tpInsc;
		return this;
	}

	/**
	 * Preencher com o mês e ano de início da validade das informações prestadas
	 * no evento, no formato AAAA-MM. Validação: Deve ser uma data válida, igual
	 * ou posterior à data inicial de implantação do eSocial, no formato
	 * AAAA-MM.
	 *
	 * @param dataInicio
	 */
	public IdeEstab setIniValid(String dataInicio) {
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
	 * @param dataFim
	 */
	public IdeEstab setFimValid(String dataFim) {
		this.fimValid = dataFim;
		return this;
	}

	public String getFimValid() {
		return fimValid;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeEstab)) {
			return false;
		}
		IdeEstab castOther = (IdeEstab) other;
		return new EqualsBuilder().append(tpInsc, castOther.tpInsc).append(nrInsc, castOther.nrInsc)
				.append(iniValid, castOther.iniValid).append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(tpInsc).append(nrInsc).append(iniValid).append(fimValid).toHashCode();
	}

}
