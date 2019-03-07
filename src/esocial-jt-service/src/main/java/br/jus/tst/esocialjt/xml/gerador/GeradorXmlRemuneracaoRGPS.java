package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.remun.ESocial;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.RemunMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlRemuneracaoRGPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtRemun.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		Remun dados = (Remun) ocorrencia.getDadosOcorrencia();
		EvtRemun evtRemun = RemunMapper.INSTANCE.comoEvtRemun(dados);
		evtRemun.setId(evento.getIdEvento());
		
		preencherConstantes(evtRemun.getIdeEvento());	
		preencherDadosRetificacao(evtRemun.getIdeEvento(), evento.getOcorrencia());
		
		ESocial eSocial = new ESocial();
		eSocial.setEvtRemun(evtRemun);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
