package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;

public class MaquinaEstadoLoteTest {
	
	private MaquinaEstadoLote maquinaEstadoLote = new MaquinaEstadoLote();

	@Test
	public void estadoLoteEmFilaSeNaoHaEstado() {
		Lote lote = new Lote();
		lote.adicionarEnvioEvento(new EnvioEvento());
		
		Estado proximoEstado = maquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}
	
	@Test
	public void estadoLoteErroSeErroInterno() {
		Lote lote = new Lote();
		lote.adicionarEnvioEvento(new EnvioEvento());
		lote.setEstado(Estado.EM_FILA);
		lote.setErroInterno("erro");
		
		Estado proximoEstado = maquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
	}
	
	@Test
	public void estadoLoteProcessamentoSeProtocoloESemRetornoProcessamento() {
		EnvioEvento envioEvento = new EnvioEvento();

		Lote lote = new Lote();
		lote.setEstado(Estado.EM_FILA);
		lote.setProtocolo("1.0.1");
		lote.adicionarEnvioEvento(envioEvento);
		
		Estado proximoEstado = maquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}
	
	@Test
	public void estadoLoteSucessoSeTodosEnviosComSucesso() {
		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 201l, ""));

		Lote lote = new Lote();
		lote.setEstado(Estado.EM_FILA);
		lote.setProtocolo("1.0.1");
		lote.adicionarEnvioEvento(envioEvento);
		
		Estado proximoEstado = maquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}
	
	@Test
	public void estadoLoteProcessadoComErroSeQualquerEnvioPossuiErro() {
		EnvioEvento envioEvento1 = new EnvioEvento();
		envioEvento1.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 201l, ""));
		
		EnvioEvento envioEvento2 = new EnvioEvento();
		envioEvento2.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, ""));

		Lote lote = new Lote();
		lote.setEstado(Estado.EM_FILA);
		lote.setProtocolo("1.0.1");
		lote.adicionarEnvioEvento(envioEvento1);
		lote.adicionarEnvioEvento(envioEvento2);
		
		Estado proximoEstado = maquinaEstadoLote.proximoEstado(lote);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
	}

}
