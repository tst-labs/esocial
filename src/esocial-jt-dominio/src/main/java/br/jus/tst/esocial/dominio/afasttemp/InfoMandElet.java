package br.jus.tst.esocial.dominio.afasttemp;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoMandElet {
	
	@NotNull
	@CNPJ
	private String cnpjMandElet;
	
	private SimNao indRemunCargo;

	public String getCnpjMandElet() {
		return cnpjMandElet;
	}

	public void setCnpjMandElet(String cnpjMandElet) {
		this.cnpjMandElet = cnpjMandElet;
	}

	public SimNao getIndRemunCargo() {
		return indRemunCargo;
	}

	public void setIndRemunCargo(SimNao indRemunCargo) {
		this.indRemunCargo = indRemunCargo;
	}
}
