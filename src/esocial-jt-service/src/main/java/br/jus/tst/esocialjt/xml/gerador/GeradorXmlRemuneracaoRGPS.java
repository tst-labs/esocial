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

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtRemun.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtRemun evtRemun = RemunMapper.INSTANCE.comoEvtRemun((Remun) ocorrencia.getDadosOcorrencia());
		evtRemun.setId(evento.getIdEvento());
//		evtRemun.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtRemun(evtRemun);

		return eSocial;
	}

//	private IdeEvento gerarIdeEvento() {
//		IdeEvento ideEvento = new IdeEvento();
//		ideEvento.setTpAmb(getAmbiente().codigo());
//		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
//		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
//		ideEvento.setIndRetif((byte) 1);
//		//FIXME IdeEvento nos eventos de pagamento não são do tipo TIdeEveTrab, aparentemente os campos abaixo precisam ser tratados no domínio
//		ideEvento.setIndApuracao((byte) 1);
//		ideEvento.setPerApur("2018-09");
//		return ideEvento;
//		
//	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
