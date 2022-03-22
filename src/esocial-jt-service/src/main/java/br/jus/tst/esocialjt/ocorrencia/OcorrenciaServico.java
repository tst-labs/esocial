package br.jus.tst.esocialjt.ocorrencia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.negocio.TipoEventoServico;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;

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
	
	@Autowired
	OcorrenciaSpecs specs;

	@Transactional
	public Ocorrencia salvar(Ocorrencia ocorrencia) {
		return gerarEvento(ocorrencia);
	}

	public List<Ocorrencia> recuperaTodos() {
		return repository.findAll();
	}
	
	public OcorrenciaPage recuperaPaginado(int page, int size, List<Estado> estados, String expressao, List<TipoEvento> tipos,
			boolean incluirArquivados) {
		Sort ordenamento = Sort.by("dataRecebimento").descending();
		PageRequest pageRequest = PageRequest.of(page, size, ordenamento);
		
		Page<Ocorrencia> pagina = repository.findAll(
					specs.nosEstados(estados)
					.and(specs.comExpressao(expressao))
					.and(specs.dosTipos(tipos))
					.and(specs.incluirArquivados(incluirArquivados)), 
					pageRequest);
		
		OcorrenciaPage ocorrenciaPage = new OcorrenciaPage();
		ocorrenciaPage.pagina = pagina;
		ocorrenciaPage.contagemEstado = Estado.listaEstados
											.stream()
											.map(e -> {
												long count = repository.count(
														specs.nosEstados(Arrays.asList(e))
														.and(specs.comExpressao(expressao))
														.and(specs.dosTipos(tipos))
														.and(specs.incluirArquivados(incluirArquivados)));
												return new ContagemEstado(e.getId(), count);
											}).collect(Collectors.toList());
		
		return ocorrenciaPage;
	}
	
	public List<Long> buscarTiposEnviados(){
		return repository.buscarTiposEnviados();
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
		TipoEvento tipoEvento = tipoEventoServico.obterTipoEventoEsocial(ocorrencia.getTipoOcorrencia());
		Evento evento = eventoServico.gerarEvento(ocorrencia, tipoEvento);
		ocorrencia.setEvento(evento);
		return atualizar(ocorrencia);
	}
	
	@Transactional
	public int arquivar(long id) {
		return repository.arquivar(id);
	}
	
	@Transactional
	public int desarquivar(long id) {
		return repository.desarquivar(id);
	}

}
