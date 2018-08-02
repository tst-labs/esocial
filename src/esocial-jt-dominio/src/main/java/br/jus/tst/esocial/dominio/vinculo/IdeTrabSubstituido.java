package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabSubstituido {
	
	@NotNull
	@CPF
	private String cpfTrabSubst;

	public void setCpfTrabSubst(String cpf) {
		this.cpfTrabSubst = cpf;
	}

	public String getCpfTrabSubst() {
		return cpfTrabSubst;
	}
}
