package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoDeficiencia {
	@NotNull
	private SimNao defFisica;
	
	@NotNull
	private SimNao defVisual;
	
	@NotNull
	private SimNao defAuditiva;
	
	@NotNull
	private SimNao defMental;
	
	@NotNull
	private SimNao defIntelectual;
	
	@NotNull
	private SimNao reabReadap;
	
	private SimNao infoCota;
	
	@Size(min = 3, max = 255)
	private String observacao;

	public SimNao getDefFisica() {
		return defFisica;
	}

	public void setDefFisica(SimNao defFisica) {
		this.defFisica = defFisica;
	}

	public SimNao getDefVisual() {
		return defVisual;
	}

	public void setDefVisual(SimNao defVisual) {
		this.defVisual = defVisual;
	}

	public SimNao getDefAuditiva() {
		return defAuditiva;
	}

	public void setDefAuditiva(SimNao defAuditiva) {
		this.defAuditiva = defAuditiva;
	}

	public SimNao getDefMental() {
		return defMental;
	}

	public void setDefMental(SimNao defMental) {
		this.defMental = defMental;
	}

	public SimNao getDefIntelectual() {
		return defIntelectual;
	}

	public void setDefIntelectual(SimNao defIntelectual) {
		this.defIntelectual = defIntelectual;
	}

	public SimNao getReabReadap() {
		return reabReadap;
	}

	public void setReabReadap(SimNao reabReadap) {
		this.reabReadap = reabReadap;
	}

	public SimNao getInfoCota() {
		return infoCota;
	}

	public void setInfoCota(SimNao infoCota) {
		this.infoCota = infoCota;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
