package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class PgtosMapperTest {
	
	@Test
	public void deveMapearEvento() {
		Pgtos pgtos = CriadorObjetoAleatorio.criarEPreencher(Pgtos.class);
		EvtPgtos evtPgtos = PgtosMapper.INSTANCE.comoEvtPgtos(pgtos);
		
		Assertions
			.assertThat(evtPgtos.getIdeEvento())
			.usingRecursiveComparison()
			.ignoringFields("indRetif", "nrRecibo", "tpAmb", "procEmi", "verProc")
			.isEqualTo(pgtos.getIdeEvento());

		 MapperAssertion
		 	.assertThat(evtPgtos.getIdeEmpregador())
		 	.usingRecursiveComparison().isEqualTo(pgtos.getIdeEmpregador());
		
		 MapperAssertion
		 	.assertThat(evtPgtos.getIdeBenef())
		 	.usingRecursiveComparison().isEqualTo(pgtos.getIdeBenef());
		
	}
	
}
