package br.jus.tst.esocial.dominio.semvinculo.termino;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.termino.comum.IdeEstabLot;


public class DmDev {
	
	@NotNull
	@Size(min=1, max=30)
	private String ideDmDev;
	
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	public String getIdeDmDev() {
		return ideDmDev;
	}

	public void setIdeDmDev(String ideDmDev) {
		this.ideDmDev = ideDmDev;
	}

	public List<IdeEstabLot> getIdeEstabLot() {
		return ideEstabLot;
	}

	public void setIdeEstabLot(List<IdeEstabLot> ideEstabLot) {
		this.ideEstabLot = ideEstabLot;
	}

}
