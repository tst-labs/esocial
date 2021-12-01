package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class ExclusaoMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Exclusao exclusao = CriadorObjetoAleatorio.criarEPreencher(Exclusao.class);
		EvtExclusao evtExclusao =ExclusaoMapper.INSTANCE.comoEvtExclusao(exclusao);

		 MapperAssertion
		 	.assertThat(evtExclusao.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(exclusao.getIdeEmpregador());
		
		
		 MapperAssertion
		 	.assertThat(evtExclusao.getInfoExclusao())
		 	.usingRecursiveComparison().isEqualTo(exclusao.getInfoExclusao());
	}
}
