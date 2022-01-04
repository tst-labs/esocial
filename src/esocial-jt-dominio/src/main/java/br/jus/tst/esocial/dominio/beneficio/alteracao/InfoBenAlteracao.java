package br.jus.tst.esocial.dominio.beneficio.alteracao;

import java.util.Calendar;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class InfoBenAlteracao {
	
	@NotNull
	private Calendar dtAltBeneficio;

	@Valid
	@NotNull
	private DadosBeneficio dadosBeneficio;

	public Calendar getDtAltBeneficio() {
		return dtAltBeneficio;
	}

	public void setDtAltBeneficio(Calendar dtAltBeneficio) {
		this.dtAltBeneficio = dtAltBeneficio;
	}

	public DadosBeneficio getDadosBeneficio() {
		return dadosBeneficio;
	}

	public void setDadosBeneficio(DadosBeneficio dadosBeneficio) {
		this.dadosBeneficio = dadosBeneficio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dadosBeneficio, dtAltBeneficio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoBenAlteracao other = (InfoBenAlteracao) obj;
		return Objects.equals(dadosBeneficio, other.dadosBeneficio)
				&& Objects.equals(dtAltBeneficio, other.dtAltBeneficio);
	}
	
}
