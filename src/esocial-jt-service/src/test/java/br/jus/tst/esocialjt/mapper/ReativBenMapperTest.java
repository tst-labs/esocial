package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.reativben.ESocial.EvtReativBen;
import br.jus.tst.esocial.ocorrencia.dados.ReativBen;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class ReativBenMapperTest {
	
	@Test
	public void deveMapearEvento() {
		ReativBen reativBen = CriadorObjetoAleatorio.criarEPreencher(ReativBen.class);
		EvtReativBen evtReativBen = ReativBenMapper.INSTANCE.comoEvtReativBen(reativBen);
		
		MapperAssertion
			.assertThat(evtReativBen.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(reativBen.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtReativBen.getIdeBeneficio())
			.usingRecursiveComparison().isEqualTo(reativBen.getIdeBeneficio());
		
		MapperAssertion
			.assertThat(evtReativBen.getInfoReativ())
			.usingRecursiveComparison().isEqualTo(reativBen.getInfoReativ());
	}
}
