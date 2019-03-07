package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.PgtosMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlPgtos extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtPgtos.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		Pgtos dados = (Pgtos) ocorrencia.getDadosOcorrencia();
		EvtPgtos evtPgtos = PgtosMapper.INSTANCE.comoEvtPgtos(dados);
		evtPgtos.setId(evento.getIdEvento());
		preencherConstantes(evtPgtos.getIdeEvento());
		preencherDadosRetificacao(evtPgtos.getIdeEvento(), evento.getOcorrencia());
		
		ESocial eSocial = new ESocial();
		eSocial.setEvtPgtos(evtPgtos);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
