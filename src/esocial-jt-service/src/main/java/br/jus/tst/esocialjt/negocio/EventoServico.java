package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.xml.GeradorId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class EventoServico {

	@Autowired
	private EntityManager em;

	@Autowired
	private GeradorId geradorId;

	@Autowired
	PublicacaoServico publicacaoServico;

	public Evento gerarEvento(Ocorrencia ocorrencia, TipoEvento tipoEvento) {

		Evento evento = new Evento();
		evento.setTipoEvento(tipoEvento);
		evento.setOcorrencia(ocorrencia);
		String cnpj = ocorrencia.getDadosOcorrencia().getIdeEmpregador().getNrInsc();
		evento.setIdEvento(geradorId.gerarId(cnpj));
		evento.setEstado(Estado.EM_FILA);

		return evento;
	}

	public List<Evento> recuperarEventoPorIdEvento(String idEvento) {
		TypedQuery<Evento> query = em.createNamedQuery("Evento.recuperarEventoPorIdEvento", Evento.class);
		query.setParameter("idEvento", idEvento);
		return query.getResultList();
	}

	@Transactional
	public Evento atualiza(Evento evento) {
		Evento eventoSalvo = em.merge(evento);
		publicacaoServico.publicarAlteracaoEstado(evento);
		return eventoSalvo;
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

	public List<Evento> forcarEstadoEvento(List<Evento> eventos, Estado estado) {
		eventos.forEach(e -> e.setEstado(estado));
		return eventos
				.stream()
				.map(this::atualiza)
				.collect(Collectors.toList());
	}

	public List<Evento> abortarTodosEmProcessamento() {
		List<Evento> eventos = criarConsulta()
				.nosEstados(Estado.PROCESSAMENTO)
				.buscar();

		eventos.stream()
				.map(Evento::getEnviosEvento)
				.filter(Objects::nonNull)
				.flatMap(Collection::stream)
				.forEach(e -> e.setErroInterno("Processamento abortado."));

		return forcarEstadoEvento(eventos, Estado.ERRO);
	}
}
