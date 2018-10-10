package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ocorrencia.dados.IdeEvento;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AdmissaoMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Admissao admissao = CriadorObjetoAleatorio.criarEPreencher(Admissao.class);
		EvtAdmissao evtAdmissao = AdmissaoMapper.INSTANCE.comoEvtAdmissao(admissao);
		
		Assertions
			.assertThat(evtAdmissao.getIdeEvento())
			.isEqualToIgnoringGivenFields(admissao.getIdeEvento(), "tpAmb", "procEmi", "verProc");
		
		MapperAssertion
			.assertThat(evtAdmissao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(admissao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtAdmissao.getTrabalhador())
			.isEqualToComparingFieldByFieldRecursively(admissao.getTrabalhador());
		
		MapperAssertion
			.assertThat(evtAdmissao.getVinculo())
			.isEqualToComparingFieldByFieldRecursively(admissao.getVinculo());
	}
	
	@Test
	public void deveSerPadraoSeNaoHaIdeEvento() {
		Admissao admissao = CriadorObjetoAleatorio.criarEPreencher(Admissao.class);
		admissao.setIdeEvento(null);
		EvtAdmissao evtAdmissao = AdmissaoMapper.INSTANCE.comoEvtAdmissao(admissao);
		Assertions.assertThat(evtAdmissao.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
	
	@Test
	public void deveSerPadraoSeNaoHaValorRetificacao() {
		Admissao admissao = CriadorObjetoAleatorio.criarEPreencher(Admissao.class);
		admissao.setIdeEvento(new IdeEvento());
		EvtAdmissao evtAdmissao = AdmissaoMapper.INSTANCE.comoEvtAdmissao(admissao);
		Assertions.assertThat(evtAdmissao.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
	
}
