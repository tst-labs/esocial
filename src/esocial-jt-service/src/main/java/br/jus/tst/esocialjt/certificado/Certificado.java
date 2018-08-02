package br.jus.tst.esocialjt.certificado;

public class Certificado {

	private String pathArquivoCertificado;
	private String pathArquivoCacerts;
	private char[] senhaCertificado;
	private char[] senhaCacerts;
	
	public Certificado(String pathArquivoCertificado, String pathArquivoCacerts, char[] senhaCertificado, char[] senhaCacerts) {
		super();
		this.pathArquivoCertificado = pathArquivoCertificado;
		this.pathArquivoCacerts = pathArquivoCacerts;
		this.senhaCertificado = senhaCertificado;
		this.senhaCacerts = senhaCacerts;
	}
	public String getPathArquivoCertificado() {
		return pathArquivoCertificado;
	}
	public String getPathArquivoCacerts() {
		return pathArquivoCacerts;
	}
	public char[] getSenhaCertificado() {
		return senhaCertificado;
	}
	public char[] getSenhaCacerts() {
		return senhaCacerts;
	}
}
