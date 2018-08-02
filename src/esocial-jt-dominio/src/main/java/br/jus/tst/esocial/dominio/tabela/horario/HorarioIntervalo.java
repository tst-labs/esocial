package br.jus.tst.esocial.dominio.tabela.horario;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

public class HorarioIntervalo {

	@NotNull
	private byte tpInterv;

	@NotNull
	private BigInteger durInterv;

	private String iniInterv;

	private String termInterv;

	public byte getTpInterv() {
		return tpInterv;
	}

	public void setTpInterv(byte tpInterv) {
		this.tpInterv = tpInterv;
	}

	public BigInteger getDurInterv() {
		return durInterv;
	}

	public void setDurInterv(BigInteger durInterv) {
		this.durInterv = durInterv;
	}

	public String getIniInterv() {
		return iniInterv;
	}

	public void setIniInterv(String iniInterv) {
		this.iniInterv = iniInterv;
	}

	public String getTermInterv() {
		return termInterv;
	}

	public void setTermInterv(String termInterv) {
		this.termInterv = termInterv;
	}
}
