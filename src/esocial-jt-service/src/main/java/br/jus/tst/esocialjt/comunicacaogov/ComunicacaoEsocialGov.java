package br.jus.tst.esocialjt.comunicacaogov;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Component;
import org.springframework.ws.soap.client.SoapFaultClientException;

import br.jus.tst.esocialjt.infraestrutura.Http;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@Component
public class ComunicacaoEsocialGov {

	private static final Logger LOGGER = LoggerFactory.getLogger(ComunicacaoEsocialGov.class);
	
	@Value("${esocialjt.urlServicoEnvioLote:}")
	String urlServicoEnvioLote;

	@Value("${esocialjt.urlServicoConsultaProcessamento:}")
	String urlServicoConsultaProcessamento;
	
	@Autowired
	ComunicacaoServico servico;

	public RetornoEnvio enviarLoteEventos(String lote) throws ComunicacaoEsocialGovException {
		String xmlRetorno = isNotBlank(urlServicoEnvioLote) ? 
								servicoEnvioRemoto(lote) : 
								servicoEnvioLocal(lote);
		RetornoEnvio retornoEnvio = new RetornoEnvio(xmlRetorno);
		verificarProtocolo(xmlRetorno, retornoEnvio);
		return retornoEnvio;
	}
	
	public RetornoProcessamento consultarLoteEventos(String protocolo) throws ComunicacaoEsocialGovException {
		String xmlRetorno = isNotBlank(urlServicoConsultaProcessamento) ? 
								servicoConsultaRemoto(protocolo) : 
								servicoConsultaLocal(protocolo);
		return new RetornoProcessamento(xmlRetorno);
	}
	
	public boolean testarConexaoEsocial() {
		boolean conexaoOk = true;
		try {
			RetornoProcessamento retornoProcessamento = consultarLoteEventos("0000");
			String resposta = retornoProcessamento.getXmlRetorno();
			if (resposta.indexOf("retornoProcessamentoLoteEventos") <= -1) {
				LOGGER.debug("Ocorreu um erro ao tentar conectar com o eSocial. RetornoEnvio: {}", resposta);
				conexaoOk = false;
			}
		} catch (ComunicacaoEsocialGovException e) {
			LOGGER.error(e.getMessage());
			LOGGER.debug(e.getMessage(), e);
			conexaoOk = false;
		}
		return conexaoOk;
	}
	
	private String servicoEnvioRemoto(String lote) throws ComunicacaoEsocialGovException {
		try {
			return new Http().post(urlServicoEnvioLote, lote);
		} catch (IOException e) {
			throw new ComunicacaoEsocialGovException(
					"Ocorreu um erro ao tentar enviar lote para eSocial-Gov usando servico remoto:\n"
					+ urlServicoEnvioLote
					, e);
		}
	}
	
	private String servicoEnvioLocal(String lote) throws ComunicacaoEsocialGovException {
		try {
			return servico.enviarLote(lote);
		} catch (IOException | XmlMappingException | SoapFaultClientException e) {
			throw new ComunicacaoEsocialGovException("Ocorreu um erro ao tentar enviar lote para eSocial-Gov em:\n"
					+ servico.getUrlEnviarLoteGov()
					+ "\nCom a ACTION:"
					+ servico.getActionEnviarLoteGov()
					, e);
		}
	}

	private void verificarProtocolo(String xmlRetorno, RetornoEnvio retornoEnvio)
			throws ComunicacaoEsocialGovException {
		if (StringUtils.isBlank(retornoEnvio.getProtocolo())) {
			throw new ComunicacaoEsocialGovException("Envio para o eSocial-Gov em retornou um erro: "
					+ retornoEnvio.getCodigoResposta() + "\n" + xmlRetorno);
		}
	}
	
	private String servicoConsultaRemoto(String protocolo) throws ComunicacaoEsocialGovException {
		String url = urlServicoConsultaProcessamento + protocolo;
		try {
			return new Http().get(url);
		} catch (IOException e) {
			throw new ComunicacaoEsocialGovException(
					"Ocorreu um erro ao tentar consultar lote do eSocial-Gov usando servico remoto:\n"
					+ url
					, e);
		}
	}
	
	private String servicoConsultaLocal(String protocolo) throws ComunicacaoEsocialGovException {
		try {
			return servico.consultarLote(protocolo);
		} catch (IOException | SoapFaultClientException e) {
			throw new ComunicacaoEsocialGovException("Ocorreu um erro ao tentar consultar lote do eSocial-Gov em:\n"
					+ servico.getUrlConsultaLoteGov()
					+ "\nCom a ACTION:"
					+ servico.getActionConsultaLoteGov()
					+ "\n"
					+ e.getMessage()
					, e);
		}
	}
}
