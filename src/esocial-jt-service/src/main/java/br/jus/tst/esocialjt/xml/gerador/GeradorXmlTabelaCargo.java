package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabcargo.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabcargo.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabcargo.ESocial.EvtTabCargo;
import br.jus.tst.esocial.ocorrencia.dados.TabelaCargo;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaCargoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaCargo extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabCargo.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabCargo evtTabCargo = converterTabCargo(ocorrencia);
		evtTabCargo.setId(evento.getIdEvento());
		evtTabCargo.setIdeEvento(gerarIdeEvento());
		eSocial.setEvtTabCargo(evtTabCargo);

		return eSocial;
	}

	private EvtTabCargo converterTabCargo(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabCargo evtTabCargo = null;
		TabelaCargo tabelaCargo = (TabelaCargo) ocorrencia.getDadosOcorrencia();
		TabelaCargoMapper mapper = TabelaCargoMapper.INSTANCE;

		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabCargo = mapper.comoEvtTabCargoInclusao(tabelaCargo);
			break;
		case ALTERACAO:
			evtTabCargo = mapper.comoEvtTabCargoAlteracao(tabelaCargo);
			break;
		case EXCLUSAO:
			evtTabCargo = mapper.comoEvtTabCargoExclusao(tabelaCargo);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtTabCargo;
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
