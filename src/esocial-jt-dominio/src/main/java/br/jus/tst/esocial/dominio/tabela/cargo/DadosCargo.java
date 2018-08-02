package br.jus.tst.esocial.dominio.tabela.cargo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

/**
 * Detalhamento das informações do cargo.
 */
public class DadosCargo {
	@NotNull
	@Length(min = 1, max = 100)
	private String nmCargo;

	@NotNull
	@Length(min = 6, max = 6)
	@Pattern(regexp = "\\d{4,6}")
	private String codCBO;

	@Valid
	private CargoPublico cargoPublico;

	public CargoPublico getCargoPublico() {
		return cargoPublico;
	}

	public DadosCargo setCargoPublico(CargoPublico cargoPublico) {
		this.cargoPublico = cargoPublico;
		return this;
	}

	/**
	 * <p>
	 * <b>Classificação Brasileira de Ocupação - CBO.</b>
	 * </p>
	 * </br>
	 * <b>Validação:</b> Deve ser um código existente na tabela de CBO, com 6
	 * (seis) posições.
	 * 
	 * @param codCBO
	 */
	public DadosCargo setCodCBO(String codCBO) {
		this.codCBO = codCBO;
		return this;
	}

	/**
	 * Classificação Brasileira de Ocupação - CBO.
	 * 
	 * @return Código CBO
	 */
	public String getCodCBO() {
		return codCBO;
	}

	/**
	 * Preencher com o nome do cargo
	 * 
	 * @param nmCargo
	 */
	public DadosCargo setNmCargo(String nmCargo) {
		this.nmCargo = nmCargo;
		return this;
	}

	/**
	 * @return Nome do cargo
	 */
	public String getNmCargo() {
		return nmCargo;
	}
}
