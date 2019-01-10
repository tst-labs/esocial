package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.AfastTempMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlAfastTemp extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_05/evtAfastTemp.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtAfastTemp evtAfastTemp = AfastTempMapper.INSTANCE.comoEvtAfastTemp((AfastTemp) ocorrencia.getDadosOcorrencia());
		evtAfastTemp.setId(evento.getIdEvento());
		TIdeEveTrab ideEvento = new TIdeEveTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtAfastTemp.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtAfastTemp(evtAfastTemp);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
