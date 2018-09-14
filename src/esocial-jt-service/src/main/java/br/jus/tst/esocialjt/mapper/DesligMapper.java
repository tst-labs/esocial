package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig;
import br.jus.tst.esocial.esquemas.eventos.deslig.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class DesligMapper {

	public static final DesligMapper INSTANCE = Mappers.getMapper(DesligMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract EvtDeslig comoEvtDeslig(Deslig deslig);

	@AfterMapping
	protected void limparNulos(@MappingTarget EvtDeslig evtDeslig) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtDeslig);
	}

}
