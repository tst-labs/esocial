package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefIn;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CdBenefInMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenefIn cdBenefIn = CriadorObjetoAleatorio.criarEPreencher(CdBenefIn.class);
		EvtCdBenefIn evtCdBenefIn = CdBenefInMapper.INSTANCE.comoEvtCdBenefIn(cdBenefIn);
		
		MapperAssertion
			.assertThat(evtCdBenefIn.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cdBenefIn.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCdBenefIn.getBeneficiario())
			.usingRecursiveComparison().isEqualTo(cdBenefIn.getBeneficiario());
	}
}
