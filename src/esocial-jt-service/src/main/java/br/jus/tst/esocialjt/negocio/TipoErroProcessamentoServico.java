package br.jus.tst.esocialjt.negocio;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.TipoErroProcessamento;

@Service
public class TipoErroProcessamentoServico {

	@Autowired
	EntityManager em;

	public TipoErroProcessamento recuperaPorId(long id) {
		return em.find(TipoErroProcessamento.class, id);
	}

}
