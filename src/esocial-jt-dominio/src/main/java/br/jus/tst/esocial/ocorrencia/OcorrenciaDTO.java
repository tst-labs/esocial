package br.jus.tst.esocial.ocorrencia;

import java.util.Date;

import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;

public class OcorrenciaDTO {

	private TipoOcorrencia tipoOcorrencia;

	private String referencia;

	private Operacao operacao;

	private Date dataOcorrencia;

	private DadosOcorrencia dadosOcorrencia;

	public OcorrenciaDTO() {
		super();
	}

	public OcorrenciaDTO(TipoOcorrencia tipoOcorrencia, Operacao operacao, String identificador,
			Date dataOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
		this.referencia = identificador;
		this.operacao = operacao;
		this.dataOcorrencia = dataOcorrencia;
	}

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
