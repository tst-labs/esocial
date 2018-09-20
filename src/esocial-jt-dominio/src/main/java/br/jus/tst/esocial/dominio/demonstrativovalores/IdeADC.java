package br.jus.tst.esocial.dominio.demonstrativovalores;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class IdeADC {

	@NotNull
	private Calendar dtAcConv;
	
	@NotNull
	@Size(min=1, max=1)
	private String tpAcConv;
	
	@Pattern(regexp="[2]{1}\\d{3}-(1[0-2]|0[1-9])")
	private String compAcConv;
	
	@NotNull
	private Calendar dtEfAcConv;

	@NotNull
	@Size(min=3, max=255)
	private String dsc;
	
	@Pattern(regexp="[N|S]")
	private String remunSuc;

	private Calendar dtLei;
	
	private String nrLei;
	
	private Calendar dtEf;
	
	@Valid
	private List<IdePeriodo> idePeriodo;

	public Calendar getDtAcConv() {
		return dtAcConv;
	}

	public void setDtAcConv(Calendar dtAcConv) {
		this.dtAcConv = dtAcConv;
	}

	public String getTpAcConv() {
		return tpAcConv;
	}

	public void setTpAcConv(String tpAcConv) {
		this.tpAcConv = tpAcConv;
	}

	public String getCompAcConv() {
		return compAcConv;
	}

	public void setCompAcConv(String compAcConv) {
		this.compAcConv = compAcConv;
	}

	public Calendar getDtEfAcConv() {
		return dtEfAcConv;
	}

	public void setDtEfAcConv(Calendar dtEfAcConv) {
		this.dtEfAcConv = dtEfAcConv;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public String getRemunSuc() {
		return remunSuc;
	}

	public void setRemunSuc(String remunSuc) {
		this.remunSuc = remunSuc;
	}

	public Calendar getDtLei() {
		return dtLei;
	}

	public void setDtLei(Calendar dtLei) {
		this.dtLei = dtLei;
	}

	public String getNrLei() {
		return nrLei;
	}

	public void setNrLei(String nrLei) {
		this.nrLei = nrLei;
	}

	public Calendar getDtEf() {
		return dtEf;
	}

	public void setDtEf(Calendar dtEf) {
		this.dtEf = dtEf;
	}

	public List<IdePeriodo> getIdePeriodo() {
		return idePeriodo;
	}

	public void setIdePeriodo(List<IdePeriodo> idePeriodo) {
		this.idePeriodo = idePeriodo;
	}
	
}
