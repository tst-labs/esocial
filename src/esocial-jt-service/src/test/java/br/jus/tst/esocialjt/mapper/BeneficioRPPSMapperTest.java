package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class BeneficioRPPSMapperTest {
	
	@Test
	public void deveMapearEvento() {
		BenPrRP cbenPrRP = CriadorObjetoAleatorio.criarEPreencher(BenPrRP.class);
		EvtBenPrRP evtBenPrRP =BenPrRPMapper.INSTANCE.comoEvtBenPrRP(cbenPrRP);
		
		Assertions
			.assertThat(evtBenPrRP.getIdeEvento())
			.isEqualToIgnoringGivenFields(cbenPrRP.getIdeEvento(), "indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc");

		 MapperAssertion
		 	.assertThat(evtBenPrRP.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(cbenPrRP.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtBenPrRP.getIdeBenef())
		 	.isEqualToComparingFieldByFieldRecursively(cbenPrRP.getIdeBenef());
		
		 MapperAssertion
		 	.assertThat(evtBenPrRP.getDmDev())
		 	.isEqualToComparingFieldByFieldRecursively(cbenPrRP.getDmDev());
	}
	
}
