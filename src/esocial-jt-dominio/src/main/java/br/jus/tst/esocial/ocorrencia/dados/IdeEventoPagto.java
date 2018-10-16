package br.jus.tst.esocial.ocorrencia.dados;

public class IdeEventoPagto {

	private Byte indRetif;

	private String nrRecibo;
	
	private Byte indApuracao;
	
	private String perApur;

	public Byte getIndApuracao() {
		return indApuracao;
	}

	public IdeEventoPagto setIndApuracao(Byte indApuracao) {
		this.indApuracao = indApuracao;
		return this;
	}

	public String getPerApur() {
		return perApur;
	}

	public IdeEventoPagto setPerApur(String perApur) {
		this.perApur = perApur;
		return this;
	}

	public Byte getIndRetif() {
		return indRetif;
	}

	public String getNrRecibo() {
		return nrRecibo;
	}

	public IdeEventoPagto setIndRetif(Byte indRetif) {
		this.indRetif = indRetif;
		return this;
	}

	public IdeEventoPagto setNrRecibo(String nrRecibo) {
		this.nrRecibo = nrRecibo;
		return this;
	}

}
