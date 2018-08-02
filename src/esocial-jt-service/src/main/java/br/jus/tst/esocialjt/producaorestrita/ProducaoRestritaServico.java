package br.jus.tst.esocialjt.producaorestrita;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.negocio.TipoEventoServico;

@Service
@Transactional
public class ProducaoRestritaServico {

	@Autowired
	private Modelo modelo;

	@Autowired
	private EventoServico eventoServico;

	@Autowired
	private EnvioServico envioServico;
	
	@Autowired
	private TipoEventoServico tipoEventoServico;

	@Autowired
	private EntityManager em;

	public Evento limparProducaoRestrita(String cnpj, TipoAmbiente ambiente) {
		verificarAmbiente(ambiente);

		Evento evento = gerarEventoLimparProducaoRestrita(cnpj);
		List<EnvioEvento> enviosEvento = envioServico.enviarEventosParaESocialGov(Arrays.asList(evento));
		verificarResposta(enviosEvento);
		apagarRegistrosLocais(ambiente);

		return enviosEvento.get(0).getEvento();
	}

	protected Evento gerarEventoLimparProducaoRestrita(String cnpj) {
		InformacoesEmpregador dados = modelo.obterDadosLimparProducaoRestrita(cnpj);

		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia
			.setTipoOcorrencia(TipoOcorrencia.INFORMACOES_EMPREGADOR)
			.setDadosOcorrencia(dados)
			.setOperacao(Operacao.INCLUSAO)
			.setReferencia(cnpj);

		TipoEvento tipoEvento = tipoEventoServico.obterTipoEventoEsocial(TipoOcorrencia.INFORMACOES_EMPREGADOR);
		Evento evento = eventoServico.gerarEvento(ocorrencia, tipoEvento);
		
		return evento;
	}

	protected void verificarAmbiente(TipoAmbiente ambiente) {
		if (ambiente != TipoAmbiente.PRODUCAO_RESTRITA) {
			throw new ProducaoRestritaException(
					"A limpeza somente pode ser feita em PRODUÇÃO RESTRITA. Ambiente atual: " + ambiente);
		}
	}

	
	protected void apagarRegistrosLocais(TipoAmbiente ambiente) {
		verificarAmbiente(ambiente);

		Query q1 = em.createQuery("DELETE FROM ErroProcessamento");
		Query q2 = em.createQuery("DELETE FROM EnvioEvento");
		Query q3 = em.createQuery("DELETE FROM Evento");
		Query q4 = em.createQuery("DELETE FROM Ocorrencia");
		Query q5 = em.createQuery("DELETE FROM Lote");

		q1.executeUpdate();
		q2.executeUpdate();
		q3.executeUpdate();
		q4.executeUpdate();
		q5.executeUpdate();
	}

	private void verificarResposta(List<EnvioEvento> enviosEvento) {
		Lote loteEnviado = enviosEvento.stream()
				.findFirst()
				.map(EnvioEvento::getLote)
				.orElseThrow(() -> new ProducaoRestritaException("Não foi possível enviar o evento para o eSocial"));
		
		if(StringUtils.isNotEmpty(loteEnviado.getErroInterno())){
			throw new ProducaoRestritaException(loteEnviado.getErroInterno());
		}
		
		Long codResposta = loteEnviado.getResposta().getId();
		if (codResposta <= 200 || codResposta > 300) {
			new ProducaoRestritaException("O eSocial retornou com status " + codResposta);
		}
	}
}
