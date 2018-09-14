package br.jus.tst.esocial.dominio.desligamento;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class InfoDeslig {

	@NotNull
	@Pattern(regexp="\\d{2}")
	private String mtvDeslig;
	
	@NotNull
	private Calendar dtDeslig;
	
	@NotNull
	@Pattern(regexp="[N|S]")
	private String indPagtoAPI;
	
	private Calendar dtProjFimAPI;
	
	private byte pensAlim;
	
	private BigDecimal percAliment;
	
    private BigDecimal vrAlim;
    
    @Pattern(regexp="\\d{32}")
    private String nrCertObito;
    
    @Max(20)
    private String nrProcTrab;
    
    private byte indCumprParc;
    
    private Byte qtdDiasInterm;
    
    @Valid
    private List<Observacoes> observacoes;
    
    @Valid
    private SucessaoVinc sucessaoVinc;
    
    @Valid
    private TransfTit transfTit;
    
    @Valid
    private VerbasResc verbasResc;
    
    @Valid
    private Quarentena quarentena;
    
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

	public String getIndPagtoAPI() {
		return indPagtoAPI;
	}

	public void setIndPagtoAPI(String indPagtoAPI) {
		this.indPagtoAPI = indPagtoAPI;
	}

	public Calendar getDtProjFimAPI() {
		return dtProjFimAPI;
	}

	public void setDtProjFimAPI(Calendar dtProjFimAPI) {
		this.dtProjFimAPI = dtProjFimAPI;
	}

	public byte getPensAlim() {
		return pensAlim;
	}

	public void setPensAlim(byte pensAlim) {
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

	public String getNrCertObito() {
		return nrCertObito;
	}

	public void setNrCertObito(String nrCertObito) {
		this.nrCertObito = nrCertObito;
	}

	public String getNrProcTrab() {
		return nrProcTrab;
	}

	public void setNrProcTrab(String nrProcTrab) {
		this.nrProcTrab = nrProcTrab;
	}

	public byte getIndCumprParc() {
		return indCumprParc;
	}

	public void setIndCumprParc(byte indCumprParc) {
		this.indCumprParc = indCumprParc;
	}

	public Byte getQtdDiasInterm() {
		return qtdDiasInterm;
	}

	public void setQtdDiasInterm(Byte qtdDiasInterm) {
		this.qtdDiasInterm = qtdDiasInterm;
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
    
}
