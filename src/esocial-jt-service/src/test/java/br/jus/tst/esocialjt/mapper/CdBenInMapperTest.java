package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn;
import br.jus.tst.esocial.ocorrencia.dados.CdBenIn;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CdBenInMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenIn cdBenIn = CriadorObjetoAleatorio.criarEPreencher(CdBenIn.class);
		EvtCdBenIn evtCdBenIn = CdBenInMapper.INSTANCE.comoEvtCdBenIn(cdBenIn);
		
		MapperAssertion
			.assertThat(evtCdBenIn.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cdBenIn.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCdBenIn.getBeneficiario())
			.usingRecursiveComparison().isEqualTo(cdBenIn.getBeneficiario());
		
		MapperAssertion
			.assertThat(evtCdBenIn.getInfoBenInicio())
			.usingRecursiveComparison().isEqualTo(cdBenIn.getInfoBenInicio());
	}
}
