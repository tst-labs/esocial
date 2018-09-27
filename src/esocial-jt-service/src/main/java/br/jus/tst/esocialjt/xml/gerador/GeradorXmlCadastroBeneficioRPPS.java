package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial;
import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.ESocial.EvtCdBenPrRP;
import br.jus.tst.esocial.esquemas.eventos.cdbenprrp.TIdeEveTrab;
import br.jus.tst.esocial.ocorrencia.dados.CdBenPrRP;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.CdBenPrRPMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlCadastroBeneficioRPPS extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtCdBenPrRP.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtCdBenPrRP evtCdBenPrRP = CdBenPrRPMapper.INSTANCE.comoEvtCdBenPrRP((CdBenPrRP) ocorrencia.getDadosOcorrencia());
		evtCdBenPrRP.setId(evento.getIdEvento());
		evtCdBenPrRP.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtCdBenPrRP(evtCdBenPrRP);

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
