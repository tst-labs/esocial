package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.alteracao.InfoBenAlteracao;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional
				.ofNullable(infoBenAlteracao)
				.map(InfoBenAlteracao::getDtAltBeneficio)
				.orElse(null);
	}

	@Override
	public String getCpf() {
		return Optional
				.ofNullable(ideBeneficio)
				.map(IdeBeneficio::getCpfBenef)
				.orElse(null);
	}

	@Override
	public String getMatricula() {
		return null;
	}
}
