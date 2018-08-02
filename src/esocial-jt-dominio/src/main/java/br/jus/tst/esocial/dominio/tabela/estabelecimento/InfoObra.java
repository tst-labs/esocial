package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import javax.validation.constraints.Null;

/**
 * Registro preenchido exclusivamente por empresa construtora enquadrada nos
 * Arts. 7 a 9 da Lei 12.546/2011, relacionando os estabelecimentos inscritos no
 * CNO, para indicar a substituição ou não da contribuição patronal incidente
 * sobre a remuneração dos trabalhadores de obra de construção civil.
 * 
 *
 */
public class InfoObra {

	@Null
	private byte indSubstPatrObra;

	public byte getIndSubstPatrObra() {
		return indSubstPatrObra;
	}

	/**
	 * <p>
	 * Indicativo de Substituição da Contribuição Patronal de Obra de Construção
	 * Civil:
	 * </p>
	 * 1 - Contribuição Patronal Substituída; 2 - Contribuição Patronal Não
	 * Substituída. Valores Válidos: 1, 2.
	 * 
	 * @param indSubstPatrObra
	 */
	public void setIndSubstPatrObra(byte indSubstPatrObra) {
		this.indSubstPatrObra = indSubstPatrObra;
	}

}
