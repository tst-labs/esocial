package br.jus.tst.esocial.dominio.beneficiario;

import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.nascimento.Nascimento;

public class DadosBenef {

	private Nascimento dadosNasc;
	
	private Endereco endereco;

	public Nascimento getDadosNasc() {
		return dadosNasc;
	}

	public void setDadosNasc(Nascimento dadosNasc) {
		this.dadosNasc = dadosNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
		
}
