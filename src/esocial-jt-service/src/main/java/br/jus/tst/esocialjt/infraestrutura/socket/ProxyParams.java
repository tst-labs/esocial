package br.jus.tst.esocialjt.infraestrutura.socket;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProxyParams {

	@Value("${esocialjt.proxyServer:}")
	private String proxyServ;
	
	@Value("${esocialjt.proxyPort:}")
	private String proxyPort;
	
	@Value("${esocialjt.proxyUser:}")
	private String proxyUser;
	
	@Value("${esocialjt.proxyPassword:}")
	private String proxyPass;

	public ProxyParams() {
		super();
	}

	public ProxyParams(String proxyServ, String proxyPort, String proxyUser, String proxyPass) {
		super();
		this.proxyServ = proxyServ;
		this.proxyPort = proxyPort;
		this.proxyUser = proxyUser;
		this.proxyPass = proxyPass;
	}

	public Boolean usaProxy() {
		return StringUtils.isNotBlank(proxyServ);
	}

	public String getProxyPass() {
		return proxyPass;
	}

	public String getProxyPort() {
		return proxyPort;
	}

	public String getProxyServ() {
		return proxyServ;
	}

	public String getProxyUser() {
		return proxyUser;
	}
}
