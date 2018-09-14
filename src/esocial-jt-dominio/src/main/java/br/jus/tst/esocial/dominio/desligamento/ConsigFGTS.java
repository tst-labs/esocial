package br.jus.tst.esocial.dominio.desligamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ConsigFGTS {
	
	@NotNull
	@Size(min=1, max=5)
	private String insConsig;

	@NotNull
	@Pattern(regexp="\\d{1,40}")
	private String nrContr;

	public String getInsConsig() {
		return insConsig;
	}

	public void setInsConsig(String insConsig) {
		this.insConsig = insConsig;
	}

	public String getNrContr() {
		return nrContr;
	}

	public void setNrContr(String nrContr) {
		this.nrContr = nrContr;
	}
	
}
