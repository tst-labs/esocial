package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Informações relativas ao Cadastro da Atividade Econômica da Pessoa Física -
 * CAEPF.
 *
 */
public class InfoCaepf {

	private byte tpCaepf;

	public byte getTpCaepf() {
		return tpCaepf;
	}

	/**
	 * 
	 * <p>
	 * Tipo de CAEPF:
	 * </p>
	 * 
	 * 1 - Contribuinte Individual;</br>
	 * 2 - Produtor Rural;</br>
	 * 3 - Segurado Especial.</br>
	 * Validação: </br>
	 * Deve ser compatível com o cadastro da RFB. Valores Válidos: 1, 2, 3.
	 * 
	 * @param tpCaepf
	 * @return InfoCaepf
	 */
	@Valid
	@NotNull
	public InfoCaepf setTpCaepf(byte tpCaepf) {
		this.tpCaepf = tpCaepf;
		return this;
	}
}
