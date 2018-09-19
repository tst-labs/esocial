package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProcJudTrab {
	
	private byte tpTrib;
	
	@NotNull
	@Size(min=3, max=21)
	private String nrProcJud;
	
	private BigInteger codSusp;

	public byte getTpTrib() {
		return tpTrib;
	}

	public void setTpTrib(byte tpTrib) {
		this.tpTrib = tpTrib;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

	public void setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
	}

	public BigInteger getCodSusp() {
		return codSusp;
	}

	public void setCodSusp(BigInteger codSusp) {
		this.codSusp = codSusp;
	}
	
}
