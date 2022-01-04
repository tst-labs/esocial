package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenAlt;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CdBenAltMapper {

	public static final CdBenAltMapper INSTANCE = Mappers.getMapper(CdBenAltMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCdBenAlt comoEvtCdBenAlt(CdBenAlt cdBenAlt); 

}
