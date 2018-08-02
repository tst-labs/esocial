package br.jus.tst.esocialjt.negocio.exception;

public class ValidacaoXMLException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4988428650063007226L;

	public ValidacaoXMLException(String descricao, Exception e) {
		super(descricao, e);
	}
}
