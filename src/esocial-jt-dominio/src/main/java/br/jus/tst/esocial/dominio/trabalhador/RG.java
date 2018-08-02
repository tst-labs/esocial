package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class RG {
	
	@NotNull
	private String nrRg;

	@NotNull
	private String orgaoEmissor;
	private Calendar dtExped;

	public String getNrRg() {
		return nrRg;
	}

	public void setNrRg(String numeroRG) {
		this.nrRg = numeroRG;
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
