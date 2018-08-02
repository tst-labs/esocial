package br.jus.tst.esocialjt.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoEvento;
import br.jus.tst.esocialjt.comunicacaogov.RetornoLote;
import br.jus.tst.esocialjt.comunicacaogov.RetornoProcessamento;
import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.ErroProcessamento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

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
	
	public List<Lote> atualizarTodosEmProcessamento(){
		List<Lote> lotes = loteServico.criarConsulta().nosEstados(Estado.PROCESSAMENTO).buscar();
		return atualizarProcessamentoLote(lotes);
	}
	
	public List<Lote> atualizarProcessamentoLote(String... protocolo){
		List<Lote> lotes = loteServico.criarConsulta().comProtocolos(protocolo).buscar();
		return atualizarProcessamentoLote(lotes);
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
			} catch (ComunicacaoEsocialGovException e) {
				LOGGER.debug(e.getMessage(), e);
			}
		});
		
		return lotesAtualizados;
	}
	
	public void preencherProcessamentoEnviosEvento(List<EnvioEvento> enviosEvento, RetornoProcessamento retornoProcessamento) {
		List<RetornoEvento> listaRetornoEvento = retornoProcessamento.getRetornoLote().getRetornoEvento();
		
		if (!listaRetornoEvento.isEmpty()) {
			enviosEvento.forEach(envioEvento -> {
				RetornoEvento retornoEvento = listaRetornoEvento.stream()
					.filter(re -> re.getIdEvento().equals(envioEvento.getEvento().getIdEvento()))
					.findFirst()
					.get();
				
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
