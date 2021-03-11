package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

public class InfoCeletista {

	@NotNull
	private Calendar dtAdm;
	
	@NotNull
	private byte tpAdmissao;
	
	@NotNull
	private byte indAdmissao;
	
	private String nrProcTrab;
	
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
	private FGTS fgts;
	
	@Valid
	private TrabTemporario trabTemporario;

	@Valid
	private Aprend aprend;
	
	public Calendar getDtAdm() {
		return dtAdm;
	}
	public void setDtAdm(Calendar dataAdmissao) {
		this.dtAdm = dataAdmissao;
	}
	public byte getTpAdmissao() {
		return tpAdmissao;
	}
	public void setTpAdmissao(byte tipoAdmissao) {
		this.tpAdmissao = tipoAdmissao;
	}
	public byte getIndAdmissao() {
		return indAdmissao;
	}
	public void setIndAdmissao(byte indAdmissao) {
		this.indAdmissao = indAdmissao;
	}
	public String getNrProcTrab() {
		return nrProcTrab;
	}
	public void setNrProcTrab(String nrProcTrab) {
		this.nrProcTrab = nrProcTrab;
	}
	public byte getTpRegJor() {
		return tpRegJor;
	}
	public void setTpRegJor(byte tipoRegimeJornada) {
		this.tpRegJor = tipoRegimeJornada;
	}
	public byte getNatAtividade() {
		return natAtividade;
	}
	public void setNatAtividade(byte naturezaAtividade) {
		this.natAtividade = naturezaAtividade;
	}
	public Byte getDtBase() {
		return dtBase;
	}
	public void setDtBase(Byte mesDataBase) {
		this.dtBase = mesDataBase;
	}
	public String getCnpjSindCategProf() {
		return cnpjSindCategProf;
	}
	public void setCnpjSindCategProf(String cnpjSindicatoCategoriaProf) {
		this.cnpjSindCategProf = cnpjSindicatoCategoriaProf;
	}
	public FGTS getFGTS() {
		return fgts;
	}
	public void setFGTS(FGTS fgts) {
		this.fgts = fgts;
	}
	public TrabTemporario getTrabTemporario() {
		return trabTemporario;
	}
	public void setTrabTemporario(TrabTemporario trabalhoTemporario) {
		this.trabTemporario = trabalhoTemporario;
	}
	public Aprend getAprend() {
		return aprend;
	}
	public void setAprend(Aprend aprendiz) {
		this.aprend = aprendiz;
	}
	
}
