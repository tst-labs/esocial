package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao;
import br.jus.tst.esocial.ocorrencia.dados.Cessao;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CessaoMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Cessao cessao = CriadorObjetoAleatorio.criarEPreencher(Cessao.class);
		EvtCessao evtCessao = CessaoMapper.INSTANCE.comoEvtCessao(cessao);
		
		MapperAssertion
			.assertThat(evtCessao.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cessao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCessao.getIdeVinculo())
			.usingRecursiveComparison().isEqualTo(cessao.getIdeVinculo());
		
		MapperAssertion
			.assertThat(evtCessao.getInfoCessao())
			.usingRecursiveComparison().isEqualTo(cessao.getInfoCessao());
	}
	
}
