package br.jus.tst.esocial.dominio.cessao;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.ocorrencia.dados.Admissao;

public class InfoCessao {

	@Valid
	private IniCessao iniCessao;

	@Valid
	private FimCessao fimCessao;

	public IniCessao getIniCessao() {
		return iniCessao;
	}

	public void setIniCessao(IniCessao iniCessao) {
		this.iniCessao = iniCessao;
	}

	public FimCessao getFimCessao() {
		return fimCessao;
	}

	public void setFimCessao(FimCessao fimCessao) {
		this.fimCessao = fimCessao;
	}
	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		InfoCessao castOther = (InfoCessao) other;
		return new EqualsBuilder()
				.append(iniCessao, castOther.iniCessao)
				.append(fimCessao, castOther.fimCessao)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(iniCessao)
				.append(fimCessao)
				.toHashCode();
	}
}
