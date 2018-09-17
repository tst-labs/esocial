package br.jus.tst.esocialjt.negocio;

import java.util.EnumMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;

@Service
public class TipoEventoServico {

	@Autowired
	EntityManager em;

	private Map<TipoOcorrencia, Integer> tipoEventoEsocialMap;

	public TipoEvento recuperarPorId(long id) {
		return em.find(TipoEvento.class, id);
	}

	public TipoEvento obterTipoEventoEsocial(TipoOcorrencia tipoOcorrencia) {
		if (tipoEventoEsocialMap == null) {
			this.tipoEventoEsocialMap = mapearTipoEventoEsocial();
		}
		TipoEvento tipoEvento = recuperarPorId(tipoEventoEsocialMap.get(tipoOcorrencia));
		return tipoEvento;
	}

	private Map<TipoOcorrencia, Integer> mapearTipoEventoEsocial() {
		Map<TipoOcorrencia, Integer> map = new EnumMap<>(TipoOcorrencia.class);

		map.put(TipoOcorrencia.INFORMACOES_EMPREGADOR, 1000);
		map.put(TipoOcorrencia.TABELA_ESTABELECIMENTO, 1005);
		map.put(TipoOcorrencia.TABELA_RUBRICA, 1010);
		map.put(TipoOcorrencia.TABELA_LOTACAO, 1020);
		map.put(TipoOcorrencia.TABELA_CARGO, 1030);
		map.put(TipoOcorrencia.TABELA_CARREIRA, 1035);
		map.put(TipoOcorrencia.TABELA_FUNCAO, 1040);
		map.put(TipoOcorrencia.TABELA_HORARIO, 1050);
		map.put(TipoOcorrencia.TABELA_AMBIENTE, 1060);
		map.put(TipoOcorrencia.TABELA_PROCESSO, 1070);
		map.put(TipoOcorrencia.ADMISSAO_TRABALHADOR, 2200);
		map.put(TipoOcorrencia.ALTERACAO_CADASTRAL, 2205);
		map.put(TipoOcorrencia.ALTERACAO_CONTRATUAL, 2206);
		map.put(TipoOcorrencia.AFASTAMENTO_TEMPORARIO, 2230);
		map.put(TipoOcorrencia.REINTEGRACAO, 2298);
		map.put(TipoOcorrencia.DESLIGAMENTO, 2299);
		map.put(TipoOcorrencia.TSV_INICIO, 2300);

		return map;
	}

}
