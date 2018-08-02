package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.constraints.NotNull;

public class CargoFuncao {
	
	@NotNull
	private String codCargo;
	
	private String codFuncao;

	public String getCodCargo() {
		return codCargo;
	}

	public CargoFuncao setCodCargo(String codCargo) {
		this.codCargo = codCargo;
		return this;
	}

	public String getCodFuncao() {
		return codFuncao;
	}

	public CargoFuncao setCodFuncao(String codFuncao) {
		this.codFuncao = codFuncao;
		return this;
	}

}
