package br.jus.tst.esocial.dominio.afasttemp;

import java.math.BigInteger;

public class InfoAtestado {
	
	private String codCID;
	
	private BigInteger qtdDiasAfast;
	
	private Emitente emitente;

	public String getCodCID() {
		return codCID;
	}

	public void setCodCID(String codCID) {
		this.codCID = codCID;
	}

	public BigInteger getQtdDiasAfast() {
		return qtdDiasAfast;
	}

	public void setQtdDiasAfast(BigInteger qtdDiasAfast) {
		this.qtdDiasAfast = qtdDiasAfast;
	}

	public Emitente getEmitente() {
		return emitente;
	}

	public void setEmitente(Emitente emitente) {
		this.emitente = emitente;
	}
}
