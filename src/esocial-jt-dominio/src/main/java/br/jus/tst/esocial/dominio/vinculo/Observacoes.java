package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.constraints.Size;

public class Observacoes {
	
	@Size(min=3, max=255)
	private String observacao;

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
