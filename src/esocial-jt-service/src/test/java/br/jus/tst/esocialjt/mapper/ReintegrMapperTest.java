package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class ReintegrMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Reintegr reintegr = CriadorObjetoAleatorio.criarEPreencher(Reintegr.class);
		EvtReintegr evtReintegr =ReintegrMapper.INSTANCE.comoEvtReintegr(reintegr);
		
		Assertions
			.assertThat(evtReintegr.getIdeEvento())
			.isEqualToIgnoringGivenFields(reintegr.getIdeEvento(), "tpAmb", "procEmi", "verProc");

		 MapperAssertion
		 	.assertThat(evtReintegr.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(reintegr.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtReintegr.getIdeVinculo())
		 	.isEqualToComparingFieldByFieldRecursively(reintegr.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtReintegr.getInfoReintegr())
		 	.isEqualToComparingFieldByFieldRecursively(reintegr.getInfoReintegr());
	}
	
	@Test
	public void deveSerPadraoSeNaoHaRetificacao() {
		Reintegr reintegr = CriadorObjetoAleatorio.criarEPreencher(Reintegr.class);
		reintegr.setIdeEvento(null);
		EvtReintegr evtReintegr =ReintegrMapper.INSTANCE.comoEvtReintegr(reintegr);
		Assertions.assertThat(evtReintegr.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
}
