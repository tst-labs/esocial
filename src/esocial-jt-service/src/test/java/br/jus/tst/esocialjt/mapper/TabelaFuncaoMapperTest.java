package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabfuncao.ESocial.EvtTabFuncao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaFuncaoMapperTest {

	@Test
	public void deveMapearInclusao() {

		TabelaFuncao tabelaFuncao = CriadorObjetoAleatorio.criarEPreencher(TabelaFuncao.class);
		EvtTabFuncao evtTabFuncao = TabelaFuncaoMapper.INSTANCE.comoEvtTabFuncaoInclusao(tabelaFuncao);

		MapperAssertion
			.assertThat(evtTabFuncao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabFuncao.getInfoFuncao().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getInfoFuncao());
		

		assertThat(evtTabFuncao.getInfoFuncao().getAlteracao()).isNull();
		assertThat(evtTabFuncao.getInfoFuncao().getExclusao()).isNull();
	}

	@Test
	public void deveMapearAlteracao() {

		TabelaFuncao tabelaFuncao = CriadorObjetoAleatorio.criarEPreencher(TabelaFuncao.class);
		EvtTabFuncao evtTabFuncao = TabelaFuncaoMapper.INSTANCE.comoEvtTabFuncaoAlteracao(tabelaFuncao);

		MapperAssertion
			.assertThat(evtTabFuncao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabFuncao.getInfoFuncao().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getInfoFuncao());

		assertThat(evtTabFuncao.getInfoFuncao().getInclusao()).isNull();
		assertThat(evtTabFuncao.getInfoFuncao().getExclusao()).isNull();
	}

	@Test
	public void deveMapearExclusao() {

		TabelaFuncao tabelaFuncao = CriadorObjetoAleatorio.criarEPreencher(TabelaFuncao.class);
		EvtTabFuncao evtTabFuncao = TabelaFuncaoMapper.INSTANCE.comoEvtTabFuncaoExclusao(tabelaFuncao);

		MapperAssertion
			.assertThat(evtTabFuncao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabFuncao.getInfoFuncao().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaFuncao.getInfoFuncao());

		assertThat(evtTabFuncao.getInfoFuncao().getInclusao()).isNull();
		assertThat(evtTabFuncao.getInfoFuncao().getAlteracao()).isNull();
	}	
}
