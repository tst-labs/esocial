package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

public class FiliacaoSindical {
	@NotNull
	@CNPJ
	private String cnpjSindTrab;

	public String getCnpjSindTrab() {
		return cnpjSindTrab;
	}

	public void setCnpjSindTrab(String cnpj) {
		this.cnpjSindTrab = cnpj;
	}
}
