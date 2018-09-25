package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.FechaEvPerMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlFechamentoPeriodicos extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtFechaEvPer.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		FechaEvPer dados = (FechaEvPer) ocorrencia.getDadosOcorrencia();
		EvtFechaEvPer evtFechaEvPer = FechaEvPerMapper.INSTANCE.comoEvtFechaEvPer(dados);
		evtFechaEvPer.setId(evento.getIdEvento());
		evtFechaEvPer.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtFechaEvPer(evtFechaEvPer);

		return eSocial;
	}

	private EvtFechaEvPer.IdeEvento gerarIdeEvento(FechaEvPer dados) {
		EvtFechaEvPer.IdeEvento ideEvento = new EvtFechaEvPer.IdeEvento();
		ideEvento.setTpAmb(getAmbiente().codigo());
		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
		ideEvento.setIndApuracao(dados.getIdeEvento().getIndApuracao());
		ideEvento.setPerApur(dados.getIdeEvento().getPerApur());
		return ideEvento;
		
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
