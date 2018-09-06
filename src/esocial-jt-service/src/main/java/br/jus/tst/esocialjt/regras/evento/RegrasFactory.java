package br.jus.tst.esocialjt.regras.evento;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.exception.RegraException;
import br.jus.tst.esocialjt.regras.Regra;

@Component
public class RegrasFactory {

	@Autowired
	private RegraInformacoesEmpregador regraInformacoesEmpregador;

	@Autowired
	private RegraTabelaEstabelecimento regraTabelaEstabelecimento;

	@Autowired
	private RegraTabelaLotacao regraTabelaLotacao;

	@Autowired
	private RegraTabelaCargo regraTabelaCargo;

	@Autowired
	private RegraTabelaCarreira regraTabelaCarreira;

	@Autowired
	private RegraTabelaFuncao regraTabelaFuncao;

	@Autowired
	private RegraTabelaAmbiente regraTabelaAmbiente;

	@Autowired
	private RegraTabelaProcesso regraTabelaProcesso;

	@Autowired
	private RegraAdmissao regraAdmissao;

	@Autowired
	private RegraTabelaRubrica regraTabelaRubrica;
	
	@Autowired
	private RegraTabelaHorario regraTabelaHorario;

	private Map<Long, Regra> regras;

	public Regra getRegra(EventoDTO eventoDTO) {
		Regra regra = getRegras().get(eventoDTO.getCodTipoEvento());
		if (regra == null) {
			throw new RegraException(eventoDTO, "Não foi possível encontrar a regra para o evento");
		}
		return regra;
	}

	private Map<Long, Regra> getRegras() {
		if (regras == null) {
			regras = new HashMap<>();
			regras.put(TipoEvento.S1000.getCodTipo(), regraInformacoesEmpregador);
			regras.put(TipoEvento.S1005.getCodTipo(), regraTabelaEstabelecimento);
			regras.put(TipoEvento.S1010.getCodTipo(), regraTabelaRubrica);
			regras.put(TipoEvento.S1020.getCodTipo(), regraTabelaLotacao);
			regras.put(TipoEvento.S1030.getCodTipo(), regraTabelaCargo);
			regras.put(TipoEvento.S1035.getCodTipo(), regraTabelaCarreira);
			regras.put(TipoEvento.S1040.getCodTipo(), regraTabelaFuncao);
			regras.put(TipoEvento.S1050.getCodTipo(), regraTabelaHorario);
			regras.put(TipoEvento.S1060.getCodTipo(), regraTabelaAmbiente);
			regras.put(TipoEvento.S1070.getCodTipo(), regraTabelaProcesso);
			regras.put(TipoEvento.S2200.getCodTipo(), regraAdmissao);
		}
		return regras;
	}
}
