package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial;
import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial.EvtTotConting;
import br.jus.tst.esocial.esquemas.eventos.totconting.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TotConting;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class TotContingMapper {

	public static final TotContingMapper INSTANCE = Mappers.getMapper(TotContingMapper.class);
 
	@Mapping(target = "id", ignore = true) 
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtTotConting comoEvtTotConting(TotConting totConting);
 
	@AfterMapping
	protected void limparNulos(@MappingTarget EvtTotConting evtTotConting) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTotConting);
	}

}
