package br.jus.tst.esocialjt.mapper;

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

		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(rmnRPPS.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getIdeTrabalhador())
		 	.isEqualToComparingFieldByFieldRecursively(rmnRPPS.getIdeTrabalhador());
		
		 MapperAssertion
		 	.assertThat(evtRmnRPPS.getDmDev())
		 	.isEqualToComparingFieldByFieldRecursively(rmnRPPS.getDmDev());
	}
}
