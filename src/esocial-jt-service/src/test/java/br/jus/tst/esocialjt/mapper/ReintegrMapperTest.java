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
		 	.usingRecursiveComparison().isEqualTo(reintegr.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtReintegr.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(reintegr.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtReintegr.getInfoReintegr())
		 	.usingRecursiveComparison().isEqualTo(reintegr.getInfoReintegr());
	}
	
}
