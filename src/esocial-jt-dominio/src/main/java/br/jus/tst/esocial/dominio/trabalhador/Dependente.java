package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.br.CPF;

public class Dependente {
	@NotNull
	@Size(min = 2, max = 2)
	private String tpDep;

	@NotNull
	@Size(min = 2, max = 70)
	private String nmDep;

	@NotNull
	private Calendar dtNascto;

	@CPF
	private String cpfDep;

	@NotNull
	private String depIRRF;

	@NotNull
	private String depSF;

	@NotNull
	private String incTrab;

	public String getTpDep() {
		return tpDep;
	}

	public Dependente setTpDep(String tipo) {
		this.tpDep = StringUtils.leftPad(tipo, 2, '0');
		return this;
	}

	public String getNmDep() {
		return nmDep;
	}

	public Dependente setNmDep(String nome) {
		this.nmDep = StringUtils.trim(nome);
		return this;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public Dependente setDtNascto(Calendar dataNascimento) {
		this.dtNascto = dataNascimento;
		return this;
	}

	public String getCpfDep() {
		return cpfDep;
	}

	public Dependente setCpfDep(String cpf) {
		this.cpfDep = cpf;
		return this;
	}

	public String getDepIRRF() {
		return depIRRF;
	}

	public Dependente setDepIRRF(String dependenteIRRF) {
		this.depIRRF = dependenteIRRF;
		return this;
	}

	public String getDepSF() {
		return depSF;
	}

	public Dependente setDepSF(String dependenteSF) {
		this.depSF = dependenteSF;
		return this;
	}

	public String getIncTrab() {
		return incTrab;
	}

	public Dependente setIncTrab(String incapacitadoParaTrabalho) {
		this.incTrab = incapacitadoParaTrabalho;
		return this;
	}
}
