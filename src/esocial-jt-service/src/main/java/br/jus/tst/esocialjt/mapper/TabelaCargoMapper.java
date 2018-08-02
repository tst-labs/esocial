package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabcargo.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabcargo.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCargo;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, LimpadorNulos.class, XMLGregorianCalendarMapper.class })
public abstract class TabelaCargoMapper {
	public static final TabelaCargoMapper INSTANCE = Mappers.getMapper(TabelaCargoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCargo.alteracao", ignore = true)
	@Mapping(target = "infoCargo.exclusao", ignore = true)
	@Mapping(source = "infoCargo", target = "infoCargo.inclusao")
	public abstract ESocial.EvtTabCargo comoEvtTabCargoInclusao(TabelaCargo tabelaCargo);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCargo.inclusao", ignore = true)
	@Mapping(target = "infoCargo.exclusao", ignore = true)
	@Mapping(source = "infoCargo", target = "infoCargo.alteracao")
	public abstract ESocial.EvtTabCargo comoEvtTabCargoAlteracao(TabelaCargo tabelaCargo);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCargo.inclusao", ignore = true)
	@Mapping(target = "infoCargo.alteracao", ignore = true)
	@Mapping(source = "infoCargo", target = "infoCargo.exclusao")
	public abstract ESocial.EvtTabCargo comoEvtTabCargoExclusao(TabelaCargo tabelaCargo);

	@AfterMapping
	protected void limparNulos(TabelaCargo tabelaCargo, @MappingTarget ESocial.EvtTabCargo evtTabCargo) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabCargo);
	}

}
