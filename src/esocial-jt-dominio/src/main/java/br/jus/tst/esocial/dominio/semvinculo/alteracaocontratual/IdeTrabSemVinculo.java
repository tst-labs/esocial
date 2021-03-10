package br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabSemVinculo {

	@NotNull
	@CPF
	private String cpfTrab;
	
	private String matricula;
	
	@NotNull
	private Integer codCateg;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public IdeTrabSemVinculo setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
		return this;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getCodCateg() {
		return codCateg;
	}

	public IdeTrabSemVinculo setCodCateg(Integer codCateg) {
		this.codCateg = codCateg;
		return this;
	}

	
}
