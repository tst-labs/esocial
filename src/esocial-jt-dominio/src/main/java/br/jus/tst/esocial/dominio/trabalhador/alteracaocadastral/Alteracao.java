package br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Alteracao {

	@NotNull
    private Calendar dtAlteracao;
	
	private DadosTrabalhador dadosTrabalhador;

	public Calendar getDtAlteracao() {
		return dtAlteracao;
	}

	public Alteracao setDtAlteracao(Calendar dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
		return this;
	}

	public DadosTrabalhador getDadosTrabalhador() {
		return dadosTrabalhador;
	}

	public Alteracao setDadosTrabalhador(DadosTrabalhador dadosTrabalhador) {
		this.dadosTrabalhador = dadosTrabalhador;
		return this;
	}
	
	
	
}
