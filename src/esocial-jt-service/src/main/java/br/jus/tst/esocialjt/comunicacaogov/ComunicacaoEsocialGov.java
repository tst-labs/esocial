package br.jus.tst.esocialjt.comunicacaogov;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.esocialjt.comunicacao.wsdl.ServicoConsultarLoteEventosStub;
import br.jus.esocialjt.comunicacao.wsdl.ServicoConsultarLoteEventosStub.ConsultarLoteEventos;
import br.jus.esocialjt.comunicacao.wsdl.ServicoEnviarLoteEventosStub;
import br.jus.esocialjt.comunicacao.wsdl.ServicoEnviarLoteEventosStub.EnviarLoteEventos;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@Component
public class ComunicacaoEsocialGov {
	public static final String URL_ENVIAR_LOTE_EVENTOS = "https://webservices.producaorestrita.esocial.gov.br/servicos/empregador/enviarloteeventos/WsEnviarLoteEventos.svc";
	public static final String URL_CONSULTAR_LOTE_EVENTOS = "https://webservices.producaorestrita.esocial.gov.br/servicos/empregador/consultarloteeventos/WsConsultarLoteEventos.svc";

	private static final Logger LOGGER = LoggerFactory.getLogger(ComunicacaoEsocialGov.class);

	@Autowired
	private GeradorLoteEventos geradorLoteEventos;

	@Autowired
	private GeradorLoteConsulta geradorLoteConsulta;

	public RetornoEnvio enviarLoteEventos(String lote) throws ComunicacaoEsocialGovException {
		try {
			ServicoEnviarLoteEventosStub stub = new ServicoEnviarLoteEventosStub(URL_ENVIAR_LOTE_EVENTOS);
			EnviarLoteEventos loteEventos = geradorLoteEventos.gerarLoteEventos(lote);
			ServicoEnviarLoteEventosStub.EnviarLoteEventosResponse result = stub.enviarLoteEventos(loteEventos);
			String xmlRetorno = result.getEnviarLoteEventosResult().getExtraElement().toString();

			RetornoEnvio retornoEnvio = new RetornoEnvio(xmlRetorno);

			if (StringUtils.isBlank(retornoEnvio.getProtocolo())) {
				throw new ComunicacaoEsocialGovException("Envio para o eSocial-Gov em " + URL_ENVIAR_LOTE_EVENTOS
						+ " retornou um erro: " + retornoEnvio.getCodigoResposta() + "\n" + xmlRetorno);
			}
			return retornoEnvio;
		} catch (IOException | XMLStreamException e) {
			throw new ComunicacaoEsocialGovException("Ocorreu um erro ao tentar enviar para o eSocial-Gov em "
					+ URL_ENVIAR_LOTE_EVENTOS + "\n" + e.getMessage(), e);
		}
	}

	public RetornoProcessamento consultarLoteEventos(String protocolo) throws ComunicacaoEsocialGovException {
		try {
			ServicoConsultarLoteEventosStub stub = new ServicoConsultarLoteEventosStub(URL_CONSULTAR_LOTE_EVENTOS);
			ConsultarLoteEventos gerarConsultaLoteEventos = geradorLoteConsulta.gerarConsultaLoteEventos(protocolo);
			ServicoConsultarLoteEventosStub.ConsultarLoteEventosResponse resultCLE = stub
					.consultarLoteEventos(gerarConsultaLoteEventos);
			String xmlRetorno = resultCLE.getConsultarLoteEventosResult().getExtraElement().toString();

			return new RetornoProcessamento(xmlRetorno);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new ComunicacaoEsocialGovException(
					"Ocorreu um erro ao tentar consultar lote do eSocial-Gov em " + URL_CONSULTAR_LOTE_EVENTOS, e);
		}
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
			LOGGER.debug(e.getMessage(), e);
			conexaoOk = false;
		}
		return conexaoOk;
	}

}
