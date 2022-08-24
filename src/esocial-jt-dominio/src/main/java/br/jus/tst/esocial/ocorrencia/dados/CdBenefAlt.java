package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.beneficiario.alteracao.Alteracao;
import br.jus.tst.esocial.dominio.beneficiario.alteracao.IdeBenef;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

public class CdBenefAlt extends DadosOcorrencia {
	
	@Valid
	@NotNull
	private IdeBenef ideBenef;
	
	@Valid
	@NotNull
	private Alteracao alteracao;

	public IdeBenef getIdeBenef() {
		return ideBenef;
	}

	public void setIdeBenef(IdeBenef ideBenef) {
		this.ideBenef = ideBenef;
	}

	public Alteracao getAlteracao() {
		return alteracao;
	}

	public void setAlteracao(Alteracao alteracao) {
		this.alteracao = alteracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alteracao, ideBenef);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CdBenefAlt other = (CdBenefAlt) obj;
		return Objects.equals(alteracao, other.alteracao) && Objects.equals(ideBenef, other.ideBenef);
	}

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(alteracao)
				.map(Alteracao::getDtAlteracao)
				.orElse(null);
	}
	
	@Override
	public String getCpf() {
		return Optional
				.ofNullable(ideBenef)
				.map(IdeBenef::getCpfBenef)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
