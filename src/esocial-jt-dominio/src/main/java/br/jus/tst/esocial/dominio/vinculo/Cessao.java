package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Cessao {

	@NotNull
	private Calendar dtIniCessao;

	public Calendar getDtIniCessao() {
		return dtIniCessao;
	}

	public void setDtIniCessao(Calendar dtIniCessao) {
		this.dtIniCessao = dtIniCessao;
	}
}
