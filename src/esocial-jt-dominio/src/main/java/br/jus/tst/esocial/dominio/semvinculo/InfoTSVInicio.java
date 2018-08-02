package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.vinculo.Afastamento;

public class InfoTSVInicio {
	
	@NotNull
	private String cadIni;
	
	@NotNull
	private Integer codCateg;

	@NotNull
	private Calendar dtInicio;

	private Byte natAtividade;
	
	@Valid
	private InfoComplementares infoComplementares;
	
	@Valid
	private Afastamento afastamento;
	
	@Valid
	private Termino termino;

	public Integer getCodCateg() {
		return codCateg;
	}

	public InfoTSVInicio setCodCateg(Integer codCategoria) {
		this.codCateg = codCategoria;
		return this;
	}

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public InfoTSVInicio setDtInicio(Calendar dataInicio) {
		this.dtInicio = dataInicio;
		return this;
	}

	public Byte getNatAtividade() {
		return natAtividade;
	}

	public InfoTSVInicio setNatAtividade(Byte naturezaAtividade) {
		this.natAtividade = naturezaAtividade;
		return this;
	}

	public InfoComplementares getInfoComplementares() {
		return infoComplementares;
	}

	public InfoTSVInicio setInfoComplementares(InfoComplementares infoComplementares) {
		this.infoComplementares = infoComplementares;
		return this;
	}

	public String getCadIni() {
		return cadIni;
	}

	public void setCadIni(String cadIni) {
		this.cadIni = cadIni;
	}

	public Afastamento getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(Afastamento afastamento) {
		this.afastamento = afastamento;
	}

	public Termino getTermino() {
		return termino;
	}

	public void setTermino(Termino termino) {
		this.termino = termino;
	}
}
