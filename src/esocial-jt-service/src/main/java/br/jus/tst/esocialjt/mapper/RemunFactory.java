package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.esquemas.eventos.remun.TItensRemun;
import br.jus.tst.esocial.esquemas.eventos.remun.TItensRemunDescFolha;

public class RemunFactory {
    public TItensRemun createTItensRemun() {
        return new TItensRemun();
    }

    public TItensRemunDescFolha createTItensRemunDescFolha() {
        return new TItensRemunDescFolha();
    }
}
