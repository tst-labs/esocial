package br.jus.tst.esocial.dominio.tabela.rubrica;

import javax.validation.constraints.NotNull;

public class IdeProcessoFGTS {
	
	@NotNull
    private String nrProc;

	public String getNrProc() {
		return nrProc;
	}

	public IdeProcessoFGTS setNrProc(String nrProc) {
		this.nrProc = nrProc;
		return this;
	}
}
