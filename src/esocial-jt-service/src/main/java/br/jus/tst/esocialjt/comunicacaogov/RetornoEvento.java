package br.jus.tst.esocialjt.comunicacaogov;

import java.util.ArrayList;
import java.util.List;

public class RetornoEvento {
	private String idEvento;
	private long codigoRespostaProcessamento;
	private String descricaoRespostaProcessamento;
	private List<RetornoErroProcessamento> retornoErrosProcessamento = new ArrayList<>();
	private String xmlRetorno;

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public long getCodigoRespostaProcessamento() {
		return codigoRespostaProcessamento;
	}

	public void setCodigoRespostaProcessamento(long codigoRespostaProcessamento) {
		this.codigoRespostaProcessamento = codigoRespostaProcessamento;
	}

	public List<RetornoErroProcessamento> getRetornoErrosProcessamento() {
		return retornoErrosProcessamento;
	}

	public void setRetornoErrosProcessamento(List<RetornoErroProcessamento> retornoErrosProcessamento) {
		this.retornoErrosProcessamento = retornoErrosProcessamento;
	}

	public String getDescricaoRespostaProcessamento() {
		return descricaoRespostaProcessamento;
	}

	public void setDescricaoRespostaProcessamento(String descricaoRespostaProcessamento) {
		this.descricaoRespostaProcessamento = descricaoRespostaProcessamento;
	}

	public String getXmlRetorno() {
		return xmlRetorno;
	}

	public void setXmlRetorno(String xmlRetorno) {
		this.xmlRetorno = xmlRetorno;
	}
}
