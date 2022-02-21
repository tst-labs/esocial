package br.jus.tst.esocialjt.ocorrencia;

public class ContagemEstado {
	
	private long estado;
	private long total;
	
	public ContagemEstado(long estado, long total) {
		super();
		this.estado = estado;
		this.total = total;
	}

	public Long getEstado() {
		return estado;
	}

	public Long getTotal() {
		return total;
	}

}
