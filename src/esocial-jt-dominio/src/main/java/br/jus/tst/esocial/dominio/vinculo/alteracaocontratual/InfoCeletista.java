package br.jus.tst.esocial.dominio.vinculo.alteracaocontratual;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

public class InfoCeletista {

	@NotNull
	private byte tpRegJor;
	
	@NotNull
	private byte natAtividade;
	
	@Min(1)	
	@Max(12)
	private Byte dtBase;
	
	@NotNull
	@CNPJ
	private String cnpjSindCategProf;
	
	@Valid
	private TrabTemporario trabTemporario;

	@Valid
	private Aprend aprend;

	public byte getTpRegJor() {
		return tpRegJor;
	}

	public void setTpRegJor(byte tpRegJor) {
		this.tpRegJor = tpRegJor;
	}

	public byte getNatAtividade() {
		return natAtividade;
	}

	public void setNatAtividade(byte natAtividade) {
		this.natAtividade = natAtividade;
	}

	public Byte getDtBase() {
		return dtBase;
	}

	public void setDtBase(Byte dtBase) {
		this.dtBase = dtBase;
	}

	public String getCnpjSindCategProf() {
		return cnpjSindCategProf;
	}

	public void setCnpjSindCategProf(String cnpjSindCategProf) {
		this.cnpjSindCategProf = cnpjSindCategProf;
	}

	public TrabTemporario getTrabTemporario() {
		return trabTemporario;
	}

	public void setTrabTemporario(TrabTemporario trabTemporario) {
		this.trabTemporario = trabTemporario;
	}

	public Aprend getAprend() {
		return aprend;
	}

	public void setAprend(Aprend aprend) {
		this.aprend = aprend;
	}
}
