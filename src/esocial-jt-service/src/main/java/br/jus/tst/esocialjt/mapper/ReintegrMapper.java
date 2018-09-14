package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr;
import br.jus.tst.esocial.esquemas.eventos.reintegr.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class ReintegrMapper {

	public static final ReintegrMapper INSTANCE = Mappers.getMapper(ReintegrMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract EvtReintegr comoEvtReintegr(Reintegr reintegr);

	@AfterMapping
	protected void limparNulos(@MappingTarget EvtReintegr evtReintegr) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtReintegr);
	}

}
