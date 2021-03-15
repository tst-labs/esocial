package br.jus.tst.esocial.dominio.tabela.processo;

import java.math.BigInteger;

import br.jus.tst.esocial.dominio.enums.UF;

public class DadosProcJud {
	
	private UF ufVara;
	
	private BigInteger codMunic;
	
	private BigInteger idVara;

	public UF getUfVara() {
		return ufVara;
	}

	public DadosProcJud setUfVara(UF uf) {
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
