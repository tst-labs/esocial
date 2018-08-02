package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, LimpadorNulos.class })
public abstract class TabelaEstabelecimentoMapper {

	public static final TabelaEstabelecimentoMapper INSTANCE = Mappers.getMapper(TabelaEstabelecimentoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoEstab.alteracao", ignore = true)
	@Mapping(target = "infoEstab.exclusao", ignore = true)
	@Mapping(source = "infoEstab", target = "infoEstab.inclusao")
	public abstract ESocial.EvtTabEstab comoEvtTabEstabInclusao(TabelaEstabelecimento tabelaEstabelecimento);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoEstab.inclusao", ignore = true)
	@Mapping(target = "infoEstab.exclusao", ignore = true)
	@Mapping(source = "infoEstab", target = "infoEstab.alteracao")
	public abstract ESocial.EvtTabEstab comoEvtTabEstabAlteracao(TabelaEstabelecimento tabelaEstabelecimento);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoEstab.inclusao", ignore = true)
	@Mapping(target = "infoEstab.alteracao", ignore = true)
	@Mapping(source = "infoEstab", target = "infoEstab.exclusao")
	public abstract ESocial.EvtTabEstab comoEvtTabEstabExclusao(TabelaEstabelecimento tabelaEstabelecimento);

	@AfterMapping
	protected void limparNulos(TabelaEstabelecimento tabelaEstabelecimento,
			@MappingTarget ESocial.EvtTabEstab evtTabEstab) {
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("contApr");
    	LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtTabEstab);
	}

}
