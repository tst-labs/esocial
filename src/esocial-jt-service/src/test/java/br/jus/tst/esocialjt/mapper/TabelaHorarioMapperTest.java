package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabhortur.ESocial.EvtTabHorTur;
import br.jus.tst.esocial.ocorrencia.dados.TabelaHorario;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaHorarioMapperTest {

	@Test
	public void deveMapearInclusao(){
		TabelaHorario tabelaHorario = CriadorObjetoAleatorio.criarEPreencher(TabelaHorario.class);
		EvtTabHorTur evtTabHorario = TabelaHorarioMapper.INSTANCE.comoEvtTabHorTurInclusao(tabelaHorario);

		MapperAssertion
			.assertThat(evtTabHorario.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabHorario.getInfoHorContratual().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getInfoHorContratual());
		

		assertThat(evtTabHorario.getInfoHorContratual().getAlteracao()).isNull();
		assertThat(evtTabHorario.getInfoHorContratual().getExclusao()).isNull();
	}
	
	@Test
	public void deveMapearAlteracao(){
		TabelaHorario tabelaHorario = CriadorObjetoAleatorio.criarEPreencher(TabelaHorario.class);
		EvtTabHorTur evtTabHorario = TabelaHorarioMapper.INSTANCE.comoEvtTabHorTurAlteracao(tabelaHorario);
		
		MapperAssertion
		.assertThat(evtTabHorario.getIdeEmpregador())
		.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getIdeEmpregador());
		
		MapperAssertion
		.assertThat(evtTabHorario.getInfoHorContratual().getAlteracao())
		.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getInfoHorContratual());
		
		
		assertThat(evtTabHorario.getInfoHorContratual().getInclusao()).isNull();
		assertThat(evtTabHorario.getInfoHorContratual().getExclusao()).isNull();
	}
	
	@Test
	public void deveMapearExclusao(){
		TabelaHorario tabelaHorario = CriadorObjetoAleatorio.criarEPreencher(TabelaHorario.class);
		EvtTabHorTur evtTabHorario = TabelaHorarioMapper.INSTANCE.comoEvtTabHorTurExclusao(tabelaHorario);
		
		MapperAssertion
		.assertThat(evtTabHorario.getIdeEmpregador())
		.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getIdeEmpregador());
		
		MapperAssertion
		.assertThat(evtTabHorario.getInfoHorContratual().getExclusao())
		.isEqualToComparingFieldByFieldRecursively(tabelaHorario.getInfoHorContratual());
		
		
		assertThat(evtTabHorario.getInfoHorContratual().getInclusao()).isNull();
		assertThat(evtTabHorario.getInfoHorContratual().getAlteracao()).isNull();
	}

}
