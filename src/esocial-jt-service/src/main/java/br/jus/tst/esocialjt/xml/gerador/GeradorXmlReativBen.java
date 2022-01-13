package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.reativben.ESocial;
import br.jus.tst.esocial.esquemas.eventos.reativben.ESocial.EvtReativBen;
import br.jus.tst.esocial.esquemas.eventos.reativben.TIdeEventoTrabPJ;
import br.jus.tst.esocial.ocorrencia.dados.ReativBen;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ReativBenMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlReativBen extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtReativBen.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtReativBen evtReativBen = ReativBenMapper.INSTANCE.comoEvtReativBen((ReativBen) ocorrencia.getDadosOcorrencia());
		evtReativBen.setId(evento.getIdEvento());
		TIdeEventoTrabPJ ideEvento = new TIdeEventoTrabPJ();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtReativBen.setIdeEvento(ideEvento);

		ESocial eSocial = new ESocial();
		eSocial.setEvtReativBen(evtReativBen);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
