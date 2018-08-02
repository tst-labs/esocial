package br.jus.tst.esocial.dominio.tabela.rubrica;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DadosRubrica {

	@NotNull
	@Size(min = 1, max = 30)
	private String dscRubr;

	private BigInteger natRubr;

	private byte tpRubr;

	@NotNull
	private String codIncCP;

	@NotNull
	private String codIncIRRF;

	@NotNull
	private String codIncFGTS;

	@NotNull
	private String codIncSIND;

	@Size(min = 0, max = 255)
	private String observacao;

	@Valid
	private List<IdeProcessoCP> ideProcessoCP;

	@Valid
	private List<IdeProcessoIRRF> ideProcessoIRRF;

	@Valid
	private List<IdeProcessoFGTS> ideProcessoFGTS;

	@Valid
	private List<IdeProcessoSIND> ideProcessoSIND;

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

	public String getCodIncIRRF() {
		return codIncIRRF;
	}

	public void setCodIncIRRF(String codIncIRRF) {
		this.codIncIRRF = codIncIRRF;
	}

	public String getCodIncFGTS() {
		return codIncFGTS;
	}

	public void setCodIncFGTS(String codIncFGTS) {
		this.codIncFGTS = codIncFGTS;
	}

	public String getCodIncSIND() {
		return codIncSIND;
	}

	public void setCodIncSIND(String codIncSIND) {
		this.codIncSIND = codIncSIND;
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

	public List<IdeProcessoSIND> getIdeProcessoSIND() {
		return ideProcessoSIND;
	}

	public void setIdeProcessoSIND(List<IdeProcessoSIND> ideProcessoSIND) {
		this.ideProcessoSIND = ideProcessoSIND;
	}

}
