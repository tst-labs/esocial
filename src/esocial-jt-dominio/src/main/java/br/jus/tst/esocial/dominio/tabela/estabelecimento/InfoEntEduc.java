package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Identificação da(s) entidade(s) educativa(s) ou de prática desportiva
 * 
 *
 */
public class InfoEntEduc {

	@NotNull
	@Pattern(regexp = "\\d{8,15}")
	private String nrInsc;

	public String getNrInsc() {
		return nrInsc;
	}

	/**
	 * Informar o número de inscrição da entidade educativa ou de prática
	 * desportiva. </br>
	 * Validação: Deve ser um número de CNPJ válido.
	 * 
	 * @param nrInsc
	 * @return InfoEntEduc
	 */
	public InfoEntEduc setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
		return this;
	}
}
