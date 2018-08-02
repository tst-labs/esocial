package br.jus.tst.esocialjt.producaorestrita;

public class ProducaoRestritaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProducaoRestritaException() {
		super();
	}

	public ProducaoRestritaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProducaoRestritaException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProducaoRestritaException(String message) {
		super(message);
	}

	public ProducaoRestritaException(Throwable cause) {
		super(cause);
	}

}
