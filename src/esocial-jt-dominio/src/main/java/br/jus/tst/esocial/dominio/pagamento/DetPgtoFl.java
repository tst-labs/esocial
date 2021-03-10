package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class DetPgtoFl {
	
	@Size(min=4, max=7)
	private String perRef;
	
	@Size(min=1, max=30)
	@NotNull
	private String ideDmDev;
	
	@NotNull
	private SimNao indPgtoTt;
	
	@NotNull
	private BigDecimal vrLiq;
	
	@Size(min=1, max=40)
	private String nrRecArq;
	
	@Valid
	private List<RetPgtoTot> retPgtoTot;

	@Valid
	private List<InfoPgtoParc> infoPgtoParc;

	public String getPerRef() {
		return perRef;
	}

	public void setPerRef(String perRef) {
		this.perRef = perRef;
	}

	public String getIdeDmDev() {
		return ideDmDev;
	}

	public void setIdeDmDev(String ideDmDev) {
		this.ideDmDev = ideDmDev;
	}

	public SimNao getIndPgtoTt() {
		return indPgtoTt;
	}

	public void setIndPgtoTt(SimNao indPgtoTt) {
		this.indPgtoTt = indPgtoTt;
	}

	public BigDecimal getVrLiq() {
		return vrLiq;
	}

	public void setVrLiq(BigDecimal vrLiq) {
		this.vrLiq = vrLiq;
	}

	public String getNrRecArq() {
		return nrRecArq;
	}

	public void setNrRecArq(String nrRecArq) {
		this.nrRecArq = nrRecArq;
	}

	public List<RetPgtoTot> getRetPgtoTot() {
		return retPgtoTot;
	}

	public void setRetPgtoTot(List<RetPgtoTot> retPgtoTot) {
		this.retPgtoTot = retPgtoTot;
	}

	public List<InfoPgtoParc> getInfoPgtoParc() {
		return infoPgtoParc;
	}

	public void setInfoPgtoParc(List<InfoPgtoParc> infoPgtoParc) {
		this.infoPgtoParc = infoPgtoParc;
	}
	
}
