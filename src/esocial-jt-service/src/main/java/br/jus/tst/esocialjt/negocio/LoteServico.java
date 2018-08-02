package br.jus.tst.esocialjt.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Lote;

@Service
@Transactional
public class LoteServico {

	@Autowired
	private EntityManager em;

	@Autowired
	private EstadoServico estadoServico;

	private final long LIMITE_EVENTOS_LOTE = Constantes.LIMITE_EVENTOS_LOTE;

	
	public Lote atualiza(Lote lote) {
		return em.merge(lote);
	}

	public void atualiza(List<Lote> lotes) {
		lotes.forEach(this::atualiza);
	}

	public void salvar(Lote lote) {
		em.persist(lote);
	}

	public List<Lote> gerarLotes(List<EnvioEvento> enviosEvento) {
		ArrayList<Lote> listaLotes = new ArrayList<>();
		Lote lote;
		if (!enviosEvento.isEmpty()) {
			lote = novoLote();
			listaLotes.add(lote);
			for (EnvioEvento envioEvento : enviosEvento) {
				if (lote.getEnviosEvento().size() >= LIMITE_EVENTOS_LOTE) {
					lote = novoLote();
					listaLotes.add(lote);
				}
				lote.adicionarEnvioEvento(envioEvento);
				envioEvento.setLote(lote);
			}
		}
		return listaLotes;
	}

	private Lote novoLote() {
		Lote lote = new Lote();
		estadoServico.atualizarEstado(lote);
		return atualiza(lote);
	}

	public ConsultaLote criarConsulta() {
		return new ConsultaLote(em);
	}
}
