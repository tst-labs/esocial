package br.jus.tst.esocial.dominio.semvinculo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

public class InfoEstagiario {
	
	@NotNull
	@Length(min=1, max=1)
	private String natEstagio;
	
	@NotNull
	private byte nivEstagio;

	@Max(50)
	private String areaAtuacao;
	
	@Size(min=1, max=30)
	private String nrApol;
	
	private BigDecimal vlrBolsa;
	
	@NotNull
	private Calendar dtPrevTerm;
	
	@NotNull
	@Valid
	private InstEnsino instEnsino;
	
	@Valid
	private AgeIntegracao ageIntegracao;
	
	@Valid
	private SupervisorEstagio supervisorEstagio;

	public String getNatEstagio() {
		return natEstagio;
	}

	public InfoEstagiario setNatEstagio(String naturezaEstagio) {
		this.natEstagio = naturezaEstagio;
		return this;
	}

	public byte getNivEstagio() {
		return nivEstagio;
	}

	public InfoEstagiario setNivEstagio(byte nivelEstagio) {
		this.nivEstagio = nivelEstagio;
		return this;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public InfoEstagiario setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
		return this;
	}

	public String getNrApol() {
		return nrApol;
	}

	public InfoEstagiario setNrApol(String numeroApoliceSeguro) {
		this.nrApol = numeroApoliceSeguro;
		return this;
	}

	public BigDecimal getVlrBolsa() {
		return vlrBolsa;
	}

	public InfoEstagiario setVlrBolsa(BigDecimal valorBolsa) {
		this.vlrBolsa = valorBolsa;
		return this;
	}

	public Calendar getDtPrevTerm() {
		return dtPrevTerm;
	}

	public InfoEstagiario setDtPrevTerm(Calendar previsaoTermino) {
		this.dtPrevTerm = previsaoTermino;
		return this;
	}

	public InstEnsino getInstEnsino() {
		return instEnsino;
	}

	public InfoEstagiario setInstEnsino(InstEnsino instituicaoEnsino) {
		this.instEnsino = instituicaoEnsino;
		return this;
	}

	public AgeIntegracao getAgeIntegracao() {
		return ageIntegracao;
	}

	public InfoEstagiario setAgeIntegracao(AgeIntegracao agenteIntegracao) {
		this.ageIntegracao = agenteIntegracao;
		return this;
	}

	public SupervisorEstagio getSupervisorEstagio() {
		return supervisorEstagio;
	}

	public InfoEstagiario setSupervisorEstagio(SupervisorEstagio supervisorEstagio) {
		this.supervisorEstagio = supervisorEstagio;
		return this;
	}

}
