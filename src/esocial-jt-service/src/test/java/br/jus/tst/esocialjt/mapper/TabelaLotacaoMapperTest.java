package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaLotacaoMapperTest {

	@Test
	public void deveMapearInclusao() throws Exception {
		TabelaLotacao tabelaLotacao = CriadorObjetoAleatorio.criarEPreencher(TabelaLotacao.class);
		EvtTabLotacao evtTabLotacao = TabelaLotacaoMapper.INSTANCE.comoEvtTabLotacaoInclusao(tabelaLotacao);
		
		MapperAssertion
			.assertThat(evtTabLotacao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getIdeEmpregador());

		MapperAssertion
			.assertThat(evtTabLotacao.getInfoLotacao().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getInfoLotacao());

		assertThat(evtTabLotacao.getInfoLotacao().getAlteracao()).isNull();
		assertThat(evtTabLotacao.getInfoLotacao().getExclusao()).isNull();

	}

	@Test
	public void deveMapearAlteracao() {
		TabelaLotacao tabelaLotacao = CriadorObjetoAleatorio.criarEPreencher(TabelaLotacao.class);
		EvtTabLotacao evtTabLotacao = TabelaLotacaoMapper.INSTANCE.comoEvtTabLotacaoAlteracao(tabelaLotacao);

		MapperAssertion
			.assertThat(evtTabLotacao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getIdeEmpregador());
	
		MapperAssertion
			.assertThat(evtTabLotacao.getInfoLotacao().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getInfoLotacao());
		
		assertThat(evtTabLotacao.getInfoLotacao().getInclusao()).isNull();
		assertThat(evtTabLotacao.getInfoLotacao().getExclusao()).isNull();
	}

	@Test
	public void deveMapearExclusao() {

		TabelaLotacao tabelaLotacao = CriadorObjetoAleatorio.criarEPreencher(TabelaLotacao.class);
		EvtTabLotacao evtTabLotacao = TabelaLotacaoMapper.INSTANCE.comoEvtTabLotacaoExclusao(tabelaLotacao);

		MapperAssertion
			.assertThat(evtTabLotacao.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getIdeEmpregador());
	
		MapperAssertion
			.assertThat(evtTabLotacao.getInfoLotacao().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaLotacao.getInfoLotacao());

		assertThat(evtTabLotacao.getInfoLotacao().getInclusao()).isNull();
		assertThat(evtTabLotacao.getInfoLotacao().getAlteracao()).isNull();
	}
	
	@Test
	public void tipoLotacaoDosDadosLotacaoNaoPodeSerZero() {
		TabelaLotacao tabelaLotacao = CriadorObjetoAleatorio.criarEPreencher(TabelaLotacao.class);
		tabelaLotacao.getInfoLotacao().getDadosLotacao().setTpInsc(null);
		
		EvtTabLotacao inclusao = TabelaLotacaoMapper.INSTANCE.comoEvtTabLotacaoInclusao(tabelaLotacao);
		EvtTabLotacao alteracao = TabelaLotacaoMapper.INSTANCE.comoEvtTabLotacaoAlteracao(tabelaLotacao);

		assertThat(inclusao.getInfoLotacao().getInclusao().getDadosLotacao().getTpInsc()).isNull();
		assertThat(alteracao.getInfoLotacao().getAlteracao().getDadosLotacao().getTpInsc()).isNull();
	}
}
