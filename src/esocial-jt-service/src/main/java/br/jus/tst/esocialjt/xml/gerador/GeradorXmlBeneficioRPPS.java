package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP;
import br.jus.tst.esocial.esquemas.eventos.benprrp.TIdeEveFopag;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.BenPrRPMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlBeneficioRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtBenPrRP.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		BenPrRP dados = (BenPrRP) ocorrencia.getDadosOcorrencia();
		EvtBenPrRP evtBenPrRP = BenPrRPMapper.INSTANCE.comoEvtBenPrRP(dados);
		evtBenPrRP.setId(evento.getIdEvento());
		evtBenPrRP.setIdeEvento(gerarIdeEvento(dados));

		ESocial eSocial = new ESocial();
		eSocial.setEvtBenPrRP(evtBenPrRP);

		return eSocial;
	}

	private TIdeEveFopag gerarIdeEvento(BenPrRP dados) {
		TIdeEveFopag ideEvento = new TIdeEveFopag();
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
