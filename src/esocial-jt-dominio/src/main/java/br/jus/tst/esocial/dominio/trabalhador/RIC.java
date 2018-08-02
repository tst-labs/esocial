package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class RIC {
	
	@NotNull
	private String nrRic;

	@NotNull
	private String orgaoEmissor;
	
	private Calendar dtExped;

	public String getNrRic() {
		return nrRic;
	}

	public void setNrRic(String numeroRic) {
		this.nrRic = numeroRic;
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
