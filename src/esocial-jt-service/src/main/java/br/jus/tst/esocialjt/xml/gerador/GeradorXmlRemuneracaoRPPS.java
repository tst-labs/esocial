package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.RmnRPPSMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlRemuneracaoRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtRmnRPPS.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		RmnRPPS dados = (RmnRPPS) ocorrencia.getDadosOcorrencia();
		EvtRmnRPPS evtRmnRPPS = RmnRPPSMapper.INSTANCE.comoEvtRmnRPPS(dados);
		evtRmnRPPS.setId(evento.getIdEvento());

		preencherConstantes(evtRmnRPPS.getIdeEvento());
		preencherDadosRetificacao(evtRmnRPPS.getIdeEvento(), evento.getOcorrencia());

		ESocial eSocial = new ESocial();
		eSocial.setEvtRmnRPPS(evtRmnRPPS);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
