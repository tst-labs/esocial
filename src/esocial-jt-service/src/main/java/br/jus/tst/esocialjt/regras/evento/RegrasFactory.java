package br.jus.tst.esocialjt.regras.evento;

import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.evento.EventoDTO;
import br.jus.tst.esocialjt.negocio.exception.RegraException;
import br.jus.tst.esocialjt.regras.Regra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RegrasFactory {

	@Autowired
	private RegraInformacoesEmpregador regraInformacoesEmpregador;

	@Autowired
	private RegraTabelaEstabelecimento regraTabelaEstabelecimento;

	@Autowired
	private RegraTabelaRubrica regraTabelaRubrica;

	@Autowired
	private RegraTabelaLotacao regraTabelaLotacao;

	@Autowired
	private RegraTabelaProcesso regraTabelaProcesso;

	@Autowired
	private RegraAdmissao regraAdmissao;
	
	@Autowired
	private RegraCessao regraCessao;

	@Autowired
	private RegraAltCadastral regraAltCadastral;

	@Autowired
	private RegraAltContratual regraAltContratual;

	@Autowired
	private RegraAfastTemp regraAfastTemp;
	
	@Autowired
	private RegraReintegracao regraReintegracao;
	
	@Autowired
	private RegraDesligamento regraDesligamento;
	
	@Autowired
	private RegraTSVInicio regraTSVInicio;

	@Autowired
	private RegraTSVAltContr regraTSVAltContr;

	@Autowired
	private RegraTSVTermino regraTSVTermino;
	
	@Autowired
	private RegraRemuneracaoRGPS regraRemuneracaoRGPS;
	
	@Autowired
	private RegraRemuneracaoRPPS regraRemuneracaoRPPS;
	
	@Autowired
	private RegraBeneficioRPPS regraBeneficioRPPS;

	@Autowired
	private RegraPgtos regraPgtos;

	@Autowired
	private RegraReaberturaPeriodicos regraReaberturaPeriodicos;

	@Autowired
	private RegraFechamentoPeriodicos regraFechamentoPeriodicos;

	@Autowired
	private RegraExclusao regraExclusao;

	@Autowired
	private RegraCdBenefIn regraCdBenefIn;
	
	@Autowired
	private RegraCdBenefAlt regraCdBenefAlt;

	@Autowired
	private RegraCdBenIn regraCdBenIn;

	@Autowired
	private RegraCdBenAlt regraCdBenAlt;

	@Autowired
	private RegraCdBenTerm regraCdBenTerm;

	@Autowired
	private RegraReativBen regraReativBen;

	@Autowired
	private RegraExpRisco regraExpRisco;

	@Autowired
	private RegraCAT regraCAT;

	@Autowired
	private RegraMonit regraMonit;

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
			regras.put(TipoEvento.S1070.getCodTipo(), regraTabelaProcesso);
			regras.put(TipoEvento.S2200.getCodTipo(), regraAdmissao);
			regras.put(TipoEvento.S2205.getCodTipo(), regraAltCadastral);
			regras.put(TipoEvento.S2206.getCodTipo(), regraAltContratual);
			regras.put(TipoEvento.S2210.getCodTipo(), regraCAT);
			regras.put(TipoEvento.S2220.getCodTipo(), regraMonit);
			regras.put(TipoEvento.S2230.getCodTipo(), regraAfastTemp);
			regras.put(TipoEvento.S2231.getCodTipo(), regraCessao);
			regras.put(TipoEvento.S2240.getCodTipo(), regraExpRisco);
			regras.put(TipoEvento.S2298.getCodTipo(), regraReintegracao);
			regras.put(TipoEvento.S2299.getCodTipo(), regraDesligamento);
			regras.put(TipoEvento.S2300.getCodTipo(), regraTSVInicio);
			regras.put(TipoEvento.S2306.getCodTipo(), regraTSVAltContr);
			regras.put(TipoEvento.S2399.getCodTipo(), regraTSVTermino);
			regras.put(TipoEvento.S2400.getCodTipo(), regraCdBenefIn);
			regras.put(TipoEvento.S2405.getCodTipo(), regraCdBenefAlt);
			regras.put(TipoEvento.S2410.getCodTipo(), regraCdBenIn);
			regras.put(TipoEvento.S2416.getCodTipo(), regraCdBenAlt);
			regras.put(TipoEvento.S2418.getCodTipo(), regraReativBen);
			regras.put(TipoEvento.S2420.getCodTipo(), regraCdBenTerm);
			regras.put(TipoEvento.S1200.getCodTipo(), regraRemuneracaoRGPS);
			regras.put(TipoEvento.S1202.getCodTipo(), regraRemuneracaoRPPS);
			regras.put(TipoEvento.S1207.getCodTipo(), regraBeneficioRPPS);
			regras.put(TipoEvento.S1210.getCodTipo(), regraPgtos);
			regras.put(TipoEvento.S1298.getCodTipo(), regraReaberturaPeriodicos);
			regras.put(TipoEvento.S1299.getCodTipo(), regraFechamentoPeriodicos);
			regras.put(TipoEvento.S3000.getCodTipo(), regraExclusao);
		}
		return regras;
	}
}
