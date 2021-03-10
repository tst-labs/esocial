package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TrabTemporario {

	@NotNull
	@Size(min=3, max=999)
	private String justProrr;

	public String getJustProrr() {
		return justProrr;
	}

	public void setJustProrr(String justProrr) {
		this.justProrr = justProrr;
	}
}
