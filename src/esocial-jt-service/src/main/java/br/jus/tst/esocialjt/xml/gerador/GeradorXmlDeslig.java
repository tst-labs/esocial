package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.DesligMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlDeslig extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtDeslig.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtDeslig evtDeslig = DesligMapper.INSTANCE.comoEvtDeslig((Deslig) ocorrencia.getDadosOcorrencia());
		evtDeslig.setId(evento.getIdEvento());
		preencherConstantes(evtDeslig.getIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtDeslig(evtDeslig);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
