package br.jus.tst.esocialjt.negocio;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaAtualizacaoPub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PublicacaoServico {

    @Autowired
    OcorrenciaAtualizacaoPub ocorrenciaAtualizacaoPub;

    public void publicarAlteracaoEstado(Evento evento){
        if(evento.isEstadoAlterado()){
            evento.setEstadoAlterado(false);
            ocorrenciaAtualizacaoPub.send(evento.getOcorrencia());
        }
    }

    public void publicarAlteracaoEstado(Ocorrencia ocorrencia){
        publicarAlteracaoEstado(ocorrencia.getEvento());
    }

    public void publicarAlteracaoEstado(EnvioEvento envioEvento){
        publicarAlteracaoEstado(envioEvento.getEvento());
    }

    public void publicarAlteracaoEstado(Lote lote){
        lote.getEnviosEvento().forEach(envioEvento -> publicarAlteracaoEstado(envioEvento.getEvento()));
    }
}
