package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.reativben.ESocial;
import br.jus.tst.esocial.esquemas.eventos.reativben.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.ReativBen;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class ReativBenMapper {

	public static final ReativBenMapper INSTANCE = Mappers.getMapper(ReativBenMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtReativBen comoEvtReativBen(ReativBen reativBen); 

}
