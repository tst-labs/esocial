package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import javax.validation.constraints.Size;


public class DmDev {
	
	@Size(min=1, max=30)
	private String ideDmDev;
	
	@Size(min=3, max=20)
	private String nrBeneficio;

	private InfoPerApur infoPerApur;
	
	private InfoPerAnt infoPerAnt;

	public String getIdeDmDev() {
		return ideDmDev;
	}

	public void setIdeDmDev(String ideDmDev) {
		this.ideDmDev = ideDmDev;
	}

	public String getNrBeneficio() {
		return nrBeneficio;
	}

	public void setNrBeneficio(String nrBeneficio) {
		this.nrBeneficio = nrBeneficio;
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
