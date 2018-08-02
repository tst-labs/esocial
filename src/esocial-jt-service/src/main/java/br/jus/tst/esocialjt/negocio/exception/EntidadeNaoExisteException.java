package br.jus.tst.esocialjt.negocio.exception;

/**
 * Classe que representa uma exceção de negócio lançada quando tenta-se executar uma operação com uma entidade  que não existe.
 * @author "pedro.vasconcelos"
 *
 */
public class EntidadeNaoExisteException extends Exception {

    public EntidadeNaoExisteException(String message) {
		super(message);
	}

	public EntidadeNaoExisteException(String message, Throwable cause) {
		super(message, cause);
	}

	public EntidadeNaoExisteException() {
	}

	private static final long serialVersionUID = 1L;

}