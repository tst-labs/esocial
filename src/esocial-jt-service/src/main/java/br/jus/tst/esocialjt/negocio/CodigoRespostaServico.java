package br.jus.tst.esocialjt.negocio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.jus.tst.esocialjt.dominio.CodigoResposta;

@Service
@Transactional
public class CodigoRespostaServico {

	@Autowired
	EntityManager em;

	/**
	 * Método para pesquisar na base de dados o código de resposta
	 * <b>codGrupoResposta :</b> </br>
	 * 1 -> LOTE </br>
	 * 2 -> EVENTO </br>
	 * 
	 * @param codResposta
	 * @param codGrupoResposta
	 * @return CodigoResposta
	 */
	public List<CodigoResposta> obterCodigoResposta(Long codResposta, int codGrupoResposta) {
		TypedQuery<CodigoResposta> query = em.createNamedQuery("CodigoRetorno.obterResposta", CodigoResposta.class);
		query.setParameter("codResposta", codResposta);
		query.setParameter("codGrupoResposta", codGrupoResposta);
		return query.getResultList();
	}

	/**
	 * Quando não encontrar o código de resposta na base de dados o método vai incluir
	 * um novo.
	 * 
	 * @param codigoResposta
	 * @return CodigoResposta
	 */
	public CodigoResposta obterCodigoResposta(CodigoResposta codigoResposta) {
		List<CodigoResposta> listaCodigoResposta = obterCodigoResposta(codigoResposta.getCodResposta(),
				codigoResposta.getCodGrupoResposta());

		if (listaCodigoResposta.isEmpty()) {
			codigoResposta = new CodigoResposta(codigoResposta.getCodGrupoResposta(), codigoResposta.getCodResposta(),
					codigoResposta.getDesResposta());
			salvar(codigoResposta);
		} else {
			codigoResposta = listaCodigoResposta.get(0);
		}

		return codigoResposta;
	}

	public CodigoResposta salvar(CodigoResposta codigoRetorno) {
		em.persist(codigoRetorno);
		return codigoRetorno;
	}

}
