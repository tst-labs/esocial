package br.jus.tst.esocial.dominio.trabalhador;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoDeficiencia {
	@NotNull
	private String defFisica;
	
	@NotNull
	private String defVisual;
	
	@NotNull
	private String defAuditiva;
	
	@NotNull
	private String defMental;
	
	@NotNull
	private String defIntelectual;
	
	@NotNull
	private String reabReadap;
	
	@NotNull
	private String infoCota;
	
	@Size(min = 3, max = 255)
	private String observacao;

	public String getDefFisica() {
		return defFisica;
	}

	public void setDefFisica(String defFisica) {
		this.defFisica = defFisica;
	}

	public String getDefVisual() {
		return defVisual;
	}

	public void setDefVisual(String defVisual) {
		this.defVisual = defVisual;
	}

	public String getDefAuditiva() {
		return defAuditiva;
	}

	public void setDefAuditiva(String defAuditiva) {
		this.defAuditiva = defAuditiva;
	}

	public String getDefMental() {
		return defMental;
	}

	public void setDefMental(String defMental) {
		this.defMental = defMental;
	}

	public String getDefIntelectual() {
		return defIntelectual;
	}

	public void setDefIntelectual(String defIntelectual) {
		this.defIntelectual = defIntelectual;
	}

	public String getReabReadap() {
		return reabReadap;
	}

	public void setReabReadap(String reabilitadoReadaptado) {
		this.reabReadap = reabilitadoReadaptado;
	}

	public String getInfoCota() {
		return infoCota;
	}

	public void setInfoCota(String infoCota) {
		this.infoCota = infoCota;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
