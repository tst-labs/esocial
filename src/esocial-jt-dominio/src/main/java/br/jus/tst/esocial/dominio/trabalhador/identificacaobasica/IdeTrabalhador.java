package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabalhador {

	@NotNull
	@CPF
	private String cpfTrab;

	private InfoMV infoMV;
	
	private InfoComplem infoComplem;
	
	private List<ProcJudTrab> procJudTrab;
	
	private List<InfoInterm> infoInterm;
	
	public String getCpfTrab() {
		return cpfTrab;
	}

	public void setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
	}

	public InfoMV getInfoMV() {
		return infoMV;
	}

	public void setInfoMV(InfoMV infoMV) {
		this.infoMV = infoMV;
	}

	public InfoComplem getInfoComplem() {
		return infoComplem;
	}

	public void setInfoComplem(InfoComplem infoComplem) {
		this.infoComplem = infoComplem;
	}

	public List<ProcJudTrab> getProcJudTrab() {
		return procJudTrab;
	}

	public void setProcJudTrab(List<ProcJudTrab> procJudTrab) {
		this.procJudTrab = procJudTrab;
	}

	public List<InfoInterm> getInfoInterm() {
		return infoInterm;
	}

	public void setInfoInterm(List<InfoInterm> infoInterm) {
		this.infoInterm = infoInterm;
	}

	@Override
    public boolean equals(Object other) {
		if (!(other instanceof IdeTrabalhador)) {
			return false;
		}
		IdeTrabalhador castOther = (IdeTrabalhador) other;
		return new EqualsBuilder().append(cpfTrab, castOther.cpfTrab).isEquals();
    }

    @Override
    public int hashCode() {
		return new HashCodeBuilder().append(cpfTrab).toHashCode();
    }	
}
