package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefAlt;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CdBenefAltMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenefAlt cdBenefAlt = CriadorObjetoAleatorio.criarEPreencher(CdBenefAlt.class);
		EvtCdBenefAlt evtCdBenefAlt = CdBenefAltMapper.INSTANCE.comoEvtCdBenefAlt(cdBenefAlt);
		
		MapperAssertion
			.assertThat(evtCdBenefAlt.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cdBenefAlt.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCdBenefAlt.getIdeBenef())
			.usingRecursiveComparison().isEqualTo(cdBenefAlt.getIdeBenef());
		
		MapperAssertion
			.assertThat(evtCdBenefAlt.getAlteracao())
			.usingRecursiveComparison().isEqualTo(cdBenefAlt.getAlteracao());
	}
}
