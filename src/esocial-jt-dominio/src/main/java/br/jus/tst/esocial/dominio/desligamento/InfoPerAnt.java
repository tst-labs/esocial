package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.Valid;

public class InfoPerAnt {
	
	@Valid
	private List<IdeADC> ideADC;

	public List<IdeADC> getIdeADC() {
		return ideADC;
	}

	public void setIdeADC(List<IdeADC> ideADC) {
		this.ideADC = ideADC;
	}
	
}
