package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import java.util.Calendar;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class Duracao {
	
	private byte tpContr;
	private Calendar dtTerm;
	private String objDet;
	private SimNao clauAssec;

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

	public String getObjDet() {
		return objDet;
	}

	public Duracao setObjDet(String objDet) {
		this.objDet = objDet;
		return this;
	}

	public SimNao getClauAssec() {
		return clauAssec;
	}

	public Duracao setClauAssec(SimNao clauAssec) {
		this.clauAssec = clauAssec;
		return this;
	}
}
