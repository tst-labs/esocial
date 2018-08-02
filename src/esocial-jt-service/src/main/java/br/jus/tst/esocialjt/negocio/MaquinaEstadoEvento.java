package br.jus.tst.esocialjt.negocio;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.ErroProcessamento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;

@Service
public class MaquinaEstadoEvento {
	
	private static final long CODIGO_SUCESSO = 201l;
	
	@Value("#{'${esocialjt.erros-recuperaveis}'.split(',')}") 
	List<Long> errosRecuperaveis;

	public Estado proximoEstado(Evento evento) {
		Estado estado = evento.getEstado();
		
		estado = estadoEmFila(estado);
		estado = estadoErro(evento, estado);
		estado = estadoProcessadoComErro(evento, estado);
		estado = estadoEnviadoComSucesso(evento, estado);
		estado = estadoProcessamento(evento, estado);
		estado = erroRecuperavel(evento, estado);
		
		return estado;
	}
	
	private Estado estadoEmFila(Estado estado) {
		if(estado == null) {
			estado = Estado.EM_FILA;
		}
		return estado;
	}
	
	private Estado estadoErro(Evento evento, Estado estado) {
		boolean contemErro = evento.getEnviosEvento().stream()
			.map(EnvioEvento::getErroInterno)
			.anyMatch(StringUtils::isNotEmpty);

		if(contemErro) {
			estado = Estado.ERRO;
		}
		return estado;
	}
	
	private Estado estadoProcessamento(Evento evento, Estado estado) {
		boolean enviadoENaoProcessado = evento.getEnviosEvento().stream()
			.filter(envio -> envio.getCodRespostaProcessamento() == null)
			.map(EnvioEvento::getLote)
			.filter(Objects::nonNull)
			.map(Lote::getProtocolo)
			.anyMatch(StringUtils::isNotEmpty);
		
		if(enviadoENaoProcessado) {
			estado = Estado.PROCESSAMENTO;
		}
		return estado;
	}

	private Estado estadoProcessadoComErro(Evento evento, Estado estado) {
		boolean envioErro = evento.getEnviosEvento().stream()
				.map(EnvioEvento::getCodRespostaProcessamento)
				.filter(Objects::nonNull)
				.map(CodigoResposta::getCodResposta)
				.anyMatch(codigo -> codigo != CODIGO_SUCESSO);
		
		if(envioErro) {
			estado = Estado.PROCESSADO_COM_ERRO;
		}
		return estado;
	}

	private Estado estadoEnviadoComSucesso(Evento evento, Estado estado) {
		boolean envioSucesso = evento.getEnviosEvento().stream()
			.map(EnvioEvento::getCodRespostaProcessamento)
			.filter(Objects::nonNull)
			.map(CodigoResposta::getCodResposta)
			.anyMatch(codigo -> codigo == CODIGO_SUCESSO);
		if(envioSucesso) {
			estado = Estado.PROCESSADO_COM_SUCESSO;
		}
		return estado;
	}
	
	private Estado erroRecuperavel(Evento evento, Estado estado) {
			
		if(estado.getId() == Estado.PROCESSADO_COM_ERRO.getId()) {
			Optional<EnvioEvento> findFirst = evento.getEnviosEvento().stream()
				.sorted(Comparator.comparing( 
						EnvioEvento::getDtaGeracaoEvento, 
						Comparator.nullsLast(Comparator.reverseOrder()))
						)
				.findFirst();
			
			if (findFirst.isPresent()) {
				EnvioEvento ultimoEnvio = findFirst.get();
				Set<ErroProcessamento> erros = ultimoEnvio.getErrosProcessamento();

				boolean todosErrosRecuperaveis = erros.stream()
						.map(ErroProcessamento::getCodMensagem)
						.allMatch(errosRecuperaveis::contains);

				if (!erros.isEmpty() && todosErrosRecuperaveis) {
					estado = Estado.EM_FILA;
				}
			}
		}

		return estado;
	}
	
}
