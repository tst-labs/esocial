package br.jus.tst.esocialjt.comunicacaogov;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class LeitorXML {
	
	public static String lerRetornoEnvio(String arquivo) {
		return ler("xml-esocial-gov/retorno-envio/"+arquivo);
	}
	
	public static String lerRetornoProcessamento(String arquivo) {
		return ler("xml-esocial-gov/retorno-processamento/"+arquivo);
	}
	
	public static String ler(String caminhoCompletoArquivo) {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classloader.getResourceAsStream(caminhoCompletoArquivo);
		try {
			return IOUtils.toString(stream, "UTF-8");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
