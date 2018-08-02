package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.Valid;

public class Documentos {
	
	@Valid
	private CTPS ctps;
	
	@Valid
	private RIC ric;
	
	@Valid
	private RG rg;
	
	@Valid
	private RNE rne;
	
	@Valid
	private OC oc;

	@Valid
	private CNH cnh;

	public CTPS getCTPS() {
		return ctps;
	}

	public Documentos setCTPS(CTPS carteiraTrabalho) {
		this.ctps = carteiraTrabalho;
		return this;
	}

	public RIC getRIC() {
		return ric;
	}

	public Documentos setRIC(RIC registroIdentificacaoCivil) {
		this.ric = registroIdentificacaoCivil;
		return this;
	}

	public RG getRG() {
		return rg;
	}

	public Documentos setRG(RG registroGeral) {
		this.rg = registroGeral;
		return this;
	}

	public RNE getRNE() {
		return rne;
	}

	public Documentos setRNE(RNE registroNacionalEstrangeiro) {
		this.rne = registroNacionalEstrangeiro;
		return this;
	}

	public OC getOC() {
		return oc;
	}

	public Documentos setOC(OC orgaoClasse) {
		this.oc = orgaoClasse;
		return this;
	}

	public CNH getCNH() {
		return cnh;
	}

	public Documentos setCNH(CNH carteiraNacionalHabilitacao) {
		this.cnh = carteiraNacionalHabilitacao;
		return this;
	}
}
