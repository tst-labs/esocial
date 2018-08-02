package br.jus.tst.esocial.dominio.tabela.funcao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

public class IdeFuncao {

	@NotNull
	@Size(min = 1, max = 30)
	private String codFuncao;
	
	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public String getCodFuncao() {
		return codFuncao;
	}

	public IdeFuncao setCodFuncao(String codFuncao) {
		this.codFuncao = codFuncao;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	public IdeFuncao setIniValid(String iniValid) {
		this.iniValid = iniValid;
		return this;
	}

	public String getFimValid() {
		return fimValid;
	}

	public IdeFuncao setFimValid(String fimValid) {
		this.fimValid = fimValid;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeFuncao)) {
			return false;
		}
		IdeFuncao castOther = (IdeFuncao) other;
		return new EqualsBuilder().append(codFuncao, castOther.codFuncao).append(iniValid, castOther.iniValid)
				.append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(codFuncao).append(iniValid).append(fimValid).toHashCode();
	}
	
}
