package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.remun.ESocial;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun;
import br.jus.tst.esocial.esquemas.eventos.remun.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class })
public abstract class RemunMapper {

	public static final RemunMapper INSTANCE = Mappers.getMapper(RemunMapper.class);
 
	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtRemun comoEvtRemun(Remun remun);
 
	@AfterMapping 
	protected void limparNulos(@MappingTarget EvtRemun evtRemun) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtRemun);
	}

}
