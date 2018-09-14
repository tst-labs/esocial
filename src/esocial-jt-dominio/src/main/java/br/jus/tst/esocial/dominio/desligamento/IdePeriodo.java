package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IdePeriodo {
	@NotNull
	@Size(min=4, max=7)
	private String perRef;
	
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	public String getPerRef() {
		return perRef;
	}

	public void setPerRef(String perRef) {
		this.perRef = perRef;
	}

	public List<IdeEstabLot> getIdeEstabLot() {
		return ideEstabLot;
	}

	public void setIdeEstabLot(List<IdeEstabLot> ideEstabLot) {
		this.ideEstabLot = ideEstabLot;
	}
}
