package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.comunicacaogov.*;
import br.jus.tst.esocialjt.dominio.*;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class AtualizacaoProcessamentoServico {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AtualizacaoProcessamentoServico.class);
	
	@Autowired
	private LoteServico loteServico;
	
	@Autowired
	private EstadoServico estadoServico;

	@Autowired
	private CodigoRespostaServico codigoRespostaServico;

	@Autowired
	private ErroProcessamentoServico erroProcessamentoServico;

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Autowired
	private EventoTotalizadorServico eventoTotalizadorServico;

	public List<Lote> atualizarTodosEmProcessamento() {
		List<Lote> lotes = loteServico.criarConsulta().nosEstados(Estado.PROCESSAMENTO).buscar();
		return atualizarProcessamentoLote(lotes);
	}

	public List<Lote> atualizarProcessamentoLote(String... protocolo) {
		List<Lote> lotes = loteServico.criarConsulta().comProtocolos(protocolo).buscar();
		return atualizarProcessamentoLote(lotes);
	}

	@Transactional
	public List<Lote> abortarTodosEmProcessamento() {
		List<Lote> lotesAtualizados = new ArrayList<>();
		List<Lote> lotes = loteServico.criarConsulta().nosEstados(Estado.PROCESSAMENTO).buscar();
		lotes.forEach(lote -> {
			lote.getEnviosEvento().forEach(envio -> {
				envio.getEvento().setEstado(Estado.ERRO);
				envio.setErroInterno("Ocorreu um erro ao obter resposta do evento. Verifique resultado do envio no eSocial-Gov.");
			});
			lote.setEstado(Estado.ERRO);
			lotesAtualizados.add(loteServico.atualiza(lote));
		});
		return lotesAtualizados;
	}

	public List<Lote> atualizarProcessamentoLote(List<Lote> lotes) {
		List<Lote> lotesAtualizados = new ArrayList<>();

		lotes.forEach(lote -> {
			try {
				RetornoProcessamento retornoProcessamento = comunicacaoEsocialGov.consultarLoteEventos(lote.getProtocolo());
				RetornoLote retornoLote = retornoProcessamento.getRetornoLote();
				preencherDadosProcessamentoLote(lote, retornoLote);
				preencherProcessamentoEnviosEvento(lote.getEnviosEvento(), retornoProcessamento);

				lote.getEnviosEvento().forEach(envio -> estadoServico.atualizarEstado(envio.getEvento()));
				estadoServico.atualizarEstado(lote);
				
				lotesAtualizados.add(loteServico.atualiza(lote));
				
				salvaEventosTotalizadores(retornoLote);
				
			} catch (ComunicacaoEsocialGovException e) {
				LOGGER.error(e.getMessage());
				LOGGER.debug(e.getMessage(), e);
			}
		});
		
		return lotesAtualizados;
	}

	public void salvaEventosTotalizadores(RetornoLote retornoLote) {
		List<RetornoEventoTotalizador> listaRetornoEventoTotalizador = retornoLote.getRetornoEventoTotalizador();
		
		if (!listaRetornoEventoTotalizador.isEmpty()) {
			for (RetornoEventoTotalizador eventoTot : listaRetornoEventoTotalizador) {
				EventoTotalizador eventoTotalizador = new EventoTotalizador();
				eventoTotalizador.setTipo(eventoTot.getTipo());
				eventoTotalizador.setNrReciboArquivoBase(eventoTot.getNrReciboArquivoBase());
				eventoTotalizador.setIndApuracao(eventoTot.getIndApuracao());
				eventoTotalizador.setPerApuracao(eventoTot.getPerApuracao());
				eventoTotalizador.setCpfTrabalhador(eventoTot.getCpfTrabalhador());
				eventoTotalizador.setXmlEventoTotalizador(eventoTot.getXmlEventoTotalizador());
				eventoTotalizadorServico.salvar(eventoTotalizador);
			}
		}
	}
	
	public void preencherProcessamentoEnviosEvento(List<EnvioEvento> enviosEvento, RetornoProcessamento retornoProcessamento) {
		List<RetornoEvento> listaRetornoEvento = retornoProcessamento.getRetornoLote().getRetornoEvento();
		
		if (!listaRetornoEvento.isEmpty()) {
			enviosEvento.forEach(envioEvento -> {
				RetornoEvento retornoEvento = listaRetornoEvento.stream()
					.filter(re -> re.getIdEvento().equals(envioEvento.getEvento().getIdEvento()))
					.findFirst()
					.get();
				
				envioEvento.getEvento().setNrRecibo(retornoEvento.getNrRecibo());
				
				long codigoRespostaProcessamento = retornoEvento.getCodigoRespostaProcessamento();
				CodigoResposta codigoResposta = new CodigoResposta(CodigoResposta.RESPOSTA_GOV_EVENTO, codigoRespostaProcessamento,
						retornoEvento.getDescricaoRespostaProcessamento());
				codigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta);
				
				envioEvento.setCodRespostaProcessamento(codigoResposta);
				Set<ErroProcessamento> errosProcessamento = erroProcessamentoServico
						.retornaErroProcessamento(retornoEvento.getRetornoErrosProcessamento(), envioEvento);
				envioEvento.setErrosProcessamento(errosProcessamento);
			});
		}
				
	}
	
	public Lote preencherDadosProcessamentoLote(Lote lote, RetornoLote retornoLote) {
		long codigoRespostaProcessamento = retornoLote.getCodigoRespostaProcessamento();
		CodigoResposta codigoResposta = new CodigoResposta(
				CodigoResposta.RESPOSTA_GOV_LOTE, 
				codigoRespostaProcessamento,
				retornoLote.getDescricaoRespostaProcessamento());
		codigoResposta = codigoRespostaServico.obterCodigoResposta(codigoResposta);
		lote.setResposta(codigoResposta);
		
		return lote;
	}

}
