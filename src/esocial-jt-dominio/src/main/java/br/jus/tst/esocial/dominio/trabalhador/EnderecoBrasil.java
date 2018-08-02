package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EnderecoBrasil {

	@NotNull
	@Size(min = 1, max = 4)
	private String tpLograd;

	@NotNull
	@Size(min = 1, max = 80)
	private String dscLograd;

	@NotNull
	@Size(min = 1, max = 10)
	private String nrLograd;

	@Size(max = 30)
	private String complemento;

	@Size(max = 60)
	private String bairro;

	@NotNull
	@Pattern(regexp = "\\d{8}")
	private String cep;

	@NotNull
	private Integer codMunic;

	@NotNull
	private String uf;

	public String getTpLograd() {
		return tpLograd;
	}

	public EnderecoBrasil setTpLograd(String tipoLogradouro) {
		this.tpLograd = tipoLogradouro;
		return this;
	}

	public String getDscLograd() {
		return dscLograd;
	}

	public EnderecoBrasil setDscLograd(String descricaoLogradouro) {
		this.dscLograd = descricaoLogradouro;
		return this;
	}

	public String getNrLograd() {
		return nrLograd;
	}

	public EnderecoBrasil setNrLograd(String numeroLogradouro) {
		this.nrLograd = numeroLogradouro;
		return this;
	}

	public String getComplemento() {
		return complemento;
	}

	public EnderecoBrasil setComplemento(String complemento) {
		this.complemento = complemento;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public EnderecoBrasil setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public EnderecoBrasil setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public Integer getCodMunic() {
		return codMunic;
	}

	public EnderecoBrasil setCodMunic(Integer codMunicipio) {
		this.codMunic = codMunicipio;
		return this;
	}

	public String getUf() {
		return uf;
	}

	public EnderecoBrasil setUf(String uf) {
		this.uf = uf;
		return this;
	}
}
