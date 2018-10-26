package br.jus.tst.esocialjt.comunicacaogov;

import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RetornoEventoTotalizadorTest {

	@Test
	public void deveRetornarDoisEventosS5001() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5001-2servidores.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		List<RetornoEventoTotalizador> tot = retornoLote.getRetornoEventoTotalizador();

		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.size()).isEqualTo(2);
		soft.assertAll();
		
	}
	
	@Test
	public void deveRetornarOsDadosDoPrimeiroDe2EventosS5001() {

		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5001-2servidores.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		RetornoEventoTotalizador tot = retornoLote.getRetornoEventoTotalizador().get(0);
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5001");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000234538448");
		soft.assertThat(tot.getIndApuracao()).isEqualTo((byte) 1);
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isEqualTo("72568274077");		
		
		soft.assertAll();

	}
	
	@Test
	public void deveRetornarOsDadosDoSegundoDe2EventosS5001() {

		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5001-2servidores.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		RetornoEventoTotalizador tot = retornoLote.getRetornoEventoTotalizador().get(1);
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5001");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000234538461");
		soft.assertThat(tot.getIndApuracao()).isEqualTo((byte) 1);
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isEqualTo("12682528082");		
		
		soft.assertAll();

	}
	
	@Test
	public void deveRetornar1EventoS5001() {

		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5001-1servidor.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		List<RetornoEventoTotalizador> tot = retornoLote.getRetornoEventoTotalizador();
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.size()).isEqualTo(1);
		soft.assertAll();

	}

	@Test
	public void deveRetornarOsDadosDe1EventoS5001() {

		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5001-1servidor.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		RetornoEventoTotalizador tot = retornoLote.getRetornoEventoTotalizador().get(0);
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5001");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000249099392");
		soft.assertThat(tot.getIndApuracao()).isEqualTo((byte) 1);
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isEqualTo("12682528082");		
		
		soft.assertAll();

	}


	@Test
	public void deveRetornarOsDadosDe1EventoS5002() {

		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5002-1servidor.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		RetornoEventoTotalizador tot = retornoLote.getRetornoEventoTotalizador().get(0);
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5002");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000248317040");
		soft.assertThat(tot.getIndApuracao()).isNull();
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isEqualTo("72568274077");		
		
		soft.assertAll();

	}

	@Test
	public void deveRetornarDoisEventosTotalizadoresDoProcessamentoDoEventoS1295() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5011-e-s5012.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		List<RetornoEventoTotalizador> tot = retornoLote.getRetornoEventoTotalizador();
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.size()).isEqualTo(2);
		soft.assertAll();
		
	}

	@Test
	public void deveRetornarOsDadosDe1eventoS5011eDe1eventoS5012() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("s5011-e-s5012.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();		
		retornoProcessamento.buscaEventosTotalizadores(xmlRetorno);
		
		RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
		RetornoEventoTotalizador tot = retornoLote.getRetornoEventoTotalizador().get(0);
		
		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5012");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000249108123");
		soft.assertThat(tot.getIndApuracao()).isNull();
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isNull();		

		tot = retornoLote.getRetornoEventoTotalizador().get(1);
		
		soft.assertThat(tot.getTipo()).isEqualTo("S5011");
		soft.assertThat(tot.getNrReciboArquivoBase()).isEqualTo("1.2.0000000000249108123");
		soft.assertThat(tot.getIndApuracao()).isEqualTo((byte) 1);
		soft.assertThat(tot.getPerApuracao()).isEqualTo("2018-07");
		soft.assertThat(tot.getCpfTrabalhador()).isNull();		
		
		soft.assertAll();
		
	}

}
