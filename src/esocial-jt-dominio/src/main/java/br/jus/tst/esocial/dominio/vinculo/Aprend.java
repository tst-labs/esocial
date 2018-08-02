package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Aprend {

	private byte tpInsc;
	
	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;

	public byte getTpInsc() {
		return tpInsc;
	}

	public void setTpInsc(byte tipoInscricao) {
		this.tpInsc = tipoInscricao;
	}

	public String getNrInsc() {
		return nrInsc;
	}

	public void setNrInsc(String numeroInscricao) {
		this.nrInsc = numeroInscricao;
	}
}
