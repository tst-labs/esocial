package br.jus.tst.esocialjt.util;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ret.beneficiario.Beneficiario;
import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaDTODeserializer;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class OcorrenciaUtil {

	static OcorrenciaDTODeserializer deserializer = new OcorrenciaDTODeserializer();
	
	static ObjectMapper mapper = new ObjectMapper();
	
	public static Ocorrencia lerOcorrencia(String arquivo) {
		try {
			InputStream ocorrenciaStr = Resource.asStream(arquivo);
			OcorrenciaDTO ocorrenciaDTO = deserializer.converter(ocorrenciaStr);
			Ocorrencia ocorrencia = OcorrenciaMapper.INSTANCE.comoOcorrencia(ocorrenciaDTO);
			ocorrencia.setCpf(ocorrencia.getDadosOcorrencia().getCpf());
			ocorrencia.setMatricula(ocorrencia.getDadosOcorrencia().getMatricula());
			return ocorrencia;
			
		} catch (IllegalArgumentException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static Empregado lerEmpregado(String arquivo) {
		try {
			InputStream empregadoStr = Resource.asStream(arquivo);
			return mapper.readValue(empregadoStr, Empregado.class);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
        
	public static TrabalhadorSemVinculo lerTrabalhadorSemVinculo(String arquivo) {
		try {
			InputStream trabalhadorSemVinculoStr = Resource.asStream(arquivo);
			return mapper.readValue(trabalhadorSemVinculoStr, TrabalhadorSemVinculo.class);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}        
	
    public static Beneficiario lerBeneficiario(String arquivo) {
        try {
            InputStream str = Resource.asStream(arquivo);
            return mapper.readValue(str, Beneficiario.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
