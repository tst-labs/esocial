package br.jus.tst.esocial.dominio.tabela.rubrica;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.enums.SimNao;

public class DadosRubrica {

	@NotNull
	@Size(min = 1, max = 30)
	private String dscRubr;

	private BigInteger natRubr;

	private byte tpRubr;

	@NotNull
	private String codIncCP;

	@NotNull
	private BigInteger codIncIRRF;

	@NotNull
	private String codIncFGTS;

	private String codIncCPRP;
	
	private SimNao tetoRemun;

	@Size(min = 0, max = 255)
	private String observacao;

	@Valid
	private List<IdeProcessoCP> ideProcessoCP;

	@Valid
	private List<IdeProcessoIRRF> ideProcessoIRRF;

	@Valid
	private List<IdeProcessoFGTS> ideProcessoFGTS;

	public String getDscRubr() {
		return dscRubr;
	}

	public void setDscRubr(String dscRubr) {
		this.dscRubr = dscRubr;
	}

	public BigInteger getNatRubr() {
		return natRubr;
	}

	public void setNatRubr(BigInteger natRubr) {
		this.natRubr = natRubr;
	}

	public byte getTpRubr() {
		return tpRubr;
	}

	public void setTpRubr(byte tpRubr) {
		this.tpRubr = tpRubr;
	}

	public String getCodIncCP() {
		return codIncCP;
	}

	public void setCodIncCP(String codIncCP) {
		this.codIncCP = codIncCP;
	}

	public BigInteger getCodIncIRRF() {
		return codIncIRRF;
	}

	public void setCodIncIRRF(BigInteger codIncIRRF) {
		this.codIncIRRF = codIncIRRF;
	}

	public String getCodIncFGTS() {
		return codIncFGTS;
	}

	public void setCodIncFGTS(String codIncFGTS) {
		this.codIncFGTS = codIncFGTS;
	}
	
	public String getCodIncCPRP() {
		return codIncCPRP;
	}

	public void setCodIncCPRP(String codIncCPRP) {
		this.codIncCPRP = codIncCPRP;
	}

	public SimNao getTetoRemun() {
		return tetoRemun;
	}

	public void setTetoRemun(SimNao tetoRemun) {
		this.tetoRemun = tetoRemun;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<IdeProcessoCP> getIdeProcessoCP() {
		return ideProcessoCP;
	}

	public void setIdeProcessoCP(List<IdeProcessoCP> ideProcessoCP) {
		this.ideProcessoCP = ideProcessoCP;
	}

	public List<IdeProcessoIRRF> getIdeProcessoIRRF() {
		return ideProcessoIRRF;
	}

	public void setIdeProcessoIRRF(List<IdeProcessoIRRF> ideProcessoIRRF) {
		this.ideProcessoIRRF = ideProcessoIRRF;
	}

	public List<IdeProcessoFGTS> getIdeProcessoFGTS() {
		return ideProcessoFGTS;
	}

	public void setIdeProcessoFGTS(List<IdeProcessoFGTS> ideProcessoFGTS) {
		this.ideProcessoFGTS = ideProcessoFGTS;
	}

}
