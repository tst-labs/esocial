package br.jus.tst.esocial.dominio.pagamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EndExt {

	@NotNull
	@Size(min = 1, max = 80)
	private String dscLograd;

	@NotNull
	@Size(min = 1, max = 10)
	private String nrLograd;

	@Size(max = 30)
	private String complem;

	@Size(min = 1, max = 60)
	private String bairro;

	@NotNull
	@Size(max = 50)
	private String nmCid;

	@Size(min = 4, max = 12)
	private String codPostal;

	public String getDscLograd() {
		return dscLograd;
	}

	public void setDscLograd(String descricaoLogradouro) {
		this.dscLograd = descricaoLogradouro;
	}

	public String getNrLograd() {
		return nrLograd;
	}

	public void setNrLograd(String numeroLogradouro) {
		this.nrLograd = numeroLogradouro;
	}

	public String getComplem() {
		return complem;
	}

	public void setComplem(String complem) {
		this.complem = complem;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNmCid() {
		return nmCid;
	}

	public void setNmCid(String nomeCidade) {
		this.nmCid = nomeCidade;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codigoPostal) {
		this.codPostal = codigoPostal;
	}
}
