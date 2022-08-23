package br.jus.tst.esocial.ocorrencia.dados;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.termino.InfoBenTermino;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Objects;
import java.util.Optional;

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

	@Override
	public Calendar getDataEvento() {
		return Optional.ofNullable(infoBenTermino)
				.map(InfoBenTermino::getDtTermBeneficio)
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
