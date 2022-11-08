package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.comunicacaogov.RetornoErroProcessamento;
import br.jus.tst.esocialjt.comunicacaogov.RetornoLote;
import br.jus.tst.esocialjt.dominio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ErroProcessamentoServico {

	@Autowired
	EntityManager em;

	@Autowired
	TipoErroProcessamentoServico tipoErroProcessamentoServico;

	public void preencheErrosDiversosLote(Lote lote, RetornoLote retornoLote, Estado loteEstado) {
		if (loteEstado != Estado.PROCESSAMENTO) {
			lote.getEnviosEvento()
					.stream()
					.filter(e -> e.getEvento().getEstado() == Estado.PROCESSAMENTO)
					.forEach(e -> {
						if (loteEstado == Estado.ERRO || loteEstado == Estado.PROCESSADO_COM_ERRO) {
							e.setErroInterno(retornoLote.getDescricaoRespostaProcessamento());
						}
						e.getEvento().setEstado(loteEstado);
					});
		}
	}

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
