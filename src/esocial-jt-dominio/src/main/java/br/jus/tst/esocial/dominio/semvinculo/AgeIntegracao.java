package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AgeIntegracao {
	
	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjAgntInteg;
	
	@NotNull
	@Size(min= 2, max=100)
	private String nmRazao;
	
	@NotNull
	@Size(min= 1, max=80)
	private String dscLograd;
	
	@NotNull
	@Size(min= 1, max=10)
	private String nrLograd;
	
	@Size(min= 1, max=60)
	private String bairro;
	
	@NotNull
	@Pattern(regexp="\\d{8}")
	private String cep;

	private Integer codMunic;
	
	@NotNull
	private String uf;

	public String getCnpjAgntInteg() {
		return cnpjAgntInteg;
	}

	public AgeIntegracao setCnpjAgntInteg(String cnpj) {
		this.cnpjAgntInteg = cnpj;
		return this;
	}

	public String getNmRazao() {
		return nmRazao;
	}

	public AgeIntegracao setNmRazao(String nomeRazaoSocial) {
		this.nmRazao = nomeRazaoSocial;
		return this;
	}

	public String getDscLograd() {
		return dscLograd;
	}

	public AgeIntegracao setDscLograd(String descricaoLogradouro) {
		this.dscLograd = descricaoLogradouro;
		return this;
	}

	public String getNrLograd() {
		return nrLograd;
	}

	public AgeIntegracao setNrLograd(String numeroLogradouro) {
		this.nrLograd = numeroLogradouro;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public AgeIntegracao setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public AgeIntegracao setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public Integer getCodMunic() {
		return codMunic;
	}

	public AgeIntegracao setCodMunic(Integer codMunicipio) {
		this.codMunic = codMunicipio;
		return this;
	}

	public String getUf() {
		return uf;
	}

	public AgeIntegracao setUf(String uf) {
		this.uf = uf;
		return this;
	}

}
