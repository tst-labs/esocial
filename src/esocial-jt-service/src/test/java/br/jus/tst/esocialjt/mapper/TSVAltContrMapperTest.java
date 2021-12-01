package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TSVAltContrMapperTest {
	
	@Test
	public void deveMapearEvento(){
		TSVAltContr tsvAltContr = CriadorObjetoAleatorio.criarEPreencher(TSVAltContr.class);
		EvtTSVAltContr evtTSVAltContr = TSVAltContrMapper.INSTANCE.comoEvtTSVAltContr(tsvAltContr);

		MapperAssertion
			.assertThat(evtTSVAltContr.getIdeEmpregador())
			.usingRecursiveComparison().isEqualTo(tsvAltContr.getIdeEmpregador());
	
		MapperAssertion
			.assertThat(evtTSVAltContr.getIdeTrabSemVinculo())
			.usingRecursiveComparison().isEqualTo(tsvAltContr.getIdeTrabSemVinculo());

		MapperAssertion
			.assertThat(evtTSVAltContr.getInfoTSVAlteracao())
			.usingRecursiveComparison().isEqualTo(tsvAltContr.getInfoTSVAlteracao());
	}
	
}
