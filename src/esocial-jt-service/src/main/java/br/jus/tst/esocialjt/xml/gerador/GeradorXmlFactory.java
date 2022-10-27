package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GeradorXmlFactory {
	@Autowired
	private GeradorXmlInformacaoEmpregador geradorXmlInformacaoEmpregador;

	@Autowired
	private GeradorXmlTabelaEstabelecimento geradorXmlTabelaEstabelecimento;

	@Autowired
	private GeradorXmlTabelaRubrica geradorXmlTabelaRubrica;

	@Autowired
	private GeradorXmlTabelaLotacao geradorXmlTabelaLotacao;

	@Autowired
	private GeradorXmlTabelaProcesso geradorXmlTabelaProcesso;

	@Autowired
	private GeradorXmlAdmissao geradorXmlAdmissao;
	
	@Autowired
	private GeradorXmlCessao geradorXmlCessao;

	@Autowired
	private GeradorXmlAltCadastral geradorXmlAltCadastral;

	@Autowired
	private GeradorXmlAltContratual geradorXmlAltContratual;
	
	@Autowired
	private GeradorXmlAfastTemp geradorXmlAfastTemp;
	
	@Autowired
	private GeradorXmlReintegr geradorXmlReintegr;

	@Autowired
	private GeradorXmlDeslig geradorXmlDeslig;
	
	@Autowired
	private GeradorXmlTSVInicio geradorXmlTSVInicio;

	@Autowired
	private GeradorXmlTSVAltContr geradorXmlTSVAltContr;
	
	@Autowired
	private GeradorXmlTSVTermino geradorXmlTSVTermino;

	@Autowired
	private GeradorXmlRemuneracaoRGPS geradorXmlRemuneracaoRGPS;

	@Autowired
	private GeradorXmlRemuneracaoRPPS geradorXmlRemuneracaoRPPS;

	@Autowired
	private GeradorXmlBeneficioRPPS geradorXmlBeneficioRPPS;
	
	@Autowired
	private GeradorXmlPgtos geradorXmlPgtos;
	
	@Autowired
	private GeradorXmlReaberturaPeriodicos geradorXmlReaberturaPeriodicos;
	
	@Autowired
	private GeradorXmlFechamentoPeriodicos geradorXmlFechamentoPeriodicos;

	@Autowired
	private GeradorXmlExclusao geradorXmlExclusao;

	@Autowired
	private GeradorXmlCdBenefIn geradorXmlCdBenefIn;
	
	@Autowired
	private GeradorXmlCdBenefAlt geradorXmlCdBenefAlt;
	
	@Autowired
	private GeradorXmlCdBenIn geradorXmlCdBenIn;

	@Autowired
	private GeradorXmlCdBenAlt geradorXmlCdBenAlt;

	@Autowired
	private GeradorXmlCdBenTerm geradorXmlCdBenTerm;

	@Autowired
	private GeradorXmlReativBen geradorXmlReativBen;

	@Autowired
	private GeradorXmlExpRisco geradorXmlExpRisco;

	@Autowired
	private GeradorXmlCat geradorXmlCat;

	@Autowired
	private GeradorXmlMonit geradorXmlMonit;

	private Map<TipoEvento, GeradorXml> geradores;

	public GeradorXml getGerador(Evento evento) throws GeracaoXmlException {
		GeradorXml geradorXml = getGeradores().get(evento.getTipoEvento());
		if (geradorXml == null) {
			throw new GeracaoXmlException(evento, "Não foi possível encontrar um gerador de XML para o evento");
		}
		return geradorXml;
	}

	private Map<TipoEvento, GeradorXml> getGeradores() {
		if (geradores == null) {
			geradores = new HashMap<>();
			geradores.put(TipoEvento.S1000, geradorXmlInformacaoEmpregador);
			geradores.put(TipoEvento.S1005, geradorXmlTabelaEstabelecimento);
			geradores.put(TipoEvento.S1010, geradorXmlTabelaRubrica);
			geradores.put(TipoEvento.S1020, geradorXmlTabelaLotacao);
			geradores.put(TipoEvento.S1070, geradorXmlTabelaProcesso);
			geradores.put(TipoEvento.S2200, geradorXmlAdmissao);
			geradores.put(TipoEvento.S2205, geradorXmlAltCadastral);
			geradores.put(TipoEvento.S2206, geradorXmlAltContratual);
			geradores.put(TipoEvento.S2210, geradorXmlCat);
			geradores.put(TipoEvento.S2220, geradorXmlMonit);
			geradores.put(TipoEvento.S2230, geradorXmlAfastTemp);
			geradores.put(TipoEvento.S2231, geradorXmlCessao);
			geradores.put(TipoEvento.S2240, geradorXmlExpRisco);
			geradores.put(TipoEvento.S2298, geradorXmlReintegr);
			geradores.put(TipoEvento.S2299, geradorXmlDeslig);
			geradores.put(TipoEvento.S2300, geradorXmlTSVInicio);
			geradores.put(TipoEvento.S2306, geradorXmlTSVAltContr);
			geradores.put(TipoEvento.S2399, geradorXmlTSVTermino);
			geradores.put(TipoEvento.S2400, geradorXmlCdBenefIn);
			geradores.put(TipoEvento.S2405, geradorXmlCdBenefAlt);
			geradores.put(TipoEvento.S2410, geradorXmlCdBenIn);
			geradores.put(TipoEvento.S2416, geradorXmlCdBenAlt);
			geradores.put(TipoEvento.S2418, geradorXmlReativBen);
			geradores.put(TipoEvento.S2420, geradorXmlCdBenTerm);
			geradores.put(TipoEvento.S1200, geradorXmlRemuneracaoRGPS);
			geradores.put(TipoEvento.S1202, geradorXmlRemuneracaoRPPS);
			geradores.put(TipoEvento.S1207, geradorXmlBeneficioRPPS);
			geradores.put(TipoEvento.S1210, geradorXmlPgtos);
			geradores.put(TipoEvento.S1298, geradorXmlReaberturaPeriodicos);
			geradores.put(TipoEvento.S1299, geradorXmlFechamentoPeriodicos);
			geradores.put(TipoEvento.S3000, geradorXmlExclusao);
		}
		return geradores;
	}

}
