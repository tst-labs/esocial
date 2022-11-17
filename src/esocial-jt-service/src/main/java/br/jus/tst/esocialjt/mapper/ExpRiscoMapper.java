package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.exprisco.ESocial;
import br.jus.tst.esocial.esquemas.eventos.exprisco.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.ExpRisco;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class ExpRiscoMapper {

	public static final ExpRiscoMapper INSTANCE = Mappers.getMapper(ExpRiscoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtExpRisco comoEvtExpRisco(ExpRisco expRisco);

	@AfterMapping
	protected void limparNulos(@MappingTarget ESocial.EvtExpRisco evtExpRisco) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtExpRisco);
	}

}
