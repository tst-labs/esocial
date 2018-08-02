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

	@Size(min = 1, max = 40)
	private String nrRecInfPrelim;

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
	private Afastamento afastamento;
	
	@Valid
	private Desligamento desligamento;
	
	public String getMatricula() {
		return matricula;
	}

	public Vinculo setMatricula(String matricula) {
		this.matricula = matricula;
		return this;
	}

	public byte getTpRegTrab() {
		return tpRegTrab;
	}

	public Vinculo setTpRegTrab(byte tipoRegimeTrabalhista) {
		this.tpRegTrab = tipoRegimeTrabalhista;
		return this;
	}

	public byte getTpRegPrev() {
		return tpRegPrev;
	}

	public Vinculo setTpRegPrev(byte tipoRegimePrevidencia) {
		this.tpRegPrev = tipoRegimePrevidencia;
		return this;
	}

	public String getNrRecInfPrelim() {
		return nrRecInfPrelim;
	}

	public Vinculo setNrRecInfPrelim(String numeroReciboInfoPreliminares) {
		this.nrRecInfPrelim = numeroReciboInfoPreliminares;
		return this;
	}

	public InfoRegimeTrab getInfoRegimeTrab() {
		return infoRegimeTrab;
	}

	public Vinculo setInfoRegimeTrab(InfoRegimeTrab regimeTrabalhista) {
		this.infoRegimeTrab = regimeTrabalhista;
		return this;
	}

	public InfoContrato getInfoContrato() {
		return infoContrato;
	}

	public Vinculo setInfoContrato(InfoContrato contrato) {
		this.infoContrato = contrato;
		return this;
	}

	public SucessaoVinc getSucessaoVinc() {
		return sucessaoVinc;
	}

	public Vinculo setSucessaoVinc(SucessaoVinc sucessaoVinculo) {
		this.sucessaoVinc = sucessaoVinculo;
		return this;
	}

	public String getCadIni() {
		return cadIni;
	}

	public Vinculo setCadIni(String indCadastroInicial) {
		this.cadIni = indCadastroInicial;
		return this;
	}

	public TransfDom getTransfDom() {
		return transfDom;
	}

	public Vinculo setTransfDom(TransfDom transfDom) {
		this.transfDom = transfDom;
		return this;
	}

	public Afastamento getAfastamento() {
		return afastamento;
	}

	public Vinculo setAfastamento(Afastamento afastamento) {
		this.afastamento = afastamento;
		return this;
	}

	public Desligamento getDesligamento() {
		return desligamento;
	}

	public Vinculo setDesligamento(Desligamento desligamento) {
		this.desligamento = desligamento;
		return this;
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
