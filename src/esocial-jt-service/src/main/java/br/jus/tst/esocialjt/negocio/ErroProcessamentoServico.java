package br.jus.tst.esocialjt.negocio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.comunicacaogov.RetornoErroProcessamento;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.ErroProcessamento;
import br.jus.tst.esocialjt.dominio.TipoErroProcessamento;

@Service
public class ErroProcessamentoServico {

	@Autowired
	EntityManager em;

	@Autowired
	TipoErroProcessamentoServico tipoErroProcessamentoServico;

	public ErroProcessamento recuperaPorId(long id) {
		return em.find(ErroProcessamento.class, id);
	}

	public List<ErroProcessamento> recuperaTodos() {
		TypedQuery<ErroProcessamento> query = em.createNamedQuery("ErroProcessamento.findAll", ErroProcessamento.class);
		return query.getResultList();
	}

	public Set<ErroProcessamento> retornaErroProcessamento(List<RetornoErroProcessamento> retornoErrosProcessamento,
			EnvioEvento envioEvento) {
		Set<ErroProcessamento> errosProcessamento = new HashSet<>();
		
		retornoErrosProcessamento.forEach(rep -> {
			ErroProcessamento erroProcessamento = new ErroProcessamento()
				.setLoacalizacao(rep.getLocalizacao())
				.setCodMensagem((long) rep.getCodigo())
				.setDescricao(rep.getDescricao())
				.setTipoErroProcessamento(new TipoErroProcessamento((long) rep.getTipo()))
				.setEnvioEvento(envioEvento);

			errosProcessamento.add(erroProcessamento);
		});

		return errosProcessamento;
	}
}
