package br.jus.tst.esocial.dominio.tabela.rubrica;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;

public class IdeProcessoCP {

    private byte tpProc;
    
    @NotNull
    private String nrProc;
   
    private byte extDecisao;
   
    @NotNull
	private BigInteger codSusp;

	public byte getTpProc() {
		return tpProc;
	}

	public IdeProcessoCP setTpProc(byte tpProc) {
		this.tpProc = tpProc;
		return this;
	}

	public String getNrProc() {
		return nrProc;
	}

	public IdeProcessoCP setNrProc(String nrProc) {
		this.nrProc = nrProc;
		return this;
	}

	public byte getExtDecisao() {
		return extDecisao;
	}

	public IdeProcessoCP setExtDecisao(byte extDecisao) {
		this.extDecisao = extDecisao;
		return this;
	}

	public BigInteger getCodSusp() {
		return codSusp;
	}

	public IdeProcessoCP setCodSusp(BigInteger codSusp) {
		this.codSusp = codSusp;
		return this;
	}

}
