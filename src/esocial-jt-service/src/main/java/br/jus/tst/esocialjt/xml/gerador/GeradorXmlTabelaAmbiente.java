package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabambiente.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabambiente.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabambiente.ESocial.EvtTabAmbiente;
import br.jus.tst.esocial.ocorrencia.dados.TabelaAmbiente;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaAmbienteMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaAmbiente extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabAmbiente.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabAmbiente evtTabAmbiente = converterTabAmbiente(ocorrencia);
		evtTabAmbiente.setId(evento.getIdEvento());
		evtTabAmbiente.setIdeEvento(gerarIdeEvento());
		eSocial.setEvtTabAmbiente(evtTabAmbiente);

		return eSocial;
	}

	private EvtTabAmbiente converterTabAmbiente(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabAmbiente evtTabAmbiente = null;
		TabelaAmbiente tabelaAmbiente = (TabelaAmbiente) ocorrencia.getDadosOcorrencia();
		TabelaAmbienteMapper mapper = TabelaAmbienteMapper.INSTANCE;

		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabAmbiente = mapper.comoEvtTabAmbienteInclusao(tabelaAmbiente);
			break;
		case ALTERACAO:
			evtTabAmbiente = mapper.comoEvtTabAmbienteAlteracao(tabelaAmbiente);
			break;
		case EXCLUSAO:
			evtTabAmbiente = mapper.comoEvtTabAmbienteExclusao(tabelaAmbiente);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(),
					"Operação não suportada: " + ocorrencia.getOperacao());
		}

		return evtTabAmbiente;
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
