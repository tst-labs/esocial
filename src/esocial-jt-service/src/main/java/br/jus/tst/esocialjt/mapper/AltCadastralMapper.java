package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class AltCadastralMapper {

    public static final AltCadastralMapper INSTANCE = Mappers.getMapper(AltCadastralMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtAltCadastral comoEvtAltCadastral(AltCadastral altCadastral);

	@AfterMapping
	protected void limparNulos(AltCadastral altCadastral, @MappingTarget ESocial.EvtAltCadastral evtAltCadastral) {
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtAltCadastral);
	}

}