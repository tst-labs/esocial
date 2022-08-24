package br.jus.tst.esocialjt.ret.empregado;

import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.afasttemp.IniAfastamento;
import br.jus.tst.esocial.dominio.cessao.InfoCessao;
import br.jus.tst.esocial.dominio.cessao.IniCessao;
import br.jus.tst.esocial.dominio.desligamento.InfoDeslig;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ret.empregado.DadosCadastrais;
import br.jus.tst.esocial.ret.empregado.DadosContratuais;
import br.jus.tst.esocial.ret.empregado.DadosDesligamento;
import br.jus.tst.esocial.ret.empregado.Empregado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;

public class Processador2200 implements ProcessadorEmpregado {

    @Override
    public void processaRegistro(ArrayList<RetEmpregado> listaRetEmpregado, Ocorrencia ocorrencia) {
        Admissao admissao = (Admissao) ocorrencia.getDadosOcorrencia();

        RetEmpregado re = new RetEmpregado();

        re.empregado = new Empregado();
        re.empregado.dadosCadastrais = new DadosCadastrais();
        re.empregado.dadosContratuais = new DadosContratuais();

        BeanUtils.copyProperties(admissao.getTrabalhador(), re.empregado.dadosCadastrais);
        BeanUtils.copyProperties(admissao.getVinculo(), re.empregado.dadosContratuais);

        if (admissao.getVinculo().getDesligamento() != null) {
            re.empregado.dadosDesligamento = new DadosDesligamento();
            re.empregado.dadosDesligamento.infoDeslig = new InfoDeslig();
            re.empregado.dadosDesligamento.infoDeslig.setDtDeslig(admissao.getVinculo().getDesligamento().getDtDeslig());
        }

        if (admissao.getVinculo().getAfastamento() != null) {
            re.empregado.dadosAfastamentos = new ArrayList<>();
            InfoAfastamento infoAfastamento = new InfoAfastamento();
            infoAfastamento.setIniAfastamento(new IniAfastamento());
            infoAfastamento.getIniAfastamento().setDtIniAfast(admissao.getVinculo().getAfastamento().getDtIniAfast());
            infoAfastamento.getIniAfastamento().setCodMotAfast(admissao.getVinculo().getAfastamento().getCodMotAfast());

            re.empregado.dadosAfastamentos.add(infoAfastamento);
        }

        if (admissao.getVinculo().getCessao() != null) {
            re.empregado.dadosCessoes = new ArrayList<>();
            InfoCessao infoCessao = new InfoCessao();
            infoCessao.setIniCessao(new IniCessao());
            infoCessao.getIniCessao().setDtIniCessao(admissao.getVinculo().getCessao().getDtIniCessao());

            re.empregado.dadosCessoes.add(infoCessao);
        }

        re.addOcorrencia(ocorrencia);
        listaRetEmpregado.add(re);
    }

}
