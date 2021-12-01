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
			.usingRecursiveComparison()
			.ignoringFields("indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc")
			.isEqualTo(remun.getIdeEvento());

		 MapperAssertion
		 	.assertThat(evtRemun.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(remun.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtRemun.getIdeTrabalhador())
		 	.usingRecursiveComparison().isEqualTo(remun.getIdeTrabalhador());
		
		 MapperAssertion
		 	.assertThat(evtRemun.getDmDev())
		 	.usingRecursiveComparison().isEqualTo(remun.getDmDev());
	}
	
}
