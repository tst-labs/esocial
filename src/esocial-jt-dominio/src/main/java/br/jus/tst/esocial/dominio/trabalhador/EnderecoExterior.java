package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EnderecoExterior {

	@NotNull
	@Size(min=3, max=3)
	private String paisResid;
	
	@NotNull
	@Size(min=1, max=80)
	private String dscLograd;
	
	@NotNull
	@Size(min=1, max=10)
	private String nrLograd;
	
	@Size(max=30)
	private String complemento;
	
	@Size(min=1, max=60)
	private String bairro;
	
	@NotNull
	@Size(max=50)
	private String nmCid;
	
	@Size(min=4, max=12)
	private String codPostal;
	
	public String getPaisResid() {
		return paisResid;
	}

	public void setPaisResid(String paisResidencia) {
		this.paisResid = paisResidencia;
	}

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

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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
