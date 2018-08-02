package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaProcessoMapperTest {

	@Test
	public void deveMapearObjetoDominioParaJaxbInclusao() {
		
		TabelaProcesso tabelaProcesso = CriadorObjetoAleatorio.criarEPreencher(TabelaProcesso.class);

		ESocial.EvtTabProcesso evtTabProcesso = TabelaProcessoMapper.INSTANCE
				.comoEvtTabProcessoInclusao(tabelaProcesso);

		MapperAssertion.assertThat(evtTabProcesso.getIdeEmpregador())
				.isEqualToComparingFieldByFieldRecursively(tabelaProcesso.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabProcesso.getInfoProcesso().getInclusao())
				.isEqualToComparingFieldByFieldRecursively(tabelaProcesso.getInfoProcesso());

		assertThat(evtTabProcesso.getInfoProcesso().getAlteracao()).isNull();
		assertThat(evtTabProcesso.getInfoProcesso().getExclusao()).isNull();

	}

	@Test
	public void deveMapearObjetoDominioParaJaxbAlteracao() {

		TabelaProcesso tabelaProcesso = CriadorObjetoAleatorio.criarEPreencher(TabelaProcesso.class);

		ESocial.EvtTabProcesso evtTabProcesso = TabelaProcessoMapper.INSTANCE
				.comoEvtTabProcessoAlteracao(tabelaProcesso);

		MapperAssertion.assertThat(evtTabProcesso.getIdeEmpregador())
				.isEqualToComparingFieldByFieldRecursively(evtTabProcesso.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabProcesso.getInfoProcesso().getAlteracao())
				.isEqualToComparingFieldByFieldRecursively(tabelaProcesso.getInfoProcesso());

		assertThat(evtTabProcesso.getInfoProcesso().getInclusao()).isNull();
		assertThat(evtTabProcesso.getInfoProcesso().getExclusao()).isNull();

	}

	@Test
	public void deveMapearObjetoDominioParaJaxbExclusao() {

		TabelaProcesso tabelaProcesso = CriadorObjetoAleatorio.criarEPreencher(TabelaProcesso.class);
		
		ESocial.EvtTabProcesso evtTabProcesso = TabelaProcessoMapper.INSTANCE
				.comoEvtTabProcessoExclusao(tabelaProcesso);
		
		MapperAssertion.assertThat(evtTabProcesso.getIdeEmpregador())
				.isEqualToComparingFieldByFieldRecursively(evtTabProcesso.getIdeEmpregador());

		MapperAssertion.assertThat(evtTabProcesso.getInfoProcesso().getExclusao())
				.isEqualToComparingFieldByFieldRecursively(tabelaProcesso.getInfoProcesso());

		assertThat(evtTabProcesso.getInfoProcesso().getInclusao()).isNull();
		assertThat(evtTabProcesso.getInfoProcesso().getAlteracao()).isNull();

	}

}
