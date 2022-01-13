package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefIn;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CdBenefInMapper {

	public static final CdBenefInMapper INSTANCE = Mappers.getMapper(CdBenefInMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCdBenefIn comoEvtCdBenefIn(CdBenefIn cdBenefIn); 

}
