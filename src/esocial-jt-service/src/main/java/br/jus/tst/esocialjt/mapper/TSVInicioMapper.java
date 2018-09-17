package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class TSVInicioMapper {
	
	public static final TSVInicioMapper INSTANCE = Mappers.getMapper(TSVInicioMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtTSVInicio comoEvtTSVInicio(TSVInicio tsvInicio);

	@AfterMapping
	protected void limparNulos(TSVInicio tsvInicio,
			@MappingTarget ESocial.EvtTSVInicio evtTSVInicio) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTSVInicio);
	}

}
