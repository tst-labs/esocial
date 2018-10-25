package br.jus.tst.esocialjt.negocio;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.dominio.EventoTotalizador;

@Service
public class EventoTotalizadorServico {

	@Autowired
	private EntityManager em;

	@Transactional
	public void salvar(EventoTotalizador eventoTotalizador) {
		em.flush();
		em.persist(eventoTotalizador);
	}

}
