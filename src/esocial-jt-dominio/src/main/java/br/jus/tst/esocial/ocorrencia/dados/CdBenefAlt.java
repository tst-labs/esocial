package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficiario.alteracao.Alteracao;
import br.jus.tst.esocial.dominio.beneficiario.alteracao.IdeBenef;

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
}
