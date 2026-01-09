package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.negocio.PublicacaoServico;
import br.jus.tst.esocialjt.negocio.TipoEventoServico;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

	@Autowired
	PublicacaoServico publicacaoServico;

	@Autowired
	ExclusaoServico exclusaoServico;

	public static final Logger LOGGER = LoggerFactory.getLogger(OcorrenciaServico.class);

	@Transactional
	public Ocorrencia salvar(Ocorrencia ocorrencia) {
		ocorrencia.setDataRecebimento(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
		ocorrencia.setCpf(ocorrencia.getDadosOcorrencia().getCpf());
		ocorrencia.setMatricula(ocorrencia.getDadosOcorrencia().getMatricula());

		return gerarEvento(ocorrencia);
	}

	public List<Ocorrencia> recuperaTodos() {
		return repository.findAll();
	}
	
	public OcorrenciaPage recuperaPaginado(int page, int size, List<Estado> estados, String expressao, List<TipoEvento> tipos,
			boolean incluirArquivados, List<String> cpf, List<String> periodoApuracao) {
		Sort ordenamento = Sort.by("dataRecebimento").descending();
		PageRequest pageRequest = PageRequest.of(page, size, ordenamento);
		
		Page<Ocorrencia> pagina = repository.findAll(
					specs.nosEstados(estados)
					.and(specs.comExpressao(expressao))
					.and(specs.dosTipos(tipos))
					.and(specs.incluirArquivados(incluirArquivados)
					.and(specs.comCPF(cpf))
					.and(specs.comPeriodoApuracao(periodoApuracao))),
					pageRequest);
		
		OcorrenciaPage ocorrenciaPage = new OcorrenciaPage();
		ocorrenciaPage.pagina = pagina;
		ocorrenciaPage.contagemEstado = Estado.listaEstados
											.stream()
											.map(e -> {
												long count = repository.count(
														specs.nosEstados(Collections.singletonList(e))
														.and(specs.comExpressao(expressao))
														.and(specs.dosTipos(tipos))
														.and(specs.incluirArquivados(incluirArquivados))
														.and(specs.comCPF(cpf))
														.and(specs.comPeriodoApuracao(periodoApuracao)));
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

	public Ocorrencia enviarEventoExclusao(long id) throws EntidadeNaoExisteException {
		Ocorrencia ocorrencia = repository
				.findById(id)
				.orElseThrow(()->new EntidadeNaoExisteException("Não foi possível encontrar ocorrência com id=" + id));

		Ocorrencia exclusao = exclusaoServico.gerarExclusao(ocorrencia);

		return salvar(exclusao);
	}

	@Async
	public void enviarEventoExclusao(List<Long> ids) {
        ids.forEach(id -> {
			try {
				enviarEventoExclusao(id);
			} catch (Exception e) {
                LOGGER.error("Erro ao enviar evento de exclusão para ocorrência com id={}. Mensagem: {}", id, e.getMessage());
				LOGGER.debug(e.getMessage(), e);
			}
		});
	}

	public List<Ocorrencia> recuperaOcorrenciasSemEventos() {
		return em.createNamedQuery("Ocorrencia.ocorrenciasSemEvento", Ocorrencia.class).getResultList();
	}

	@Transactional
	public Ocorrencia atualizar(Ocorrencia ocorrencia) {
		Ocorrencia ocorrenciaSalva = repository.save(ocorrencia);
		publicacaoServico.publicarAlteracaoEstado(ocorrencia);
		return ocorrenciaSalva;
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


	public List<OcorrenciaSumario> getSumario(TipoEvento tipoEvento){
		return repository.getSumario(tipoEvento);
	}

	public List<Long> buscarIdsPorFiltros(List<Estado> estados, List<TipoEvento> tipos, List<String> cpf, List<String> periodoApuracao) {
		// Remove espaços em branco dos CPFs
		List<String> cpfsTrimmed = cpf == null ? Collections.emptyList() :
				cpf.stream()
						.map(String::trim)
						.collect(Collectors.toList());

		// Remove espaços em branco dos períodos de apuração
		List<String> periodosTrimmed = periodoApuracao == null ? Collections.emptyList() :
				periodoApuracao.stream()
						.map(String::trim)
						.collect(Collectors.toList());

		return repository.buscarIdsPorFiltros(
				estados == null ? Collections.emptyList() : estados,
				tipos == null ? Collections.emptyList() : tipos,
				cpfsTrimmed,
				periodosTrimmed
		);
	}

	public void atualizarExclusao(Evento evento) {
		if (Estado.PROCESSADO_COM_SUCESSO.equals(evento.getEstado()) && TipoEvento.EXCLUSAO.equals(evento.getTipoEvento()) ) {
			Ocorrencia ocorrenciaExclusao = evento.getOcorrencia();
			DadosOcorrencia dadosOcorrencia = ocorrenciaExclusao.getDadosOcorrencia();
			if (dadosOcorrencia instanceof Exclusao) {
				Exclusao exclusao = (Exclusao) dadosOcorrencia;
				String recibo = exclusao.getInfoExclusao().getNrRecEvt();
				repository.buscarPorRecibo(recibo)
						.stream()
						.findFirst()
						.ifPresent(ocorrencia -> {
							ocorrencia.setOcorrenciaExclusaoId(ocorrenciaExclusao.getId());
							atualizar(ocorrencia);
						});
			}
		}
	}

	public void atualizarRetificacao(Evento evento) {
		if (Estado.PROCESSADO_COM_SUCESSO.equals(evento.getEstado()) && evento.getOcorrencia().getRetificarRecibo() != null) {
			repository.buscarPorRecibo(evento.getOcorrencia().getRetificarRecibo())
				.stream()
				.findFirst()
				.ifPresent(ocorrencia -> {
					ocorrencia.setOcorrenciaRetificacaoId(evento.getOcorrencia().getId());
					atualizar(ocorrencia);
				});
		}
	}
}
