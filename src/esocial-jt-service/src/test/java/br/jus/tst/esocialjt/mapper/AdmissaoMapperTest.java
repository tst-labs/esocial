package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AdmissaoMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Admissao admissao = CriadorObjetoAleatorio.criarEPreencher(Admissao.class);
		EvtAdmissao evtAdmissao = AdmissaoMapper.INSTANCE.comoEvtAdmissao(admissao);
		
		MapperAssertion
			.assertThat(evtAdmissao.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(admissao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtAdmissao.getTrabalhador())
			.usingRecursiveComparison().isEqualTo(admissao.getTrabalhador());
		
		MapperAssertion
			.assertThat(evtAdmissao.getVinculo())
			.usingRecursiveComparison().isEqualTo(admissao.getVinculo());
	}
	
}
