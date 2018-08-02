package br.jus.tst.esocialjt.comunicacaogov;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import br.jus.esocialjt.comunicacao.retorno.evento.ESocial;
import br.jus.esocialjt.comunicacao.retorno.evento.TOcorrencias.Ocorrencia;
import br.jus.esocialjt.comunicacao.retorno.processamento.ESocial.RetornoProcessamentoLoteEventos;
import br.jus.esocialjt.comunicacao.retorno.processamento.TDadosRecepcao;
import br.jus.esocialjt.comunicacao.retorno.processamento.TStatus;
import br.jus.tst.esocialjt.xml.GeradorXmlToObject;
import br.jus.tst.esocialjt.xml.XmlTools;

public class RetornoProcessamento {

	private String xmlRetorno;
	private RetornoLote retornoLote = new RetornoLote();
	private GeradorXmlToObject geradorXmlToObject = new GeradorXmlToObject();

	public RetornoProcessamento() {

	}

	public RetornoProcessamento(String xmlRetorno) {
		setXmlRetorno(xmlRetorno);
	}

	public String getXmlRetorno() {
		return xmlRetorno;
	}

	public RetornoLote getRetornoLote() {
		return retornoLote;
	}

	private RetornoEvento criarRetornoEvento(Element elemento) {
		String eventoString = (XmlTools.asString(elemento));
		ESocial evento = geradorXmlToObject.convertXMLToObject(ESocial.class, eventoString);

		long codigoRespostaProcessamento = evento.getRetornoEvento().getProcessamento().getCdResposta();
		String descricaoRespostaProcessamento = evento.getRetornoEvento().getProcessamento().getDescResposta();
		String idEvento = evento.getRetornoEvento().getId();

		RetornoEvento retornoEvento = new RetornoEvento();
		retornoEvento.setCodigoRespostaProcessamento(codigoRespostaProcessamento);
		retornoEvento.setDescricaoRespostaProcessamento(descricaoRespostaProcessamento);
		retornoEvento.setIdEvento(idEvento);
		retornoEvento.setXmlRetorno(eventoString);

		if (evento.getRetornoEvento().getProcessamento().getOcorrencias() != null) {
			List<Ocorrencia> ocorrencia = evento.getRetornoEvento().getProcessamento().getOcorrencias().getOcorrencia();
			List<RetornoErroProcessamento> erros = criarErrosProcessamento(ocorrencia);
			retornoEvento.setRetornoErrosProcessamento(erros);
		}
		return retornoEvento;

	}

	private RetornoLote criarRetornoLote(String xmlRetorno) {
		br.jus.esocialjt.comunicacao.retorno.processamento.ESocial lote = geradorXmlToObject
				.convertXMLToObject(br.jus.esocialjt.comunicacao.retorno.processamento.ESocial.class, xmlRetorno);

		RetornoProcessamentoLoteEventos retornoProcessamentoLote = lote.getRetornoProcessamentoLoteEventos();
		TDadosRecepcao dadosRecepcaoLote = retornoProcessamentoLote.getDadosRecepcaoLote();
		TStatus status = retornoProcessamentoLote.getStatus();

		if (dadosRecepcaoLote != null) {
			String protocolo = dadosRecepcaoLote.getProtocoloEnvio();
			retornoLote.setProtocolo(protocolo);
			List<Element> elementos = new RetornoProcessamentoUtil().obterElementosDeEventos(xmlRetorno);
			elementos.forEach(elemento -> retornoLote.getRetornoEvento().add(criarRetornoEvento(elemento)));
		}

		if (status != null) {
			long codigoRespostaProcessamento = status.getCdResposta();
			retornoLote.setCodigoRespostaProcessamento(codigoRespostaProcessamento);
			retornoLote.setDescricaoRespostaProcessamento(status.getDescResposta());

			if (status.getOcorrencias() != null) {
				List<RetornoErroProcessamento> erros = criarErrosProcessamentoLote(
						status.getOcorrencias().getOcorrencia());
				retornoLote.setRetornoErrosProcessamento(erros);
			}
		}

		return retornoLote;

	}

	private List<RetornoErroProcessamento> criarErrosProcessamentoLote(
			List<br.jus.esocialjt.comunicacao.retorno.processamento.TOcorrencias.Ocorrencia> ocorrenciasDeErro) {
		List<RetornoErroProcessamento> errosProcessamento = new ArrayList<>();
		RetornoErroProcessamento erroProcessamento;
		for (br.jus.esocialjt.comunicacao.retorno.processamento.TOcorrencias.Ocorrencia ocorrenciaErro : ocorrenciasDeErro) {
			erroProcessamento = new RetornoErroProcessamento();
			erroProcessamento.setTipo(ocorrenciaErro.getTipo());
			erroProcessamento.setLocalizacao(ocorrenciaErro.getLocalizacao());
			erroProcessamento.setCodigo(ocorrenciaErro.getCodigo());
			erroProcessamento.setDescricao(ocorrenciaErro.getDescricao());
			errosProcessamento.add(erroProcessamento);
		}
		return errosProcessamento;
	}

	private List<RetornoErroProcessamento> criarErrosProcessamento(List<Ocorrencia> ocorrenciasDeErro) {
		List<RetornoErroProcessamento> errosProcessamento = new ArrayList<>();
		RetornoErroProcessamento erroProcessamento;
		for (Ocorrencia ocorrenciaErro : ocorrenciasDeErro) {
			erroProcessamento = new RetornoErroProcessamento();
			erroProcessamento.setTipo(ocorrenciaErro.getTipo());
			erroProcessamento.setLocalizacao(ocorrenciaErro.getLocalizacao());
			erroProcessamento.setCodigo(ocorrenciaErro.getCodigo());
			erroProcessamento.setDescricao(ocorrenciaErro.getDescricao());
			errosProcessamento.add(erroProcessamento);
		}
		return errosProcessamento;
	}

	public void setXmlRetorno(String xmlRetorno) {
		criarRetornoLote(xmlRetorno);
		this.xmlRetorno = xmlRetorno;
	}

	public void setRetornoLote(RetornoLote retornoLote) {
		this.retornoLote = retornoLote;
	}

}
