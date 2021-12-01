package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TSVInicioMapperTest {
	
	@Test
	public void deveMapearEvento(){
		TSVInicio tsvInicio = CriadorObjetoAleatorio.criarEPreencher(TSVInicio.class);
		EvtTSVInicio evtTSVInicio = TSVInicioMapper.INSTANCE.comoEvtTSVInicio(tsvInicio);

		MapperAssertion
			.assertThat(evtTSVInicio.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(tsvInicio.getIdeEmpregador());
	
		MapperAssertion
			.assertThat(evtTSVInicio.getTrabalhador())
			.usingRecursiveComparison().isEqualTo(tsvInicio.getTrabalhador());

		MapperAssertion
			.assertThat(evtTSVInicio.getInfoTSVInicio())
			.usingRecursiveComparison().isEqualTo(tsvInicio.getInfoTSVInicio());
	}
	
}
