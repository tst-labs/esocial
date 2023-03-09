package br.jus.tst.esocial.dominio.desligamento;

import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.termino.Quarentena;
import br.jus.tst.esocial.dominio.vinculo.MudancaCPF;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

public class InfoDeslig {

	@NotNull
	@Pattern(regexp="\\d{2}")
	private String mtvDeslig;
	
	@NotNull
	private Calendar dtDeslig;

	private Calendar dtAvPrv;
	
	@NotNull
	private SimNao indPagtoAPI;
	
	private Calendar dtProjFimAPI;
	
	private Byte pensAlim;
	
	private BigDecimal percAliment;
	
    private BigDecimal vrAlim;
    
    @Max(20)
    private String nrProcTrab;
    
    @Valid
    private List<InfoInterm> infoInterm;
    
    @Valid
	private List<Observacoes> observacoes;

	@Valid
	private SucessaoVinc sucessaoVinc;

	@Valid
	private TransfTit transfTit;

	@Valid
	private MudancaCPF mudancaCPF;

	@Valid
	private VerbasResc verbasResc;

	@Deprecated
	private Quarentena quarentena;

	private RemunAposDeslig remunAposDeslig;

	@Valid
	private List<ConsigFGTS> consigFGTS;

	public String getMtvDeslig() {
		return mtvDeslig;
	}

	public void setMtvDeslig(String mtvDeslig) {
		this.mtvDeslig = mtvDeslig;
	}

	public Calendar getDtDeslig() {
		return dtDeslig;
	}

	public void setDtDeslig(Calendar dtDeslig) {
		this.dtDeslig = dtDeslig;
	}

	public Calendar getDtAvPrv() {
		return dtAvPrv;
	}

	public void setDtAvPrv(Calendar dtAvPrv) {
		this.dtAvPrv = dtAvPrv;
	}

	public SimNao getIndPagtoAPI() {
		return indPagtoAPI;
	}

	public void setIndPagtoAPI(SimNao indPagtoAPI) {
		this.indPagtoAPI = indPagtoAPI;
	}

	public Calendar getDtProjFimAPI() {
		return dtProjFimAPI;
	}

	public void setDtProjFimAPI(Calendar dtProjFimAPI) {
		this.dtProjFimAPI = dtProjFimAPI;
	}

	public Byte getPensAlim() {
		return pensAlim;
	}

	public void setPensAlim(Byte pensAlim) {
		this.pensAlim = pensAlim;
	}

	public BigDecimal getPercAliment() {
		return percAliment;
	}

	public void setPercAliment(BigDecimal percAliment) {
		this.percAliment = percAliment;
	}

	public BigDecimal getVrAlim() {
		return vrAlim;
	}

	public void setVrAlim(BigDecimal vrAlim) {
		this.vrAlim = vrAlim;
	}

	public String getNrProcTrab() {
		return nrProcTrab;
	}

	public void setNrProcTrab(String nrProcTrab) {
		this.nrProcTrab = nrProcTrab;
	}

	public List<InfoInterm> getInfoInterm() {
		return infoInterm;
	}

	public void setInfoInterm(List<InfoInterm> infoInterm) {
		this.infoInterm = infoInterm;
	}

	public List<Observacoes> getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(List<Observacoes> observacoes) {
		this.observacoes = observacoes;
	}

	public SucessaoVinc getSucessaoVinc() {
		return sucessaoVinc;
	}

	public void setSucessaoVinc(SucessaoVinc sucessaoVinc) {
		this.sucessaoVinc = sucessaoVinc;
	}

	public TransfTit getTransfTit() {
		return transfTit;
	}

	public void setTransfTit(TransfTit transfTit) {
		this.transfTit = transfTit;
	}

	public MudancaCPF getMudancaCPF() {
		return mudancaCPF;
	}

	public void setMudancaCPF(MudancaCPF mudancaCPF) {
		this.mudancaCPF = mudancaCPF;
	}

	public VerbasResc getVerbasResc() {
		return verbasResc;
	}

	public void setVerbasResc(VerbasResc verbasResc) {
		this.verbasResc = verbasResc;
	}

	public Quarentena getQuarentena() {
		return quarentena;
	}

	public void setQuarentena(Quarentena quarentena) {
		this.quarentena = quarentena;
	}

	public List<ConsigFGTS> getConsigFGTS() {
		return consigFGTS;
	}

	public void setConsigFGTS(List<ConsigFGTS> consigFGTS) {
		this.consigFGTS = consigFGTS;
	}

	public RemunAposDeslig getRemunAposDeslig() {
		return remunAposDeslig;
	}

	public void setRemunAposDeslig(RemunAposDeslig remunAposDeslig) {
		this.remunAposDeslig = remunAposDeslig;
	}
}
