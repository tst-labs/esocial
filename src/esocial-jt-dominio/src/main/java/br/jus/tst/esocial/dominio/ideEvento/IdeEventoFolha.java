package br.jus.tst.esocial.dominio.ideEvento;

public class IdeEventoFolha {

	private Byte indRetif;

	private String nrRecibo;
	
	private String perApur;
	
	private Byte indGuia;
	
	private byte indApuracao;

	public Byte getIndRetif() {
		return indRetif;
	}

	public void setIndRetif(Byte indRetif) {
		this.indRetif = indRetif;
	}

	public String getNrRecibo() {
		return nrRecibo;
	}

	public void setNrRecibo(String nrRecibo) {
		this.nrRecibo = nrRecibo;
	}

	public String getPerApur() {
		return perApur;
	}

	public void setPerApur(String perApur) {
		this.perApur = perApur;
	}

	public Byte getIndGuia() {
		return indGuia;
	}

	public void setIndGuia(Byte indGuia) {
		this.indGuia = indGuia;
	}

	public byte getIndApuracao() {
		return indApuracao;
	}

	public void setIndApuracao(byte indApuracao) {
		this.indApuracao = indApuracao;
	}

}
