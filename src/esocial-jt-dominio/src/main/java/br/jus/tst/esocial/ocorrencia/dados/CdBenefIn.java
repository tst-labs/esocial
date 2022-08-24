package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.beneficiario.inicio.Beneficiario;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(beneficiario)
				.map(Beneficiario::getDtInicio)
				.orElse(null);
	}
	
	@Override
	public String getCpf() {
		return Optional
				.ofNullable(beneficiario)
				.map(Beneficiario::getCpfBenef)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
