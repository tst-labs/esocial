package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial.EvtReabreEvPer;
import br.jus.tst.esocial.ocorrencia.dados.ReabreEvPer;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ReabreEvPerMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlReaberturaPeriodicos extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtReabreEvPer.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		ReabreEvPer dados = (ReabreEvPer) ocorrencia.getDadosOcorrencia();
		EvtReabreEvPer evtReabreEvPer = ReabreEvPerMapper.INSTANCE.comoEvtReabreEvPer(dados);
		evtReabreEvPer.setId(evento.getIdEvento());
		preencherConstantes(evtReabreEvPer.getIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtReabreEvPer(evtReabreEvPer);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
