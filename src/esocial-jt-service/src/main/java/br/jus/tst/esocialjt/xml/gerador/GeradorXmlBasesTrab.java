package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.basestrab.ESocial;
import br.jus.tst.esocial.esquemas.eventos.basestrab.ESocial.EvtBasesTrab;
import br.jus.tst.esocial.ocorrencia.dados.BasesTrab;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.BasesTrabMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlBasesTrab extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtBasesTrab.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		BasesTrab dados = (BasesTrab) ocorrencia.getDadosOcorrencia();
		EvtBasesTrab evtBasesTrab = BasesTrabMapper.INSTANCE.comoEvtBasesTrab(dados);
		evtBasesTrab.setId(evento.getIdEvento());
		evtBasesTrab.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtBasesTrab(evtBasesTrab);

		return eSocial;
	}

	private EvtBasesTrab.IdeEvento gerarIdeEvento(BasesTrab dados) {
		EvtBasesTrab.IdeEvento ideEvento = new EvtBasesTrab.IdeEvento();
		ideEvento.setNrRecArqBase(dados.getIdeEvento().getNrRecArqBase());
		ideEvento.setIndApuracao(dados.getIdeEvento().getIndApuracao());
		ideEvento.setPerApur(dados.getIdeEvento().getPerApur());
		return ideEvento;
		
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
