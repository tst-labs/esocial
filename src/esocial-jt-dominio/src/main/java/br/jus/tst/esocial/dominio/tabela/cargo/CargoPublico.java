package br.jus.tst.esocial.dominio.tabela.cargo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 
 * Detalhamento de informações exclusivas para Cargos e Empregos Públicos
 *
 */
public class CargoPublico {

	@NotNull
	private byte acumCargo;

	@NotNull
	private byte contagemEsp;

	@NotNull
	private String dedicExcl;

	@NotNull
	@Valid
	private LeiCargo leiCargo;

	/**
	 * 
	 * @return Lei que criou/extinguiu/reestruturou o cargo
	 */
	public LeiCargo getLeiCargo() {
		return leiCargo;
	}

	/**
	 * Lei que criou/extinguiu/reestruturou o cargo
	 * 
	 * @param leiCargo
	 * @return Cargo Público
	 */
	public CargoPublico setLeiCargo(LeiCargo leiCargo) {
		this.leiCargo = leiCargo;
		return this;
	}

	/**
	 * 
	 * @return Indicativo se é cargo de dedicação exclusiva.
	 */
	public String getDedicExcl() {
		return dedicExcl;
	}

	/**
	 * Indicar se é cargo de dedicação exclusiva.
	 * 
	 * @param dedicExcl
	 * @return Cargo Público
	 */
	public CargoPublico setDedicExcl(String dedicExcl) {
		this.dedicExcl = dedicExcl;
		return this;
	}

	/**
	 * @return Código que indica contagem especial: </br>
	 *         1 - Não;</br>
	 *         2 - Professor (Infantil, Fundamental e Médio);</br>
	 *         3 - Professor de Ensino Superior, Magistrado, Membro de
	 *         Ministério Público,Membro do Tribunal de Contas (com ingresso
	 *         anterior a 16/12/1998 EC nr. 20/98);</br>
	 *         4 - Atividade de risco.</br>
	 */
	public byte getContagemEsp() {
		return contagemEsp;
	}

	/**
	 * <p>
	 * Preencher com o código correspondente a possibilidade de contagem de
	 * tempo especial:
	 * </p>
	 * </br>
	 * 1 - Não;</br>
	 * 2 - Professor (Infantil, Fundamental e Médio);</br>
	 * 3 - Professor de Ensino Superior, Magistrado, Membro de Ministério
	 * Público,Membro do Tribunal de Contas (com ingresso anterior a 16/12/1998
	 * EC nr. 20/98);</br>
	 * 4 - Atividade de risco.</br>
	 * 
	 * @param contagemEsp
	 * @return CargoPublico
	 */
	public CargoPublico setContagemEsp(byte contagemEsp) {
		this.contagemEsp = contagemEsp;
		return this;
	}

	/**
	 * 
	 * @return O código correspondente à possibilidade de acumulação de cargos.
	 *         </br>
	 *         </br>
	 *         1 - Não acumulável;</br>
	 *         2 - Profissional de Saúde;</br>
	 *         3 - Professor;</br>
	 *         4 - Técnico/Científico.</br>
	 */
	public byte getAcumCargo() {
		return acumCargo;
	}

	/**
	 * <p>
	 * Preencher com o código correspondente à possibilidade de acumulação de
	 * cargos:
	 * </p>
	 * </br>
	 * 1 - Não acumulável;</br>
	 * 2 - Profissional de Saúde;</br>
	 * 3 - Professor;</br>
	 * 4 - Técnico/Científico.</br>
	 * 
	 * @param acumCargo
	 * @return CargoPublico
	 */
	public CargoPublico setAcumCargo(byte acumCargo) {
		this.acumCargo = acumCargo;
		return this;
	}

}
