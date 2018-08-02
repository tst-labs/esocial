package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class,  LimpadorNulos.class})
public abstract class TabelaLotacaoMapper {
	public static final TabelaLotacaoMapper INSTANCE = Mappers.getMapper(TabelaLotacaoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoLotacao.alteracao", ignore = true)
	@Mapping(target = "infoLotacao.exclusao", ignore = true)
	@Mapping(source = "infoLotacao", target = "infoLotacao.inclusao")
	public abstract ESocial.EvtTabLotacao comoEvtTabLotacaoInclusao(TabelaLotacao tabelaLotacao);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoLotacao.inclusao", ignore = true)
	@Mapping(target = "infoLotacao.exclusao", ignore = true)
	@Mapping(source = "infoLotacao", target = "infoLotacao.alteracao")
	public abstract ESocial.EvtTabLotacao comoEvtTabLotacaoAlteracao(TabelaLotacao tabelaLotacao);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoLotacao.inclusao", ignore = true)
	@Mapping(target = "infoLotacao.alteracao", ignore = true)
	@Mapping(source = "infoLotacao", target = "infoLotacao.exclusao")
	public abstract ESocial.EvtTabLotacao comoEvtTabLotacaoExclusao(TabelaLotacao tabelaLotacao);

	@AfterMapping
	protected void limparNulos(TabelaLotacao tabelaLotacao, @MappingTarget ESocial.EvtTabLotacao evtTabLotacao) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabLotacao);
	}

}
