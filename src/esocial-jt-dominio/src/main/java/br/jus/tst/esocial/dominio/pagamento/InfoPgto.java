package br.jus.tst.esocial.dominio.pagamento;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class InfoPgto {
	
	@NotNull
	private Calendar dtPgto;
	
	private Byte tpPgto;
	
	@NotNull
	@Pattern(regexp="[N|S]")
	private String indResBr;
	
	@Valid
	private List<DetPgtoFl> detPgtoFl;

	@Valid
	private DetPgtoBenPr detPgtoBenPr;

	@Valid
	private List<DetPgtoFer> detPgtoFer;

	@Valid
	private List<DetPgtoAnt> detPgtoAnt;

	@Valid
	private IdePgtoExt idePgtoExt;

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

	public String getIndResBr() {
		return indResBr;
	}

	public void setIndResBr(String indResBr) {
		this.indResBr = indResBr;
	}

	public List<DetPgtoFl> getDetPgtoFl() {
		return detPgtoFl;
	}

	public void setDetPgtoFl(List<DetPgtoFl> detPgtoFl) {
		this.detPgtoFl = detPgtoFl;
	}

	public DetPgtoBenPr getDetPgtoBenPr() {
		return detPgtoBenPr;
	}

	public void setDetPgtoBenPr(DetPgtoBenPr detPgtoBenPr) {
		this.detPgtoBenPr = detPgtoBenPr;
	}

	public List<DetPgtoFer> getDetPgtoFer() {
		return detPgtoFer;
	}

	public void setDetPgtoFer(List<DetPgtoFer> detPgtoFer) {
		this.detPgtoFer = detPgtoFer;
	}

	public List<DetPgtoAnt> getDetPgtoAnt() {
		return detPgtoAnt;
	}

	public void setDetPgtoAnt(List<DetPgtoAnt> detPgtoAnt) {
		this.detPgtoAnt = detPgtoAnt;
	}

	public IdePgtoExt getIdePgtoExt() {
		return idePgtoExt;
	}

	public void setIdePgtoExt(IdePgtoExt idePgtoExt) {
		this.idePgtoExt = idePgtoExt;
	}
	
}
