package br.jus.tst.esocial.dominio.tabela.cargo;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Lei que criou/extinguiu/reestruturou o cargo.
 *
 */
public class LeiCargo {

	@NotNull
	@Length(min = 1, max = 12)
	private String nrLei;

	@NotNull
	private Calendar dtLei;

	@NotNull
	private byte sitCargo;

	/**
	 * <p>
	 * Situação gerada pela Lei. Preencher com uma das opções:
	 * </p>
	 * </br>
	 * 1 - Criação;</br>
	 * 2 - Extinção;</br>
	 * 3 - Reestruturação.</br>
	 * 
	 * @param sitCargo
	 */
	public LeiCargo setSitCargo(byte sitCargo) {
		this.sitCargo = sitCargo;
		return this;
	}

	/**
	 * 
	 * @return Situação do cargo gerada pela Lei.
	 */
	public byte getSitCargo() {
		return sitCargo;
	}

	/**
	 * Data da Lei
	 * 
	 * @param dtLei
	 */
	public LeiCargo setDtLei(Calendar dtLei) {
		this.dtLei = dtLei;
		return this;
	}

	/**
	 * 
	 * @return Data da lei.
	 */
	public Calendar getDtLei() {
		return dtLei;
	}

	/**
	 * Número da Lei
	 * 
	 * @param nrLei
	 * @return LeiCargo
	 */
	public LeiCargo setNrLei(String nrLei) {
		this.nrLei = nrLei;
		return this;
	}

	/**
	 * 
	 * @return Número da Lei.
	 */
	public String getNrLei() {
		return nrLei;
	}
}
