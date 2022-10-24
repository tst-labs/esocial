package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.exprisco.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.ExpRisco;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;
import org.junit.Test;

public class ExpRiscoMapperTest {
	
	@Test
	public void deveMapearEvento() {
		ExpRisco expRisco = CriadorObjetoAleatorio.criarEPreencher(ExpRisco.class);
		ESocial.EvtExpRisco evtExpRisco = ExpRiscoMapper.INSTANCE.comoEvtExpRisco(expRisco);

		 MapperAssertion
		 	.assertThat(evtExpRisco.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(expRisco.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtExpRisco.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(expRisco.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtExpRisco.getInfoExpRisco())
		 	.usingRecursiveComparison().isEqualTo(expRisco.getInfoExpRisco());
	}
}
