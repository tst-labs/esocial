package br.jus.tst.esocialjt.evento;

public class EventoDTO {
	private Long id;
	private Long codTipoEvento;

	public Long getId() {
		return id;
	}

	public EventoDTO setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getCodTipoEvento() {
		return codTipoEvento;
	}

	public EventoDTO setCodTipoEvento(Long codTipoEvento) {
		this.codTipoEvento = codTipoEvento;
		return this;
	}
}
