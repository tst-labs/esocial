package br.jus.tst.esocialjt.mapper;

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
}
