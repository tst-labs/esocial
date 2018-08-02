package br.jus.tst.esocial.dominio.tabela.processo;

import java.math.BigInteger;

public class DadosProcJud {
	
	private String ufVara;
	
	private BigInteger codMunic;
	
	private BigInteger idVara;

	public String getUfVara() {
		return ufVara;
	}

	public DadosProcJud setUfVara(String uf) {
		this.ufVara = uf;
		return this;
	}

	public BigInteger getCodMunic() {
		return codMunic;
	}

	public DadosProcJud setCodMunic(BigInteger codigoMunicipio) {
		this.codMunic = codigoMunicipio;
		return this;
	}

	public BigInteger getIdVara() {
		return idVara;
	}

	public DadosProcJud setIdVara(BigInteger identificacaoVara) {
		this.idVara = identificacaoVara;
		return this;
	}
	
	
}
