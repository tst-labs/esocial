package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.FechaEvPerMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import org.springframework.stereotype.Component;

@Component
public class GeradorXmlFechamentoPeriodicos extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtFechaEvPer.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		FechaEvPer dados = (FechaEvPer) ocorrencia.getDadosOcorrencia();
		EvtFechaEvPer evtFechaEvPer = FechaEvPerMapper.INSTANCE.comoEvtFechaEvPer(dados);
		evtFechaEvPer.setId(evento.getIdEvento());
		preencherConstantes(evtFechaEvPer.getIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtFechaEvPer(evtFechaEvPer);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
