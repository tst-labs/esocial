package br.jus.tst.esocialjt;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.auto.TimerEnvio;
import br.jus.tst.esocialjt.certificado.Certificado;
import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoProcessamento;
import br.jus.tst.esocialjt.infraestrutura.socket.ConexaoSSL;
import br.jus.tst.esocialjt.infraestrutura.socket.ProxyParams;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@Component
public class OnStartup {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnStartup.class);

	@Autowired
	private TimerEnvio timerEnvio;
	
	@Autowired
	private ConexaoSSL conexaoSSL;

	@Autowired
	private Certificado certificado;
	
	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;
	
	@Autowired
	private ProxyParams proxyParams;
	
	@Value("${esocialjt.runStartup:true}")
	private boolean runStartup;
	
	@PostConstruct
	public void postConstruct() {
		if(runStartup) {
			configurarSSL();
			testarConexaoEsocial();
			iniciarTimer();
		}
	}
	
	private void iniciarTimer() {
		timerEnvio.iniciar();
		LOGGER.info(timerEnvio.getStatus().toString());
	}
	
	private void configurarSSL() {
		LOGGER.info("Configurando SSL...");
		conexaoSSL.configurarSslUtilizandoCertificado(certificado, proxyParams);
	}
	
	private void testarConexaoEsocial() {
		LOGGER.info("Testando conexão com eSocial...");
		try {
			RetornoProcessamento retornoProcessamento = comunicacaoEsocialGov.consultarLoteEventos("0000");
			String resposta = retornoProcessamento.getXmlRetorno();
			if (resposta.indexOf("retornoProcessamentoLoteEventos") > -1) {
				LOGGER.info("Conexão com eSocial OK ");
				LOGGER.debug("RetornoEnvio: {}", resposta);
			} else {
				LOGGER.error("Ocorreu um erro ao tentar conectar com o eSocial. RetornoEnvio: {}", resposta);
			}
		} catch (ComunicacaoEsocialGovException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}
