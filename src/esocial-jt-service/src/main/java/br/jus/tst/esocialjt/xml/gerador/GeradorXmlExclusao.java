package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.ExclusaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlExclusao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtExclusao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		
		EvtExclusao evtExclusao = ExclusaoMapper.INSTANCE.comoEvtExclusao((Exclusao) ocorrencia.getDadosOcorrencia());
		evtExclusao.setId(evento.getIdEvento());
		evtExclusao.setIdeEvento(gerarIdeEvento());

		ESocial eSocial = new ESocial();
		eSocial.setEvtExclusao(evtExclusao);

		return eSocial;
	}

	private EvtExclusao.IdeEvento gerarIdeEvento() {
		EvtExclusao.IdeEvento ideEvento = new EvtExclusao.IdeEvento();
		ideEvento.setTpAmb(getAmbiente().codigo());
		ideEvento.setProcEmi(Constantes.APLICATIVO_DO_EMPREGADOR);
		ideEvento.setVerProc(Constantes.VERSAO_APLICATIVO);
		return ideEvento;
	}

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}

}
