package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabcarreira.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCarreira;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaCarreiraMapperTest {

	@Test
	public void deveMapearInclusao() {
		TabelaCarreira tabelaCarreira = CriadorObjetoAleatorio.criarEPreencher(TabelaCarreira.class);
		ESocial.EvtTabCarreira evtTabCarreira = TabelaCarreiraMapper.INSTANCE.comoEvtTabCarreiraInclusao(tabelaCarreira);

		MapperAssertion
			.assertThat(evtTabCarreira.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabCarreira.getInfoCarreira().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getInfoCarreira());
		
		assertThat(evtTabCarreira.getInfoCarreira().getAlteracao()).isNull();
		assertThat(evtTabCarreira.getInfoCarreira().getExclusao()).isNull();
	}

	@Test
	public void deveMapearAlteracao() {

		TabelaCarreira tabelaCarreira = CriadorObjetoAleatorio.criarEPreencher(TabelaCarreira.class);
		ESocial.EvtTabCarreira evtTabCarreira = TabelaCarreiraMapper.INSTANCE.comoEvtTabCarreiraAlteracao(tabelaCarreira);

		MapperAssertion
			.assertThat(evtTabCarreira.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabCarreira.getInfoCarreira().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getInfoCarreira());
		
		assertThat(evtTabCarreira.getInfoCarreira().getInclusao()).isNull();
		assertThat(evtTabCarreira.getInfoCarreira().getExclusao()).isNull();

	}

	@Test
	public void deveMapearExclusao() {

		TabelaCarreira tabelaCarreira = CriadorObjetoAleatorio.criarEPreencher(TabelaCarreira.class);
		ESocial.EvtTabCarreira evtTabCarreira = TabelaCarreiraMapper.INSTANCE.comoEvtTabCarreiraExclusao(tabelaCarreira);
				
		MapperAssertion
			.assertThat(evtTabCarreira.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabCarreira.getInfoCarreira().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaCarreira.getInfoCarreira());
		
		assertThat(evtTabCarreira.getInfoCarreira().getInclusao()).isNull();
		assertThat(evtTabCarreira.getInfoCarreira().getAlteracao()).isNull();
	}
}
