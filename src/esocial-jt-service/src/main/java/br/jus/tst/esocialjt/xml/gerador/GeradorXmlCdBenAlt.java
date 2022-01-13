package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.CdBenAlt;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenAltMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCdBenAlt extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCdBenAlt.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenAlt evtCdBenAlt = CdBenAltMapper.INSTANCE.comoEvtCdBenAlt((CdBenAlt) ocorrencia.getDadosOcorrencia());
		evtCdBenAlt.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenAlt.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenAlt(evtCdBenAlt);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
