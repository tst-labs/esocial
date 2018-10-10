package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial.EvtCdBenPrRP;
import br.jus.tst.esocial.ocorrencia.dados.CdBenPrRP;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CadastroBeneficioRPPSMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenPrRP cdBenPrRP = CriadorObjetoAleatorio.criarEPreencher(CdBenPrRP.class);
		EvtCdBenPrRP evtCdBenPrRP =CdBenPrRPMapper.INSTANCE.comoEvtCdBenPrRP(cdBenPrRP);
		
		Assertions
			.assertThat(evtCdBenPrRP.getIdeEvento())
			.isEqualToIgnoringGivenFields(cdBenPrRP.getIdeEvento(), "tpAmb", "procEmi", "verProc");

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
	
	@Test
	public void deveSerPadraoSeNaoHaRetificacao() {
		CdBenPrRP cdBenPrRP = CriadorObjetoAleatorio.criarEPreencher(CdBenPrRP.class);
		cdBenPrRP.setIdeEvento(null);
		EvtCdBenPrRP evtCdBenPrRP =CdBenPrRPMapper.INSTANCE.comoEvtCdBenPrRP(cdBenPrRP);
		Assertions.assertThat(evtCdBenPrRP.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
}
