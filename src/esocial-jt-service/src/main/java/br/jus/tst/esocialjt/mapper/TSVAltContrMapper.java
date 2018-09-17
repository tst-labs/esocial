package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class TSVAltContrMapper {
	
	public static final TSVAltContrMapper INSTANCE = Mappers.getMapper(TSVAltContrMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtTSVAltContr comoEvtTSVAltContr(TSVAltContr tsvInicio);

	@AfterMapping
	protected void limparNulos(TSVAltContr tsvInicio,
			@MappingTarget ESocial.EvtTSVAltContr evtTSVAltContr) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTSVAltContr);
	}

}
