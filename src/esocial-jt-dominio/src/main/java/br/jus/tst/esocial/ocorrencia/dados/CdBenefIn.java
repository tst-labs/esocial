package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficiario.inicio.Beneficiario;

public class CdBenefIn extends DadosOcorrencia {
	
	@Valid
	@NotNull
	private Beneficiario beneficiario;

	public Beneficiario getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(beneficiario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CdBenefIn other = (CdBenefIn) obj;
		return Objects.equals(beneficiario, other.beneficiario);
	}
}
