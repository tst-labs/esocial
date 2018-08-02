package br.jus.tst.esocialjt.negocio;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.comunicacaogov.RetornoEnvio;
import br.jus.tst.esocialjt.dominio.CodigoResposta;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import br.jus.tst.esocialjt.xml.GeradorLote;
import br.jus.tst.esocialjt.xml.gerador.GeradorXml;
import br.jus.tst.esocialjt.xml.gerador.GeradorXmlFactory;

@Service
@Transactional
public class EnvioServico {

	private static final Logger LOGGER = LoggerFactory.getLogger(EnvioServico.class);
	
	@Autowired
	private GeradorXmlFactory geradorXmlFactory;

	@Autowired
	private GeradorLote geradorLote;

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@Autowired
	private LoteServico loteServico;
	
	@Autowired
	private EntityManager em;
	
	@Autowired
	private EstadoServico estadoServico;
	
	@Autowired
	private CodigoRespostaServico codigoRespostaServico;
	
	public List<EnvioEvento> enviarEventosParaESocialGov(List<Evento> eventos) {
		List<EnvioEvento> enviosEvento = gerarEnviosEvento(eventos);
		enviosEvento = gerarXmls(enviosEvento);
		List<EnvioEvento> enviosEventosValidos = getEventosValidos(enviosEvento);
		List<Lote> listaLotes = loteServico.gerarLotes(enviosEventosValidos);
		enviarLotes(listaLotes);
		
		eventos.forEach(evento -> estadoServico.atualizarEstado(evento));
		listaLotes.forEach(lote -> estadoServico.atualizarEstado(lote));
		
		return atualizar(enviosEvento);
	}
	
	private void enviarLotes(List<Lote> listaLotes) {
		listaLotes.forEach(lote -> {
			try {
				String xmlLote = geradorLote.gerarXmlLote(lote);
				lote.setXmlLote(xmlLote);
				RetornoEnvio retorno = comunicacaoEsocialGov.enviarLoteEventos(xmlLote);
				preencherDadosEnvioLote(lote, retorno);		
			} catch (GeracaoXmlException | ComunicacaoEsocialGovException e) {
				lote.setErroInterno(e.getMessage());
				LOGGER.debug(e.getMessage(), e);
			}
		});
	}
	
	public EnvioEvento atualizar(EnvioEvento envioEvento) {
		return em.merge(envioEvento);
	}

	public List<EnvioEvento> atualizar(List<EnvioEvento> enviosEvento) {
		return enviosEvento.stream()
					.map(this::atualizar)
					.collect(Collectors.toList());
	}
	
	private List<EnvioEvento> getEventosValidos(List<EnvioEvento> enviosEvento) {
		return enviosEvento.stream()
			.filter(ee -> StringUtils.isNotEmpty(ee.getXmlEvento()))
			.collect(Collectors.toList());
	}
	
	private List<EnvioEvento> gerarEnviosEvento(List<Evento> eventos){
		Date agora = new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		return eventos.stream()
		 	.map(evento -> {
		 		EnvioEvento envioEvento = new EnvioEvento();
		 		envioEvento.setEvento(evento);
		 		envioEvento.setDtaGeracaoEvento(agora);	 		
		 		evento.adicionarEnvioEvento(envioEvento);		 		
		 		return envioEvento;
		 	})
		 	.collect(Collectors.toList());
	}

	private List<EnvioEvento> gerarXmls(List<EnvioEvento> enviosEventos) {
		enviosEventos.forEach(envioEvento -> {
			try {
				Evento evento = envioEvento.getEvento();
				GeradorXml gerador = geradorXmlFactory.getGerador(evento);
				envioEvento.setVersao(gerador.getVersao());
				envioEvento.setXmlEvento(gerador.gerarXml(evento));
			} catch (GeracaoXmlException e) {
				envioEvento.setErroInterno(e.getMessage());
				LOGGER.debug(e.getMessage(), e);
			}
		});
		return enviosEventos;
	}
	
	public Lote preencherDadosEnvioLote(Lote lote, RetornoEnvio retorno) {
		lote.setDtaEnvio(new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
		lote.setProtocolo(retorno.getProtocolo());
		CodigoResposta codigoResposta = codigoRespostaServico.obterCodigoResposta(
				new CodigoResposta(CodigoResposta.RESPOSTA_GOV_LOTE, retorno.getCodigoResposta(), retorno.getDescricaoResposta()));
		lote.setResposta(codigoResposta);
		lote.setRetorno(retorno.getXmlRetorno());
		
		return lote;
	}
}
