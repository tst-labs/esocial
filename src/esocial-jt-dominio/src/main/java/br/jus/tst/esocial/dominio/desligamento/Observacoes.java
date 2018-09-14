package br.jus.tst.esocial.dominio.desligamento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Observacoes {

	@NotNull
	@Size(min=3, max=255)
	private String observacao;

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
