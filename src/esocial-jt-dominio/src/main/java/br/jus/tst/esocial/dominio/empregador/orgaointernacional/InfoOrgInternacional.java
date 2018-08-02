package br.jus.tst.esocial.dominio.empregador.orgaointernacional;

import javax.validation.constraints.NotNull;

/**
 *
 * Informações exclusivas de organismos internacionais e outras instituições
 * extraterritoriais
 */
public class InfoOrgInternacional {

	/**
	 * Indicativo da existência de acordo internacional para isenção de multa: 0 -
	 * Sem acordo; 1 - Com acordo. Valores Válidos: 0, 1.
	 */
	@NotNull
	private Byte indAcordoIsenMulta;

	/**
	 * <p>
	 * Indicativo da existência de acordo internacional para isenção de multa:
	 * </p>
	 * 0 - Sem acordo; 1 - Com acordo.
	 * <p>
	 * Valores Válidos: 0, 1.
	 * </p>
	 *
	 * @return the indAcordoIsenMulta
	 */
	public Byte getIndAcordoIsenMulta() {
		return indAcordoIsenMulta;
	}

	/**
	 * <p>
	 * Indicativo da existência de acordo internacional para isenção de multa:
	 * </p>
	 * 0 - Sem acordo; 1 - Com acordo.
	 * <p>
	 * Valores Válidos: 0, 1.
	 * </p>
	 *
	 * @param indAcordoIsenMulta
	 *            the indAcordoIsenMulta to set
	 */
	public void setIndAcordoIsenMulta(Byte acordoIsencaoMulta) {
		this.indAcordoIsenMulta = acordoIsencaoMulta;
	}
}
