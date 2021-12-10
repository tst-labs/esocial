package br.jus.tst.esocialjt.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cessao.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Cessao;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CessaoMapper {

	public static final CessaoMapper INSTANCE = Mappers.getMapper(CessaoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCessao comoEvtCessao(Cessao cessao); 

}
