package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;


public enum MaquinaEstadoLote {

	EM_FILA(Estado.EM_FILA) {
		@Override
		Estado proximo(Lote lote) {
			Estado result = this.estado;
			if (StringUtils.isNotEmpty(lote.getProtocolo())) {
				result = Estado.PROCESSAMENTO;
			}

			if (StringUtils.isNotEmpty(lote.getErroInterno())) {
				result = Estado.ERRO;
			}
			return result;
		}
	},

	PROCESSAMENTO(Estado.PROCESSAMENTO) {
		@Override
		Estado proximo(Lote lote) {
			Estado result = this.estado;
			if (lote.getCodigoResposta() != null) {
				Long codResposta = lote.getCodigoResposta().getCodResposta();
				if (codResposta == 101L) {
					result = Estado.PROCESSAMENTO;
				} else if (codResposta >= 200L && codResposta < 300L) {
					result = Estado.PROCESSADO_COM_SUCESSO;
				} else {
					result = Estado.PROCESSADO_COM_ERRO;
				}
			}
			return result;
		}
	};

	final Estado estado;

	MaquinaEstadoLote(Estado estado) {
		this.estado = estado;
	}

	abstract Estado proximo(Lote lote);

	public static Estado proximoEstado(Lote lote) {
		Estado estadoAtual = Optional.ofNullable(lote.getEstado()).orElse(Estado.EM_FILA);

		return Stream.of(MaquinaEstadoLote.values())
				.filter(val -> Objects.equals(val.estado.getId(), estadoAtual.getId()))
				.map(m -> m.proximo(lote))
				.findAny()
				.orElse(estadoAtual);
	}
}
