package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefAlt;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CdBenefAltMapper {

	public static final CdBenefAltMapper INSTANCE = Mappers.getMapper(CdBenefAltMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCdBenefAlt comoEvtCdBenefAlt(CdBenefAlt cdBenefAlt); 

}
