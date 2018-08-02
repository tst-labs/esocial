package br.jus.tst.esocialjt.negocio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.xml.GeradorId;

@Service
public class EventoServico {

	@Autowired
	private EntityManager em;

	@Autowired
	private GeradorId geradorId;
	
	@Autowired
	private EstadoServico estadoServico;

	public Evento gerarEvento(Ocorrencia ocorrencia, TipoEvento tipoEvento) {

		Evento evento = new Evento();
		evento.setTipoEvento(tipoEvento);
		evento.setOcorrencia(ocorrencia);
		String cnpj = ocorrencia.getDadosOcorrencia().getIdeEmpregador().getNrInsc();
		evento.setIdEvento(geradorId.gerarId(cnpj));
		estadoServico.atualizarEstado(evento);
		
		return evento;
	}

	public List<Evento> recuperarEventoPorIdEvento(String idEvento) {
		TypedQuery<Evento> query = em.createNamedQuery("Evento.recuperarEventoPorIdEvento", Evento.class);
		query.setParameter("idEvento", idEvento);
		return query.getResultList();
	}

	@Transactional
	public Evento atualiza(Evento evento) {
		return em.merge(evento);
	}

	@Transactional
	public void atualiza(List<Evento> eventos) {
		eventos.forEach(this::atualiza);
	}

	@Transactional
	public void salvar(Evento evento) {
		em.persist(evento);
	}

	public ConsultaEvento criarConsulta() {
		return new ConsultaEvento(em);
	}
}
