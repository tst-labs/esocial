package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Desligamento {
	
	@NotNull
	private Calendar dtDeslig;

	public Calendar getDtDeslig() {
		return dtDeslig;
	}

	public void setDtDeslig(Calendar dtDeslig) {
		this.dtDeslig = dtDeslig;
	}
	
}
