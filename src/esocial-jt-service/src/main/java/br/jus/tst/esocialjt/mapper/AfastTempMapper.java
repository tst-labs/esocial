package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class AfastTempMapper {

	public static final AfastTempMapper INSTANCE = Mappers.getMapper(AfastTempMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract EvtAfastTemp comoEvtAfastTemp(AfastTemp afastTemp);

	@AfterMapping
	protected void limparNulos(@MappingTarget EvtAfastTemp evtAfastTemp) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtAfastTemp);
	}

}
