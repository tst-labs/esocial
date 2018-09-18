package br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

import br.jus.tst.esocial.dominio.semvinculo.InfoComplementares;

public class InfoTSVAlteracao {

	@NotNull
    private Calendar dtAlteracao;

	private Byte natAtividade;
	
	private InfoComplementares infoComplementares;

	public Calendar getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(Calendar dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Byte getNatAtividade() {
		return natAtividade;
	}

	public void setNatAtividade(Byte natAtividade) {
		this.natAtividade = natAtividade;
	}

	public InfoComplementares getInfoComplementares() {
		return infoComplementares;
	}

	public void setInfoComplementares(InfoComplementares infoComplementares) {
		this.infoComplementares = infoComplementares;
	}

}
