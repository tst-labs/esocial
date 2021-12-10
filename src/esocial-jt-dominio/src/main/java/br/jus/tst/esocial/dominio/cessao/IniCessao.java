package br.jus.tst.esocial.dominio.cessao;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CNPJ;

import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;

public class IniCessao {

	@NotNull
	private Calendar dtIniCessao;
	
	@NotNull
	@CNPJ
	private String cnpjCess;
	
	@NotNull
	private SimNao respRemun;

	public Calendar getDtIniCessao() {
		return dtIniCessao;
	}

	public void setDtIniCessao(Calendar dtIniCessao) {
		this.dtIniCessao = dtIniCessao;
	}

	public String getCnpjCess() {
		return cnpjCess;
	}

	public void setCnpjCess(String cnpjCess) {
		this.cnpjCess = cnpjCess;
	}

	public SimNao getRespRemun() {
		return respRemun;
	}

	public void setRespRemun(SimNao respRemun) {
		this.respRemun = respRemun;
	}
	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Admissao)) {
			return false;
		}
		IniCessao castOther = (IniCessao) other;
		return new EqualsBuilder()
				.append(dtIniCessao, castOther.dtIniCessao)
				.append(cnpjCess, castOther.cnpjCess)
				.append(respRemun, castOther.respRemun)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(dtIniCessao)
				.append(cnpjCess)
				.append(respRemun)
				.toHashCode();
	}
}
