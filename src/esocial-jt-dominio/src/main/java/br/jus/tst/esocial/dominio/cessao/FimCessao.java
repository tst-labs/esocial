package br.jus.tst.esocial.dominio.cessao;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.ocorrencia.dados.Admissao;

public class FimCessao {

	@NotNull
	private Calendar dtTermCessao;

	public Calendar getDtTermCessao() {
		return dtTermCessao;
	}

	public void setDtTermCessao(Calendar dtTermCessao) {
		this.dtTermCessao = dtTermCessao;
	}
	
	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		FimCessao castOther = (FimCessao) other;
		return new EqualsBuilder()
				.append(dtTermCessao, castOther.dtTermCessao)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(dtTermCessao)
				.toHashCode();
	}
}
