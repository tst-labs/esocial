package br.jus.tst.esocial.dominio.trabalhador.identificacaobasica;

public class InfoInterm {

	private Byte qtdDiasInterm;

	private Byte dia;

	private String hrsTrab;
	
	public Byte getQtdDiasInterm() {
		return qtdDiasInterm;
	}

	public void setQtdDiasInterm(Byte qtdDiasInterm) {
		this.qtdDiasInterm = qtdDiasInterm;
	}

	public Byte getDia() {
		return dia;
	}

	public void setDia(Byte dia) {
		this.dia = dia;
	}

	public String getHrsTrab() {
		return hrsTrab;
	}

	public void setHrsTrab(String hrsTrab) {
		this.hrsTrab = hrsTrab;
	}
}
