package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.termino.InfoBenTermino;

public class CdBenTerm extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeBeneficio ideBeneficio;

	@Valid
	@NotNull
	private InfoBenTermino infoBenTermino;

	public IdeBeneficio getIdeBeneficio() {
		return ideBeneficio;
	}

	public void setIdeBeneficio(IdeBeneficio ideBeneficio) {
		this.ideBeneficio = ideBeneficio;
	}

	public InfoBenTermino getInfoBenTermino() {
		return infoBenTermino;
	}

	public void setInfoBenTermino(InfoBenTermino infoBenTermino) {
		this.infoBenTermino = infoBenTermino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ideBeneficio, infoBenTermino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CdBenTerm other = (CdBenTerm) obj;
		return Objects.equals(ideBeneficio, other.ideBeneficio) && Objects.equals(infoBenTermino, other.infoBenTermino);
	}

}
