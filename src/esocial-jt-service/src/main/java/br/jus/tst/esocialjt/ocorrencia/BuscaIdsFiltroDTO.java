package br.jus.tst.esocialjt.ocorrencia;

import java.util.List;

public class BuscaIdsFiltroDTO {

	private List<Long> estados;
	private List<Long> tipos;
	private List<String> cpf;
	private List<String> periodoApuracao;

	public List<Long> getEstados() {
		return estados;
	}

	public void setEstados(List<Long> estados) {
		this.estados = estados;
	}

	public List<Long> getTipos() {
		return tipos;
	}

	public void setTipos(List<Long> tipos) {
		this.tipos = tipos;
	}


	public List<String> getCpf() {
		return cpf;
	}

	public void setCpf(List<String> cpf) {
		this.cpf = cpf;
	}

	public List<String> getPeriodoApuracao() {
		return periodoApuracao;
	}

	public void setPeriodoApuracao(List<String> periodoApuracao) {
		this.periodoApuracao = periodoApuracao;
	}
}

