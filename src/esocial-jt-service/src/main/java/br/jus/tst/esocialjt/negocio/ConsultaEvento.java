package br.jus.tst.esocialjt.negocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;

public class ConsultaEvento {

	private static final String QUERY_BASE = " SELECT e FROM Evento e ";
	private static final String QUERY_BASE_DTO = " SELECT e.id as codEvento, e.tipoEvento.id as codTipoEvento FROM Evento e ";
	private static final String QUERY_COUNT = " SELECT COUNT(e) FROM Evento e ";

	private EntityManager em;
	private Set<String> campos = new LinkedHashSet<>();
	private Map<String, Object> parametros = new LinkedHashMap<>();

	public ConsultaEvento(EntityManager em) {
		this.em = em;
	}

	public List<Evento> buscar() {
		TypedQuery<Evento> typedQuery = em.createQuery(criarQuery(QUERY_BASE), Evento.class);
		parametros.forEach(typedQuery::setParameter);
		return typedQuery.getResultList();
	}
	
	public List<EventoDTO> buscarDTO() {
		List<EventoDTO> listaEventoDTO = new ArrayList<>();

		TypedQuery<Tuple> typedQuery = em.createQuery(criarQuery(QUERY_BASE_DTO), Tuple.class);
		parametros.forEach(typedQuery::setParameter);
		List<Tuple> resultado = typedQuery.getResultList();
		
		resultado.forEach(tupla -> {
			EventoDTO eventoDTO = new EventoDTO();
			eventoDTO.setId((Long) tupla.get("codEvento"));
			eventoDTO.setCodTipoEvento((Long) tupla.get("codTipoEvento"));
			listaEventoDTO.add(eventoDTO);
		});
		
		return listaEventoDTO;
	}
	
	public boolean existe() {
		TypedQuery<Long> typedQuery = em.createQuery(criarQuery(QUERY_COUNT), Long.class);
		parametros.forEach(typedQuery::setParameter);
		Long count = typedQuery.getSingleResult();
		return count > 0;
	}
	
	public boolean naoExiste() {
		return ! existe();
	}

	public ConsultaEvento comIds(Long... ids) {
		if (ids != null && ids.length > 0) {
			campos.add(" e.id in :ids ");
			parametros.put("ids", Arrays.asList(ids));
		}
		return this;
	}

	public ConsultaEvento comIdsEvento(String... idsEvento) {
		if (idsEvento != null && idsEvento.length > 0) {
			campos.add(" e.idEvento in :idsEvento ");
			parametros.put("idsEvento", Arrays.asList(idsEvento));
		}
		return this;
	}

	public ConsultaEvento dosTipos(TipoEvento... tipos) {
		if (tipos != null && tipos.length > 0) {
			campos.add(" e.tipoEvento in :tipos ");
			parametros.put("tipos", Arrays.asList(tipos));
		}
		return this;
	}

	public ConsultaEvento nosEstados(Estado... estados) {
		if (estados != null && estados.length > 0) {
			campos.add(" e.estado in :estados ");
			parametros.put("estados", Arrays.asList(estados));
		}
		return this;
	}
	
	public ConsultaEvento dosGrupos(GrupoTipoEvento... grupos) {
		if (grupos != null && grupos.length > 0) {
			campos.add(" e.tipoEvento.grupoTipoEvento in :grupos ");
			parametros.put("grupos", Arrays.asList(grupos));
		}
		return this;
	}
	
	public ConsultaEvento comReferencias(String... referencias) {
		if (referencias != null && referencias.length > 0) {
			campos.add(" e.ocorrencia.referencia in :referencias ");
			parametros.put("referencias", Arrays.asList(referencias));
		}
		return this;
	}

	private String criarQuery(String queryBase) {
		StringBuilder query = new StringBuilder();
		query.append(queryBase);
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
