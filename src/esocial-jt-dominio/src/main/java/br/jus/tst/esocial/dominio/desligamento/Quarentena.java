package br.jus.tst.esocial.dominio.desligamento;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Quarentena {
	
	@NotNull
	private Calendar dtFimQuar;

	public Calendar getDtFimQuar() {
		return dtFimQuar;
	}

	public void setDtFimQuar(Calendar dtFimQuar) {
		this.dtFimQuar = dtFimQuar;
	}
	
}
