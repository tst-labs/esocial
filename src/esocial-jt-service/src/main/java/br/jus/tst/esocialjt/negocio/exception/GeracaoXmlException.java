package br.jus.tst.esocialjt.negocio.exception;

import br.jus.tst.esocialjt.dominio.Evento;

public class GeracaoXmlException extends Exception {

	private static final long serialVersionUID = 1L;

	public GeracaoXmlException() {
		super();
	}

	public GeracaoXmlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GeracaoXmlException(String message, Throwable cause) {
		super(message, cause);
	}

	public GeracaoXmlException(String message) {
		super(message);
	}

	public GeracaoXmlException(Throwable cause) {
		super(cause);
	}
	
	public GeracaoXmlException(Evento evento, String message, Throwable cause) {
		super("Evento "+evento.getId()+": "+message, cause);
	}

	public GeracaoXmlException(Evento evento, String message) {
		super("Evento "+evento.getId()+": "+message);
	}

}
