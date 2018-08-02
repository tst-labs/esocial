package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.Valid;

public class Endereco {
	
	@Valid
	private EnderecoBrasil brasil;

	@Valid
	private EnderecoExterior exterior;

	public EnderecoBrasil getBrasil() {
		return brasil;
	}

	public Endereco setBrasil(EnderecoBrasil enderecoBrasil) {
		this.brasil = enderecoBrasil;
		return this;
	}

	public EnderecoExterior getExterior() {
		return exterior;
	}

	public Endereco setExterior(EnderecoExterior enderecoExterior) {
		this.exterior = enderecoExterior;
		return this;
	}

}
