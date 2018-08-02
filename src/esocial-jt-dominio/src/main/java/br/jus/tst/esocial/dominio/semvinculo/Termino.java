package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Termino {
	
	@NotNull
	private Calendar dtTerm;

	public Calendar getDtTerm() {
		return dtTerm;
	}

	public void setDtTerm(Calendar dtTerm) {
		this.dtTerm = dtTerm;
	}
}
