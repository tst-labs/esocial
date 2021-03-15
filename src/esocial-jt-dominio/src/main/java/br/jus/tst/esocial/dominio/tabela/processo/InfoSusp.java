package br.jus.tst.esocial.dominio.tabela.processo;

import java.math.BigInteger;
import java.util.Calendar;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class InfoSusp {

	private BigInteger codSusp;
	
	private String indSusp;

	private Calendar dtDecisao;
	
	private SimNao indDeposito;

	public BigInteger getCodSusp() {
		return codSusp;
	}

	public InfoSusp setCodSusp(BigInteger codigoSuspensao) {
		this.codSusp = codigoSuspensao;
		return this;
	}

	public String getIndSusp() {
		return indSusp;
	}

	public InfoSusp setIndSusp(String indSusp) {
		this.indSusp = indSusp;
		return this;
	}

	public Calendar getDtDecisao() {
		return dtDecisao;
	}

	public InfoSusp setDtDecisao(Calendar dataDecisao) {
		this.dtDecisao = dataDecisao;
		return this;
	}

	public SimNao getIndDeposito() {
		return indDeposito;
	}

	public InfoSusp setIndDeposito(SimNao indicativoDepositoMontanteLegal) {
		this.indDeposito = indicativoDepositoMontanteLegal;
		return this;
	}
	
}
