package br.jus.tst.esocial.dominio.beneficio.inicio;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class DadosBeneficio {

	@NotNull
	private String tpBeneficio;

	@NotNull
	private byte tpPlanRP;

	private String dsc;
	
	private SimNao indDecJud;
	
	@Valid
	private InfoPenMorte infoPenMorte;

	public String getTpBeneficio() {
		return tpBeneficio;
	}

	public void setTpBeneficio(String tpBeneficio) {
		this.tpBeneficio = tpBeneficio;
	}

	public byte getTpPlanRP() {
		return tpPlanRP;
	}

	public void setTpPlanRP(byte tpPlanRP) {
		this.tpPlanRP = tpPlanRP;
	}

	public String getDsc() {
		return dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}

	public SimNao getIndDecJud() {
		return indDecJud;
	}

	public void setIndDecJud(SimNao indDecJud) {
		this.indDecJud = indDecJud;
	}

	public InfoPenMorte getInfoPenMorte() {
		return infoPenMorte;
	}

	public void setInfoPenMorte(InfoPenMorte infoPenMorte) {
		this.infoPenMorte = infoPenMorte;
	}
	
}
