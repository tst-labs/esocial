package br.jus.tst.esocial.dominio.tabela.rubrica;

import javax.validation.constraints.NotNull;

public class IdeProcessoSIND {
	@NotNull
    private String nrProc;

	public String getNrProc() {
		return nrProc;
	}

	public IdeProcessoSIND setNrProc(String nrProc) {
		this.nrProc = nrProc;
		return this;
	}
}
