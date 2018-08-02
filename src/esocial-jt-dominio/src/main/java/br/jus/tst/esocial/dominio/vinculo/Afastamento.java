package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Afastamento {

	@NotNull
	private Calendar dtIniAfast;
	
	@NotNull
	private String codMotAfast;

	public Calendar getDtIniAfast() {
		return dtIniAfast;
	}

	public void setDtIniAfast(Calendar dataInicioAfastamento) {
		this.dtIniAfast = dataInicioAfastamento;
	}

	public String getCodMotAfast() {
		return codMotAfast;
	}

	public void setCodMotAfast(String codMotivoAfastamento) {
		this.codMotAfast = codMotivoAfastamento;
	}

}
