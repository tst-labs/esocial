package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.cat.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.CAT;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;
import org.junit.Test;

public class CatMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CAT cat = CriadorObjetoAleatorio.criarEPreencher(CAT.class);
		ESocial.EvtCAT evtAfastTemp =CatMapper.INSTANCE.comoEvtCAT(cat);

		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(cat.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeVinculo())
		 	.usingRecursiveComparison().isEqualTo(cat.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getCat())
		 	.usingRecursiveComparison().isEqualTo(cat.getCat());
	}
}
