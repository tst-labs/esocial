package br.jus.tst.esocial.dominio.empregador.orgaopublico;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;

/**
 *
 * Informações relativas a Ente Federativo Responsável - EFR
 */
public class InfoEFR {
	
	@NotNull
	private String ideEFR;
	
	@CNPJ
	private String cnpjEFR;

	/**
	 * Determina se o órgão é um Ente Federativo
	 *
	 * @return Indicador de ente federativo
	 */

	public String getIdeEFR() {
		return ideEFR;
	}

	/**
	 * Informar se o Órgão Público é o Ente Federativo Responsável - EFR ou se é
	 * uma unidade administrativa autônoma vinculada a um EFR; S - É EFR; N -
	 * Não é EFR. Validação: Essa informação é validada no cadastro do CNPJ na
	 * RFB. Valores Válidos: S, N
	 *
	 * @param enteFederativo
	 *            the enteFederativo to set
	 */
	public void setIdeEFR(String nomeEnteFederativo) {
		this.ideEFR = nomeEnteFederativo;
	}

	/**
	 * @return the cnpjEFR
	 */
	public String getCnpjEFR() {
		return cnpjEFR;
	}

	/**
	 * <p>
	 * CNPJ do Ente Federativo Responsável - EFR
	 * </p>
	 * <p>
	 * Validação: Preenchimento obrigatório se é um ente federativo.
	 * </p>
	 * Informação validada no cadastro do CNPJ da RFB
	 *
	 * @param cnpjEFR
	 *            the cnpjEFR to set
	 */
	public void setCnpjEFR(String cnpj) {
		this.cnpjEFR = cnpj;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 29 * hash + Objects.hashCode(this.ideEFR);
		hash = 29 * hash + Objects.hashCode(this.cnpjEFR);
		return hash;
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
		final InfoEFR other = (InfoEFR) obj;
		if (!Objects.equals(this.ideEFR, other.ideEFR)) {
			return false;
		}
		if (!Objects.equals(this.cnpjEFR, other.cnpjEFR)) {
			return false;
		}
		return true;
	}
}
