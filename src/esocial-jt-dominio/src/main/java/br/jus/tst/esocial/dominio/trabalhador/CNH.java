package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class CNH {
	
	@NotNull
	private String nrRegCnh;
	
	private Calendar dtExped;
	
	@NotNull
	private String ufCnh;

	@NotNull
	private Calendar dtValid;

	private Calendar dtPriHab;
	
	@NotNull
	private String categoriaCnh;
	
	public String getNrRegCnh() {
		return nrRegCnh;
	}
	public void setNrRegCnh(String numeroCNH) {
		this.nrRegCnh = numeroCNH;
	}
	public Calendar getDtExped() {
		return dtExped;
	}
	public void setDtExped(Calendar dataExpedicao) {
		this.dtExped = dataExpedicao;
	}
	public String getUfCnh() {
		return ufCnh;
	}
	public void setUfCnh(String uf) {
		this.ufCnh = uf;
	}
	public Calendar getDtValid() {
		return dtValid;
	}
	public void setDtValid(Calendar dataValidade) {
		this.dtValid = dataValidade;
	}
	public Calendar getDtPriHab() {
		return dtPriHab;
	}
	public void setDtPriHab(Calendar dataPrimeiraHabilitacao) {
		this.dtPriHab = dataPrimeiraHabilitacao;
	}
	public String getCategoriaCnh() {
		return categoriaCnh;
	}
	public void setCategoriaCnh(String categoria) {
		this.categoriaCnh = categoria;
	}
	
	
}
