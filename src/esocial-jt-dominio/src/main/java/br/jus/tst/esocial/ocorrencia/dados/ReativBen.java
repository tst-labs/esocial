package br.jus.tst.esocial.ocorrencia.dados;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.reativacao.InfoReativ;

public class ReativBen extends DadosOcorrencia {

	@Valid
	@NotNull
	private IdeBeneficio ideBeneficio;

	@Valid
	@NotNull
	private InfoReativ infoReativ;

	public IdeBeneficio getIdeBeneficio() {
		return ideBeneficio;
	}

	public void setIdeBeneficio(IdeBeneficio ideBeneficio) {
		this.ideBeneficio = ideBeneficio;
	}

	public InfoReativ getInfoReativ() {
		return infoReativ;
	}

	public void setInfoReativ(InfoReativ infoReativ) {
		this.infoReativ = infoReativ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ideBeneficio, infoReativ);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReativBen other = (ReativBen) obj;
		return Objects.equals(ideBeneficio, other.ideBeneficio) && Objects.equals(infoReativ, other.infoReativ);
	}
}
