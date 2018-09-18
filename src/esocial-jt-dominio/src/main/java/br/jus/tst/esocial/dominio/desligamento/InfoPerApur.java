package br.jus.tst.esocial.dominio.desligamento;

import java.util.List;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.termino.comum.IdeEstabLot;

public class InfoPerApur {
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	public List<IdeEstabLot> getIdeEstabLot() {
		return ideEstabLot;
	}

	public void setIdeEstabLot(List<IdeEstabLot> ideEstabLot) {
		this.ideEstabLot = ideEstabLot;
	}
	
}
