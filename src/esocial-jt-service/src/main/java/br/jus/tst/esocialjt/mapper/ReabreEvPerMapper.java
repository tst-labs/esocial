package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial.EvtReabreEvPer;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.ReabreEvPer;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class })
public abstract class ReabreEvPerMapper {

	public static final ReabreEvPerMapper INSTANCE = Mappers.getMapper(ReabreEvPerMapper.class);
 
	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtReabreEvPer comoEvtReabreEvPer(ReabreEvPer reabreEvPer);
 
	@AfterMapping
	protected void limparNulos(@MappingTarget EvtReabreEvPer evtReabreEvPer) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtReabreEvPer);
	}

}
