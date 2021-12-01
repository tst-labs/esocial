package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AltCadastralMapperTest {
	
	@Test
	public void deveMapearEvento() {
		AltCadastral altCadastral = CriadorObjetoAleatorio.criarEPreencher(AltCadastral.class);
		EvtAltCadastral evtAltCadastral = AltCadastralMapper.INSTANCE.comoEvtAltCadastral(altCadastral);

		MapperAssertion
		 	.assertThat(evtAltCadastral.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(altCadastral.getIdeEmpregador());
		
		MapperAssertion
		 	.assertThat(evtAltCadastral.getIdeTrabalhador())
		 	.usingRecursiveComparison().isEqualTo(altCadastral.getIdeTrabalhador());
		
		MapperAssertion
		 	.assertThat(evtAltCadastral.getAlteracao())
		 	.usingRecursiveComparison().isEqualTo(altCadastral.getAlteracao());
	}
}
