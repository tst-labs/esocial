package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenIn;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CdBenInMapper {

	public static final CdBenInMapper INSTANCE = Mappers.getMapper(CdBenInMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCdBenIn comoEvtCdBenIn(CdBenIn cdBenIn); 

}
