package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial;
import br.jus.tst.esocial.esquemas.eventos.totconting.ESocial.EvtTotConting;
import br.jus.tst.esocial.ocorrencia.dados.TotConting;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TotContingMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlSolicitacaoTotalPagamento extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTotConting.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		TotConting dados = (TotConting) ocorrencia.getDadosOcorrencia();
		EvtTotConting evtTotConting = TotContingMapper.INSTANCE.comoEvtTotConting(dados);
		evtTotConting.setId(evento.getIdEvento());
		evtTotConting.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtTotConting(evtTotConting);

		return eSocial;
	}

	private EvtTotConting.IdeEvento gerarIdeEvento(TotConting dados) {
		EvtTotConting.IdeEvento ideEvento = new EvtTotConting.IdeEvento();
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
