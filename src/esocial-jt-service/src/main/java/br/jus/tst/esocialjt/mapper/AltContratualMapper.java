package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class AltContratualMapper {

    public static final AltContratualMapper INSTANCE = Mappers.getMapper(AltContratualMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtAltContratual comoEvtAltContratual(AltContratual altContratual);

	@AfterMapping
	protected void limparNulos(AltContratual altContratual, @MappingTarget ESocial.EvtAltContratual evtAltContratual) {
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("infoDeficiencia");
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtAltContratual);
	}

}