package br.jus.tst.esocialjt.negocio;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.dominio.CodigoResposta;

@Service
public class TipoRetornoServico {

	@Autowired
	EntityManager em;

	public CodigoResposta recuperaPorId(long cdResposta) {
		return em.find(CodigoResposta.class, cdResposta);
	}

}
