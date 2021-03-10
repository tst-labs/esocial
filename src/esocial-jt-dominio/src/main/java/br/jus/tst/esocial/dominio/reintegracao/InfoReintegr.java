package br.jus.tst.esocial.dominio.reintegracao;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoReintegr {

	@NotNull
	private byte tpReint;
	
	@Size(min=0,max=20)
	private String nrProcJud;
	
	@Size(min=0,max=13)
	private String nrLeiAnistia;

	@NotNull
	private Calendar dtEfetRetorno;

	@NotNull
	private Calendar dtEfeito;

	@NotNull
	private SimNao indPagtoJuizo;

	public byte getTpReint() {
		return tpReint;
	}

	public InfoReintegr setTpReint(byte tpReint) {
		this.tpReint = tpReint;
		return this;
	}

	public String getNrProcJud() {
		return nrProcJud;
	}

	public InfoReintegr setNrProcJud(String nrProcJud) {
		this.nrProcJud = nrProcJud;
		return this;
	}

	public String getNrLeiAnistia() {
		return nrLeiAnistia;
	}

	public InfoReintegr setNrLeiAnistia(String nrLeiAnistia) {
		this.nrLeiAnistia = nrLeiAnistia;
		return this;
	}

	public Calendar getDtEfetRetorno() {
		return dtEfetRetorno;
	}

	public InfoReintegr setDtEfetRetorno(Calendar dtEfetRetorno) {
		this.dtEfetRetorno = dtEfetRetorno;
		return this;
	}

	public Calendar getDtEfeito() {
		return dtEfeito;
	}

	public InfoReintegr setDtEfeito(Calendar dtEfeito) {
		this.dtEfeito = dtEfeito;
		return this;
	}

	public SimNao getIndPagtoJuizo() {
		return indPagtoJuizo;
	}

	public InfoReintegr setIndPagtoJuizo(SimNao indPagtoJuizo) {
		this.indPagtoJuizo = indPagtoJuizo;
		return this;
	}
	
}
