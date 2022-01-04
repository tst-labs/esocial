package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial.EvtCdBenTerm;
import br.jus.tst.esocial.ocorrencia.dados.CdBenTerm;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class CdBenTermMapperTest {
	
	@Test
	public void deveMapearEvento() {
		CdBenTerm cdBenTerm = CriadorObjetoAleatorio.criarEPreencher(CdBenTerm.class);
		EvtCdBenTerm evtCdBenTerm = CdBenTermMapper.INSTANCE.comoEvtCdBenTerm(cdBenTerm);
		
		MapperAssertion
			.assertThat(evtCdBenTerm.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(cdBenTerm.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtCdBenTerm.getIdeBeneficio())
			.usingRecursiveComparison().isEqualTo(cdBenTerm.getIdeBeneficio());
		
		MapperAssertion
			.assertThat(evtCdBenTerm.getInfoBenTermino())
			.usingRecursiveComparison().isEqualTo(cdBenTerm.getInfoBenTermino());
	}
}
