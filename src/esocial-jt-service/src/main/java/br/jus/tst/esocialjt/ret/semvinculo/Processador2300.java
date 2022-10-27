package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocial.ret.tsv.DadosCadastrais;
import br.jus.tst.esocial.ret.tsv.DadosContratuais;
import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocial.dominio.semvinculo.Termino;
import java.util.ArrayList;
import org.springframework.beans.BeanUtils;

public class Processador2300 implements ProcessadorTrabalhadorSemVinculo {

    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        TSVInicio tsvInicio = (TSVInicio) ocorrencia.getDadosOcorrencia();

        RetTrabalhadorSemVinculo re = new RetTrabalhadorSemVinculo();

        re.trabalhadorSemVinculo = new TrabalhadorSemVinculo();
        re.trabalhadorSemVinculo.dadosCadastrais = new DadosCadastrais();
        re.trabalhadorSemVinculo.dadosContratuais = new DadosContratuais();

        BeanUtils.copyProperties(tsvInicio.getTrabalhador(), re.trabalhadorSemVinculo.dadosCadastrais);
        BeanUtils.copyProperties(tsvInicio.getInfoTSVInicio(), re.trabalhadorSemVinculo.dadosContratuais);

        re.trabalhadorSemVinculo.termino = retornaNovoTermino(tsvInicio.getInfoTSVInicio().getTermino());
        re.addOcorrencia(ocorrencia);
        listaRetTrabalhadorSemVinculo.add(re);
    }
    
    private Termino retornaNovoTermino(Termino term) {
        if (term == null) {
            return term;
        }
        Termino termino = new Termino();
        termino.setDtTerm(term.getDtTerm());
        return termino;
    }
}
