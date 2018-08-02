package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class OC {
	
	@NotNull
	private String nrOc;

	@NotNull
	private String orgaoEmissor;
	
	private Calendar dtExped;
	
	private Calendar dtValid;
	
	public String getNrOc() {
		return nrOc;
	}
	public void setNrOc(String numeroOC) {
		this.nrOc = numeroOC;
	}
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	public Calendar getDtExped() {
		return dtExped;
	}
	public void setDtExped(Calendar dataExpedicao) {
		this.dtExped = dataExpedicao;
	}
	public Calendar getDtValid() {
		return dtValid;
	}
	public void setDtValid(Calendar dataValidade) {
		this.dtValid = dataValidade;
	}
}
