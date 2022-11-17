package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaquinaEstadoLoteTest {

//	private MaquinaEstadoLote MaquinaEstadoLote = new MaquinaEstadoLote();

	@Test
	public void estadoLoteEmFilaSeNaoHaEstado() {
		Lote lote = new Lote();
		lote.adicionarEnvioEvento(new EnvioEvento());

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}

	@Test
	public void estadoLoteErroSeErroInterno() {
		Lote lote = new Lote();
		lote.adicionarEnvioEvento(new EnvioEvento());
		lote.setEstado(Estado.EM_FILA);
		lote.setErroInterno("erro");

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
	}
	
	@Test
	public void estadoLoteProcessamentoSeProtocoloESemRetornoProcessamento() {
		EnvioEvento envioEvento = new EnvioEvento();

		Lote lote = new Lote();
		lote.setEstado(Estado.EM_FILA);
		lote.setProtocolo("1.0.1");
		lote.adicionarEnvioEvento(envioEvento);

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}

	@Test
	public void estadoLoteProcessamentoSeRetornoProcessamento() {
		Lote lote = new Lote();
		lote.setEstado(Estado.PROCESSAMENTO);
		lote.setProtocolo("1.0.1");
		lote.setCodigoResposta(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, 101l, ""));

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}

	@Test
	public void estadoLoteSucessoSeRetornoProcessadoComSucesso() {
		Lote lote = new Lote();
		lote.setEstado(Estado.PROCESSAMENTO);
		lote.setProtocolo("1.0.1");
		lote.setCodigoResposta(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, 201l, ""));

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}

	@Test
	public void estadoLoteSucessoSeRetornoProcessadoComAdvertencia() {
		Lote lote = new Lote();
		lote.setEstado(Estado.PROCESSAMENTO);
		lote.setProtocolo("1.0.1");
		lote.setCodigoResposta(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, 202l, ""));

		Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}

	@Test
	public void estadoLoteSucessoSeRetornoQualquerCodigo200() {
		for (long cod = 200; cod < 300; cod++) {
			Lote lote = new Lote();
			lote.setEstado(Estado.PROCESSAMENTO);
			lote.setProtocolo("1.0.1");
			lote.setCodigoResposta(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, cod, ""));

			Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
			assertThat(proximoEstado.getDescricao()).as("codResposta: " + cod).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
		}
	}

	@Test
	public void estadoLoteProcessadoComErroSeQualquerErro() {
		for (long cod = 1; cod < 600; cod++) {
			if (cod == 200) {
				cod = 300;
			}
			if (cod == 101) {
				cod = 102;
			}
			Lote lote = new Lote();
			lote.setEstado(Estado.PROCESSAMENTO);
			lote.setProtocolo("1.0.1");
			lote.setCodigoResposta(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, cod, ""));

			Estado proximoEstado = MaquinaEstadoLote.proximoEstado(lote);
			assertThat(proximoEstado.getDescricao()).as("codResposta: " + cod).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
		}
	}
}
