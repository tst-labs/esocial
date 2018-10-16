package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class })
public abstract class FechaEvPerMapper {

	public static final FechaEvPerMapper INSTANCE = Mappers.getMapper(FechaEvPerMapper.class);
 
	@Mapping(target = "id", ignore = true) 
	public abstract ESocial.EvtFechaEvPer comoEvtFechaEvPer(FechaEvPer fechaEvPer);
	
	@AfterMapping
	protected void limparNulos(@MappingTarget EvtFechaEvPer evtFechaEvPer) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtFechaEvPer);
	}

}
