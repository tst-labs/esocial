package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public enum MaquinaEstadoEvento {
	EM_FILA(Estado.EM_FILA) {
		@Override
		Estado proximo(EnvioEvento envioEvento) {
			Estado result = this.estado;

			if (StringUtils.isNotEmpty(envioEvento.getErroInterno())) {
				result = Estado.ERRO;
			}

			Estado estadoLote = Optional.ofNullable(envioEvento.getLote())
					.map(Lote::getEstado)
					.orElse(null);

			if (estadoLote != null && Objects.equals(Estado.PROCESSAMENTO.getId(), estadoLote.getId())) {
				result = Estado.PROCESSAMENTO;
			}

			return result;
		}
	},
	PROCESSAMENTO(Estado.PROCESSAMENTO) {
		@Override
		Estado proximo(EnvioEvento envioEvento) {
			Estado result = this.estado;

			boolean possuiErroInterno = StringUtils.isNotEmpty(envioEvento.getErroInterno());
			boolean loteEstadoErro = Optional
					.ofNullable(envioEvento.getLote())
					.map(Lote::getEstado)
					.map(Estado::getId)
					.filter(id -> Objects.equals(Estado.PROCESSADO_COM_ERRO.getId(), id))
					.isPresent();

			if (possuiErroInterno || loteEstadoErro) {
				result = Estado.ERRO;
			}

			CodigoResposta codigoResposta = envioEvento.getCodRespostaProcessamento();

			if (codigoResposta != null) {
				Long codResposta = codigoResposta.getCodResposta();
				if (codResposta >= 200 && codResposta < 300) {
					result = Estado.PROCESSADO_COM_SUCESSO;
				} else {
					result = Estado.PROCESSADO_COM_ERRO;
				}
			}

			return result;
		}
	};

	final Estado estado;

	MaquinaEstadoEvento(Estado estado) {
		this.estado = estado;
	}

	abstract Estado proximo(EnvioEvento envioEvento);

	public static Estado proximoEstado(EnvioEvento envioEvento) {
		Estado estadoAtual = Optional.ofNullable(envioEvento.getEvento().getEstado()).orElse(Estado.EM_FILA);

		return Stream.of(MaquinaEstadoEvento.values())
				.filter(val -> Objects.equals(val.estado.getId(), estadoAtual.getId()))
				.map(m -> m.proximo(envioEvento))
				.findAny()
				.orElse(estadoAtual);
	}
}
