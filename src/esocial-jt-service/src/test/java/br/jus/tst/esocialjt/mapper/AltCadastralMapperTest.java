package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
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
		
		Assertions
			.assertThat(evtAltCadastral.getIdeEvento())
			.isEqualToIgnoringGivenFields(altCadastral.getIdeEvento(), "tpAmb", "procEmi", "verProc");

		MapperAssertion
		 	.assertThat(evtAltCadastral.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(altCadastral.getIdeEmpregador());
		
		MapperAssertion
		 	.assertThat(evtAltCadastral.getIdeTrabalhador())
		 	.isEqualToComparingFieldByFieldRecursively(altCadastral.getIdeTrabalhador());
		
		MapperAssertion
		 	.assertThat(evtAltCadastral.getAlteracao())
		 	.isEqualToComparingFieldByFieldRecursively(altCadastral.getAlteracao());
	}
	
	@Test
	public void deveSerPadraoSeNaoHaRetificacao() {
		AltCadastral altCadastral = CriadorObjetoAleatorio.criarEPreencher(AltCadastral.class);
		altCadastral.setIdeEvento(null);
		EvtAltCadastral evtAltCadastral = AltCadastralMapper.INSTANCE.comoEvtAltCadastral(altCadastral);
		
		Assertions.assertThat(evtAltCadastral.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
}
