package br.jus.tst.esocial.dominio.vinculo;

import java.util.Calendar;

public class MudancaCPF {

	private String novoCPF;
	private String cpfAnt;
	private String matricAnt;
	private Calendar dtAltCPF;
	private String observacao;

	public String getNovoCPF() {
		return novoCPF;
	}

	public void setNovoCPF(String novoCPF) {
		this.novoCPF = novoCPF;
	}

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