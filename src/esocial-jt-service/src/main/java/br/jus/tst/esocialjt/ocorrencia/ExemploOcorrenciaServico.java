package br.jus.tst.esocialjt.ocorrencia;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;

@Service
public class ExemploOcorrenciaServico {
	
	@Value("${esocialjt.cnpj-empregador:}")
	String runStartup;
	
	private static final String PASTA = "exemplos";
	
	public OcorrenciaDTO lerOcorrenciaDTO(TipoOcorrencia tipo) throws EntidadeNaoExisteException, IOException {
		String caminhoRecurso = getCaminhoRecurso(tipo.toString());
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream stream = classloader.getResourceAsStream(caminhoRecurso);
		
		if(stream == null) {
			throw new EntidadeNaoExisteException(caminhoRecurso + " não encontrado");
		}

		return	new ObjectMapper().readValue(stream, OcorrenciaDTO.class);
	}
	
	public Ocorrencia lerOcorrencia(TipoOcorrencia tipo)  throws EntidadeNaoExisteException, IOException {
		OcorrenciaDTO ocorrenciaDTO = lerOcorrenciaDTO(tipo);
		return OcorrenciaMapper.INSTANCE.comoOcorrencia(ocorrenciaDTO);
	}

	private String getCaminhoRecurso(String filename) {
		return PASTA + "/" + filename.toLowerCase() + ".json";
	}

}
