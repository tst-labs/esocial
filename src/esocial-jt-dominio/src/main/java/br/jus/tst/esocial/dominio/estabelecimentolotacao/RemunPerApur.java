package br.jus.tst.esocial.dominio.estabelecimentolotacao;

import java.math.BigInteger;
import java.util.List;

import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.demonstrativovalores.InfoTrabInterm;

public class RemunPerApur {

	@Size(min=1, max=30)
	private String matricula;
	
	private BigInteger codCateg;
	
	private Byte indSimples;
	
	private List<ItemRemuneracao> itensRemun;

	private InfoSaudeColet infoSaudeColet;
	
	private InfoAgNocivo infoAgNocivo;
	
	private List<InfoTrabInterm> infoTrabInterm;
	
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

	public List<ItemRemuneracao> getItensRemun() {
		return itensRemun;
	}

	public void setItensRemun(List<ItemRemuneracao> itensRemun) {
		this.itensRemun = itensRemun;
	}

	public InfoSaudeColet getInfoSaudeColet() {
		return infoSaudeColet;
	}

	public void setInfoSaudeColet(InfoSaudeColet infoSaudeColet) {
		this.infoSaudeColet = infoSaudeColet;
	}

	public InfoAgNocivo getInfoAgNocivo() {
		return infoAgNocivo;
	}

	public void setInfoAgNocivo(InfoAgNocivo infoAgNocivo) {
		this.infoAgNocivo = infoAgNocivo;
	}

	public List<InfoTrabInterm> getInfoTrabInterm() {
		return infoTrabInterm;
	}

	public void setInfoTrabInterm(List<InfoTrabInterm> infoTrabInterm) {
		this.infoTrabInterm = infoTrabInterm;
	}
	
}
