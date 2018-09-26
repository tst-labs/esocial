package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial.EvtTotConting;
import br.jus.tst.esocial.ocorrencia.dados.TotConting;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TotContingMapperTest {
	
	@Test
	public void deveMapearEvento() {
		TotConting totConting = CriadorObjetoAleatorio.criarEPreencher(TotConting.class);
		EvtTotConting evtTotConting = TotContingMapper.INSTANCE.comoEvtTotConting(totConting);

		 MapperAssertion
			 .assertThat(evtTotConting.getIdeEmpregador())
			 .isEqualToComparingFieldByFieldRecursively(totConting.getIdeEmpregador());		 

		 MapperAssertion
		 	.assertThat(evtTotConting.getIdeRespInf())
		 	.isEqualToComparingFieldByFieldRecursively(totConting.getIdeRespInf());

	}
}
