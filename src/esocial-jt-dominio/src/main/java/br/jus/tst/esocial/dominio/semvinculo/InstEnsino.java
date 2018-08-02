package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class InstEnsino {
	
	@CNPJ
	private String cnpjInstEnsino;
	
	@NotNull
	@Length(min=2, max=100)
	private String nmRazao;

	@Length(min=1, max=80)
	private String dscLograd;
	
	@Length(min=1, max=10)
	private String nrLograd;
	
	@Length(min=1, max=60)
	private String bairro;

	@Pattern(regexp="\\d{8}")
	private String cep;
	
	private Integer codMunic;
	
	private String uf;

	public String getCnpjInstEnsino() {
		return cnpjInstEnsino;
	}

	public InstEnsino setCnpjInstEnsino(String cnpj) {
		this.cnpjInstEnsino = cnpj;
		return this;
	}

	public String getNmRazao() {
		return nmRazao;
	}

	public InstEnsino setNmRazao(String nomeRazaoSocial) {
		this.nmRazao = nomeRazaoSocial;
		return this;
	}

	public String getDscLograd() {
		return dscLograd;
	}

	public InstEnsino setDscLograd(String descricaoLogradouro) {
		this.dscLograd = descricaoLogradouro;
		return this;
	}

	public String getNrLograd() {
		return nrLograd;
	}

	public InstEnsino setNrLograd(String numeroLogradouro) {
		this.nrLograd = numeroLogradouro;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public InstEnsino setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public InstEnsino setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public Integer getCodMunic() {
		return codMunic;
	}

	public InstEnsino setCodMunic(Integer codMunicipio) {
		this.codMunic = codMunicipio;
		return this;
	}

	public String getUf() {
		return uf;
	}

	public InstEnsino setUf(String uf) {
		this.uf = uf;
		return this;
	}

}
