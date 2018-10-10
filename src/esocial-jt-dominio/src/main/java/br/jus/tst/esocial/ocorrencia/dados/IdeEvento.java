package br.jus.tst.esocial.ocorrencia.dados;

public class IdeEvento {

	private Byte indRetif;

	private String nrRecibo;
	
	public Byte getIndRetif() {
		return indRetif;
	}

	public String getNrRecibo() {
		return nrRecibo;
	}

	public IdeEvento setIndRetif(Byte indRetif) {
		this.indRetif = indRetif;
		return this;
	}

	public IdeEvento setNrRecibo(String nrRecibo) {
		this.nrRecibo = nrRecibo;
		return this;
	}

}
