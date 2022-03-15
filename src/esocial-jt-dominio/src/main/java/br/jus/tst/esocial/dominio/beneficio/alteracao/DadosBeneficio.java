package br.jus.tst.esocial.dominio.beneficio.alteracao;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class DadosBeneficio {
	@NotNull
	private String tpBeneficio;

	@NotNull
	private byte tpPlanRP;

	private String dsc;
	
	private SimNao indSuspensao;
	
	@Valid
	private InfoPenMorte infoPenMorte;
	
	@Valid
	private Suspensao suspensao;
	
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

	public SimNao getIndSuspensao() {
		return indSuspensao;
	}

	public void setIndSuspensao(SimNao indSuspensao) {
		this.indSuspensao = indSuspensao;
	}

	public InfoPenMorte getInfoPenMorte() {
		return infoPenMorte;
	}

	public void setInfoPenMorte(InfoPenMorte infoPenMorte) {
		this.infoPenMorte = infoPenMorte;
	}

	public Suspensao getSuspensao() {
		return suspensao;
	}

	public void setSuspensao(Suspensao suspensao) {
		this.suspensao = suspensao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dsc, indSuspensao, tpBeneficio, tpPlanRP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosBeneficio other = (DadosBeneficio) obj;
		return Objects.equals(dsc, other.dsc) && indSuspensao == other.indSuspensao
				&& Objects.equals(tpBeneficio, other.tpBeneficio) && tpPlanRP == other.tpPlanRP;
	}

}
