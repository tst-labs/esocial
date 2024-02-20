package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Aprend {

	private byte tpInsc;
	
	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;

	private byte indAprend;
	private String cnpjEntQual;
	private String cnpjPrat;

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

	public byte getIndAprend() {
		return indAprend;
	}

	public void setIndAprend(byte indAprend) {
		this.indAprend = indAprend;
	}

	public String getCnpjEntQual() {
		return cnpjEntQual;
	}

	public void setCnpjEntQual(String cnpjEntQual) {
		this.cnpjEntQual = cnpjEntQual;
	}

	public String getCnpjPrat() {
		return cnpjPrat;
	}

	public void setCnpjPrat(String cnpjPrat) {
		this.cnpjPrat = cnpjPrat;
	}
}
