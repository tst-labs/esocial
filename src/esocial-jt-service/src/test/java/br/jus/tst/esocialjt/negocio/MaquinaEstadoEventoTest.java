package br.jus.tst.esocialjt.negocio;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.BeforeClass;
import org.junit.Test;

import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.ErroProcessamento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;

public class MaquinaEstadoEventoTest {

	private static MaquinaEstadoEvento maquinaEstadoEvento;
	
	@BeforeClass
	public static void init() {
		maquinaEstadoEvento = new MaquinaEstadoEvento();
		maquinaEstadoEvento.errosRecuperaveis = Arrays.asList(72l);
	}

	@Test
	public void estadoDeErroSeEnvioComErro() {
		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setErroInterno("erro");

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.ERRO.getDescricao());
	}

	@Test
	public void estadoEmProcessamentoSeEnviadoESemConsultarRetorno() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSAMENTO.getDescricao());
	}

	@Test
	public void estadoEmFilaSeNaoHaEstado() {
		Evento evento = new Evento();
		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);
		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}

	@Test
	public void estadoProcessadoComSucesso() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento
				.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 201l, "Sucesso"));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_SUCESSO.getDescricao());
	}

	@Test
	public void estadoProcessadoComErro() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento
				.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
	}
	
	@Test
	public void deveRecuperarDeErroQuandoPossivel() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento
				.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		
		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);
		
		envioEvento.setErrosProcessamento(Stream.of(erroProcessamento72).collect(Collectors.toSet()));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}
	
	@Test
	public void erroProcessamentoSePeloMenosUmNaoRecuperavel() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento = new EnvioEvento();
		envioEvento.setLote(lote);
		envioEvento
				.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		
		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);
		
		ErroProcessamento erroProcessamento177 = new ErroProcessamento();
		erroProcessamento177.setDescricao("O envio do evento ocorreu em data posterior ao período previsto na legislação.");
		erroProcessamento177.setCodMensagem(177l);
		
		envioEvento.setErrosProcessamento(Stream.of(erroProcessamento72, erroProcessamento177).collect(Collectors.toSet()));

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
	}
	
	@Test
	public void deveRecuperarDoUltimoEnvio() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento1 = new EnvioEvento();
		envioEvento1.setLote(lote);
		envioEvento1.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		envioEvento1.setDtaGeracaoEvento(new GregorianCalendar(2018, Calendar.FEBRUARY, 11).getTime());
		
		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);
		envioEvento1.setErrosProcessamento(Stream.of(erroProcessamento72).collect(Collectors.toSet()));
		
		EnvioEvento envioEvento2 = new EnvioEvento();
		envioEvento2.setLote(lote);
		envioEvento2.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		envioEvento2.setDtaGeracaoEvento(new GregorianCalendar(2018, Calendar.FEBRUARY, 10).getTime());
		
		ErroProcessamento erroProcessamento177 = new ErroProcessamento();
		erroProcessamento177.setDescricao("O envio do evento ocorreu em data posterior ao período previsto na legislação.");
		erroProcessamento177.setCodMensagem(177l);
		envioEvento2.setErrosProcessamento(Stream.of(erroProcessamento177).collect(Collectors.toSet()));
		

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento1);
		evento.adicionarEnvioEvento(envioEvento2);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}
	
	@Test
	public void naoDeveRecuperarDoUltimoEnvio() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento1 = new EnvioEvento();
		envioEvento1.setLote(lote);
		envioEvento1.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		envioEvento1.setDtaGeracaoEvento(new GregorianCalendar(2018, Calendar.FEBRUARY, 11).getTime());
		
		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);
		envioEvento1.setErrosProcessamento(Stream.of(erroProcessamento72).collect(Collectors.toSet()));
		
		EnvioEvento envioEvento2 = new EnvioEvento();
		envioEvento2.setLote(lote);
		envioEvento2.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		envioEvento2.setDtaGeracaoEvento(new GregorianCalendar(2018, Calendar.FEBRUARY, 12).getTime());
		
		ErroProcessamento erroProcessamento177 = new ErroProcessamento();
		erroProcessamento177.setDescricao("O envio do evento ocorreu em data posterior ao período previsto na legislação.");
		erroProcessamento177.setCodMensagem(177l);
		envioEvento2.setErrosProcessamento(Stream.of(erroProcessamento177).collect(Collectors.toSet()));
		

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento1);
		evento.adicionarEnvioEvento(envioEvento2);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.PROCESSADO_COM_ERRO.getDescricao());
	}
	
	@Test
	public void deveRecuperarDoUltimoEnvioSeOutroTemDataNula() {
		Lote lote = new Lote();
		lote.setProtocolo("0.1.0");

		EnvioEvento envioEvento1 = new EnvioEvento();
		envioEvento1.setLote(lote);
		envioEvento1.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		envioEvento1.setDtaGeracaoEvento(new GregorianCalendar(2018, Calendar.FEBRUARY, 11).getTime());
		
		ErroProcessamento erroProcessamento72 = new ErroProcessamento();
		erroProcessamento72.setDescricao("Não foi possível estabelecer conexão com o Sistema do CPF");
		erroProcessamento72.setCodMensagem(72l);
		envioEvento1.setErrosProcessamento(Stream.of(erroProcessamento72).collect(Collectors.toSet()));
		
		EnvioEvento envioEvento2 = new EnvioEvento();
		envioEvento2.setLote(lote);
		envioEvento2.setCodRespostaProcessamento(new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, 400l, "Erro"));
		
		ErroProcessamento erroProcessamento177 = new ErroProcessamento();
		erroProcessamento177.setDescricao("O envio do evento ocorreu em data posterior ao período previsto na legislação.");
		erroProcessamento177.setCodMensagem(177l);
		envioEvento2.setErrosProcessamento(Stream.of(erroProcessamento177).collect(Collectors.toSet()));
		

		Evento evento = new Evento();
		evento.adicionarEnvioEvento(envioEvento1);
		evento.adicionarEnvioEvento(envioEvento2);
		evento.setEstado(Estado.EM_FILA);

		Estado proximoEstado = maquinaEstadoEvento.proximoEstado(evento);

		assertThat(proximoEstado.getDescricao()).isEqualTo(Estado.EM_FILA.getDescricao());
	}

}
