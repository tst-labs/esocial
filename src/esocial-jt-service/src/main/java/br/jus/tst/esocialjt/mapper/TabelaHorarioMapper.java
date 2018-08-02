package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabhortur.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabhortur.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaHorario;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, LimpadorNulos.class })
public abstract class TabelaHorarioMapper {

	public static final TabelaHorarioMapper INSTANCE = Mappers.getMapper(TabelaHorarioMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoHorContratual.alteracao", ignore = true)
	@Mapping(target = "infoHorContratual.exclusao", ignore = true)
	@Mapping(source = "infoHorContratual", target = "infoHorContratual.inclusao")
	public abstract ESocial.EvtTabHorTur comoEvtTabHorTurInclusao(TabelaHorario tabelaHorario);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoHorContratual.inclusao", ignore = true)
	@Mapping(target = "infoHorContratual.exclusao", ignore = true)
	@Mapping(source = "infoHorContratual", target = "infoHorContratual.alteracao")
	public abstract ESocial.EvtTabHorTur comoEvtTabHorTurAlteracao(TabelaHorario tabelaHorario);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoHorContratual.inclusao", ignore = true)
	@Mapping(target = "infoHorContratual.alteracao", ignore = true)
	@Mapping(source = "infoHorContratual", target = "infoHorContratual.exclusao")
	public abstract ESocial.EvtTabHorTur comoEvtTabHorTurExclusao(TabelaHorario tabelaHorario);

	@AfterMapping
	protected void limparNulos(TabelaHorario tabelaHorario, @MappingTarget ESocial.EvtTabHorTur evtTabHorTur) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabHorTur);
	}
}
