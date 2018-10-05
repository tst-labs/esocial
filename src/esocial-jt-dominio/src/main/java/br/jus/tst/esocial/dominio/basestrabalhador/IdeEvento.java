package br.jus.tst.esocial.dominio.basestrabalhador;

import javax.validation.constraints.Size;

public class IdeEvento {
	
	@Size(min=0, max=40)
	private String nrRecArqBase;
	
	private byte indApuracao;
	
	@Size(min=4, max=7)
	private String perApur;

	public String getNrRecArqBase() {
		return nrRecArqBase;
	}

	public void setNrRecArqBase(String nrRecArqBase) {
		this.nrRecArqBase = nrRecArqBase;
	}

	public byte getIndApuracao() {
		return indApuracao;
	}

	public void setIndApuracao(byte indApuracao) {
		this.indApuracao = indApuracao;
	}

	public String getPerApur() {
		return perApur;
	}

	public void setPerApur(String perApur) {
		this.perApur = perApur;
	}
	
	
}
