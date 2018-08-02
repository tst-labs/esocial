package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

public class SupervisorEstagio {
	
	@NotNull
	@CPF
	private String cpfSupervisor;

	@NotNull
	@Length(min=2, max=70)
	private String nmSuperv;

	public String getCpfSupervisor() {
		return cpfSupervisor;
	}

	public SupervisorEstagio setCpfSupervisor(String cpf) {
		this.cpfSupervisor = cpf;
		return this;
	}

	public String getNmSuperv() {
		return nmSuperv;
	}

	public SupervisorEstagio setNmSuperv(String nome) {
		this.nmSuperv = nome;
		return this;
	}

}
