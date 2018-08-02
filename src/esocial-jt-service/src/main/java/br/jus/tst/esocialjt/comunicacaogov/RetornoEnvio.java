package br.jus.tst.esocialjt.comunicacaogov;

import br.jus.esocialjt.comunicacao.retorno.envio.ESocial;
import br.jus.esocialjt.comunicacao.retorno.envio.TDadosRecepcao;
import br.jus.esocialjt.comunicacao.retorno.envio.ESocial.RetornoEnvioLoteEventos;
import br.jus.tst.esocialjt.xml.GeradorXmlToObject;

public class RetornoEnvio {
	private String protocolo;
	private long codigoResposta;
	private String descricaoResposta;
	private String xmlRetorno;

	public RetornoEnvio(String xmlRetorno) {
		GeradorXmlToObject geradorXmlToObject = new GeradorXmlToObject();
		ESocial retorno = geradorXmlToObject.convertXMLToObject(ESocial.class, xmlRetorno);
		RetornoEnvioLoteEventos retornoEnvioLoteEventos = retorno.getRetornoEnvioLoteEventos();
		TDadosRecepcao dadosRecepcaoLote = retornoEnvioLoteEventos.getDadosRecepcaoLote();
		
		if (dadosRecepcaoLote != null) {
			this.protocolo = dadosRecepcaoLote.getProtocoloEnvio();
		}
		
		this.codigoResposta = retornoEnvioLoteEventos.getStatus().getCdResposta();
		this.descricaoResposta = retornoEnvioLoteEventos.getStatus().getDescResposta();
		this.xmlRetorno = xmlRetorno;
	}

	public RetornoEnvio() {
	}

	public String getProtocolo() {
		return protocolo;
	}

	public long getCodigoResposta() {
		return codigoResposta;
	}

	public String getXmlRetorno() {
		return xmlRetorno;
	}

	public String getDescricaoResposta() {
		return descricaoResposta;
	}

	public RetornoEnvio setProtocolo(String protocolo) {
		this.protocolo = protocolo;
		return this;
	}

	public RetornoEnvio setCodigoResposta(long codigoResposta) {
		this.codigoResposta = codigoResposta;
		return this;
	}

	public RetornoEnvio setDescricaoResposta(String descricaoResposta) {
		this.descricaoResposta = descricaoResposta;
		return this;
	}

	public RetornoEnvio setXmlRetorno(String xmlRetorno) {
		this.xmlRetorno = xmlRetorno;
		return this;
	}
}
