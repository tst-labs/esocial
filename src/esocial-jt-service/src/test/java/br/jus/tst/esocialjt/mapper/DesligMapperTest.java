package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class DesligMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Deslig deslig = CriadorObjetoAleatorio.criarEPreencher(Deslig.class);
		EvtDeslig evtDeslig =DesligMapper.INSTANCE.comoEvtDeslig(deslig);
		
		Assertions
			.assertThat(evtDeslig.getIdeEvento())
			.isEqualToIgnoringGivenFields(deslig.getIdeEvento(), "tpAmb", "procEmi", "verProc");

		 MapperAssertion
		 	.assertThat(evtDeslig.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(deslig.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtDeslig.getIdeVinculo())
		 	.isEqualToComparingFieldByFieldRecursively(deslig.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtDeslig.getInfoDeslig())
		 	.isEqualToComparingFieldByFieldRecursively(deslig.getInfoDeslig());
	}
	
	@Test
	public void deveSerPadraoSeNaoHaRetificacao() {
		Deslig deslig = CriadorObjetoAleatorio.criarEPreencher(Deslig.class);
		deslig.setIdeEvento(null);
		EvtDeslig evtDeslig =DesligMapper.INSTANCE.comoEvtDeslig(deslig);
		Assertions.assertThat(evtDeslig.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
}
