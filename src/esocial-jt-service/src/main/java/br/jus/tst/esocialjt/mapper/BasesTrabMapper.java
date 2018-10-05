package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.basestrab.ESocial.EvtBasesTrab;
import br.jus.tst.esocial.esquemas.eventos.basestrab.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.BasesTrab;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class BasesTrabMapper {

	public static final BasesTrabMapper INSTANCE = Mappers.getMapper(BasesTrabMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract EvtBasesTrab comoEvtBasesTrab(BasesTrab basestrab);

	@AfterMapping
	protected void limparNulos(@MappingTarget EvtBasesTrab evtBasesTrab) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtBasesTrab);
	}

}
