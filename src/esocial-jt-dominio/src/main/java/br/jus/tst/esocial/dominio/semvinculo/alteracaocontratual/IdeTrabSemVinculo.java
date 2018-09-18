package br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabSemVinculo {

	@NotNull
	@CPF
	private String cpfTrab;
	
	@NotNull
	@Size(min=11, max=11)
	private String nisTrab;
	
	@NotNull
	private Integer codCateg;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public IdeTrabSemVinculo setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
		return this;
	}

	public String getNisTrab() {
		return nisTrab;
	}

	public IdeTrabSemVinculo setNisTrab(String nisTrab) {
		this.nisTrab = nisTrab;
		return this;
	}

	public Integer getCodCateg() {
		return codCateg;
	}

	public IdeTrabSemVinculo setCodCateg(Integer codCateg) {
		this.codCateg = codCateg;
		return this;
	}

	
}
