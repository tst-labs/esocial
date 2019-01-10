package br.jus.tst.esocial.dominio.desligamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SucessaoVinc {

	private byte tpInscSuc;

	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjSucessora;

	public String getCnpjSucessora() {
		return cnpjSucessora;
	}

	public void setCnpjSucessora(String cnpjSucessora) {
		this.cnpjSucessora = cnpjSucessora;
	}

	public byte getTpInscSuc() {
		return tpInscSuc;
	}	

	public void setTpInscSuc(byte tpInscSuc) {
		this.tpInscSuc = tpInscSuc;
	}
}
