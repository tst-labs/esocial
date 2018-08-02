package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

public class InfoTrabCedido {
	
	@NotNull
	private Integer categOrig;
	
	@CNPJ
	@NotNull
	private String cnpjCednt;
	
	@NotNull
	@Size(min=1, max=30)
	private String matricCed;
	
	@NotNull
	private Calendar dtAdmCed;
	
	private byte tpRegTrab;
	
	@NotNull
	private byte tpRegPrev;

	@NotNull
	private byte infOnus;
	
	public Integer getCategOrig() {
		return categOrig;
	}
	public InfoTrabCedido setCategOrig(Integer categoriaOrigem) {
		this.categOrig = categoriaOrigem;
		return this;
	}
	public String getCnpjCednt() {
		return cnpjCednt;
	}
	public InfoTrabCedido setCnpjCednt(String cnpjCedente) {
		this.cnpjCednt = cnpjCedente;
		return this;
	}
	public String getMatricCed() {
		return matricCed;
	}
	public InfoTrabCedido setMatricCed(String matriculaCedente) {
		this.matricCed = matriculaCedente;
		return this;
	}
	public Calendar getDtAdmCed() {
		return dtAdmCed;
	}
	public InfoTrabCedido setDtAdmCed(Calendar dataAdmissaoCedente) {
		this.dtAdmCed = dataAdmissaoCedente;
		return this;
	}
	public byte getTpRegTrab() {
		return tpRegTrab;
	}
	public InfoTrabCedido setTpRegTrab(byte tipoRegimeTrabalhista) {
		this.tpRegTrab = tipoRegimeTrabalhista;
		return this;
	}
	public byte getTpRegPrev() {
		return tpRegPrev;
	}
	public InfoTrabCedido setTpRegPrev(byte tipoRegimePrevidenciario) {
		this.tpRegPrev = tipoRegimePrevidenciario;
		return this;
	}
	public byte getInfOnus() {
		return infOnus;
	}
	public InfoTrabCedido setInfOnus(byte infOnus) {
		this.infOnus = infOnus;
		return this;
	}
	
}
