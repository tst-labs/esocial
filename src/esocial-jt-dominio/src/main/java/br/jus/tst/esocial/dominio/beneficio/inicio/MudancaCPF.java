package br.jus.tst.esocial.dominio.beneficio.inicio;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class MudancaCPF {

	@NotNull
	private String cpfAnt;

	@NotNull
	private String nrBeneficioAnt;

	@NotNull
	private Calendar dtAltCPF;

	private String observacao;

	public String getCpfAnt() {
		return cpfAnt;
	}

	public void setCpfAnt(String cpfAnt) {
		this.cpfAnt = cpfAnt;
	}

	public String getNrBeneficioAnt() {
		return nrBeneficioAnt;
	}

	public void setNrBeneficioAnt(String nrBeneficioAnt) {
		this.nrBeneficioAnt = nrBeneficioAnt;
	}

	public Calendar getDtAltCPF() {
		return dtAltCPF;
	}

	public void setDtAltCPF(Calendar dtAltCPF) {
		this.dtAltCPF = dtAltCPF;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
