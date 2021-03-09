package br.jus.tst.esocial.dominio.vinculo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Vinculo {

	@NotNull
	@Size(min = 1, max = 30)
	private String matricula;

	@NotNull
	private byte tpRegTrab;

	@NotNull
	private byte tpRegPrev;

	@NotNull
	private String cadIni;

	@NotNull
	@Valid
	private InfoRegimeTrab infoRegimeTrab;

	@NotNull
	@Valid
	private InfoContrato infoContrato;

	@Valid
	private SucessaoVinc sucessaoVinc;
	
	@Valid
	private TransfDom transfDom;

	@Valid
	private MudancaCPF mudancaCPF;

	@Valid
	private Afastamento afastamento;
	
	@Valid
	private Desligamento desligamento;

	@Valid
	private Cessao cessao;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public byte getTpRegTrab() {
		return tpRegTrab;
	}

	public void setTpRegTrab(byte tpRegTrab) {
		this.tpRegTrab = tpRegTrab;
	}

	public byte getTpRegPrev() {
		return tpRegPrev;
	}

	public void setTpRegPrev(byte tpRegPrev) {
		this.tpRegPrev = tpRegPrev;
	}

	public String getCadIni() {
		return cadIni;
	}

	public void setCadIni(String cadIni) {
		this.cadIni = cadIni;
	}

	public InfoRegimeTrab getInfoRegimeTrab() {
		return infoRegimeTrab;
	}

	public void setInfoRegimeTrab(InfoRegimeTrab infoRegimeTrab) {
		this.infoRegimeTrab = infoRegimeTrab;
	}

	public InfoContrato getInfoContrato() {
		return infoContrato;
	}

	public void setInfoContrato(InfoContrato infoContrato) {
		this.infoContrato = infoContrato;
	}

	public SucessaoVinc getSucessaoVinc() {
		return sucessaoVinc;
	}

	public void setSucessaoVinc(SucessaoVinc sucessaoVinc) {
		this.sucessaoVinc = sucessaoVinc;
	}

	public TransfDom getTransfDom() {
		return transfDom;
	}

	public void setTransfDom(TransfDom transfDom) {
		this.transfDom = transfDom;
	}

	public MudancaCPF getMudancaCPF() {
		return mudancaCPF;
	}

	public void setMudancaCPF(MudancaCPF mudancaCPF) {
		this.mudancaCPF = mudancaCPF;
	}

	public Afastamento getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(Afastamento afastamento) {
		this.afastamento = afastamento;
	}

	public Desligamento getDesligamento() {
		return desligamento;
	}

	public void setDesligamento(Desligamento desligamento) {
		this.desligamento = desligamento;
	}

	public Cessao getCessao() {
		return cessao;
	}

	public void setCessao(Cessao cessao) {
		this.cessao = cessao;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Vinculo)) {
			return false;
		}
		Vinculo castOther = (Vinculo) other;
		return new EqualsBuilder().append(matricula, castOther.matricula).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(matricula).toHashCode();
	}
}
