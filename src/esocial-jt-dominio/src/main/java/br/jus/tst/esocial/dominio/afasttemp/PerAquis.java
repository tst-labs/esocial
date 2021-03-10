package br.jus.tst.esocial.dominio.afasttemp;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class PerAquis {
	@NotNull
	private Calendar dtInicio;
	
	private Calendar dtFim;

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Calendar getDtFim() {
		return dtFim;
	}

	public void setDtFim(Calendar dtFim) {
		this.dtFim = dtFim;
	}
}
