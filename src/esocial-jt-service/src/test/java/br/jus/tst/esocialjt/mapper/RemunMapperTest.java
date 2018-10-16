package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class RemunMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Remun remun = CriadorObjetoAleatorio.criarEPreencher(Remun.class);
		EvtRemun evtRemun = RemunMapper.INSTANCE.comoEvtRemun(remun);
		
		Assertions
			.assertThat(evtRemun.getIdeEvento())
			.isEqualToIgnoringGivenFields(remun.getIdeEvento(), "indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc");

		 MapperAssertion
		 	.assertThat(evtRemun.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(remun.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtRemun.getIdeTrabalhador())
		 	.isEqualToComparingFieldByFieldRecursively(remun.getIdeTrabalhador());
		
		 MapperAssertion
		 	.assertThat(evtRemun.getDmDev())
		 	.isEqualToComparingFieldByFieldRecursively(remun.getDmDev());
	}
	
}
