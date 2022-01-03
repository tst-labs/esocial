package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefIn;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenefInMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCdBenefIn extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCdBenefIn.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenefIn evtCdBenefIn = CdBenefInMapper.INSTANCE.comoEvtCdBenefIn((CdBenefIn) ocorrencia.getDadosOcorrencia());
		evtCdBenefIn.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenefIn.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenefIn(evtCdBenefIn);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
