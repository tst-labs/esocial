package br.jus.tst.esocialjt.xml.gerador;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TIdeCadastro;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import br.jus.tst.esocialjt.Constantes;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.mapper.TabelaEstabelecimentoMapper;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@Component
public class GeradorXmlTabelaEstabelecimento extends GeradorXml {
	
	private static final String ARQUIVO_XSD = "xsd/eventos/v02_04_02/evtTabEstab.xsd";

	@Override
	public Object criarObjetoESocial(Evento evento) throws GeracaoXmlException {
		Ocorrencia ocorrencia = evento.getOcorrencia();
        ESocial eSocial = new ESocial();

        EvtTabEstab evtTabEstab = converterTabEstab(ocorrencia);
        evtTabEstab.setId(evento.getIdEvento());
        evtTabEstab.setIdeEvento(gerarIdeEvento());
        eSocial.setEvtTabEstab(evtTabEstab);

        return eSocial;
	}
	
    private EvtTabEstab converterTabEstab(Ocorrencia ocorrencia) throws GeracaoXmlException {   
    	EvtTabEstab evtTabEstab = null;
    	TabelaEstabelecimento tabelaEstabelecimento = (TabelaEstabelecimento) ocorrencia.getDadosOcorrencia();
        TabelaEstabelecimentoMapper mapper = TabelaEstabelecimentoMapper.INSTANCE;
        
        
        switch (ocorrencia.getOperacao()) {
		case INCLUSAO:
			evtTabEstab = mapper.comoEvtTabEstabInclusao(tabelaEstabelecimento);
			break;
			
		case ALTERACAO:	
			evtTabEstab = mapper.comoEvtTabEstabAlteracao(tabelaEstabelecimento);
			break;
		
		case EXCLUSAO:
			evtTabEstab = mapper.comoEvtTabEstabExclusao(tabelaEstabelecimento);        
			break;
		default:
			throw new GeracaoXmlException(ocorrencia.getEvento(), "Operação não suportada: "+ocorrencia.getOperacao());
		}
        
        return evtTabEstab; 
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
