package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabcarreira.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabcarreira.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCarreira;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, LimpadorNulos.class, XMLGregorianCalendarMapper.class })
public abstract class TabelaCarreiraMapper {
	public static final TabelaCarreiraMapper INSTANCE = Mappers.getMapper(TabelaCarreiraMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCarreira.alteracao", ignore = true)
	@Mapping(target = "infoCarreira.exclusao", ignore = true)
	@Mapping(source = "infoCarreira", target = "infoCarreira.inclusao")
	public abstract ESocial.EvtTabCarreira comoEvtTabCarreiraInclusao(TabelaCarreira tabelaCarreira);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCarreira.inclusao", ignore = true)
	@Mapping(target = "infoCarreira.exclusao", ignore = true)
	@Mapping(source = "infoCarreira", target = "infoCarreira.alteracao")
	public abstract ESocial.EvtTabCarreira comoEvtTabCarreiraAlteracao(TabelaCarreira tabelaCarreira);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoCarreira.inclusao", ignore = true)
	@Mapping(target = "infoCarreira.alteracao", ignore = true)
	@Mapping(source = "infoCarreira", target = "infoCarreira.exclusao")
	public abstract ESocial.EvtTabCarreira comoEvtTabCarreiraExclusao(TabelaCarreira tabelaCarreira);
	
	@AfterMapping
	protected void limparNulos(TabelaCarreira tabelaCarreira, @MappingTarget ESocial.EvtTabCarreira evtTabCarreira) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabCarreira);
	}

}
