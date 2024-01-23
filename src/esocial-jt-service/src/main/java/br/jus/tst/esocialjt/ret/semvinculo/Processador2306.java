package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.dominio.semvinculo.InfoComplementares;
import br.jus.tst.esocial.dominio.semvinculo.InfoDirigenteSindical;
import br.jus.tst.esocial.dominio.semvinculo.InfoMandElet;
import br.jus.tst.esocial.dominio.semvinculo.InfoTrabCedido;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Processador2306 implements ProcessadorTrabalhadorSemVinculo {
    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        TSVAltContr alteracao = (TSVAltContr) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();
        Integer codCateg = alteracao.getIdeTrabSemVinculo().getCodCateg();

        listaRetTrabalhadorSemVinculo
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .filter(re -> codCateg == null || codCateg.equals(re.trabalhadorSemVinculo.getDadosContratuais().getCodCateg()))
                .forEach(re -> {
                    InfoComplementares infoComplementares = re.trabalhadorSemVinculo.dadosContratuais.getInfoComplementares();
                    InfoComplementares infoComplementaresAlt = alteracao.getInfoTSVAlteracao().getInfoComplementares();
                    if (infoComplementaresAlt != null && infoComplementares != null) {
                        infoComplementares.setCargoFuncao(infoComplementaresAlt.getCargoFuncao());
                        infoComplementares.setRemuneracao(infoComplementaresAlt.getRemuneracao());
                        infoComplementares.setInfoEstagiario(infoComplementaresAlt.getInfoEstagiario());
                        infoComplementares.setLocalTrabGeral(infoComplementaresAlt.getLocalTrabGeral());
                        preencherInfoDirigenteSindical(infoComplementares, infoComplementaresAlt);
                        preencherInfoTrabCedido(infoComplementares, infoComplementaresAlt);
                        preencherInfoMandElet(infoComplementares, infoComplementaresAlt);
                    }
                    re.addOcorrencia(ocorrencia);
                });
    }

    private static void preencherInfoMandElet(InfoComplementares infoComplementares, InfoComplementares infoComplementaresAlt) {
        InfoMandElet infoMandElet = infoComplementares.getInfoMandElet();
        InfoMandElet infoMandEletAlt = infoComplementaresAlt.getInfoMandElet();
        if (infoMandEletAlt != null && infoMandElet != null) {
            infoMandElet.setTpRegPrev(infoMandEletAlt.getTpRegPrev());
            infoMandElet.setIndRemunCargo(infoMandEletAlt.getIndRemunCargo());
        } else {
            infoComplementares.setInfoMandElet(infoMandEletAlt);
        }
    }

    private static void preencherInfoTrabCedido(InfoComplementares infoComplementares, InfoComplementares infoComplementaresAlt) {
        InfoTrabCedido infoTrabCedido = infoComplementares.getInfoTrabCedido();
        InfoTrabCedido infoTrabCedidoAlt = infoComplementaresAlt.getInfoTrabCedido();

        if (infoTrabCedidoAlt != null && infoTrabCedido != null) {
            infoTrabCedido.setTpRegPrev(infoTrabCedidoAlt.getTpRegPrev());
        } else {
            infoComplementares.setInfoTrabCedido(infoTrabCedidoAlt);
        }
    }

    private static void preencherInfoDirigenteSindical(InfoComplementares infoComplementares, InfoComplementares infoComplementaresAlt) {
        InfoDirigenteSindical infoDirigenteSindical = infoComplementares.getInfoDirigenteSindical();
        InfoDirigenteSindical infoDirigenteSindicalAlt = infoComplementaresAlt.getInfoDirigenteSindical();
        if (infoDirigenteSindicalAlt != null && infoDirigenteSindical != null) {
            infoDirigenteSindical.setTpRegPrev(infoDirigenteSindicalAlt.getTpRegPrev());
        } else {
            infoComplementares.setInfoDirigenteSindical(infoDirigenteSindicalAlt);
        }
    }
}
