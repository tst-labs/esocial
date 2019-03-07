package br.jus.tst.esocialjt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OnStartup {

	private static final Logger LOGGER = LoggerFactory.getLogger(OnStartup.class);

	@Autowired
	private ProxyParams proxyParams;

	@Value("${esocialjt.runStartup:true}")
	private boolean runStartup;

	@EventListener(ApplicationReadyEvent.class)
	public void postConstruct() {
		if (runStartup) {
			configurarProxy();
		}
	}

	private void configurarProxy() {
		if (proxyParams.usaProxy()) {
			System.getProperties().put("https.proxyHost", proxyParams.getProxyServ());
			System.getProperties().put("https.proxyPort", proxyParams.getProxyPort());
			System.getProperties().put("http.proxyUser", proxyParams.getProxyUser());
			System.getProperties().put("http.proxyPassword", proxyParams.getProxyPass());
			LOGGER.info("Usando proxy " + proxyParams.getProxyServ() + ":" + proxyParams.getProxyPort());
		}
	}
}
