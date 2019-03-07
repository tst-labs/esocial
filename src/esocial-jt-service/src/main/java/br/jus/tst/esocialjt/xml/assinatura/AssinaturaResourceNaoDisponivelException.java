package br.jus.tst.esocialjt.xml.assinatura;

public class AssinaturaResourceNaoDisponivelException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AssinaturaResourceNaoDisponivelException() {
		super("O servico de assinatura nao esta disponivel. Verifique a propriedade \"esocialjt.disponibilizarServicoAssinatura\".");
	}

}
