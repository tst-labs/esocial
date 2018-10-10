package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class AfastTempMapperTest {
	
	@Test
	public void deveMapearEvento() {
		AfastTemp afastTemp = CriadorObjetoAleatorio.criarEPreencher(AfastTemp.class);
		EvtAfastTemp evtAfastTemp =AfastTempMapper.INSTANCE.comoEvtAfastTemp(afastTemp);
		
		Assertions
			.assertThat(evtAfastTemp.getIdeEvento())
			.isEqualToIgnoringGivenFields(afastTemp.getIdeEvento(), "tpAmb", "procEmi", "verProc");

		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeEmpregador())
		 	.isEqualToComparingFieldByFieldRecursively(afastTemp.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getIdeVinculo())
		 	.isEqualToComparingFieldByFieldRecursively(afastTemp.getIdeVinculo());
		
		 MapperAssertion
		 	.assertThat(evtAfastTemp.getInfoAfastamento())
		 	.isEqualToComparingFieldByFieldRecursively(afastTemp.getInfoAfastamento());
	}
	
	@Test
	public void deveSerPadraoSeNaoHaRetificacao() {
		AfastTemp afastTemp = CriadorObjetoAleatorio.criarEPreencher(AfastTemp.class);
		afastTemp.setIdeEvento(null);
		EvtAfastTemp evtAfastTemp =AfastTempMapper.INSTANCE.comoEvtAfastTemp(afastTemp);
		Assertions.assertThat(evtAfastTemp.getIdeEvento().getIndRetif()).isEqualTo((byte)1);
	}
}
