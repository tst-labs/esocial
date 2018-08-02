package br.jus.tst.esocialjt.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ObjectFactory;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.util.LimpadorNulos;
import br.jus.tst.esocialjt.util.LimpadorNulosConfig;

@Mapper(uses = { ObjectFactory.class, XMLGregorianCalendarMapper.class,
	LimpadorNulos.class })
public abstract class EmpregadorMapper {

    public static final EmpregadorMapper INSTANCE = Mappers.getMapper(EmpregadorMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ideEvento", ignore = true)
    @Mapping(target = "infoEmpregador.alteracao", ignore = true)
    @Mapping(target = "infoEmpregador.exclusao", ignore = true)
    @Mapping(source = "infoEmpregador", target = "infoEmpregador.inclusao")
    public abstract ESocial.EvtInfoEmpregador comoEvtInfoEmpregadorInclusao(InformacoesEmpregador informacaoEmpregador);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ideEvento", ignore = true)
    @Mapping(target = "infoEmpregador.inclusao", ignore = true)
    @Mapping(target = "infoEmpregador.exclusao", ignore = true)
    @Mapping(source = "infoEmpregador", target = "infoEmpregador.alteracao")
    public abstract ESocial.EvtInfoEmpregador comoEvtInfoEmpregadorAlteracao(InformacoesEmpregador informacaoEmpregador);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ideEvento", ignore = true)
    @Mapping(target = "infoEmpregador.inclusao", ignore = true)
    @Mapping(target = "infoEmpregador.alteracao", ignore = true)
    @Mapping(source = "infoEmpregador", target = "infoEmpregador.exclusao")
    public abstract ESocial.EvtInfoEmpregador comoEvtInfoEmpregadorExclusao(InformacoesEmpregador informacaoEmpregador);
    
    @AfterMapping
    protected void limparNulos(InformacoesEmpregador informacaoEmpregador,
	    @MappingTarget ESocial.EvtInfoEmpregador evtInfoEmpregador) {
    	
    	LimpadorNulosConfig config = new LimpadorNulosConfig();
    	config.naoLimparPropriedade("situacaoPJ");
    	config.naoLimparPropriedade("indAcordoIsenMulta");
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(evtInfoEmpregador);

    }

}
