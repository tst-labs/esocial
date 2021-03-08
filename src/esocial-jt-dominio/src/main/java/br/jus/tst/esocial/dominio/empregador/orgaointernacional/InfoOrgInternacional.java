package br.jus.tst.esocial.dominio.empregador.orgaointernacional;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.indAcordoIsenMulta)
			.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final InfoOrgInternacional other = (InfoOrgInternacional) obj;
		
		return new EqualsBuilder()
				.append(this.indAcordoIsenMulta, other.indAcordoIsenMulta)
				.isEquals();
	}
}
