package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaRubricaMapperTest {

	@Test
	public void deveMapearObjetoDominioParaJaxbInclusao() {

		TabelaRubrica tabelaRubrica = CriadorObjetoAleatorio.criarEPreencher(TabelaRubrica.class);
		EvtTabRubrica evtTabRubrica = TabelaRubricaMapper.INSTANCE.comoEvtTabRubricaInclusao(tabelaRubrica);
		
		MapperAssertion
			.assertThat(evtTabRubrica.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabRubrica.getInfoRubrica().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getInfoRubrica());
				
		assertThat(evtTabRubrica.getInfoRubrica().getAlteracao()).isNull();
		assertThat(evtTabRubrica.getInfoRubrica().getExclusao()).isNull();
	}

	@Test
	public void deveMapearObjetoDominioParaJaxbAlteracao() {
		
		TabelaRubrica tabelaRubrica = CriadorObjetoAleatorio.criarEPreencher(TabelaRubrica.class);
		EvtTabRubrica evtTabRubrica = TabelaRubricaMapper.INSTANCE.comoEvtTabRubricaAlteracao(tabelaRubrica);
		
		MapperAssertion
			.assertThat(evtTabRubrica.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabRubrica.getInfoRubrica().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getInfoRubrica());
				
		assertThat(evtTabRubrica.getInfoRubrica().getInclusao()).isNull();
		assertThat(evtTabRubrica.getInfoRubrica().getExclusao()).isNull();

	}

	@Test
	public void deveMapearObjetoDominioParaJaxbExclusao() throws JsonGenerationException, JsonMappingException, IOException {

		TabelaRubrica tabelaRubrica = CriadorObjetoAleatorio.criarEPreencher(TabelaRubrica.class);
		EvtTabRubrica evtTabRubrica = TabelaRubricaMapper.INSTANCE.comoEvtTabRubricaExclusao(tabelaRubrica);
		
		MapperAssertion
			.assertThat(evtTabRubrica.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabRubrica.getInfoRubrica().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaRubrica.getInfoRubrica());
				
		assertThat(evtTabRubrica.getInfoRubrica().getInclusao()).isNull();
		assertThat(evtTabRubrica.getInfoRubrica().getAlteracao()).isNull();

	}

}
