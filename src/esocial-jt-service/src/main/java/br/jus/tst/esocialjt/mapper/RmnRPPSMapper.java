package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class })
public abstract class RmnRPPSMapper {

	public static final RmnRPPSMapper INSTANCE = Mappers.getMapper(RmnRPPSMapper.class);
 
	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtRmnRPPS comoEvtRmnRPPS(RmnRPPS rmnRPPS); 

	@AfterMapping 
	protected void limparNulos(@MappingTarget EvtRmnRPPS evtRmnRPPS) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtRmnRPPS);
	}

}
