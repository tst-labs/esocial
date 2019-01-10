package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial.EvtCdBenPrRP;
import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.CdBenPrRP;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenPrRPMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCadastroBeneficioRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_05/evtCdBenPrRP.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenPrRP evtCdBenPrRP = CdBenPrRPMapper.INSTANCE.comoEvtCdBenPrRP((CdBenPrRP) ocorrencia.getDadosOcorrencia());
		evtCdBenPrRP.setId(evento.getIdEvento());
		TIdeEveTrab ideEvento = new TIdeEveTrab();
		preencherConstantes(ideEvento);
		preencherDadosRetificacao(ideEvento, evento.getOcorrencia());
		evtCdBenPrRP.setIdeEvento(ideEvento);
		
		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenPrRP(evtCdBenPrRP);

		return eSocial;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
