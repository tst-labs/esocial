package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.CdBenIn;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenInMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCdBenIn extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCdBenIn.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenIn evtCdBenIn = CdBenInMapper.INSTANCE.comoEvtCdBenIn((CdBenIn) ocorrencia.getDadosOcorrencia());
		evtCdBenIn.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenIn.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenIn(evtCdBenIn);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
