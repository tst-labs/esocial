package br.jus.tst.esocialjt.ocorrencia;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocialjt.dominio.Ocorrencia;

@Mapper
public abstract class OcorrenciaMapper {
	
	public static final OcorrenciaMapper INSTANCE = Mappers.getMapper(OcorrenciaMapper.class);
	
	@Mapping(target = "dataRecebimento", ignore = true)
	@Mapping(target = "evento", ignore = true)
	@Mapping(target = "id", ignore = true)
	public abstract Ocorrencia comoOcorrencia(OcorrenciaDTO ocorrenciaDTO);

}
