package br.jus.tst.esocial.dominio.semvinculo;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.vinculo.Remuneracao;

public class InfoComplementares {
	
	@Valid
	private CargoFuncao cargoFuncao;

	@Valid
	private Remuneracao remuneracao;
	
	@Valid
	private FGTS fgts;
	
	@Valid
	private InfoDirigenteSindical infoDirigenteSindical;
	
	@Valid
	private InfoTrabCedido infoTrabCedido;
	
	@Valid
	private InfoEstagiario infoEstagiario;
	
	@Valid
	private InfoMandElet infoMandElet;

	public CargoFuncao getCargoFuncao() {
		return cargoFuncao;
	}

	public InfoComplementares setCargoFuncao(CargoFuncao cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
		return this;
	}

	public Remuneracao getRemuneracao() {
		return remuneracao;
	}

	public InfoComplementares setRemuneracao(Remuneracao remuneracao) {
		this.remuneracao = remuneracao;
		return this;
	}

	public FGTS getFGTS() {
		return fgts;
	}

	public InfoComplementares setFGTS(FGTS fgts) {
		this.fgts = fgts;
		return this;
	}

	public InfoDirigenteSindical getInfoDirigenteSindical() {
		return infoDirigenteSindical;
	}

	public InfoComplementares setInfoDirigenteSindical(InfoDirigenteSindical infoDirigenteSocial) {
		this.infoDirigenteSindical = infoDirigenteSocial;
		return this;
	}

	public InfoTrabCedido getInfoTrabCedido() {
		return infoTrabCedido;
	}

	public InfoComplementares setInfoTrabCedido(InfoTrabCedido infoTrabalhadorCedido) {
		this.infoTrabCedido = infoTrabalhadorCedido;
		return this;
	}

	public InfoEstagiario getInfoEstagiario() {
		return infoEstagiario;
	}

	public InfoComplementares setInfoEstagiario(InfoEstagiario infoEstagiario) {
		this.infoEstagiario = infoEstagiario;
		return this;
	}

	public InfoMandElet getInfoMandElet() {
		return infoMandElet;
	}

	public void setInfoMandElet(InfoMandElet infoMandElet) {
		this.infoMandElet = infoMandElet;
	}

}
