package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.CdBenPrRP;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class})
public abstract class CdBenPrRPMapper {

	public static final CdBenPrRPMapper INSTANCE = Mappers.getMapper(CdBenPrRPMapper.class);

	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtCdBenPrRP comoEvtCdBenPrRP(CdBenPrRP cdBenPrRP);
	
	@AfterMapping
	protected void limparNulos(CdBenPrRP cdBenPrRP, @MappingTarget ESocial.EvtCdBenPrRP evtCdBenPrRP) {
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("infoDeficiencia");
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtCdBenPrRP);
	}
}
