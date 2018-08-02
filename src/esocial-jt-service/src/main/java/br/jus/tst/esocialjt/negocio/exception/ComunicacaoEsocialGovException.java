package br.jus.tst.esocialjt.negocio.exception;

public class ComunicacaoEsocialGovException extends Exception{

	private static final long serialVersionUID = 1L;

	public ComunicacaoEsocialGovException() {
		super();
	}

	public ComunicacaoEsocialGovException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ComunicacaoEsocialGovException(String message, Throwable cause) {
		super(message, cause);
	}

	public ComunicacaoEsocialGovException(String message) {
		super(message);
	}

	public ComunicacaoEsocialGovException(Throwable cause) {
		super(cause);
	}

}
