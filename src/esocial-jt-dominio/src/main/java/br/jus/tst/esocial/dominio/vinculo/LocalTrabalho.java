package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;

public class LocalTrabalho {
	@Valid
	private LocalTrabGeral localTrabGeral;
	
	@Valid
	private EnderecoBrasil localTrabDom;

	public LocalTrabGeral getLocalTrabGeral() {
		return localTrabGeral;
	}

	public LocalTrabalho setLocalTrabGeral(LocalTrabGeral localTrabalhoGeral) {
		this.localTrabGeral = localTrabalhoGeral;
		return this;
	}

	public EnderecoBrasil getLocalTrabDom() {
		return localTrabDom;
	}

	public LocalTrabalho setLocalTrabDom(EnderecoBrasil localTrabalhoDomestico) {
		this.localTrabDom = localTrabalhoDomestico;
		return this;
	}

}
