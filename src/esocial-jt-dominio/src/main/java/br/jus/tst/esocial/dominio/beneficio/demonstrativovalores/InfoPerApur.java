package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import java.util.List;

import javax.validation.Valid;

public class InfoPerApur {

	@Valid
	private List<IdeEstab> ideEstab;

	public List<IdeEstab> getIdeEstab() {
		return ideEstab;
	}

	public void setIdeEstab(List<IdeEstab> ideEstab) {
		this.ideEstab = ideEstab;
	}
}
