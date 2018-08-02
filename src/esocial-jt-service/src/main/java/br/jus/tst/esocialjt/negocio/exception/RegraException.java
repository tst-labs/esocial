package br.jus.tst.esocialjt.negocio.exception;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.evento.EventoDTO;

public class RegraException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String MSG = "Evento %s: %s";

	public RegraException() {
		super();
	}

	public RegraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RegraException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegraException(String message) {
		super(message);
	}

	public RegraException(Throwable cause) {
		super(cause);
	}
	
	public RegraException(Evento evento, String message, Throwable cause) {
		super(String.format(MSG, evento.getId(), message), cause);
	}

	public RegraException(Evento evento, String message) {
		super(String.format(MSG, evento.getId(), message));
	}
	
	public RegraException(EventoDTO evento, String message, Throwable cause) {
		super(String.format(MSG, evento.getId(), message));
	}

	public RegraException(EventoDTO evento, String message) {
		super(String.format(MSG, evento.getId(), message));
	}

}
