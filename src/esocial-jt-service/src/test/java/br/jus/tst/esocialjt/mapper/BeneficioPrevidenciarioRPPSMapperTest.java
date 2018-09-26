package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial.EvtCdBenPrRP;
import br.jus.tst.esocial.ocorrencia.dados.CdBenPrRP;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class BeneficioPrevidenciarioRPPSMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenPrRP cdBenPrRP = CriadorObjetoAleatorio.criarEPreencher(CdBenPrRP.class);
		EvtCdBenPrRP evtCdBenPrRP =CdBenPrRPMapper.INSTANCE.comoEvtCdBenPrRP(cdBenPrRP);

		 MapperAssertion
		 	.assertThat(evtCdBenPrRP.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(cdBenPrRP.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtCdBenPrRP.getIdeBenef())
		 	.isEqualToComparingFieldByFieldRecursively(cdBenPrRP.getIdeBenef());
		
		 MapperAssertion
		 	.assertThat(evtCdBenPrRP.getInfoBeneficio())
		 	.isEqualToComparingFieldByFieldRecursively(cdBenPrRP.getInfoBeneficio());
	}
}
