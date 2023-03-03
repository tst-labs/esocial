package br.jus.tst.esocial.dominio.semvinculo.termino;

import br.jus.tst.esocial.dominio.termino.Quarentena;
import br.jus.tst.esocial.dominio.vinculo.MudancaCPF;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Calendar;

public class InfoTSVTermino {
	
	@NotNull
	private Calendar dtTerm;
	
	private String mtvDesligTSV;
	
	@Valid
	private VerbasResc verbasResc;

	@Deprecated
	private Quarentena quarentena;

	private RemunAposTerm remunAposTerm;
	private Byte pensAlim;
	
	@NotNull
	private BigDecimal percAliment;
	
	private BigDecimal vrAlim;

	private MudancaCPF mudancaCPF;
	
	private String nrProcTrab;

	public Calendar getDtTerm() {
		return dtTerm;
	}

	public void setDtTerm(Calendar dtTerm) {
		this.dtTerm = dtTerm;
	}

	public String getMtvDesligTSV() {
		return mtvDesligTSV;
	}

	public void setMtvDesligTSV(String mtvDesligTSV) {
		this.mtvDesligTSV = mtvDesligTSV;
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

	public Byte getPensAlim() {
		return pensAlim;
	}

	public void setPensAlim(Byte pensAlim) {
		this.pensAlim = pensAlim;
	}
	
	public  BigDecimal getPercAliment() {
		return percAliment;
	}

	public void setPercAliment (BigDecimal percAliment) {
		this.percAliment = percAliment;
	}

	public BigDecimal getVrAlim() {
		return vrAlim;
	}

	public void setVrAlim (BigDecimal vrAlim) {
		this.vrAlim = vrAlim;
	}

	public MudancaCPF getMudancaCPF() {
		return mudancaCPF;
	}

	public void setMudancaCPF(MudancaCPF mudancaCPF) {
		this.mudancaCPF = mudancaCPF;
	}

	public String getNrProcTrab() {
		return nrProcTrab;
	}

	public void setNrProcTrab(String nrProcTrab) {
		this.nrProcTrab = nrProcTrab;
	}

	public RemunAposTerm getRemunAposTerm() {
		return remunAposTerm;
	}

	public void setRemunAposTerm(RemunAposTerm remunAposTerm) {
		this.remunAposTerm = remunAposTerm;
	}
}
