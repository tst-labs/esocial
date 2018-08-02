package br.jus.tst.esocial.dominio.tabela.lotacao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.validacao.CheckDate;

/**
 * 
 * Informações de identificação da lotação e validade das informações que estão
 * sendo incluídas
 *
 */
public class IdeLotacao {

	@NotNull
	@Pattern(regexp = "/^!eSocial.*")
	private String codLotacao;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;

	public String getCodLotacao() {
		return codLotacao;
	}

	/**
	 * Informar o código atribuído pela empresa para a lotação tributária.</br>
	 * </br>
	 * <b>Validação:</b> O código atribuído não pode conter a expressão
	 * "eSocial" nas 7 primeiras posições.
	 * 
	 * @param codLotacao
	 * @return
	 */
	public IdeLotacao setCodLotacao(String codLotacao) {
		this.codLotacao = codLotacao;
		return this;
	}

	public String getIniValid() {
		return iniValid;
	}

	/**
	 * Preencher com o mês e ano de início da validade das informações prestadas
	 * no evento, no formato AAAA-MM.</br>
	 * </br>
	 * <b>Validação:</b> Deve ser uma data válida, igual ou posterior à data
	 * inicial de implantação do eSocial, no formato AAAA-MM.
	 * 
	 * @param iniValid
	 * @return IdeLotacao
	 */
	public IdeLotacao setIniValid(String iniValid) {
		this.iniValid = iniValid;
		return this;
	}

	public String getFimValid() {
		return fimValid;
	}

	/**
	 * Preencher com o mês e ano de término da validade das informações, se
	 * houver.</br>
	 * </br>
	 * <b>Validação:</b> Se informado, deve estar no formato AAAA-MM e ser um
	 * período igual ou posterior a Data inicio.
	 * 
	 * @param fimValid
	 * @return IdeLotacao
	 */
	public IdeLotacao setFimValid(String fimValid) {
		this.fimValid = fimValid;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof IdeLotacao)) {
			return false;
		}
		IdeLotacao castOther = (IdeLotacao) other;
		return new EqualsBuilder().append(codLotacao, castOther.codLotacao).append(iniValid, castOther.iniValid)
				.append(fimValid, castOther.fimValid).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(codLotacao).append(iniValid).append(fimValid).toHashCode();
	}
}
