package br.jus.tst.esocial.dominio.demonstrativovalores;

import java.util.List;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.estabelecimento.IdeEstab;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot;

public class InfoPerApur {

	@Valid
	private List<IdeEstab> ideEstab;
	
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	public List<IdeEstab> getIdeEstab() {
		return ideEstab;
	}

	public void setIdeEstab(List<IdeEstab> ideEstab) {
		this.ideEstab = ideEstab;
	}

	public List<IdeEstabLot> getIdeEstabLot() {
		return ideEstabLot;
	}

	public void setIdeEstabLot(List<IdeEstabLot> ideEstabLot) {
		this.ideEstabLot = ideEstabLot;
	}
	
}
