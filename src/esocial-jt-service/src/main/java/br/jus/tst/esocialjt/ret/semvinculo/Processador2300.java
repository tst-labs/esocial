package br.jus.tst.esocialjt.ret.semvinculo;

import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.afasttemp.IniAfastamento;
import br.jus.tst.esocial.dominio.semvinculo.AgeIntegracao;
import br.jus.tst.esocial.dominio.semvinculo.CargoFuncao;
import br.jus.tst.esocial.dominio.semvinculo.FGTS;
import br.jus.tst.esocial.dominio.semvinculo.InfoComplementares;
import br.jus.tst.esocial.dominio.semvinculo.InfoDirigenteSindical;
import br.jus.tst.esocial.dominio.semvinculo.InfoEstagiario;
import br.jus.tst.esocial.dominio.semvinculo.InfoMandElet;
import br.jus.tst.esocial.dominio.semvinculo.InfoTrabCedido;
import br.jus.tst.esocial.dominio.semvinculo.InstEnsino;
import br.jus.tst.esocial.dominio.semvinculo.SupervisorEstagio;
import br.jus.tst.esocial.dominio.vinculo.Remuneracao;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import br.jus.tst.esocial.ret.tsv.DadosCadastrais;
import br.jus.tst.esocial.ret.tsv.DadosContratuais;
import br.jus.tst.esocial.ret.tsv.TrabalhadorSemVinculo;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocial.dominio.semvinculo.Termino;
import java.util.ArrayList;
import org.springframework.beans.BeanUtils;

public class Processador2300 implements ProcessadorTrabalhadorSemVicnulo {

    @Override
    public void processaRegistro(ArrayList<RetTrabalhadorSemVinculo> listaRetTrabalhadorSemVinculo, Ocorrencia ocorrencia) {
        TSVInicio tsvInicio = (TSVInicio) ocorrencia.getDadosOcorrencia();

        RetTrabalhadorSemVinculo re = new RetTrabalhadorSemVinculo();

        re.trabalhadorSemVinculo = new TrabalhadorSemVinculo();
        re.trabalhadorSemVinculo.dadosCadastrais = new DadosCadastrais();
        re.trabalhadorSemVinculo.dadosContratuais = new DadosContratuais();

        BeanUtils.copyProperties(tsvInicio.getTrabalhador(), re.trabalhadorSemVinculo.dadosCadastrais);
        BeanUtils.copyProperties(tsvInicio.getInfoTSVInicio(), re.trabalhadorSemVinculo.dadosContratuais);

        if (tsvInicio.getInfoTSVInicio().getAfastamento() != null) {
            re.trabalhadorSemVinculo.dadosAfastamentos = new ArrayList<>();
            InfoAfastamento infoAfastamento = new InfoAfastamento();
            infoAfastamento.setIniAfastamento(new IniAfastamento());
            infoAfastamento.getIniAfastamento().setDtIniAfast(tsvInicio.getInfoTSVInicio().getAfastamento().getDtIniAfast());
            infoAfastamento.getIniAfastamento().setCodMotAfast(tsvInicio.getInfoTSVInicio().getAfastamento().getCodMotAfast());

            re.trabalhadorSemVinculo.dadosAfastamentos.add(infoAfastamento);
        }

        if (tsvInicio.getInfoTSVInicio().getInfoComplementares() != null) {
            re.trabalhadorSemVinculo.dadosInformacoesComplementares = new ArrayList<>();

            re.trabalhadorSemVinculo.dadosInformacoesComplementares.add(retornaInformacoesComplementares(tsvInicio
                    .getInfoTSVInicio()
                    .getInfoComplementares()));
        }

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

    private InfoComplementares retornaInformacoesComplementares(InfoComplementares infoComp) {
        InfoComplementares infoComplementares = new InfoComplementares();
        infoComplementares.setCargoFuncao(retornaCargoFuncao(infoComp.getCargoFuncao()));
        infoComplementares.setFGTS(retornaFGTS(infoComp.getFGTS()));
        infoComplementares.setInfoDirigenteSindical(retornaNovoDirigenteSindical(infoComp.getInfoDirigenteSindical()));
        infoComplementares.setInfoEstagiario(retornaNovoEstagiario(infoComp.getInfoEstagiario()));
        infoComplementares.setInfoMandElet(retornaNovoInfoMandElet(infoComp.getInfoMandElet()));
        infoComplementares.setInfoTrabCedido(retornaNovoInfoTrabCedido(infoComp.getInfoTrabCedido()));
        infoComplementares.setRemuneracao(retornaNovaRemuneracao(infoComp.getRemuneracao()));
        return infoComplementares;
    }

    private Remuneracao retornaNovaRemuneracao(Remuneracao remun) {

        if (remun == null) {
            return remun;
        }

        Remuneracao remuneracao = new Remuneracao();
        BeanUtils.copyProperties(remun, remuneracao);
        return remuneracao;
    }

    private InfoTrabCedido retornaNovoInfoTrabCedido(InfoTrabCedido trabCedido) {
        if (trabCedido == null) {
            return trabCedido;
        }

        InfoTrabCedido infoTrabCedido = new InfoTrabCedido();
        BeanUtils.copyProperties(trabCedido, infoTrabCedido);
        return infoTrabCedido;
    }

    private InfoMandElet retornaNovoInfoMandElet(InfoMandElet mandElet) {
        if (mandElet == null) {
            return mandElet;
        }
        InfoMandElet infoMandElet = new InfoMandElet();
        BeanUtils.copyProperties(mandElet, infoMandElet);
        return infoMandElet;
    }

    private InfoEstagiario retornaNovoEstagiario(InfoEstagiario estagiario) {
        if (estagiario == null) {
            return estagiario;
        }

        InfoEstagiario infoEstagiario = new InfoEstagiario();
        BeanUtils.copyProperties(estagiario, infoEstagiario);

        InstEnsino instEnsino = new InstEnsino();
        AgeIntegracao ageIntegracao = new AgeIntegracao();
        SupervisorEstagio supervisorEstagio = new SupervisorEstagio();

        BeanUtils.copyProperties(estagiario.getInstEnsino(), instEnsino);
        instEnsino.setUf(estagiario.getInstEnsino().getUf());
        BeanUtils.copyProperties(estagiario.getAgeIntegracao(), ageIntegracao);
        BeanUtils.copyProperties(estagiario.getSupervisorEstagio(), supervisorEstagio);

        return infoEstagiario;
    }

    private InfoDirigenteSindical retornaNovoDirigenteSindical(InfoDirigenteSindical infoDirigenteSindical) {
        if (infoDirigenteSindical == null) {
            return infoDirigenteSindical;
        }
        InfoDirigenteSindical dirigenteSindical = new InfoDirigenteSindical();
        BeanUtils.copyProperties(infoDirigenteSindical, dirigenteSindical);
        return dirigenteSindical;
    }

    private FGTS retornaFGTS(FGTS fgts) {

        if (fgts == null) {
            return fgts;
        }

        FGTS vfgts = new FGTS();
        BeanUtils.copyProperties(fgts, vfgts);
        return vfgts;
    }

    private CargoFuncao retornaCargoFuncao(CargoFuncao cargo) {
        if (cargo == null) {
            return cargo;
        }
        CargoFuncao cargoFuncao = new CargoFuncao();
        BeanUtils.copyProperties(cargo, cargoFuncao);

        return cargoFuncao;
    }
}
