package br.jus.tst.esocialjt.regras.evento;

import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.regras.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegrasFactoryTest{
	
	@Autowired
	private RegrasFactory regrasFactory;
	
	@Test
	public void deveProverRegraInformacoesEmpregador() {
		Regra regra = getRegra(TipoEvento.S1000);
		assertThat(regra).isInstanceOf(RegraInformacoesEmpregador.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraVazia.class
		);
	}
	
	@Test
	public void deveProverRegraTabelaEstabelecimento() {
		Regra regra = getRegra(TipoEvento.S1005);
		assertThat(regra).isInstanceOf(RegraTabelaEstabelecimento.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEventosTabela.class
		);
	}

	@Test
	public void deveProverRegraTabelaRubrica() {
		Regra regra = getRegra(TipoEvento.S1010);
		assertThat(regra).isInstanceOf(RegraTabelaRubrica.class);
		assertThat(regra.regras()).extracting("class").contains(
				RegraEventosTabela.class
		);
	}

	@Test
	public void deveProverRegraTabelaLotacao() {
		Regra regra = getRegra(TipoEvento.S1020);
		assertThat(regra).isInstanceOf(RegraTabelaLotacao.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEventosTabela.class
		);
	}
	
	@Test
	public void deveProverRegraTabelaProcesso() {
		Regra regra = getRegra(TipoEvento.S1070);
		assertThat(regra).isInstanceOf(RegraTabelaProcesso.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEventosTabela.class
		);
	}

	@Test
	public void deveProverRegraAdmissao() {
		Regra regra = getRegra(TipoEvento.S2200);
		assertThat(regra).isInstanceOf(RegraAdmissao.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class
		);
	}

	@Test
	public void deveProverRegraAltCadastral() {
		Regra regra = getRegra(TipoEvento.S2205);
		assertThat(regra).isInstanceOf(RegraAltCadastral.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}


	@Test
	public void deveProverRegraAltContratual() {
		Regra regra = getRegra(TipoEvento.S2206);
		assertThat(regra).isInstanceOf(RegraAltContratual.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}

	@Test
	public void deveProverRegraCAT() {
		Regra regra = getRegra(TipoEvento.S2210);
		assertThat(regra).isInstanceOf(RegraCAT.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}

	@Test
	public void deveProverRegraMonit() {
		Regra regra = getRegra(TipoEvento.S2220);
		assertThat(regra).isInstanceOf(RegraMonit.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}

	@Test
	public void deveProverRegraAfastTemp() {
		Regra regra = getRegra(TipoEvento.S2230);
		assertThat(regra).isInstanceOf(RegraAfastTemp.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}

	@Test
	public void deveProverRegraCessao() {
		Regra regra = getRegra(TipoEvento.S2231);
		assertThat(regra).isInstanceOf(RegraCessao.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class
		);
	}

	@Test
	public void deveProverRegraExpRisco() {
		Regra regra = getRegra(TipoEvento.S2240);
		assertThat(regra).isInstanceOf(RegraExpRisco.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}

	@Test
	public void deveProverRegraReintegracao() {
		Regra regra = getRegra(TipoEvento.S2298);
		assertThat(regra).isInstanceOf(RegraReintegracao.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
		);
	}
	
	@Test
	public void deveProverRegraDesligamento() {
		Regra regra = getRegra(TipoEvento.S2299);
		assertThat(regra).isInstanceOf(RegraDesligamento.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraTSVInicio() {
		Regra regra = getRegra(TipoEvento.S2300);
		assertThat(regra).isInstanceOf(RegraTSVInicio.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraTSVAltContr() {
		Regra regra = getRegra(TipoEvento.S2306);
		assertThat(regra).isInstanceOf(RegraTSVAltContr.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraTSVTermino() {
		Regra regra = getRegra(TipoEvento.S2399);
		assertThat(regra).isInstanceOf(RegraTSVTermino.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaIngressoTrabEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraRemuneracaoRGPS() {
		Regra regra = getRegra(TipoEvento.S1200);
		assertThat(regra).isInstanceOf(RegraRemuneracaoRGPS.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraRemuneracaoRPPS() {
		Regra regra = getRegra(TipoEvento.S1202);
		assertThat(regra).isInstanceOf(RegraRemuneracaoRPPS.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraBeneficioRPPS() {
		Regra regra = getRegra(TipoEvento.S1207);
		assertThat(regra).isInstanceOf(RegraBeneficioRPPS.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class
				);
	}

	@Test
	public void deveProverRegraPgtos() {
		Regra regra = getRegra(TipoEvento.S1210);
		assertThat(regra).isInstanceOf(RegraPgtos.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class,
				RegraNaoHaRemuneracaoEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraReaberturaPeriodicos() {
		Regra regra = getRegra(TipoEvento.S1298);
		assertThat(regra).isInstanceOf(RegraReaberturaPeriodicos.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class,
				RegraNaoHaRemuneracaoEmFila.class,
				RegraNaoHaPagamentoEmFila.class,
				RegraNaoHaFechamentoFolhaEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraFechamentoPeriodicos() {
		Regra regra = getRegra(TipoEvento.S1299);
		assertThat(regra).isInstanceOf(RegraFechamentoPeriodicos.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class,
				RegraNaoHaEventoNaoPeriodicoEmFila.class,
				RegraNaoHaRemuneracaoEmFila.class,
				RegraNaoHaPagamentoEmFila.class
				);
	}
	
	@Test
	public void deveProverRegraExclusao() {
		Regra regra = getRegra(TipoEvento.S3000);
		assertThat(regra).isInstanceOf(RegraExclusao.class);
		assertThat(regra.regras()).extracting("class").containsOnly(
				RegraEmpregadorCadastrado.class,
				RegraNaoHaEventoTabelaEmFila.class
				);
	}

	private Regra getRegra(TipoEvento tipo) {
		return regrasFactory.getRegra(new EventoDTO().setCodTipoEvento(tipo.getCodTipo()));
	}

}
