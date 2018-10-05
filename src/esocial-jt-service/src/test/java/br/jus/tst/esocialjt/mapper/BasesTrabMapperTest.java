package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.basestrab.ESocial.EvtBasesTrab;
import br.jus.tst.esocial.ocorrencia.dados.BasesTrab;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class BasesTrabMapperTest {
	
	@Test
	public void deveMapearEvento() {
		BasesTrab basestrab = CriadorObjetoAleatorio.criarEPreencher(BasesTrab.class);
		EvtBasesTrab evtBasesTrab =BasesTrabMapper.INSTANCE.comoEvtBasesTrab(basestrab);

		 MapperAssertion
		 	.assertThat(evtBasesTrab.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(basestrab.getIdeEmpregador());
				
		 MapperAssertion
		 .assertThat(evtBasesTrab.getInfoCpCalc())
		 .isEqualToComparingFieldByFieldRecursively(basestrab.getInfoCpCalc());
		 
		 MapperAssertion
		 .assertThat(evtBasesTrab.getInfoCp())
		 .isEqualToComparingFieldByFieldRecursively(basestrab.getInfoCp());

}
}
