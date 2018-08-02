package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabcarreira.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabcarreira.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabcarreira.ESocial.EvtTabCarreira;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCarreira;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaCarreiraMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaCarreira extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabCarreira.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabCarreira evtTabCarreira = converterTabCarreira(ocorrencia);
		evtTabCarreira.setId(evento.getIdEvento());
		evtTabCarreira.setIdeEvento(gerarIdeEvento());
		eSocial.setEvtTabCarreira(evtTabCarreira);
		return eSocial;
	}

	private EvtTabCarreira converterTabCarreira(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabCarreira evtTabCarreira = null;
		TabelaCarreira tabelaCarreira = (TabelaCarreira) ocorrencia.getDadosOcorrencia();
		TabelaCarreiraMapper mapper = TabelaCarreiraMapper.INSTANCE;

		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabCarreira = mapper.comoEvtTabCarreiraInclusao(tabelaCarreira);
			break;
		case ALTERACAO:
			evtTabCarreira = mapper.comoEvtTabCarreiraAlteracao(tabelaCarreira);
			break;
		case EXCLUSAO:
			evtTabCarreira = mapper.comoEvtTabCarreiraExclusao(tabelaCarreira);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtTabCarreira;
	}

	private TIdeCadastro gerarIdeEvento() {
		TIdeCadastro ideEvento = new TIdeCadastro();
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
