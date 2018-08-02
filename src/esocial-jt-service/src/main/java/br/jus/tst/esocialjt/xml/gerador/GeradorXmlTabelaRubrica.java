package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaRubricaMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaRubrica extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabRubrica.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
		ESocial eSocial = new ESocial();

		EvtTabRubrica evtTabRubrica = converteTabRubrica(ocorrencia);
		evtTabRubrica.setId(evento.getIdEvento());
		evtTabRubrica.setIdeEvento(gerarIdeEvento());
		eSocial.setEvtTabRubrica(evtTabRubrica);

		return eSocial;
	}

	private EvtTabRubrica converteTabRubrica(Ocorrencia ocorrencia) throws GeracaoXmlException {
		EvtTabRubrica evtTabRubrica;
		TabelaRubrica tabelaRubrica = (TabelaRubrica) ocorrencia.getDadosOcorrencia();
		TabelaRubricaMapper mapper = TabelaRubricaMapper.INSTANCE;
		
		switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabRubrica = mapper.comoEvtTabRubricaInclusao(tabelaRubrica);
			break;
			
		case ALTERACAO:	
			evtTabRubrica = mapper.comoEvtTabRubricaAlteracao(tabelaRubrica);
			break;
		
		case EXCLUSAO:
			evtTabRubrica = mapper.comoEvtTabRubricaExclusao(tabelaRubrica);
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(), "Operação não suportada: "+ocorrencia.getOperacao());
		}

		return evtTabRubrica;
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
