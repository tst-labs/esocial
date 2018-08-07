package br.jus.tst.esocialjt.infraestrutura.socket;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.junit.Test;

import br.jus.tst.esocialjt.certificado.Certificado;

public class ConexaoSSLTest {

	@Test
	public void deveRegistrarSocketFactoryComCertificadoParaConexaoHttps() {
		ConexaoSSL conexaoSSL = new ConexaoSSL();
		Certificado certificado = criarCertificadoParaTeste();
		conexaoSSL.configurarSslUtilizandoCertificado(certificado, new ProxyParams());
		
		Protocol protocol = Protocol.getProtocol("https");
		ProtocolSocketFactory socketFactory = protocol.getSocketFactory();
		assertThat(socketFactory).isInstanceOf(SocketFactoryDinamico.class);
	}
	
	public Certificado criarCertificadoParaTeste() {
		final String arquivoCertificado = "target/test-classes/keystore.pfx";
		final String arquivoCacerts = "";
		final String senhaCertificado = "123456";
		final String senhaCacerts = "";

		return new Certificado(arquivoCertificado, arquivoCacerts, senhaCertificado.toCharArray(),
				senhaCacerts.toCharArray());
	}
}
