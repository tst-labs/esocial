package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.*;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class MaquinaEstadoEventoTest {

	@Test
	public void estadoDeErroSeEnvioComErro() {
		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setErroInterno("erro");

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
	}

	@Test
	public void estadoDeErroSeErroLote() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSADO_COM_ERRO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setErroInterno("erro");
		envioEvento.setLote(lote);

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.PROCESSAMENTO);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
	}

	@Test
	public void estadoEmProcessamentoSeEnviadoESemConsultarRetorno() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSAMENTO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}

	@Test
	public void estadoEmFilaSeNaoHaEstado() {
		Evento evento = new Evento();
		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setEvento(evento);
		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}

	@Test
	public void estadoProcessadoComSucesso() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 201l, "Sucesso"));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.PROCESSAMENTO);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}

	@Test
	public void estadoProcessadoComErro() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento
				.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.PROCESSAMENTO);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
	}

	@Test
	public void estadoProcessamentoSeLoteEmProcessamento() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSAMENTO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.PROCESSAMENTO);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}

	@Test
	public void estadoProcessadoComSucessoSeProcessadoComAdvertencia() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");
		lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 202l, "Erro"));

		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);

		ErroProcessamento erroProcessamento177 = new ErroProcessamento();
		erroProcessamento177.setDescricao("O envio do evento ocorreu em data posterior ao período previsto na legislação.");
		erroProcessamento177.setCodMensagem(177l);

		envioEvento.setErrosProcessamento(Stream.of(erroProcessamento72, erroProcessamento177).collect(Collectors.toSet()));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.PROCESSAMENTO);

		Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}

	@Test
	public void estadoLoteSucessoSeRetornoQualquerCodigo200() {
		for (long cod = 200; cod < 300; cod++) {
			Lote lote = new Lote();
			lote.setProtocolo("0.1.0");
			lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);

			EnvioEvento envioEvento = new EnvioEvento();
			envioEvento.setLote(lote);
			envioEvento.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, cod, "Sucesso"));

			Evento evento = new Evento();
			evento.adicionarEnvioEvento(envioEvento);
			evento.setEstado(Estado.PROCESSAMENTO);

			Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

			assertThat(proximoEstado.getDescricao()).as("codResposta: " + cod).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
		}
	}

	@Test
	public void estadoLoteProcessadoComErroSeQualquerErro() {
		for (long cod = 1; cod < 600; cod++) {
			if (cod == 200) {
				cod = 300;
			}

			Lote lote = new Lote();
			lote.setProtocolo("0.1.0");
			lote.setEstado(Estado.PROCESSADO_COM_SUCESSO);

			EnvioEvento envioEvento = new EnvioEvento();
			envioEvento.setLote(lote);
			envioEvento
					.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, cod, "Erro"));

			Evento evento = new Evento();
			evento.adicionarEnvioEvento(envioEvento);
			evento.setEstado(Estado.PROCESSAMENTO);

			Estado proximoEstado = MaquinaEstadoEvento.proximoEstado(envioEvento);

			assertThat(proximoEstado.getDescricao()).as("codResposta: " + cod).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
		}
	}
}
