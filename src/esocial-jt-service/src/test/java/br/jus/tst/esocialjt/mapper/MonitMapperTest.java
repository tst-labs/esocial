package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.monit.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.Monit;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;
import org.junit.Test;

public class MonitMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Monit monit = CriadorObjetoAleatorio.criarEPreencher(Monit.class);
		ESocial.EvtMonit evtMonit = MonitMapper.INSTANCE.comoEvtMonit(monit);

		 MapperAssertion
		 	.assertThat(evtMonit.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(monit.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtMonit.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(monit.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtMonit.getExMedOcup())
		 	.usingRecursiveComparison().isEqualTo(monit.getExMedOcup());
	}
}
