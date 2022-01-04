package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt;
import br.jus.tst.esocial.ocorrencia.dados.CdBenAlt;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CdBenAltMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenAlt cdBenAlt = CriadorObjetoAleatorio.criarEPreencher(CdBenAlt.class);
		EvtCdBenAlt evtCdBenAlt = CdBenAltMapper.INSTANCE.comoEvtCdBenAlt(cdBenAlt);
		
		MapperAssertion
			.assertThat(evtCdBenAlt.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cdBenAlt.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCdBenAlt.getIdeBeneficio())
			.usingRecursiveComparison().isEqualTo(cdBenAlt.getIdeBeneficio());
		
		MapperAssertion
			.assertThat(evtCdBenAlt.getInfoBenAlteracao())
			.usingRecursiveComparison().isEqualTo(cdBenAlt.getInfoBenAlteracao());
	}
}
