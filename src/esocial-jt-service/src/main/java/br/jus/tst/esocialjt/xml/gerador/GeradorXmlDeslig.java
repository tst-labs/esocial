package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import br.jus.tst.esocialjt.Constantes;
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
		evtDeslig.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtDeslig(evtDeslig);

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
