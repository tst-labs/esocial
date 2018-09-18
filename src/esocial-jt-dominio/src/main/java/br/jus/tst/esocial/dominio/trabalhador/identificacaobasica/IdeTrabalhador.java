package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

public class IdeTrabalhador {

	@NotNull
	@CPF
	private String cpfTrab;

	@NotNull
	@Size(min=11, max=11)
	private String nisTrab;
	
	private InfoMV infoMV;
	
	private InfoComplem infoComplem;
	
	private List<ProcJudTrab> procsJudsTrabs;
	
	private InfoInterm infoInterm;
	
	
	public String getCpfTrab() {
		return cpfTrab;
	}

	public void setCpfTrab(String cpfTrab) {
		this.cpfTrab = cpfTrab;
	}
	
    public String getNisTrab() {
		return nisTrab;
	}

	public void setNisTrab(String nisTrab) {
		this.nisTrab = nisTrab;
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

	public List<ProcJudTrab> getProcsJudsTrabs() {
		return procsJudsTrabs;
	}

	public void setProcsJudsTrabs(List<ProcJudTrab> procsJudsTrabs) {
		this.procsJudsTrabs = procsJudsTrabs;
	}

	public InfoInterm getInfoInterm() {
		return infoInterm;
	}

	public void setInfoInterm(InfoInterm infoInterm) {
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
