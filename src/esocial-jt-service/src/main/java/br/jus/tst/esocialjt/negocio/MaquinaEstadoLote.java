package br.jus.tst.esocialjt.negocio;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;

@Service
public class MaquinaEstadoLote {
	
	private static final long CODIGO_SUCESSO = 201l;
	
	public Estado proximoEstado(Lote lote) {
		Estado estado = lote.getEstado();
		
		estado = estadoEmFila(estado);
		estado = estadoErro(lote, estado);
		estado = estadoProcessamento(lote, estado);
		estado = estadoProcessadoComSucesso(lote, estado);
		estado = estadoProcessadoComErro(lote, estado);
		
		return estado;
	}
	
	private Estado estadoEmFila(Estado estado) {
		if(estado == null) {
			estado = Estado.EM_FILA;
		}
		return estado;
	}

	private Estado estadoProcessadoComErro(Lote lote, Estado estado) {
		boolean algumProcessadoErro = lote.getEnviosEvento().stream()
				.map(EnvioEvento::getCodRespostaProcessamento)
				.anyMatch(resp -> resp != null && resp.getCodResposta() != CODIGO_SUCESSO);

		if (algumProcessadoErro || loteCodigoErro(lote)) {
			estado = Estado.PROCESSADO_COM_ERRO;
		}
		return estado;
	}

	private boolean loteCodigoErro(Lote lote) {
		return lote.getCodigoResposta() !=null && lote.getCodigoResposta().getCodResposta() > CODIGO_SUCESSO;
	}

	private Estado estadoProcessadoComSucesso(Lote lote, Estado estado) {
		boolean todosProcessadosSucesso = lote.getEnviosEvento().stream()
			.map(EnvioEvento::getCodRespostaProcessamento)
			.allMatch(resp -> resp != null && resp.getCodResposta() == CODIGO_SUCESSO);
		
		if(!lote.getEnviosEvento().isEmpty() && todosProcessadosSucesso) {
			estado = Estado.PROCESSADO_COM_SUCESSO;
		}
		return estado;
	}

	private Estado estadoProcessamento(Lote lote, Estado estado) {
		boolean exiteEnvioSemRespProcessamento = lote.getEnviosEvento().stream()
			.map(EnvioEvento::getCodRespostaProcessamento)
			.anyMatch(Objects::isNull);
		
		if(StringUtils.isNotEmpty(lote.getProtocolo())&& exiteEnvioSemRespProcessamento) {
			estado = Estado.PROCESSAMENTO;
		}
		return estado;
	}

	private Estado estadoErro(Lote lote, Estado estado) {
		if(StringUtils.isNotEmpty(lote.getErroInterno())) {
			estado = Estado.ERRO;
		}
		return estado;
	}
}
