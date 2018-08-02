package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class TabelaEstabelecimentoMapperTest {

	@Test
	public void deveMapearInclusao(){
		TabelaEstabelecimento tabelaEstabelecimento = CriadorObjetoAleatorio.criarEPreencher(TabelaEstabelecimento.class);
		tabelaEstabelecimento.getInfoEstab().getDadosEstab().getInfoObra().setIndSubstPatrObra((byte)55);
		
		EvtTabEstab evtTabEstab = TabelaEstabelecimentoMapper.INSTANCE
				.comoEvtTabEstabInclusao(tabelaEstabelecimento);

		MapperAssertion
			.assertThat(evtTabEstab.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabEstab.getInfoEstab().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getInfoEstab());

		assertThat(evtTabEstab.getInfoEstab().getAlteracao()).isNull();
		assertThat(evtTabEstab.getInfoEstab().getExclusao()).isNull();

	}

	@Test
	public void deveMapearAlteracao(){
		TabelaEstabelecimento tabelaEstabelecimento = CriadorObjetoAleatorio.criarEPreencher(TabelaEstabelecimento.class);
		tabelaEstabelecimento.getInfoEstab().getDadosEstab().getInfoObra().setIndSubstPatrObra((byte)55);
		EvtTabEstab evtTabEstab = TabelaEstabelecimentoMapper.INSTANCE
				.comoEvtTabEstabAlteracao(tabelaEstabelecimento);

		MapperAssertion
			.assertThat(evtTabEstab.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabEstab.getInfoEstab().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getInfoEstab());
	
		assertThat(evtTabEstab.getInfoEstab().getInclusao()).isNull();
		assertThat(evtTabEstab.getInfoEstab().getExclusao()).isNull();

	}
	
	@Test
	public void deveMapearExclusao(){
		TabelaEstabelecimento tabelaEstabelecimento = CriadorObjetoAleatorio.criarEPreencher(TabelaEstabelecimento.class);
		tabelaEstabelecimento.getInfoEstab().getDadosEstab().getInfoObra().setIndSubstPatrObra((byte)55);
		EvtTabEstab evtTabEstab = TabelaEstabelecimentoMapper.INSTANCE
				.comoEvtTabEstabExclusao(tabelaEstabelecimento);

		MapperAssertion
			.assertThat(evtTabEstab.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtTabEstab.getInfoEstab().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(tabelaEstabelecimento.getInfoEstab());
		
		assertThat(evtTabEstab.getInfoEstab().getInclusao()).isNull();
		assertThat(evtTabEstab.getInfoEstab().getAlteracao()).isNull();
	}
	
	@Test
	public void infoObraDeveSerNuloSeIndSubstPatrObraZero() {
		TabelaEstabelecimento tabelaEstabelecimento = CriadorObjetoAleatorio.criarEPreencher(TabelaEstabelecimento.class);
		
		tabelaEstabelecimento.getInfoEstab().getDadosEstab().getInfoObra().setIndSubstPatrObra((byte)0);
		
		EvtTabEstab inclusao = TabelaEstabelecimentoMapper.INSTANCE.comoEvtTabEstabInclusao(tabelaEstabelecimento);
		EvtTabEstab alteracao = TabelaEstabelecimentoMapper.INSTANCE.comoEvtTabEstabAlteracao(tabelaEstabelecimento);
		
		assertThat(inclusao.getInfoEstab().getInclusao().getDadosEstab().getInfoObra()).isNull();
		assertThat(alteracao.getInfoEstab().getAlteracao().getDadosEstab().getInfoObra()).isNull();
	}
}
