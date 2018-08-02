package br.jus.tst.esocialjt.comunicacaogov;

import java.util.ArrayList;
import java.util.List;

public class RetornoLote {
	private long codigoRespostaProcessamento;
	private String descricaoRespostaProcessamento;
	private String protocolo;
	private List<RetornoErroProcessamento> retornoErrosProcessamento = new ArrayList<>();
	private List<RetornoEvento> retornoEvento = new ArrayList<>();

	public long getCodigoRespostaProcessamento() {
		return codigoRespostaProcessamento;
	}

	public RetornoLote setCodigoRespostaProcessamento(long codigoRespostaProcessamento) {
		this.codigoRespostaProcessamento = codigoRespostaProcessamento;
		return this;
	}

	public List<RetornoErroProcessamento> getRetornoErrosProcessamento() {
		return retornoErrosProcessamento;
	}

	public RetornoLote setRetornoErrosProcessamento(List<RetornoErroProcessamento> retornoErrosProcessamento) {
		this.retornoErrosProcessamento = retornoErrosProcessamento;
		return this;
	}

	public List<RetornoEvento> getRetornoEvento() {
		return retornoEvento;
	}

	public RetornoLote setRetornoEvento(List<RetornoEvento> retornoEvento) {
		this.retornoEvento = retornoEvento;
		return this;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public RetornoLote setProtocolo(String protocolo) {
		this.protocolo = protocolo;
		return this;
	}

	public String getDescricaoRespostaProcessamento() {
		return descricaoRespostaProcessamento;
	}

	public RetornoLote setDescricaoRespostaProcessamento(String descricaoRespostaProcessamento) {
		this.descricaoRespostaProcessamento = descricaoRespostaProcessamento;
		return this;
	}

}
