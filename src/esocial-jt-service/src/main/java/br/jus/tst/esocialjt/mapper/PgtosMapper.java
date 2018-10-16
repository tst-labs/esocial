package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class })
public abstract class PgtosMapper {

	public static final PgtosMapper INSTANCE = Mappers.getMapper(PgtosMapper.class);
 
	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtPgtos comoEvtPgtos(Pgtos pgtos);
	
	@AfterMapping 
	protected void limparNulos(@MappingTarget EvtPgtos evtPgtos) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtPgtos);
	}

}
