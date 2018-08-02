package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabcargo.ESocial.EvtTabCargo;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCargo;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaCargoMapperTest {

	@Test
	public void deveMapearInclusao() {
		TabelaCargo tabelaCargo = CriadorObjetoAleatorio.criarEPreencher(TabelaCargo.class);
		EvtTabCargo evtTabCargo = TabelaCargoMapper.INSTANCE.comoEvtTabCargoInclusao(tabelaCargo);
		
		MapperAssertion.assertThat(evtTabCargo.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabCargo.getInfoCargo().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getInfoCargo());

		assertThat(evtTabCargo.getInfoCargo().getAlteracao()).isNull();
		assertThat(evtTabCargo.getInfoCargo().getExclusao()).isNull();
	}

	@Test
	public void deveMapearAlteracao() {
		TabelaCargo tabelaCargo = CriadorObjetoAleatorio.criarEPreencher(TabelaCargo.class);
		EvtTabCargo evtTabCargo = TabelaCargoMapper.INSTANCE.comoEvtTabCargoAlteracao(tabelaCargo);

		MapperAssertion.assertThat(evtTabCargo.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabCargo.getInfoCargo().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getInfoCargo());
				
		assertThat(evtTabCargo.getInfoCargo().getInclusao()).isNull();
		assertThat(evtTabCargo.getInfoCargo().getExclusao()).isNull();
	}



	@Test
	public void deveMapearExclusao() {
		TabelaCargo tabelaCargo = CriadorObjetoAleatorio.criarEPreencher(TabelaCargo.class);
		EvtTabCargo evtTabCargo = TabelaCargoMapper.INSTANCE.comoEvtTabCargoExclusao(tabelaCargo);

		MapperAssertion.assertThat(evtTabCargo.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getIdeEmpregador());
	
		MapperAssertion.assertThat(evtTabCargo.getInfoCargo().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCargo.getInfoCargo());

			
		assertThat(evtTabCargo.getInfoCargo().getInclusao()).isNull();
		assertThat(evtTabCargo.getInfoCargo().getAlteracao()).isNull();
	}
}
