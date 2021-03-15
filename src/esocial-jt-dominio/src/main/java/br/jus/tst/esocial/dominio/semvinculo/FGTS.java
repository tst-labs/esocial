package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class FGTS {
	@NotNull
	private Calendar dtOpcFGTS;

	public Calendar getDtOpcFGTS() {
		return dtOpcFGTS;
	}

	public void setDtOpcFGTS(Calendar value) {
		this.dtOpcFGTS = value;
	}
}
