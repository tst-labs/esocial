package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabhortur.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabhortur.ESocial.EvtTabHorTur;
import br.jus.tst.esocial.esquemas.eventos.tabhortur.TIdeCadastro;
import br.jus.tst.esocial.ocorrencia.dados.TabelaHorario;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaHorarioMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaHorario extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabHorTur.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
        ESocial eSocial = new ESocial();

        EvtTabHorTur evtTabHorTur = converterTabFuncao(ocorrencia);
        evtTabHorTur.setId(evento.getIdEvento());
        evtTabHorTur.setIdeEvento(preencherConstantes(new TIdeCadastro()));
        eSocial.setEvtTabHorTur(evtTabHorTur);

        return eSocial;
	}

    private EvtTabHorTur converterTabFuncao(Ocorrencia ocorrencia) throws GeracaoXmlException {  
    	EvtTabHorTur evtTabHorTur = null;
        TabelaHorario tabelaHorario = (TabelaHorario) ocorrencia.getDadosOcorrencia();
        TabelaHorarioMapper mapper = TabelaHorarioMapper.INSTANCE;

        switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabHorTur = mapper.comoEvtTabHorTurInclusao(tabelaHorario);
			break;
			
		case ALTERACAO:	
			evtTabHorTur = mapper.comoEvtTabHorTurAlteracao(tabelaHorario);
			break;
		
		case EXCLUSAO:
			evtTabHorTur = mapper.comoEvtTabHorTurExclusao(tabelaHorario);        
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(), "Operação não suportada: "+ocorrencia.getOperacao());
		}

        return evtTabHorTur; 
    }

	@Override
	public String getArquivoXSD() {
		return ARQUIVO_XSD;
	}
}
