package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import java.util.List;

import javax.validation.constraints.NotNull;

public class IdePeriodo {
	
	@NotNull
	private String perRef;

	@NotNull
    private List<IdeEstab> ideEstab;

	public String getPerRef() {
		return perRef;
	}

	public void setPerRef(String perRef) {
		this.perRef = perRef;
	}

	public List<IdeEstab> getIdeEstab() {
		return ideEstab;
	}

	public void setIdeEstab(List<IdeEstab> ideEstab) {
		this.ideEstab = ideEstab;
	}
}
