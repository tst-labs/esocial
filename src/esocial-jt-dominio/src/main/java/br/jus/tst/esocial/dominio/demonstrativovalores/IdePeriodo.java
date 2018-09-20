package br.jus.tst.esocial.dominio.demonstrativovalores;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.estabelecimento.IdeEstab;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot;

public class IdePeriodo {
	@NotNull
	@Size(min=4, max=7)
	private String perRef;
	
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	@Valid
	private List<IdeEstab> ideEstab;

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

	public List<IdeEstab> getIdeEstab() {
		return ideEstab;
	}

	public void setIdeEstab(List<IdeEstab> ideEstab) {
		this.ideEstab = ideEstab;
	}
}
