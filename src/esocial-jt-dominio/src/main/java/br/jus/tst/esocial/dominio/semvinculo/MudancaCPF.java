package br.jus.tst.esocial.dominio.semvinculo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class MudancaCPF {
	private String cpfAnt;
	private String matricAnt;
	@NotNull
	private Calendar dtAltCPF;
	private String observacao;

	public String getCpfAnt() {
		return cpfAnt;
	}

	public void setCpfAnt(String cpfAnt) {
		this.cpfAnt = cpfAnt;
	}

	public String getMatricAnt() {
		return matricAnt;
	}

	public void setMatricAnt(String matricAnt) {
		this.matricAnt = matricAnt;
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
