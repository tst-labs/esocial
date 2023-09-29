package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolha;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class ExclusaoServicoTest {

    ExclusaoServico exclusaoServico = new ExclusaoServico();

    @Test
    public void deveGerarExclusaoParaNaoPeriodico() {
        // Arrange
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipoOcorrencia(TipoOcorrencia.ADMISSAO_TRABALHADOR);
        ocorrencia.setReferencia("2018-01");
        ocorrencia.setCpf("12345678901");
        ocorrencia.setDadosOcorrencia(new Admissao());
        ocorrencia.getDadosOcorrencia().setIdeEmpregador(new IdeEmpregador());
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setNrInsc("12345678901234");
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setTpInsc((byte) 1);
        ocorrencia.setEvento(new Evento());
        ocorrencia.getEvento().setNrRecibo("12345678901234567890");
        ocorrencia.getEvento().setTipoEvento(TipoEvento.ADMISSAO_TRABALHADOR);

        // Act
        Ocorrencia exclusao = exclusaoServico.gerarExclusao(ocorrencia);

        // Assert
        SoftAssertions soft = new SoftAssertions();
        soft.assertThat(exclusao.getTipoOcorrencia()).isEqualTo(TipoOcorrencia.EXCLUSAO);
        soft.assertThat(exclusao.getReferencia()).isEqualTo(ocorrencia.getReferencia());
        soft.assertThat(exclusao.getDataOcorrencia()).isNotNull();

        Exclusao dados = (Exclusao) exclusao.getDadosOcorrencia();

        soft.assertThat(dados.getIdeEmpregador()).as("ideEmpregador")
                .isEqualTo(ocorrencia.getDadosOcorrencia().getIdeEmpregador());

        soft.assertThat(dados.getInfoExclusao().getTpEvento()).as("tpEvento")
                .isEqualTo("S-2200");

        soft.assertThat(dados.getInfoExclusao().getNrRecEvt()).as("nrRecEvt")
                .isEqualTo(ocorrencia.getEvento().getNrRecibo());

        soft.assertThat(dados.getInfoExclusao().getIdeTrabalhador().getCpfTrab()).as("cpfTrab")
                .isEqualTo(ocorrencia.getCpf());

        soft.assertThat(dados.getInfoExclusao().getIdeFolhaPagto()).as("ideFolhaPagto")
                .isNull();

        soft.assertAll();
    }

    @Test
    public void deveGerarExclusaoPara1200() {
        // Arrange
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipoOcorrencia(TipoOcorrencia.REMUNERACAO_RGPS);
        ocorrencia.setReferencia("2018-01");
        ocorrencia.setCpf("12345678901");
        Remun remun = new Remun();
        remun.setIdeEvento(new IdeEventoFolha());
        remun.getIdeEvento().setIndApuracao((byte) 1);
        remun.getIdeEvento().setPerApur("2023-09");
        ocorrencia.setDadosOcorrencia(remun);
        ocorrencia.getDadosOcorrencia().setIdeEmpregador(new IdeEmpregador());
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setNrInsc("12345678901234");
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setTpInsc((byte) 1);
        ocorrencia.setEvento(new Evento());
        ocorrencia.getEvento().setNrRecibo("12345678901234567890");
        ocorrencia.getEvento().setTipoEvento(TipoEvento.REMUNERACAO_RGPS);

        // Act
        Ocorrencia exclusao = exclusaoServico.gerarExclusao(ocorrencia);

        // Assert
        SoftAssertions soft = new SoftAssertions();
        soft.assertThat(exclusao.getTipoOcorrencia()).isEqualTo(TipoOcorrencia.EXCLUSAO);
        soft.assertThat(exclusao.getReferencia()).isEqualTo(ocorrencia.getReferencia());
        soft.assertThat(exclusao.getDataOcorrencia()).isNotNull();

        Exclusao dados = (Exclusao) exclusao.getDadosOcorrencia();

        soft.assertThat(dados.getIdeEmpregador()).as("ideEmpregador")
                .isEqualTo(ocorrencia.getDadosOcorrencia().getIdeEmpregador());

        soft.assertThat(dados.getInfoExclusao().getTpEvento()).as("tpEvento")
                .isEqualTo("S-1200");

        soft.assertThat(dados.getInfoExclusao().getNrRecEvt()).as("nrRecEvt")
                .isEqualTo(ocorrencia.getEvento().getNrRecibo());

        soft.assertThat(dados.getInfoExclusao().getIdeTrabalhador().getCpfTrab()).as("cpfTrab")
                .isEqualTo(ocorrencia.getCpf());

        soft.assertThat(dados.getInfoExclusao().getIdeFolhaPagto().getIndApuracao()).as("indApuracao")
                .isEqualTo(remun.getIdeEvento().getIndApuracao());

        soft.assertThat(dados.getInfoExclusao().getIdeFolhaPagto().getPerApur()).as("perApur")
                .isEqualTo(remun.getIdeEvento().getPerApur());

        soft.assertAll();
    }

    @Test
    public void deveGerarExclusaoPara1299() {
        // Arrange
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipoOcorrencia(TipoOcorrencia.FECHAMENTO_PERIODICOS);
        ocorrencia.setReferencia("2018-01");
        FechaEvPer remun = new FechaEvPer();
        remun.setIdeEvento(new IdeEventoFolhaSemRetificacao());
        remun.getIdeEvento().setIndApuracao((byte) 1);
        remun.getIdeEvento().setPerApur("2023-09");
        ocorrencia.setDadosOcorrencia(remun);
        ocorrencia.getDadosOcorrencia().setIdeEmpregador(new IdeEmpregador());
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setNrInsc("12345678901234");
        ocorrencia.getDadosOcorrencia().getIdeEmpregador().setTpInsc((byte) 1);
        ocorrencia.setEvento(new Evento());
        ocorrencia.getEvento().setNrRecibo("12345678901234567890");
        ocorrencia.getEvento().setTipoEvento(TipoEvento.FECHAMENTO_PERIODICOS);

        // Act
        Ocorrencia exclusao = exclusaoServico.gerarExclusao(ocorrencia);

        // Assert
        SoftAssertions soft = new SoftAssertions();
        soft.assertThat(exclusao.getTipoOcorrencia()).isEqualTo(TipoOcorrencia.EXCLUSAO);
        soft.assertThat(exclusao.getReferencia()).isEqualTo(ocorrencia.getReferencia());
        soft.assertThat(exclusao.getDataOcorrencia()).isNotNull();

        Exclusao dados = (Exclusao) exclusao.getDadosOcorrencia();

        soft.assertThat(dados.getIdeEmpregador()).as("ideEmpregador")
                .isEqualTo(ocorrencia.getDadosOcorrencia().getIdeEmpregador());

        soft.assertThat(dados.getInfoExclusao().getTpEvento()).as("tpEvento")
                .isEqualTo("S-1299");

        soft.assertThat(dados.getInfoExclusao().getNrRecEvt()).as("nrRecEvt")
                .isEqualTo(ocorrencia.getEvento().getNrRecibo());

        soft.assertThat(dados.getInfoExclusao().getIdeTrabalhador()).as("ideTrabalhador")
                .isNull();

        soft.assertThat(dados.getInfoExclusao().getIdeFolhaPagto().getIndApuracao()).as("indApuracao")
                .isEqualTo(remun.getIdeEvento().getIndApuracao());

        soft.assertThat(dados.getInfoExclusao().getIdeFolhaPagto().getPerApur()).as("perApur")
                .isEqualTo(remun.getIdeEvento().getPerApur());

        soft.assertAll();
    }

}