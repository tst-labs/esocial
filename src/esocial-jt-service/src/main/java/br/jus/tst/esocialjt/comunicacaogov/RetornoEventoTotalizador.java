package br.jus.tst.esocialjt.comunicacaogov;

public class RetornoEventoTotalizador {
	
	private String tipo;
	private String nrReciboArquivoBase;
	private Byte indApuracao;
	private String perApuracao;
	private String cpfTrabalhador;
	private String xmlEventoTotalizador;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNrReciboArquivoBase() {
		return nrReciboArquivoBase;
	}
	public void setNrReciboArquivoBase(String nrReciboArquivoBase) {
		this.nrReciboArquivoBase = nrReciboArquivoBase;
	}
	public Byte getIndApuracao() {
		return indApuracao;
	}
	public void setIndApuracao(Byte indApuracao) {
		this.indApuracao = indApuracao;
	}
	public String getPerApuracao() {
		return perApuracao;
	}
	public void setPerApuracao(String perApuracao) {
		this.perApuracao = perApuracao;
	}
	public String getCpfTrabalhador() {
		return cpfTrabalhador;
	}
	public void setCpfTrabalhador(String cpfTrabalhador) {
		this.cpfTrabalhador = cpfTrabalhador;
	}
	public String getXmlEventoTotalizador() {
		return xmlEventoTotalizador;
	}
	public void setXmlEventoTotalizador(String xmlEventoTotalizador) {
		this.xmlEventoTotalizador = xmlEventoTotalizador;
	}


}
