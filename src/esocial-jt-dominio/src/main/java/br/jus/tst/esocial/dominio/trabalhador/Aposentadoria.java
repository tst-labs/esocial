package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;

public class Aposentadoria {
	
	@NotNull
	private String trabAposent;

	public String getTrabAposent() {
		return trabAposent;
	}

	public void setTrabAposent(String trabAposent) {
		this.trabAposent = trabAposent;
	}
}
