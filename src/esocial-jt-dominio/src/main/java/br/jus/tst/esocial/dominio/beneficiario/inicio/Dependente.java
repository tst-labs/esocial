package br.jus.tst.esocial.dominio.beneficiario.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;

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
	
	private Sexo sexoDep;

	@NotNull
	private SimNao depIRRF;

	@NotNull
	private SimNao incFisMen;

	public String getTpDep() {
		return tpDep;
	}

	public void setTpDep(String tpDep) {
		this.tpDep = tpDep;
	}

	public String getNmDep() {
		return nmDep;
	}

	public void setNmDep(String nmDep) {
		this.nmDep = nmDep;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
	}

	public String getCpfDep() {
		return cpfDep;
	}

	public void setCpfDep(String cpfDep) {
		this.cpfDep = cpfDep;
	}

	public Sexo getSexoDep() {
		return sexoDep;
	}

	public void setSexoDep(Sexo sexoDep) {
		this.sexoDep = sexoDep;
	}

	public SimNao getDepIRRF() {
		return depIRRF;
	}

	public void setDepIRRF(SimNao depIRRF) {
		this.depIRRF = depIRRF;
	}

	public SimNao getIncFisMen() {
		return incFisMen;
	}

	public void setIncFisMen(SimNao incFisMen) {
		this.incFisMen = incFisMen;
	}

}
