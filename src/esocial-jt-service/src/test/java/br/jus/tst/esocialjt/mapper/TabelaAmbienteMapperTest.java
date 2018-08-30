package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabambiente.ESocial.EvtTabAmbiente;
import br.jus.tst.esocial.ocorrencia.dados.TabelaAmbiente;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaAmbienteMapperTest {

	@Test
	public void deveMapearInclusao() {
		TabelaAmbiente tabelaAmbiente = CriadorObjetoAleatorio.criarEPreencher(TabelaAmbiente.class);
		EvtTabAmbiente evtTabAmbiente = TabelaAmbienteMapper.INSTANCE.comoEvtTabAmbienteInclusao(tabelaAmbiente);
		
		MapperAssertion.assertThat(evtTabAmbiente.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabAmbiente.getInfoAmbiente().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getInfoAmbiente());

		assertThat(evtTabAmbiente.getInfoAmbiente().getAlteracao()).isNull();
		assertThat(evtTabAmbiente.getInfoAmbiente().getExclusao()).isNull();
	}

	@Test
	public void deveMapearAlteracao() {
		TabelaAmbiente tabelaAmbiente = CriadorObjetoAleatorio.criarEPreencher(TabelaAmbiente.class);
		EvtTabAmbiente evtTabAmbiente = TabelaAmbienteMapper.INSTANCE.comoEvtTabAmbienteAlteracao(tabelaAmbiente);

		MapperAssertion.assertThat(evtTabAmbiente.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabAmbiente.getInfoAmbiente().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getInfoAmbiente());
				
		assertThat(evtTabAmbiente.getInfoAmbiente().getInclusao()).isNull();
		assertThat(evtTabAmbiente.getInfoAmbiente().getExclusao()).isNull();
	}



	@Test
	public void deveMapearExclusao() {
		TabelaAmbiente tabelaAmbiente = CriadorObjetoAleatorio.criarEPreencher(TabelaAmbiente.class);
		EvtTabAmbiente evtTabAmbiente = TabelaAmbienteMapper.INSTANCE.comoEvtTabAmbienteExclusao(tabelaAmbiente);

		MapperAssertion.assertThat(evtTabAmbiente.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getIdeEmpregador());
	
		MapperAssertion.assertThat(evtTabAmbiente.getInfoAmbiente().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaAmbiente.getInfoAmbiente());

			
		assertThat(evtTabAmbiente.getInfoAmbiente().getInclusao()).isNull();
		assertThat(evtTabAmbiente.getInfoAmbiente().getAlteracao()).isNull();
	}
}
