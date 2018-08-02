package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class })
public abstract class TabelaProcessoMapper {

	public static final TabelaProcessoMapper INSTANCE = Mappers.getMapper(TabelaProcessoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoProcesso.alteracao", ignore = true)
	@Mapping(target = "infoProcesso.exclusao", ignore = true)
	@Mapping(source = "infoProcesso", target = "infoProcesso.inclusao")
	public abstract ESocial.EvtTabProcesso comoEvtTabProcessoInclusao(TabelaProcesso tabelaProcesso);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoProcesso.inclusao", ignore = true)
	@Mapping(target = "infoProcesso.exclusao", ignore = true)
	@Mapping(source = "infoProcesso", target = "infoProcesso.alteracao")
	public abstract ESocial.EvtTabProcesso comoEvtTabProcessoAlteracao(TabelaProcesso tabelaProcesso);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoProcesso.inclusao", ignore = true)
	@Mapping(target = "infoProcesso.alteracao", ignore = true)
	@Mapping(source = "infoProcesso", target = "infoProcesso.exclusao")
	public abstract ESocial.EvtTabProcesso comoEvtTabProcessoExclusao(TabelaProcesso tabelaProcesso);

	@AfterMapping
	protected void limparNulos(TabelaProcesso tabelaProcesso, @MappingTarget ESocial.EvtTabProcesso evtTabProcesso) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabProcesso);
	}
}
