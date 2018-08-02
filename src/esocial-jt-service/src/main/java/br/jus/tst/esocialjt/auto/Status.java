package br.jus.tst.esocialjt.auto;

public class Status {
	private String descricao;
	private boolean habilitado;
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
