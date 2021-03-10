package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class InfoPgto {

	@NotNull
	private Calendar dtPgto;

	private Byte tpPgto;

	private String perRef;
	
	@NotNull
	private String ideDmDev;
	
	@NotNull
	private BigDecimal vrLiq;

	public Calendar getDtPgto() {
		return dtPgto;
	}

	public void setDtPgto(Calendar dtPgto) {
		this.dtPgto = dtPgto;
	}

	public Byte getTpPgto() {
		return tpPgto;
	}

	public void setTpPgto(Byte tpPgto) {
		this.tpPgto = tpPgto;
	}

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

	public BigDecimal getVrLiq() {
		return vrLiq;
	}

	public void setVrLiq(BigDecimal vrLiq) {
		this.vrLiq = vrLiq;
	}
}
