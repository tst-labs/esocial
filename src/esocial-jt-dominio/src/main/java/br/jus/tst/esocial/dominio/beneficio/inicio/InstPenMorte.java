package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class InstPenMorte {
	@NotNull
	private String cpfInst;
	
	@NotNull
	private Calendar dtInst;

	public String getCpfInst() {
		return cpfInst;
	}

	public void setCpfInst(String cpfInst) {
		this.cpfInst = cpfInst;
	}

	public Calendar getDtInst() {
		return dtInst;
	}

	public void setDtInst(Calendar dtInst) {
		this.dtInst = dtInst;
	} 
}
