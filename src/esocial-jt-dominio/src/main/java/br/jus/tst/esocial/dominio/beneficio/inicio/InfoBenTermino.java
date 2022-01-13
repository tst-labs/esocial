package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class InfoBenTermino {
	@NotNull
	private Calendar dtTermBeneficio;
	@NotNull
	private byte mtvTermino;

	public Calendar getDtTermBeneficio() {
		return dtTermBeneficio;
	}

	public void setDtTermBeneficio(Calendar dtTermBeneficio) {
		this.dtTermBeneficio = dtTermBeneficio;
	}

	public byte getMtvTermino() {
		return mtvTermino;
	}

	public void setMtvTermino(byte mtvTermino) {
		this.mtvTermino = mtvTermino;
	}
}
