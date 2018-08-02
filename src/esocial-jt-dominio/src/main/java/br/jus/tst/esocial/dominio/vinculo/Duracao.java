package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Duracao {
	@NotNull
	private byte tpContr;
	private Calendar dtTerm;
	private String clauAssec;

	public byte getTpContr() {
		return tpContr;
	}

	public Duracao setTpContr(byte tipoContrato) {
		this.tpContr = tipoContrato;
		return this;
	}

	public Calendar getDtTerm() {
		return dtTerm;
	}

	public Duracao setDtTerm(Calendar dataTermino) {
		this.dtTerm = dataTermino;
		return this;
	}

	public String getClauAssec() {
		return clauAssec;
	}

	public Duracao setClauAssec(String clauAssec) {
		this.clauAssec = clauAssec;
		return this;
	}

}
