package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;

public class TrabTemp {
	
	@NotNull
	private String justProrr;

	public String getJustProrr() {
		return justProrr;
	}

	public void setJustProrr(String justProrr) {
		this.justProrr = justProrr;
	}

}
