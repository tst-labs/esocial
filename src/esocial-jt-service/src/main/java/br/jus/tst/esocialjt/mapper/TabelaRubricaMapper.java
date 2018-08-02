package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;
import br.jus.tst.esocialjt.util.LimpadorNulos;

@Mapper(uses = { ObjectFactory.class })
public abstract class TabelaRubricaMapper {

	public static final TabelaRubricaMapper INSTANCE = Mappers.getMapper(TabelaRubricaMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoRubrica.alteracao", ignore = true)
	@Mapping(target = "infoRubrica.exclusao", ignore = true)
	@Mapping(source = "infoRubrica", target = "infoRubrica.inclusao")
	public abstract ESocial.EvtTabRubrica comoEvtTabRubricaInclusao(TabelaRubrica tabelaRubrica);
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoRubrica.inclusao", ignore = true)
	@Mapping(target = "infoRubrica.exclusao", ignore = true)
	@Mapping(source = "infoRubrica", target = "infoRubrica.alteracao")
	public abstract ESocial.EvtTabRubrica comoEvtTabRubricaAlteracao(TabelaRubrica tabelaRubrica);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	@Mapping(target = "infoRubrica.inclusao", ignore = true)
	@Mapping(target = "infoRubrica.alteracao", ignore = true)
	@Mapping(source = "infoRubrica", target = "infoRubrica.exclusao")
	public abstract ESocial.EvtTabRubrica comoEvtTabRubricaExclusao(TabelaRubrica tabelaRubrica);
	
	@AfterMapping
	protected void limparNulos(TabelaRubrica tabelaRubrica, @MappingTarget ESocial.EvtTabRubrica evtTabRubrica) {
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(evtTabRubrica);
	}
}
