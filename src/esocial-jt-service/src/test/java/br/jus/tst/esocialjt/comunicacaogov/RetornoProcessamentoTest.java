package br.jus.tst.esocialjt.comunicacaogov;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class RetornoProcessamentoTest {

	@Test
	public void deveCriarObjetoQuandoNaoHaErroDeProcessamento() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("sem-erros-processamento.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento(xmlRetorno);

		RetornoEvento retornoEvento = retornoProcessamento.getRetornoLote().getRetornoEvento().get(0);

		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(retornoProcessamento.getXmlRetorno()).isEqualTo(xmlRetorno);
		soft.assertThat(retornoEvento.getCodigoRespostaProcessamento()).isEqualTo(201l);
		soft.assertThat(retornoEvento.getIdEvento()).isEqualTo("ID1005099680001482017112914063400001");
		soft.assertThat(retornoEvento.getRetornoErrosProcessamento()).isEmpty();

		soft.assertAll();
	}
	
	@Test
	public void deveCriarObjetoQuandoHaErroDeProcessamento() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("com-erros-processamento.xml");
		
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento(xmlRetorno);

		RetornoEvento retornoEvento = retornoProcessamento.getRetornoLote().getRetornoEvento().get(0);

		SoftAssertions soft = new SoftAssertions();
		
		soft.assertThat(retornoProcessamento.getXmlRetorno()).isEqualTo(xmlRetorno);
		soft.assertThat(retornoEvento.getCodigoRespostaProcessamento()).isEqualTo(401l);
		soft.assertThat(retornoEvento.getIdEvento()).isEqualTo("ID1005099680001482017112112365700004");

		RetornoErroProcessamento retornoErroProcessamento = retornoEvento.getRetornoErrosProcessamento().get(0);
		soft.assertThat(retornoErroProcessamento.getCodigo()).isEqualTo(537);
		soft.assertThat(retornoErroProcessamento.getTipo()).isEqualTo(1);
		soft.assertThat(retornoErroProcessamento.getDescricao()).startsWith("Já existe no sistema");

		soft.assertAll();
	}

	@Test
	public void deveCriarObjetoVazioSeNaoHaRespostaValida() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("resposta-invalida.xml");

		RetornoProcessamento retornoProcessamento = new RetornoProcessamento(xmlRetorno);
		
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(retornoProcessamento.getRetornoLote().getCodigoRespostaProcessamento()).isEqualTo(501l);
		soft.assertThat(retornoProcessamento.getRetornoLote().getRetornoErrosProcessamento().get(0).getCodigo()).isEqualTo(605);
		soft.assertThat(retornoProcessamento.getRetornoLote().getRetornoEvento()).isEmpty();
		soft.assertThat(retornoProcessamento.getXmlRetorno()).isEqualTo(xmlRetorno);
		soft.assertAll();
	}
	
	@Test
	public void deveCriarObjetoQuandoAguardandoProcessamento() {
		String xmlRetorno = LeitorXML.lerRetornoProcessamento("aguardando-processamento.xml");

		RetornoProcessamento retornoProcessamento = new RetornoProcessamento(xmlRetorno);
		
		SoftAssertions soft = new SoftAssertions();
		soft.assertThat(retornoProcessamento.getRetornoLote().getCodigoRespostaProcessamento()).isEqualTo(101l);
		soft.assertThat(retornoProcessamento.getRetornoLote().getDescricaoRespostaProcessamento()).isEqualTo("Lote aguardando processamento.");
		soft.assertThat(retornoProcessamento.getRetornoLote().getRetornoEvento()).isEmpty();
		soft.assertThat(retornoProcessamento.getRetornoLote().getRetornoEvento()).isNotNull();
		soft.assertThat(retornoProcessamento.getXmlRetorno()).isEqualTo(xmlRetorno);
		soft.assertAll();
	}

}
