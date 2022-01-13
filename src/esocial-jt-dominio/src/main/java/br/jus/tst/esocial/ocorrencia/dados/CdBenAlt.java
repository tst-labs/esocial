package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.alteracao.InfoBenAlteracao;

public class CdBenAlt extends DadosOcorrencia {
	
	@Valid
	@NotNull
	private IdeBeneficio ideBeneficio;
	
	@Valid
	@NotNull
	private InfoBenAlteracao infoBenAlteracao;

	public IdeBeneficio getIdeBeneficio() {
		return ideBeneficio;
	}

	public void setIdeBeneficio(IdeBeneficio ideBeneficio) {
		this.ideBeneficio = ideBeneficio;
	}

	public InfoBenAlteracao getInfoBenAlteracao() {
		return infoBenAlteracao;
	}

	public void setInfoBenAlteracao(InfoBenAlteracao infoBenAlteracao) {
		this.infoBenAlteracao = infoBenAlteracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ideBeneficio, infoBenAlteracao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CdBenAlt other = (CdBenAlt) obj;
		return Objects.equals(ideBeneficio, other.ideBeneficio)
				&& Objects.equals(infoBenAlteracao, other.infoBenAlteracao);
	}
}
