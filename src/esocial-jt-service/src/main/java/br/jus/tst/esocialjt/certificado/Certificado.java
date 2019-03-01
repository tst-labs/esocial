package br.jus.tst.esocialjt.certificado;

import org.apache.commons.lang3.StringUtils;

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
	public boolean existeConfiguracaoCertificado() {
		return StringUtils.isNotBlank(pathArquivoCertificado);
	}
	public boolean existeConfiguracaoCacerts() {
		return StringUtils.isNotBlank(pathArquivoCacerts);
	}
}
