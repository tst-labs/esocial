package br.jus.tst.esocial.dominio.tabela.processo;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class DadosProc {

	@NotNull
	private Byte indAutoria;
	
	@NotNull
	private byte indMatProc;
	
	@Valid
	private DadosProcJud dadosProcJud;
	
	@Valid
	private String observacao;
	
	@Valid
	private List<InfoSusp> infoSusp; 

	
	public Byte getIndAutoria() {
		return indAutoria;
	}

	public DadosProc setIndAutoria(Byte indAutoria) {
		this.indAutoria = indAutoria;
		return this;
	}

	public byte getIndMatProc() {
		return indMatProc;
	}

	public DadosProc setIndMatProc(byte indicativoMateriaProcesso) {
		this.indMatProc = indicativoMateriaProcesso;
		return this;
	}

	public DadosProcJud getDadosProcJud() {
		return dadosProcJud;
	}

	public DadosProc setDadosProcJud(DadosProcJud dadosProcJud) {
		this.dadosProcJud = dadosProcJud;
		return this;
	}

	public List<InfoSusp> getInfoSusp() {
		return infoSusp;
	}

	public DadosProc setInfoSusp(
			List<InfoSusp> informacoesSuspensaoExigibilidade) {
		this.infoSusp = informacoesSuspensaoExigibilidade;
		return this;
	}

	public String getObservacao() {
		return observacao;
	}

	public DadosProc setObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	
	
}
