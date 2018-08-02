package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class RNE {
	
	@NotNull
	private String nrRne;

	@NotNull
	private String orgaoEmissor;
	
	private Calendar dtExped;
	
	public String getNrRne() {
		return nrRne;
	}
	public void setNrRne(String numeroRNE) {
		this.nrRne = numeroRNE;
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
}
