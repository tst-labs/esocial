package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Calendar;

public class InfoPgto {

	@NotNull
	private Calendar dtPgto;

	private Byte tpPgto;

	private String perRef;

	@NotNull
	private String ideDmDev;

	@NotNull
	private BigDecimal vrLiq;

	private InfoPgtoExt infoPgtoExt;

	private String paisResidExt;

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

	public InfoPgtoExt getInfoPgtoExt() {
		return infoPgtoExt;
	}

	public void setInfoPgtoExt(InfoPgtoExt infoPgtoExt) {
		this.infoPgtoExt = infoPgtoExt;
	}

	public String getPaisResidExt() {
		return paisResidExt;
	}

	public void setPaisResidExt(String paisResidExt) {
		this.paisResidExt = paisResidExt;
	}
}
