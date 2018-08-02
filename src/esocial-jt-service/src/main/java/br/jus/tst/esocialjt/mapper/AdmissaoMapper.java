package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.admissao.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class})
public abstract class AdmissaoMapper {

	public static final AdmissaoMapper INSTANCE = Mappers.getMapper(AdmissaoMapper.class);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "ideEvento", ignore = true)
	public abstract ESocial.EvtAdmissao comoEvtAdmissao(Admissao admissao);

	@AfterMapping
	protected void limparNulos(Admissao admissao, @MappingTarget ESocial.EvtAdmissao evtAdmissao) {
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("infoDeficiencia");
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtAdmissao);
	}
}
