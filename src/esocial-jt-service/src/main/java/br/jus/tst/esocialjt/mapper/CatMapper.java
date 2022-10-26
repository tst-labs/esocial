package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cat.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocial.ocorrencia.dados.CAT;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class CatMapper {

	public static final CatMapper INSTANCE = Mappers.getMapper(CatMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtCAT comoEvtCAT(CAT cat);

	@AfterMapping
	protected void limparNulos(@MappingTarget ESocial.EvtCAT evtCAT) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtCAT);
	}

}
