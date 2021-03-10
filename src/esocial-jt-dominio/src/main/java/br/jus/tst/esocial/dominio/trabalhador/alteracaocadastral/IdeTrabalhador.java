package br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabalhador {
	
	@NotNull
	@CPF
	private String cpfTrab;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public void setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
	}

}
