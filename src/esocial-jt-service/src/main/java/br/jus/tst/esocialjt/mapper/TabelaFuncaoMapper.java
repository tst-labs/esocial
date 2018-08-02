package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabfuncao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabfuncao.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class })
public abstract class TabelaFuncaoMapper {

	public static final TabelaFuncaoMapper INSTANCE = Mappers.getMapper(TabelaFuncaoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoFuncao.alteracao", ignore = true)
	@Mapping(target = "infoFuncao.exclusao", ignore = true)
	@Mapping(source = "infoFuncao", target = "infoFuncao.inclusao")
	public abstract ESocial.EvtTabFuncao comoEvtTabFuncaoInclusao(TabelaFuncao tabelaFuncao);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoFuncao.inclusao", ignore = true)
	@Mapping(target = "infoFuncao.exclusao", ignore = true)
	@Mapping(source = "infoFuncao", target = "infoFuncao.alteracao")
	public abstract ESocial.EvtTabFuncao comoEvtTabFuncaoAlteracao(TabelaFuncao tabelaFuncao);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoFuncao.inclusao", ignore = true)
	@Mapping(target = "infoFuncao.alteracao", ignore = true)
	@Mapping(source = "infoFuncao", target = "infoFuncao.exclusao")
	public abstract ESocial.EvtTabFuncao comoEvtTabFuncaoExclusao(TabelaFuncao tabelaFuncao);

	@AfterMapping
	protected void limparNulos(TabelaFuncao tabelaFuncao, @MappingTarget ESocial.EvtTabFuncao evtTabFuncao) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabFuncao);
	}
}
