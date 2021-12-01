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
			.usingRecursiveComparison()
			.ignoringFields("indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc")
			.isEqualTo(cbenPrRP.getIdeEvento());

		 MapperAssertion
		 	.assertThat(evtBenPrRP.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(cbenPrRP.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtBenPrRP.getIdeBenef())
		 	.usingRecursiveComparison().isEqualTo(cbenPrRP.getIdeBenef());
		
		 MapperAssertion
		 	.assertThat(evtBenPrRP.getDmDev())
		 	.usingRecursiveComparison().isEqualTo(cbenPrRP.getDmDev());
	}
	
}
