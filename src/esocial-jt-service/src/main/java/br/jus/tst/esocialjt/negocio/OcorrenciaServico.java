package br.jus.tst.esocialjt.negocio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaDadosBasicosDTO;
import br.jus.tst.esocialjt.repository.OcorrenciaRepository;

@Service
public class OcorrenciaServico {

	@Autowired
	private TipoEventoServico tipoEventoServico;

	@Autowired
	private EventoServico eventoServico;

	@Autowired
	private EntityManager em;
	
	@Autowired
	OcorrenciaRepository repository;

	@Transactional
	public Ocorrencia salvar(Ocorrencia ocorrencia) {
		return repository.save(ocorrencia);
	}

	public List<Ocorrencia> recuperaTodos() {
		return repository.findAll();
	}
	
	public Page<Ocorrencia> recuperaPaginado(int page, int size) {
		Sort ordenamento = Sort.by("dataRecebimento").descending();
		PageRequest pageRequest = PageRequest.of(page, size, ordenamento);
		return repository.findAll(pageRequest);
	}

	public List<OcorrenciaDadosBasicosDTO> recuperaDadosBasicos() {
		TypedQuery<OcorrenciaDadosBasicosDTO> query = em.createNamedQuery("Ocorrencia.findNecessaryDataOnly",
				OcorrenciaDadosBasicosDTO.class);
		return query.getResultList();
	}

	public Ocorrencia recuperaPorId(long id) throws EntidadeNaoExisteException {
		return repository
				.findById(id)
				.orElseThrow(()->new EntidadeNaoExisteException("Não foi possível encontrar ocorrência com id=" + id));
	}

	public List<Ocorrencia> recuperaOcorrenciasSemEventos() {
		return em.createNamedQuery("Ocorrencia.ocorrenciasSemEvento", Ocorrencia.class).getResultList();
	}

	@Transactional
	public Ocorrencia atualizar(Ocorrencia ocorrencia) {
		return repository.save(ocorrencia);
	}

	public Ocorrencia gerarEvento(Ocorrencia ocorrencia) {
		String referencia = ocorrencia.getReferencia();
		TipoEvento tipoEvento = tipoEventoServico.obterTipoEventoEsocial(ocorrencia.getTipoOcorrencia());

		if (!deveAguardarGeracaoEvento(tipoEvento, referencia)) {
			Evento evento = eventoServico.gerarEvento(ocorrencia, tipoEvento);
			ocorrencia.setEvento(evento);
		}

		return atualizar(ocorrencia);
	}

	public boolean deveAguardarGeracaoEvento(TipoEvento tipoEvento, String referencia) {
		return eventoServico.criarConsulta()
				.dosTipos(tipoEvento)
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO)
				.comReferencias(referencia).existe();
	}
}
