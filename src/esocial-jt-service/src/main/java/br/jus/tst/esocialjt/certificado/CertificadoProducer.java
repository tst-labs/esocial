package br.jus.tst.esocialjt.certificado;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CertificadoProducer {

	@Value("${esocialjt.arquivoCertificado}")
	private String arquivoCertificado;
	
	@Value("${esocialjt.arquivoCacerts:''}")
	private String arquivoCacerts;
	
	@Value("${esocialjt.senhaCertificado}")
	private String senhaCertificado;
	
	@Value("${esocialjt.senhaCacerts:''}")
	private String senhaCacerts;

	@Bean
	public Certificado criarCertificadoComParametrosSistema() {

		return new Certificado(arquivoCertificado, 
				arquivoCacerts, 
				senhaCertificado.toCharArray(),
				senhaCacerts.toCharArray());
	}
}
