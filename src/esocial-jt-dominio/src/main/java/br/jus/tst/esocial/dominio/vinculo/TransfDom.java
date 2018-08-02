package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class TransfDom {

	@NotNull
	private String cpfSubstituido;
	
	private String matricAnt;
	
	@NotNull
	private Calendar dtTransf;

	public String getCpfSubstituido() {
		return cpfSubstituido;
	}

	public void setCpfSubstituido(String cpfSubstituido) {
		this.cpfSubstituido = cpfSubstituido;
	}

	public String getMatricAnt() {
		return matricAnt;
	}

	public void setMatricAnt(String matricAnt) {
		this.matricAnt = matricAnt;
	}

	public Calendar getDtTransf() {
		return dtTransf;
	}

	public void setDtTransf(Calendar dtTransf) {
		this.dtTransf = dtTransf;
	}
}
