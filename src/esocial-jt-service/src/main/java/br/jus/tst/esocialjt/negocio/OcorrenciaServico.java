package br.jus.tst.esocialjt.negocio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaDadosBasicosDTO;

@Service
public class OcorrenciaServico {

	@Autowired
	private TipoEventoServico tipoEventoServico;

	@Autowired
	private EventoServico eventoServico;

	@Autowired
	private EntityManager em;

	@Transactional
	public Ocorrencia salvar(Ocorrencia ocorrencia) {
		em.persist(ocorrencia);
		return ocorrencia;
	}

	public List<Ocorrencia> recuperaTodos() {
		TypedQuery<Ocorrencia> query = em.createNamedQuery("Ocorrencia.findAll", Ocorrencia.class);
		return query.getResultList();
	}

	public List<OcorrenciaDadosBasicosDTO> recuperaDadosBasicos() {
		TypedQuery<OcorrenciaDadosBasicosDTO> query = em.createNamedQuery("Ocorrencia.findNecessaryDataOnly",
				OcorrenciaDadosBasicosDTO.class);
		return query.getResultList();
	}

	public Ocorrencia recuperaPorId(long id) throws EntidadeNaoExisteException {
		Ocorrencia ocorrencia = em.find(Ocorrencia.class, id);
		if (ocorrencia == null) {
			throw new EntidadeNaoExisteException("Não foi possível encontrar ocorrência com id=" + id);
		}
		return ocorrencia;
	}

	public List<Ocorrencia> recuperaOcorrenciasSemEventos() {
		return em.createNamedQuery("Ocorrencia.ocorrenciasSemEvento", Ocorrencia.class).getResultList();
	}

	@Transactional
	public Ocorrencia atualizar(Ocorrencia ocorrencia) {
		return em.merge(ocorrencia);
	}

	public Ocorrencia gerarEvento(Ocorrencia ocorrencia) {
		String referencia = ocorrencia.getReferencia();
		TipoEvento tipoEvento = tipoEventoServico.obterTipoEventoEsocial(ocorrencia.getTipoOcorrencia());

		if (!deveAguardarGeracaoEvento(tipoEvento, referencia)) {
			Evento evento = eventoServico.gerarEvento(ocorrencia, tipoEvento);
			ocorrencia.setEvento(evento);
			atualizarOperacaoTabela(ocorrencia);
		}

		return atualizar(ocorrencia);
	}

	public Ocorrencia atualizarOperacaoTabela(Ocorrencia ocorrencia) {
		TipoEvento tipoEvento = ocorrencia.getEvento().getTipoEvento();
		GrupoTipoEvento grupoTipoEvento = tipoEvento.getGrupoTipoEvento();
		Operacao operacao = ocorrencia.getOperacao();
		if (GrupoTipoEvento.TABELA.equals(grupoTipoEvento) && !Operacao.EXCLUSAO.equals(operacao)) {
			List<Evento> eventosAnteriores = eventoServico.criarConsulta()
					.comReferencias(ocorrencia.getReferencia())
					.dosTipos(tipoEvento)
					.nosEstados(Estado.PROCESSADO_COM_SUCESSO)
					.buscar();

			boolean existeAnteriorIgual = eventosAnteriores
					.stream()
					.anyMatch(evtAnterior -> evtAnterior
							.getOcorrencia()
							.getDadosOcorrencia()
							.equals(ocorrencia.getDadosOcorrencia()));

			Operacao novaOperacao = Operacao.INCLUSAO;

			if (existeAnteriorIgual) {
				novaOperacao = Operacao.ALTERACAO;
			}

			ocorrencia.setOperacao(novaOperacao);
		}

		return ocorrencia;
	}

	public boolean deveAguardarGeracaoEvento(TipoEvento tipoEvento, String referencia) {
		return eventoServico.criarConsulta()
				.dosTipos(tipoEvento)
				.nosEstados(Estado.EM_FILA, Estado.PROCESSAMENTO)
				.comReferencias(referencia).existe();
	}
}
