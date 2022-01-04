package br.jus.tst.esocial.dominio.beneficio.inicio;

import javax.validation.Valid;

public class InfoPenMorte {
	
	private byte tpPenMorte;
	
	@Valid
	private InstPenMorte instPenMorte;

	public byte getTpPenMorte() {
		return tpPenMorte;
	}

	public void setTpPenMorte(byte tpPenMorte) {
		this.tpPenMorte = tpPenMorte;
	}

	public InstPenMorte getInstPenMorte() {
		return instPenMorte;
	}

	public void setInstPenMorte(InstPenMorte instPenMorte) {
		this.instPenMorte = instPenMorte;
	}
}
