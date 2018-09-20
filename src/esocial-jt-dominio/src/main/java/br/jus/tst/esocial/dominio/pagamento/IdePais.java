package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IdePais {
	
	@NotNull
	@Size(min=3, max=3)
	private String codPais;

	@NotNull
	private byte indNIF;

	@Size(min=1, max=20)
	private String nifBenef;

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public byte getIndNIF() {
		return indNIF;
	}

	public void setIndNIF(byte indNIF) {
		this.indNIF = indNIF;
	}

	public String getNifBenef() {
		return nifBenef;
	}

	public void setNifBenef(String nifBenef) {
		this.nifBenef = nifBenef;
	}
	
}
