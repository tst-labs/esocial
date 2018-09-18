package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class RemunOutrEmpr {
	
	private byte tpInsc;
	
	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;
	
	@NotNull
	private BigInteger codCateg;

	@NotNull
	private BigDecimal vlrRemunOE;

	public byte getTpInsc() {
		return tpInsc;
	}

	public void setTpInsc(byte tpInsc) {
		this.tpInsc = tpInsc;
	}

	public String getNrInsc() {
		return nrInsc;
	}

	public void setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public BigDecimal getVlrRemunOE() {
		return vlrRemunOE;
	}

	public void setVlrRemunOE(BigDecimal vlrRemunOE) {
		this.vlrRemunOE = vlrRemunOE;
	}
	
}
