package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class, IdeEventoMapper.class})
public abstract class BenPrRPMapper {

	public static final BenPrRPMapper INSTANCE = Mappers.getMapper(BenPrRPMapper.class);

	@Mapping(target = "id", ignore = true)
	public abstract ESocial.EvtBenPrRP comoEvtBenPrRP(BenPrRP benPrRP);
	
	@AfterMapping
	protected void limparNulos(BenPrRP benPrRP, @MappingTarget ESocial.EvtBenPrRP evtBenPrRP) { 
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("infoDeficiencia");
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtBenPrRP);
	}
}
