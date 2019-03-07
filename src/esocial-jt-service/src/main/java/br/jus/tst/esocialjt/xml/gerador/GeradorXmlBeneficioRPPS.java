package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.BenPrRPMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlBeneficioRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/evtBenPrRP.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		BenPrRP dados = (BenPrRP) ocorrencia.getDadosOcorrencia();
		EvtBenPrRP evtBenPrRP = BenPrRPMapper.INSTANCE.comoEvtBenPrRP(dados);
		evtBenPrRP.setId(evento.getIdEvento());
		preencherConstantes(evtBenPrRP.getIdeEvento());
		preencherDadosRetificacao(evtBenPrRP.getIdeEvento(), evento.getOcorrencia());

		ESocial eSocial = new ESocial();
		eSocial.setEvtBenPrRP(evtBenPrRP);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
