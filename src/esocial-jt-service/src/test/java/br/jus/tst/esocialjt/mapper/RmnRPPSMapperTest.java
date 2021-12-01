package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class RmnRPPSMapperTest {
	
	@Test
	public void deveMapearEvento() {
		RmnRPPS rmnRPPS = CriadorObjetoAleatorio.criarEPreencher(RmnRPPS.class);
		EvtRmnRPPS evtRmnRPPS = RmnRPPSMapper.INSTANCE.comoEvtRmnRPPS(rmnRPPS);
		
		Assertions
			.assertThat(evtRmnRPPS.getIdeEvento())
			.usingRecursiveComparison()
			.ignoringFields("indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc")
			.isEqualTo(rmnRPPS.getIdeEvento());

		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(rmnRPPS.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getIdeTrabalhador())
		 	.usingRecursiveComparison().isEqualTo(rmnRPPS.getIdeTrabalhador());
		
		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getDmDev())
		 	.usingRecursiveComparison().isEqualTo(rmnRPPS.getDmDev());
	}
}
