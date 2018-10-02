package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class ExclusaoMapper {

	public static final ExclusaoMapper INSTANCE = Mappers.getMapper(ExclusaoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract EvtExclusao comoEvtExclusao(Exclusao exclusao);

	@AfterMapping
	protected void limparNulos(@MappingTarget EvtExclusao evtExclusao) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtExclusao);
	}

}
