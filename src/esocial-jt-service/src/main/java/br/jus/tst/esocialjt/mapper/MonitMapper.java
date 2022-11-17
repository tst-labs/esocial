package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.monit.ESocial;
import br.jus.tst.esocial.esquemas.eventos.monit.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Monit;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class MonitMapper {

	public static final MonitMapper INSTANCE = Mappers.getMapper(MonitMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtMonit comoEvtMonit(Monit monit);

	@AfterMapping
	protected void limparNulos(@MappingTarget ESocial.EvtMonit evtMonit) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtMonit);
	}
}
