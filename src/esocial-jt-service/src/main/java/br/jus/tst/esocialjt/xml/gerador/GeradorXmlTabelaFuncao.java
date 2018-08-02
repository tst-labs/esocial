package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabfuncao.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabfuncao.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabfuncao.ESocial.EvtTabFuncao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaFuncao;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaFuncaoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaFuncao extends GeradorXml {

	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabFuncao.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
        ESocial eSocial = new ESocial();

        EvtTabFuncao evtTabFuncao = converterTabFuncao(ocorrencia);
        evtTabFuncao.setId(evento.getIdEvento());
        evtTabFuncao.setIdeEvento(gerarIdeEvento());
        eSocial.setEvtTabFuncao(evtTabFuncao);

        return eSocial;
	}

    private EvtTabFuncao converterTabFuncao(Ocorrencia ocorrencia) throws GeracaoXmlException {  
    	EvtTabFuncao evtTabFuncao = null;
        TabelaFuncao tabelaFuncao = (TabelaFuncao) ocorrencia.getDadosOcorrencia();
        TabelaFuncaoMapper mapper = TabelaFuncaoMapper.INSTANCE;

        switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabFuncao = mapper.comoEvtTabFuncaoInclusao(tabelaFuncao);
			break;
			
		case ALTERACAO:	
			evtTabFuncao = mapper.comoEvtTabFuncaoAlteracao(tabelaFuncao);
			break;
		
		case EXCLUSAO:
			evtTabFuncao = mapper.comoEvtTabFuncaoExclusao(tabelaFuncao);        
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(), "Operação não suportada: "+ocorrencia.getOperacao());
		}

        return evtTabFuncao; 
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
