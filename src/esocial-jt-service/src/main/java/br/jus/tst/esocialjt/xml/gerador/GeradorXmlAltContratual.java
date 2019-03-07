package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.AltContratualMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlAltContratual extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtAltContratual.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtAltContratual evtAltContratual = AltContratualMapper.INSTANCE.comoEvtAltContratual((AltContratual) ocorrencia.getDadosOcorrencia());
		evtAltContratual.setId(evento.getIdEvento());
		TIdeEveTrab ideEvento = new TIdeEveTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtAltContratual.setIdeEvento(ideEvento);
		
		ESocial eSocial = new ESocial();
		eSocial. setEvtAltContratual(evtAltContratual);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
