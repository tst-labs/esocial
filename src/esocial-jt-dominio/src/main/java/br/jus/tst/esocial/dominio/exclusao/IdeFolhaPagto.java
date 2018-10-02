package br.jus.tst.esocial.dominio.exclusao;

import javax.validation.constraints.Size;

public class IdeFolhaPagto {

	private Byte indApuracao;
	
	@Size(min=4, max=7)
	private String perApur;

	public Byte getIndApuracao() {
		return indApuracao;
	}

	public void setIndApuracao(Byte indApuracao) {
		this.indApuracao = indApuracao;
	}

	public String getPerApur() {
		return perApur;
	}

	public void setPerApur(String perApur) {
		this.perApur = perApur;
	}
	
	
}
