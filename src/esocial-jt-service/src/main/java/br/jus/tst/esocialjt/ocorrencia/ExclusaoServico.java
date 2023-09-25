package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.dominio.exclusao.IdeFolhaPagto;
import br.jus.tst.esocial.dominio.exclusao.InfoExclusao;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.DadosFechamentoFolha;
import br.jus.tst.esocial.ocorrencia.dados.DadosFolha;
import br.jus.tst.esocial.ocorrencia.dados.DadosOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ExclusaoServico {
    public Ocorrencia gerarExclusao(Ocorrencia ocorrencia) {
        Ocorrencia exclusao = new Ocorrencia();

        exclusao.setTipoOcorrencia(TipoOcorrencia.EXCLUSAO);
        exclusao.setReferencia(ocorrencia.getReferencia());
        exclusao.setDataOcorrencia(new Date());

        DadosOcorrencia dadosOcorrencia = ocorrencia.getDadosOcorrencia();

        Exclusao dadosExclusao = new Exclusao();
        dadosExclusao.setIdeEmpregador(dadosOcorrencia.getIdeEmpregador());
        dadosExclusao.setInfoExclusao(new InfoExclusao());
        dadosExclusao.getInfoExclusao().setTpEvento("S-"+ocorrencia.getEvento().getTipoEvento().getCodTipo());
        dadosExclusao.getInfoExclusao().setNrRecEvt(ocorrencia.getEvento().getNrRecibo());

        if(ocorrencia.getCpf() != null) {
            dadosExclusao.getInfoExclusao().setIdeTrabalhador(new IdeTrabalhador());
            dadosExclusao.getInfoExclusao().getIdeTrabalhador().setCpfTrab(ocorrencia.getCpf());
        }

        if(dadosOcorrencia instanceof DadosFolha){
            DadosFolha dadosFolha = (DadosFolha) dadosOcorrencia;
            dadosExclusao.getInfoExclusao().setIdeFolhaPagto(new IdeFolhaPagto());
            dadosExclusao.getInfoExclusao().getIdeFolhaPagto().setIndApuracao(dadosFolha.getIdeEvento().getIndApuracao());
            dadosExclusao.getInfoExclusao().getIdeFolhaPagto().setPerApur(dadosFolha.getIdeEvento().getPerApur());
        }

        if(dadosOcorrencia instanceof DadosFechamentoFolha){
            DadosFechamentoFolha dadosFolha = (DadosFechamentoFolha) dadosOcorrencia;
            dadosExclusao.getInfoExclusao().setIdeFolhaPagto(new IdeFolhaPagto());
            dadosExclusao.getInfoExclusao().getIdeFolhaPagto().setIndApuracao(dadosFolha.getIdeEvento().getIndApuracao());
            dadosExclusao.getInfoExclusao().getIdeFolhaPagto().setPerApur(dadosFolha.getIdeEvento().getPerApur());
        }

        exclusao.setDadosOcorrencia(dadosExclusao);
        return exclusao;
    }
}
