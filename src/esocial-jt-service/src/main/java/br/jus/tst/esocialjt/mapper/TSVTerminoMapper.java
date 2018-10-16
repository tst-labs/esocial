package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class TSVTerminoMapper {
	
	public static final TSVTerminoMapper INSTANCE = Mappers.getMapper(TSVTerminoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtTSVTermino comoEvtTSVTermino(TSVTermino tsvTermino); 

	@AfterMapping
	protected void limparNulos(@MappingTarget ESocial.EvtTSVTermino evtTSVTermino) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTSVTermino);
	}

}
