package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class FechaEvPerMapperTest {
	
	@Test
	public void deveMapearEvento() {
		FechaEvPer fechaEvPer = CriadorObjetoAleatorio.criarEPreencher(FechaEvPer.class);
		EvtFechaEvPer evtFechaEvPer = FechaEvPerMapper.INSTANCE.comoEvtFechaEvPer(fechaEvPer);
		
		Assertions
			.assertThat(evtFechaEvPer.getIdeEvento())
			.usingRecursiveComparison()
			.ignoringFields("tpAmb", "procEmi", "verProc")
			.isEqualTo(fechaEvPer.getIdeEvento());

		 MapperAssertion
			 .assertThat(evtFechaEvPer.getIdeEmpregador())
			 .usingRecursiveComparison().isEqualTo(fechaEvPer.getIdeEmpregador());		 

		 MapperAssertion
		 	.assertThat(evtFechaEvPer.getInfoFech())
		 	.usingRecursiveComparison().isEqualTo(fechaEvPer.getInfoFech());
	}
	
}
