package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.dominio.vinculo.Aprend;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.InfoCeletista;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.InfoEstatutario;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.Vinculo;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2206 implements ProcessadorEmpregado {
    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        AltContratual altContratual = (AltContratual) ocorrencia.getDadosOcorrencia();
        String matriculaOcorrencia = ocorrencia.getDadosOcorrencia().getMatricula();

        listaRetEmpregado
                .stream()
                .filter(re -> StringUtils.equals(matriculaOcorrencia, re.getMatricula()))
                .forEach(re -> {
                    Vinculo vinculo = altContratual.getAltContratual().getVinculo();
                    InfoEstatutario infoEstatutario = vinculo.getInfoRegimeTrab().getInfoEstatutario();
                    InfoCeletista infoCeletista = vinculo.getInfoRegimeTrab().getInfoCeletista();

                    re.empregado.dadosContratuais.tpRegPrev = vinculo.getTpRegPrev();
                    preencherInfoEstatutario(re, infoEstatutario);
                    preencherInfoCeletista(re, infoCeletista);
                    BeanUtils.copyProperties(vinculo.getInfoContrato(), re.empregado.dadosContratuais.getInfoContrato(), "dtIngrCargo", "duracao");
                    preencherDuracao(re, vinculo);

                    re.addOcorrencia(ocorrencia);
                });

    }

    private static void preencherDuracao(RetEmpregado re, Vinculo vinculo) {
        if (vinculo.getInfoContrato().getDuracao() != null) {
            BeanUtils.copyProperties(
                    vinculo.getInfoContrato().getDuracao(),
                    re.empregado.dadosContratuais.getInfoContrato().getDuracao(),
                    "clauAssec");
        }
    }

    private void preencherInfoCeletista(RetEmpregado re, InfoCeletista infoCeletista) {
        if (infoCeletista != null) {
            BeanUtils.copyProperties(infoCeletista, re.empregado.dadosContratuais.getInfoRegimeTrab().getInfoCeletista());

            if (infoCeletista.getAprend() != null) {
                Aprend aprendiz = new Aprend();
                aprendiz.setNrInsc(infoCeletista.getAprend().getNrInsc());
                aprendiz.setTpInsc(infoCeletista.getAprend().getTpInsc());
                re.empregado.dadosContratuais.getInfoRegimeTrab().getInfoCeletista().setAprend(aprendiz);
            }

            if (infoCeletista.getTrabTemporario() != null) {
                re.empregado.dadosContratuais
                        .getInfoRegimeTrab()
                        .getInfoCeletista()
                        .getTrabTemporario()
                        .setJustContr(infoCeletista.getTrabTemporario().getJustProrr());
            }
        }
    }

    private void preencherInfoEstatutario(RetEmpregado re, InfoEstatutario infoEstatutario) {
        if (infoEstatutario != null) {
            BeanUtils.copyProperties(infoEstatutario, re.empregado.dadosContratuais.getInfoRegimeTrab().getInfoEstatutario());
        }
    }
}
