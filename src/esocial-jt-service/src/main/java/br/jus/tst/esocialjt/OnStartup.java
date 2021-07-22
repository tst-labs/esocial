package br.jus.tst.esocialjt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.WebServiceIOException;

import br.jus.tst.esocialjt.auto.TimerEnvio;
import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.infraestrutura.ProxyParams;

@Component
public class OnStartup {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OnStartup.class);

	@Autowired
	private TimerEnvio timerEnvio;
	
	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;
	
	@Autowired
	private ProxyParams proxyParams;
	
	@Value("${esocialjt.runStartup:true}")
	private boolean runStartup;
	
	@Value("${esocialjt.ambiente}")
	TipoAmbiente ambiente;
	
	@EventListener(ApplicationReadyEvent.class)
	public void postConstruct() {
		LOGGER.info("Ambiente: " + ambiente);
		if(runStartup) {
			configurarProxy();
			testarConexaoEsocial();
			iniciarTimer();
		}
	}
	
	private void iniciarTimer() {
		timerEnvio.iniciar();
		LOGGER.info(timerEnvio.getStatus().toString());
	}
	
	private void configurarProxy() {
		if(proxyParams.usaProxy()) {
			LOGGER.info("Configurando Proxy...");
			System.getProperties().put("https.proxyHost", proxyParams.getProxyServ());
			System.getProperties().put("https.proxyPort", proxyParams.getProxyPort());
			System.getProperties().put("http.proxyUser", proxyParams.getProxyUser());
			System.getProperties().put("http.proxyPassword", proxyParams.getProxyPass());
		}
	}
	
	private void testarConexaoEsocial() {
		LOGGER.info("Testando conexão com eSocial...");
		try {
			if (comunicacaoEsocialGov.testarConexaoEsocial()) {
				LOGGER.info("Conexão com eSocial OK ");
			} else {
				LOGGER.error("Ocorreu um erro ao tentar conectar com o eSocial");
			}
		} catch (WebServiceIOException e) {
			LOGGER.error(e.getMessage()+". Is proxyServer configured?", e);
		}
	}
}
