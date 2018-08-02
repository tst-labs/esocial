package br.jus.tst.esocialjt.negocio;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;

public class ConsultaLote {

	private static final String QUERY_BASE = " SELECT l FROM Lote l ";

	private EntityManager em;
	private Set<String> campos = new LinkedHashSet<>();
	private Map<String, Object> parametros = new LinkedHashMap<>();

	public ConsultaLote(EntityManager em) {
		this.em = em;
	}

	public List<Lote> buscar() {
		TypedQuery<Lote> typedQuery = em.createQuery(criarQuery(), Lote.class);
		parametros.forEach(typedQuery::setParameter);
		return typedQuery.getResultList();
	}

	public ConsultaLote comIds(Long... ids) {
		if (ids != null && ids.length > 0) {
			campos.add(" l.id in :ids ");
			parametros.put("ids", Arrays.asList(ids));
		}
		return this;
	}
	
	public ConsultaLote nosEstados(Estado... estados) {
		if (estados != null && estados.length > 0) {
			campos.add(" l.estado in :estados ");
			parametros.put("estados", Arrays.asList(estados));
		}
		return this;
	}

	public ConsultaLote comProtocolos(String... protocolos) {
		if (protocolos != null && protocolos.length > 0) {
			campos.add(" l.protocolo in :protocolos ");
			parametros.put("protocolos", Arrays.asList(protocolos));
		}
		return this;
	}


	private String criarQuery() {
		StringBuilder query = new StringBuilder();
		query.append(QUERY_BASE);
		boolean primeiraIteracao = true;
		for (String campo : campos) {
			if (primeiraIteracao) {
				query.append(" where ");
				primeiraIteracao = false;
			} else {
				query.append(" and ");
			}
			query.append(campo);
		}
		return query.toString();
	}
}
