package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.AltContratualMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlAltContratual extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtAltContratual.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtAltContratual evtAltContratual = AltContratualMapper.INSTANCE.comoEvtAltContratual((AltContratual) ocorrencia.getDadosOcorrencia());
		evtAltContratual.setId(evento.getIdEvento());
		evtAltContratual.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial. setEvtAltContratual(evtAltContratual);

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
