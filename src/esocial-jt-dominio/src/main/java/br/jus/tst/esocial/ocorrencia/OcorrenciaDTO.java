package br.jus.tst.esocial.ocorrencia;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OcorrenciaDTO {

	private TipoOcorrencia tipoOcorrencia;

	private String referencia;

	private Operacao operacao;

	private String retificarRecibo;

	private Date dataOcorrencia;

	private DadosOcorrencia dadosOcorrencia;

	public TipoOcorrencia getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public OcorrenciaDTO setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
		return this;
	}

	public String getReferencia() {
		return referencia;
	}

	public OcorrenciaDTO setReferencia(String referencia) {
		this.referencia = referencia;
		return this;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public OcorrenciaDTO setOperacao(Operacao operacao) {
		this.operacao = operacao;
		return this;
	}
	
	public String getRetificarRecibo() {
		return retificarRecibo;
	}

	public OcorrenciaDTO setRetificarRecibo(String retificarRecibo) {
		this.retificarRecibo = retificarRecibo;
		return this;
	}

	public DadosOcorrencia getDadosOcorrencia() {
		return dadosOcorrencia;
	}

	public OcorrenciaDTO setDadosOcorrencia(DadosOcorrencia dadosOcorrencia) {
		this.dadosOcorrencia = dadosOcorrencia;
		return this;
	}

	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}

	public OcorrenciaDTO setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
		return this;
	}

}
