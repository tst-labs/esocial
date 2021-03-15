package br.jus.tst.esocial.dominio.vinculo;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.Duracao;

public class InfoContrato {
	
	@Size(min=1, max=100)
	private String nmCargo;
	
	@Size(min=6, max=6)
	private String cboCargo;

	private Calendar dtIngrCargo;
	
	private String nmFuncao;
	
	private String cboFuncao;
    
	private SimNao acumCargo;

    @NotNull
    private BigInteger codCateg;
	
    @Valid
	private Remuneracao remuneracao;
    
    @Valid
	private Duracao duracao;
	
	@Valid
	private LocalTrabalho localTrabalho;
	
	@Valid
	private HorContratual horContratual;
	
	@Valid
	private AlvaraJudicial alvaraJudicial;
	
	@Valid
	private List<Observacoes> observacoes;
	
	private List<TreiCap> treiCap;

	public String getNmCargo() {
		return nmCargo;
	}

	public void setNmCargo(String nmCargo) {
		this.nmCargo = nmCargo;
	}

	public Calendar getDtIngrCargo() {
		return dtIngrCargo;
	}

	public void setDtIngrCargo(Calendar dtIngrCargo) {
		this.dtIngrCargo = dtIngrCargo;
	}

	public String getNmFuncao() {
		return nmFuncao;
	}

	public void setNmFuncao(String nmFuncao) {
		this.nmFuncao = nmFuncao;
	}

	public String getCBOCargo() {
		return cboCargo;
	}

	public void setCBOCargo(String cBOCargo) {
		cboCargo = cBOCargo;
	}

	public String getCBOFuncao() {
		return cboFuncao;
	}

	public void setCBOFuncao(String cBOFuncao) {
		cboFuncao = cBOFuncao;
	}

	public SimNao getAcumCargo() {
		return acumCargo;
	}

	public void setAcumCargo(SimNao acumCargo) {
		this.acumCargo = acumCargo;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public Remuneracao getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(Remuneracao remuneracao) {
		this.remuneracao = remuneracao;
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public void setDuracao(Duracao duracao) {
		this.duracao = duracao;
	}

	public LocalTrabalho getLocalTrabalho() {
		return localTrabalho;
	}

	public void setLocalTrabalho(LocalTrabalho localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public HorContratual getHorContratual() {
		return horContratual;
	}

	public void setHorContratual(HorContratual horContratual) {
		this.horContratual = horContratual;
	}

	public AlvaraJudicial getAlvaraJudicial() {
		return alvaraJudicial;
	}

	public void setAlvaraJudicial(AlvaraJudicial alvaraJudicial) {
		this.alvaraJudicial = alvaraJudicial;
	}

	public List<Observacoes> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<Observacoes> observacoes) {
		this.observacoes = observacoes;
	}

	public List<TreiCap> getTreiCap() {
		return treiCap;
	}

	public void setTreiCap(List<TreiCap> treiCap) {
		this.treiCap = treiCap;
	}
}
