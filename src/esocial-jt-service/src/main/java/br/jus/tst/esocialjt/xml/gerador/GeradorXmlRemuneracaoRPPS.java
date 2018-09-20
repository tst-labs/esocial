package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TIdeEveFopag;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.RmnRPPSMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlRemuneracaoRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtRmnRPPS.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		RmnRPPS dados = (RmnRPPS) ocorrencia.getDadosOcorrencia();
		EvtRmnRPPS evtRmnRPPS = RmnRPPSMapper.INSTANCE.comoEvtRmnRPPS(dados);
		evtRmnRPPS.setId(evento.getIdEvento());
		evtRmnRPPS.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtRmnRPPS(evtRmnRPPS);

		return eSocial;
	}

	private TIdeEveFopag gerarIdeEvento(RmnRPPS dados) {
		TIdeEveFopag ideEvento = new TIdeEveFopag();
		ideEvento.setTpAmb(getAmbiente().codigo());
		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
		ideEvento.setIndRetif((byte) 1);
		ideEvento.setIndApuracao(dados.getIdeEvento().getIndApuracao());
		ideEvento.setPerApur(dados.getIdeEvento().getPerApur());
		return ideEvento;
		
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
