package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos;
import br.jus.tst.esocial.esquemas.eventos.pgtos.TIdeEveFopagMensal;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.PgtosMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlPgtos extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtPgtos.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		Pgtos dados = (Pgtos) ocorrencia.getDadosOcorrencia();
		EvtPgtos evtPgtos = PgtosMapper.INSTANCE.comoEvtPgtos(dados);
		evtPgtos.setId(evento.getIdEvento());
		evtPgtos.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtPgtos(evtPgtos);

		return eSocial;
	}

	private TIdeEveFopagMensal gerarIdeEvento(Pgtos dados) {
		TIdeEveFopagMensal ideEvento = new TIdeEveFopagMensal();
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
