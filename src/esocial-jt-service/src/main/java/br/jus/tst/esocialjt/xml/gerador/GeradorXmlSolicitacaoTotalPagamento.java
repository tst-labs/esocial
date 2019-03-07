package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial;
import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial.EvtTotConting;
import br.jus.tst.esocial.ocorrencia.dados.TotConting;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TotContingMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlSolicitacaoTotalPagamento extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtTotConting.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		TotConting dados = (TotConting) ocorrencia.getDadosOcorrencia();
		EvtTotConting evtTotConting = TotContingMapper.INSTANCE.comoEvtTotConting(dados);
		evtTotConting.setId(evento.getIdEvento());
		preencherConstantes(evtTotConting.getIdeEvento());
		preencherDadosRetificacao(evtTotConting.getIdeEvento(), evento.getOcorrencia());
		
		ESocial eSocial = new ESocial();
		eSocial.setEvtTotConting(evtTotConting);

		return eSocial;
	}
	
	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
