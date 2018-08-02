package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;

public class CTPS {
	
	@NotNull
	private String nrCtps;
	
	@NotNull
	private String serieCtps;
	
	@NotNull
	private String ufCtps;

	public String getNrCtps() {
		return nrCtps;
	}

	public CTPS setNrCtps(String numeroCtps) {
		this.nrCtps = numeroCtps;
		return this;
	}

	public String getSerieCtps() {
		return serieCtps;
	}

	public CTPS setSerieCtps(String serieCtps) {
		this.serieCtps = serieCtps;
		return this;
	}

	public String getUfCtps() {
		return ufCtps;
	}

	public CTPS setUfCtps(String uf) {
		this.ufCtps = uf;
		return this;
	}
}
