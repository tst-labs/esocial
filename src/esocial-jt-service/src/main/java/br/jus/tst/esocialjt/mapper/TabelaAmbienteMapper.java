package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabambiente.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabambiente.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaAmbiente;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, LimpadorNulos.class, XMLGregorianCalendarMapper.class })
public abstract class TabelaAmbienteMapper {
	public static final TabelaAmbienteMapper INSTANCE = Mappers.getMapper(TabelaAmbienteMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoAmbiente.alteracao", ignore = true)
	@Mapping(target = "infoAmbiente.exclusao", ignore = true)
	@Mapping(source = "infoAmbiente", target = "infoAmbiente.inclusao")
	public abstract ESocial.EvtTabAmbiente comoEvtTabAmbienteInclusao(TabelaAmbiente tabelaAmbiente);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoAmbiente.inclusao", ignore = true)
	@Mapping(target = "infoAmbiente.exclusao", ignore = true)
	@Mapping(source = "infoAmbiente", target = "infoAmbiente.alteracao")
	public abstract ESocial.EvtTabAmbiente comoEvtTabAmbienteAlteracao(TabelaAmbiente tabelaAmbiente);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoAmbiente.inclusao", ignore = true)
	@Mapping(target = "infoAmbiente.alteracao", ignore = true)
	@Mapping(source = "infoAmbiente", target = "infoAmbiente.exclusao")
	public abstract ESocial.EvtTabAmbiente comoEvtTabAmbienteExclusao(TabelaAmbiente tabelaAmbiente);

	@AfterMapping
	protected void limparNulos(TabelaAmbiente tabelaAmbiente, @MappingTarget ESocial.EvtTabAmbiente evtTabAmbiente) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabAmbiente);
	}

}
