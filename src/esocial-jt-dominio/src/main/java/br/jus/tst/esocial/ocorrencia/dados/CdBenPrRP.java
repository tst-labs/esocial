package br.jus.tst.esocial.ocorrencia.dados;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.beneficiario.IdeBenef;
import br.jus.tst.esocial.dominio.beneficio.InfoBeneficio;

public class CdBenPrRP extends DadosOcorrencia {

	private IdeBenef ideBenef;
	
	private InfoBeneficio infoBeneficio;

	public IdeBenef getIdeBenef() {
		return ideBenef;
	}

	public void setIdeBenef(IdeBenef ideBenef) {
		this.ideBenef = ideBenef;
	}

	public InfoBeneficio getInfoBeneficio() {
		return infoBeneficio;
	}

	public void setInfoBeneficio(InfoBeneficio infoBeneficio) {
		this.infoBeneficio = infoBeneficio;
	}
		

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof CdBenPrRP)) {
			return false;
		}
		CdBenPrRP castOther = (CdBenPrRP) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador).append(ideBenef, castOther.ideBenef).append(infoBeneficio, castOther.infoBeneficio)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(ideBenef).append(infoBeneficio).toHashCode();
	}

}
