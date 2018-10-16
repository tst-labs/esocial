package br.jus.tst.esocialjt.mapper;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TSVTerminoMapperTest {
	
	@Test
	public void deveMapearEvento(){
		TSVTermino tsvTermino = CriadorObjetoAleatorio.criarEPreencher(TSVTermino.class);
		EvtTSVTermino evtTSVTermino = TSVTerminoMapper.INSTANCE.comoEvtTSVTermino(tsvTermino);
		
		MapperAssertion
			.assertThat(evtTSVTermino.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tsvTermino.getIdeEmpregador());
	
		MapperAssertion
			.assertThat(evtTSVTermino.getIdeTrabSemVinculo())
			.isEqualToComparingFieldByFieldRecursively(tsvTermino.getIdeTrabSemVinculo());

		MapperAssertion
			.assertThat(evtTSVTermino.getInfoTSVTermino())
			.isEqualToComparingFieldByFieldRecursively(tsvTermino.getInfoTSVTermino());
	}
}
