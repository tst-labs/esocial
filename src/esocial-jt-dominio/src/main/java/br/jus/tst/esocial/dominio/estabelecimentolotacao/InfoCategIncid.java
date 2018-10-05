package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.math.BigInteger;
import java.util.List;

import javax.validation.constraints.Size;

public class InfoCategIncid {

	@Size(min=1, max=30)
	private String matricula;
	
	private BigInteger codCateg;
		
	private Byte indSimples;
	
	private List<InfoBaseCS> infoBaseCS;
	
	private List<CalcTerc> calcTerc;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
		this.codCateg = codCateg;
	}

	public Byte getIndSimples() {
		return indSimples;
	}

	public void setIndSimples(Byte indSimples) {
		this.indSimples = indSimples;
	}

	public List<InfoBaseCS> getInfoBaseCS() {
		return infoBaseCS;
	}

	public void setInfoBaseCS(List<InfoBaseCS> infoBaseCS) {
		this.infoBaseCS = infoBaseCS;
	}

	public List<CalcTerc> getCalcTerc() {
		return calcTerc;
	}

	public void setCalcTerc(List<CalcTerc> calcTerc) {
		this.calcTerc = calcTerc;
	}
		
}
