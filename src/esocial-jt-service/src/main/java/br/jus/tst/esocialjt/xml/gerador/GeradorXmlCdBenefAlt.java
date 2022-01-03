package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefAlt;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenefAltMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCdBenefAlt extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCdBenefAlt.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenefAlt evtCdBenefAlt = CdBenefAltMapper.INSTANCE.comoEvtCdBenefAlt((CdBenefAlt) ocorrencia.getDadosOcorrencia());
		evtCdBenefAlt.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenefAlt.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenefAlt(evtCdBenefAlt);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
