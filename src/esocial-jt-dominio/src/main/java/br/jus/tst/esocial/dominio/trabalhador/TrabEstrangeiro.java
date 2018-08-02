package br.jus.tst.esocial.dominio.trabalhador;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class TrabEstrangeiro {
	
	@NotNull
	private Calendar dtChegada;
	
	@NotNull
	private byte classTrabEstrang;

	@NotNull
	private String casadoBr;
	
	@NotNull
	private String filhosBr;

	public Calendar getDtChegada() {
		return dtChegada;
	}

	public void setDtChegada(Calendar dataChegada) {
		this.dtChegada = dataChegada;
	}

	public byte getClassTrabEstrang() {
		return classTrabEstrang;
	}

	public void setClassTrabEstrang(byte classeTrabalhadorEstrangeiro) {
		this.classTrabEstrang = classeTrabalhadorEstrangeiro;
	}

	public String getCasadoBr() {
		return casadoBr;
	}

	public void setCasadoBr(String casadoComBrasileiro) {
		this.casadoBr = casadoComBrasileiro;
	}

	public String getFilhosBr() {
		return filhosBr;
	}

	public void setFilhosBr(String possuiFilhosBrasileiros) {
		this.filhosBr = possuiFilhosBrasileiros;
	}

}
