package br.jus.tst.esocial.dominio.tabela.ambiente;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

/**
 * Detalhamento das informações do ambiente.
 */
public class DadosAmbiente {
	
	@NotNull
	@Length(min = 1, max = 999)
	private String dscAmb;

	@NotNull
	private byte localAmb;

	@NotNull
    private byte tpInsc;

	@NotNull
	@Pattern(regexp="\\d{8,15}")
	private String nrInsc;

	@NotNull
	private List<FatorRisco> fatorRisco;

	/**
	 * @return the dscAmb
	 */
	public String getDscAmb() {
		return dscAmb;
	}

	/**
	 * @param dscAmb the dscAmb to set
	 * @return DadosAmbiente
	 */
	public DadosAmbiente setDscAmb(String dscAmb) {
		this.dscAmb = dscAmb;
		return this;
	}

	/**
	 * @return the localAmb
	 */
	public byte getLocalAmb() {
		return localAmb;
	}

	/**
	 * @param localAmb the localAmb to set
	 * @return DadosAmbiente
	 */
	public DadosAmbiente setLocalAmb(byte localAmb) {
		this.localAmb = localAmb;
		return this;
	}

	/**
	 * @return the tpInsc
	 */
	public byte getTpInsc() {
		return tpInsc;
	}

	/**
	 * @param tpInsc the tpInsc to set
	 * @return DadosAmbiente
	 */
	public DadosAmbiente setTpInsc(byte tpInsc) {
		this.tpInsc = tpInsc;
		return this;
	}

	/**
	 * @return the nrInsc
	 */
	public String getNrInsc() {
		return nrInsc;
	}

	/**
	 * @param nrInsc the nrInsc to set
	 * @return DadosAmbiente
	 */
	public DadosAmbiente setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
		return this;
	}

	/**
	 * @return the fatorRisco
	 */
	public List<FatorRisco> getFatorRisco() {
		return fatorRisco;
	}

	/**
	 * @param fatorRisco the fatorRisco to set
	 */
	public DadosAmbiente setFatorRisco(List<FatorRisco> fatorRisco) {
		this.fatorRisco = fatorRisco;
		return this;
	}
	
	
}
