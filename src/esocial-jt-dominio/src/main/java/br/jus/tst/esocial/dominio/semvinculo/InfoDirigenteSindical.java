package br.jus.tst.esocial.dominio.semvinculo;

import java.math.BigInteger;
import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class InfoDirigenteSindical {

	@NotNull
	private BigInteger categOrig;
	private Byte tpInsc;
	private String nrInsc;
	private Calendar dtAdmOrig;
	private String matricOrig;
	private Byte tpRegTrab;
	private byte tpRegPrev;

	public BigInteger getCategOrig() {
		return categOrig;
	}

	public void setCategOrig(BigInteger categOrig) {
		this.categOrig = categOrig;
	}

	public Byte getTpInsc() {
		return tpInsc;
	}

	public void setTpInsc(Byte tpInsc) {
		this.tpInsc = tpInsc;
	}

	public String getNrInsc() {
		return nrInsc;
	}

	public void setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
	}

	public Calendar getDtAdmOrig() {
		return dtAdmOrig;
	}

	public void setDtAdmOrig(Calendar dtAdmOrig) {
		this.dtAdmOrig = dtAdmOrig;
	}

	public String getMatricOrig() {
		return matricOrig;
	}

	public void setMatricOrig(String matricOrig) {
		this.matricOrig = matricOrig;
	}

	public Byte getTpRegTrab() {
		return tpRegTrab;
	}

	public void setTpRegTrab(Byte tpRegTrab) {
		this.tpRegTrab = tpRegTrab;
	}

	public byte getTpRegPrev() {
		return tpRegPrev;
	}

	public void setTpRegPrev(byte tpRegPrev) {
		this.tpRegPrev = tpRegPrev;
	}

}
