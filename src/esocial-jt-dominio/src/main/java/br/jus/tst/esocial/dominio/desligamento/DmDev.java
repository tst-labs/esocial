package br.jus.tst.esocial.dominio.desligamento;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class DmDev {
	
	@Size(min=1, max=30)
	private String ideDmDev;
	
	@Valid
	private InfoPerApur infoPerApur;
		
	@Valid
	private InfoPerAnt infoPerAnt;

	public String getIdeDmDev() {
		return ideDmDev;
	}

	public void setIdeDmDev(String ideDmDev) {
		this.ideDmDev = ideDmDev;
	}

	public InfoPerApur getInfoPerApur() {
		return infoPerApur;
	}

	public void setInfoPerApur(InfoPerApur infoPerApur) {
		this.infoPerApur = infoPerApur;
	}

	public InfoPerAnt getInfoPerAnt() {
		return infoPerAnt;
	}

	public void setInfoPerAnt(InfoPerAnt infoPerAnt) {
		this.infoPerAnt = infoPerAnt;
	}
}
