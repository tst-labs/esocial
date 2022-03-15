package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class InfoBenTermino {
	@NotNull
	private Calendar dtTermBeneficio;
	@NotNull
	private String mtvTermino;

	public Calendar getDtTermBeneficio() {
		return dtTermBeneficio;
	}

	public void setDtTermBeneficio(Calendar dtTermBeneficio) {
		this.dtTermBeneficio = dtTermBeneficio;
	}

	public String getMtvTermino() {
		return mtvTermino;
	}

	public void setMtvTermino(String mtvTermino) {
		this.mtvTermino = mtvTermino;
	}
}
