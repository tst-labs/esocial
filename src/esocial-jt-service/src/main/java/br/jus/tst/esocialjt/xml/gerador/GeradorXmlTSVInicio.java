package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TSVInicioMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTSVInicio extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTSVInicio.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtTSVInicio evtTSVInicio = TSVInicioMapper.INSTANCE.comoEvtTSVInicio((TSVInicio) ocorrencia.getDadosOcorrencia());
		evtTSVInicio.setId(evento.getIdEvento());
		evtTSVInicio.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtTSVInicio(evtTSVInicio);

		return eSocial;
	}

	private TIdeEveTrab gerarIdeEvento() {
		TIdeEveTrab ideEvento = new TIdeEveTrab();
		ideEvento.setTpAmb(getAmbiente().codigo());
		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
		ideEvento.setIndRetif((byte) 1);
		return ideEvento;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
