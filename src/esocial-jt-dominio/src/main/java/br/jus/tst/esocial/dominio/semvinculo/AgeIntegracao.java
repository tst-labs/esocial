package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AgeIntegracao {
	
	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjAgntInteg;
	

	public String getCnpjAgntInteg() {
		return cnpjAgntInteg;
	}

	public AgeIntegracao setCnpjAgntInteg(String cnpj) {
		this.cnpjAgntInteg = cnpj;
		return this;
	}
}
