package br.jus.tst.esocial.dominio.tabela.lotacao;

import javax.validation.constraints.NotNull;

/**
 * 
 * Informação complementar que apresenta identificação do contratante e do
 * proprietário de obra de construção civil contratada sob regime de empreitada
 * parcial ou subempreitada. A informação é preenchida exclusivamente para
 * lotações cujo {tpLotacao} seja igual a [2].
 *
 */
public class InfoEmprParcial {

	@NotNull
	private byte tpInscContrat;

	@NotNull
	private String nrInscContrat;

	@NotNull
	private Byte tpInscProp;

	@NotNull
	private String nrInscProp;

	public String getNrInscProp() {
		return nrInscProp;
	}

	/**
	 * Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO.
	 * </br>
	 * </br>
	 * <b>Validação:</b> Deve ser um CNPJ ou CPF válido, conforme indicado em
	 * {tpInscProp}, e constar como responsável no cadastro do CNO
	 * 
	 * @param nrInscProp
	 * @return
	 */
	public InfoEmprParcial setNrInscProp(String nrInscProp) {
		this.nrInscProp = nrInscProp;
		return this;
	}

	public Byte getTpInscProp() {
		return tpInscProp;
	}

	/**
	 * Tipo de Inscrição do proprietário do CNO.</br>
	 * </br>
	 * <b>Validação:>/b> Deve ser igual a [1] (CNPJ) ou [2] (CPF)
	 * 
	 * @param tpInscProp
	 * @return
	 */
	public InfoEmprParcial setTpInscProp(Byte tpInscProp) {
		this.tpInscProp = tpInscProp;
		return this;
	}

	public String getNrInscContrat() {
		return nrInscContrat;
	}

	/**
	 * Número de Inscrição (CNPJ/CPF) do Contrante.</br>
	 * </br>
	 * <b>Validação:</b> Deve ser um número de CNPJ ou CPF válido.
	 * 
	 * @param nrInscContrat
	 * @return
	 */

	public InfoEmprParcial setNrInscContrat(String nrInscContrat) {
		this.nrInscContrat = nrInscContrat;
		return this;
	}

	public byte getTpInscContrat() {
		return tpInscContrat;
	}

	/**
	 * Tipo de Inscrição do contratante: </br>
	 * 1 - CNPJ;</br>
	 * 2 - CPF.
	 * 
	 * @param tpInscContrat
	 * @return InfoEmprParcial
	 */
	public InfoEmprParcial setTpInscContrat(byte tpInscContrat) {
		this.tpInscContrat = tpInscContrat;
		return this;
	}

}
