package br.jus.tst.esocial.dominio.desligamento;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class TransfTit {

	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfSubstituto;
	
	@NotNull
	private Calendar dtNascto;

	public String getCpfSubstituto() {
		return cpfSubstituto;
	}

	public void setCpfSubstituto(String cpfSubstituto) {
		this.cpfSubstituto = cpfSubstituto;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
	}
	
}
