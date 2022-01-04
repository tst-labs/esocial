package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial.EvtCdBenTerm;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.CdBenTerm;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenTermMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCdBenTerm extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtCdBenTerm.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenTerm evtCdBenTerm = CdBenTermMapper.INSTANCE.comoEvtCdBenTerm((CdBenTerm) ocorrencia.getDadosOcorrencia());
		evtCdBenTerm.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenTerm.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenTerm(evtCdBenTerm);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
