package br.jus.tst.esocial.dominio.demonstrativovalores;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

public class DmDev {
	
	@Size(min=1, max=30)
	private String ideDmDev;
	
	private BigInteger codCateg;
	
	@Valid
	private InfoPerApur infoPerApur;
	
	@Valid
	private InfoPerAnt infoPerAnt;

	private InfoComplCont infoComplCont;
	
	@Valid
	private List<InfoTrabInterm> infoTrabInterm;
	
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

	public List<InfoTrabInterm> getInfoTrabInterm() {
		return infoTrabInterm;
	}

	public void setInfoTrabInterm(List<InfoTrabInterm> infoTrabInterm) {
		this.infoTrabInterm = infoTrabInterm;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public InfoComplCont getInfoComplCont() {
		return infoComplCont;
	}

	public void setInfoComplCont(InfoComplCont infoComplCont) {
		this.infoComplCont = infoComplCont;
	}
	
}
