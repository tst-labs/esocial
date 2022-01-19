package br.jus.tst.esocialjt.auto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "StatusAutomacao")
public class Status {
	@Schema(description = "Nome do executor do processamento automático")
	private String descricao;
	@Schema(description = "Indica se a execução está habilitada.")
	private boolean habilitado;
	@Schema(description = "Período em milisegundos entre cada ciclo de execução")
	private Long periodoMilis;

	public Status() {
	}

	public Status(String descricao, boolean habilitado, Long periodoMilis) {
		this.descricao = descricao;
		this.habilitado = habilitado;
		this.periodoMilis = periodoMilis;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Long getPeriodoMilis() {
		return periodoMilis;
	}

	public void setPeriodoMilis(Long periodoMilis) {
		this.periodoMilis = periodoMilis;
	}

	@Override
	public String toString() {
		return descricao + " [habilitado=" + habilitado + ", periodoMilis=" + periodoMilis + "]";
	}

}
