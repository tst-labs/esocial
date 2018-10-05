package br.jus.tst.esocial.ocorrencia.dados;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.basestrabalhador.IdeEvento;
import br.jus.tst.esocial.dominio.basestrabalhador.InfoCp;
import br.jus.tst.esocial.dominio.basestrabalhador.InfoCpCalc;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;

public class BasesTrab extends DadosOcorrencia {

	@Valid
	private IdeEvento ideEvento;
	
	private IdeTrabalhador ideTrabalhador;
	
	private List<InfoCpCalc> infoCpCalc;
	
	private InfoCp infoCp;
	
	public IdeEvento getIdeEvento() {
		return ideEvento;
	}

	public void setIdeEvento(IdeEvento ideEvento) {
		this.ideEvento = ideEvento;
	}

	public IdeTrabalhador getIdeTrabalhador() {
		return ideTrabalhador;
	}

	public void setIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
		this.ideTrabalhador = ideTrabalhador;
	}

	public List<InfoCpCalc> getInfoCpCalc() {
		return infoCpCalc;
	}

	public void setInfoCpCalc(List<InfoCpCalc> infoCpCalc) {
		this.infoCpCalc = infoCpCalc;
	}

	public InfoCp getInfoCp() {
		return infoCp;
	}

	public void setInfoCp(InfoCp infoCp) {
		this.infoCp = infoCp;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof BasesTrab)) {
			return false;
		}
		BasesTrab castOther = (BasesTrab) other;
		return new EqualsBuilder()
					.append(ideEmpregador, castOther.ideEmpregador)
					.append(ideEvento, castOther.ideEvento)
					.append(ideTrabalhador, castOther.ideTrabalhador)
					.append(infoCpCalc, castOther.infoCpCalc)
					.append(infoCp, castOther.infoCp)
					.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(ideEmpregador)
					.append(ideEvento)
					.append(ideTrabalhador)
					.append(infoCpCalc)
					.append(infoCp)
					.toHashCode();
	}

}
