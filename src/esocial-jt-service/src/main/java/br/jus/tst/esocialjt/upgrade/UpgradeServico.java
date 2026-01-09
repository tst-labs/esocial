package br.jus.tst.esocialjt.upgrade;

import br.jus.tst.esocial.ocorrencia.dados.DadosFechamentoFolha;
import br.jus.tst.esocial.ocorrencia.dados.DadosFolha;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaRepository;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaSpecs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UpgradeServico {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpgradeServico.class);

    @Autowired
    ControleUpgradeRepository upgradeRepository;

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    OcorrenciaSpecs specs;

    public void realizarUpgrades() {
        upgradeCpfMatricula();
        upgradeExclusaoRetificacao();
        upgradePeriodoApuracao();
    }

    public void upgradeCpfMatricula() {
        Optional<ControleUpgrade> upgrade = upgradeRepository.findById(Upgrade.CAMPO_CPF_MATRICULA.codUpgrade);
        if (!upgrade.isPresent()) {
            realizaUpgradeCpfMatricula();
            registrarUpgrade(Upgrade.CAMPO_CPF_MATRICULA);
        }
    }

    @Async
    public void realizaUpgradeCpfMatricula() {
        LOGGER.info("Upgrade: " + Upgrade.CAMPO_CPF_MATRICULA.desUpgrade);
        final int size = 100;
        int page = 0;
        Page<Ocorrencia> pagina;

        do {
            pagina = ocorrenciaRepository.findAll(PageRequest.of(page, size, Sort.by("id")));
            int elemento = page * size + pagina.getNumberOfElements();
            LOGGER.info("Atualização de CPF e Matricula: Evento {} de {}", elemento, pagina.getTotalElements());

            pagina.getContent().forEach(o -> {
                o.setMatricula(o.getDadosOcorrencia().getMatricula());
                o.setCpf(o.getDadosOcorrencia().getCpf());
            });
            ocorrenciaRepository.saveAll(pagina.getContent());

            page++;
        } while (pagina.hasNext());
    }

    public void upgradeExclusaoRetificacao() {
        Optional<ControleUpgrade> upgrade = upgradeRepository.findById(Upgrade.CAMPO_EXCLUSAO_RETIFICACAO.codUpgrade);
        if (!upgrade.isPresent()) {
            realizaUpgradeExclusaoRetificacao();
            registrarUpgrade(Upgrade.CAMPO_EXCLUSAO_RETIFICACAO);
        }
    }

    @Async
    public void realizaUpgradeExclusaoRetificacao() {
        LOGGER.info("Upgrade: " + Upgrade.CAMPO_EXCLUSAO_RETIFICACAO.desUpgrade);

        // Passo 1: Buscar todas as ocorrências de exclusão processadas com sucesso usando specs
        LOGGER.info("Buscando ocorrências de exclusão...");
        List<Ocorrencia> exclusoes = ocorrenciaRepository.findAll(
                specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                        .and(specs.dosTipos(Collections.singletonList(TipoEvento.EXCLUSAO)))
        );

        LOGGER.info("Total de exclusões encontradas: {}", exclusoes.size());

        // Criar mapa: nrRecEvt -> ID da ocorrência de exclusão
        Map<String, Long> mapaExclusoes = criarMapaExclusoes(exclusoes);

        LOGGER.info("Mapa de exclusões criado com {} entradas", mapaExclusoes.size());

        // Passo 2: Buscar todas as ocorrências com retificação processadas com sucesso
        LOGGER.info("Buscando ocorrências com retificação...");
        List<Object[]> retificacoes = ocorrenciaRepository.buscarOcorrenciasComRetificacao(Estado.PROCESSADO_COM_SUCESSO.getId());

        LOGGER.info("Total de retificações encontradas: {}", retificacoes.size());

        // Criar mapa: retificarRecibo -> ID da ocorrência que retifica
        Map<String, Long> mapaRetificacoes = criarMapaRetificacoes(retificacoes);

        LOGGER.info("Mapa de retificações criado com {} entradas", mapaRetificacoes.size());

        // Passo 3: Processar todas as ocorrências processadas com sucesso em batch
        final int batchSize = 100;
        int page = 0;
        Page<Ocorrencia> pagina;
        int totalAtualizacoes = 0;

        LOGGER.info("Processando exclusões e retificações em batch...");

        do {
            PageRequest pageRequest = PageRequest.of(page, batchSize, Sort.by("id"));
            pagina = ocorrenciaRepository.findAll(
                    specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO)),
                    pageRequest
            );

            int elemento = page * batchSize + pagina.getNumberOfElements();
            LOGGER.info("Processando batch: {} de {} ocorrências", elemento, pagina.getTotalElements());

            List<Ocorrencia> ocorrenciasParaAtualizar = new ArrayList<>();

            for (Ocorrencia ocorrencia : pagina.getContent()) {
                boolean atualizada = false;

                // Verificar se esta ocorrência foi excluída
                String nrRecibo = ocorrencia.getEvento() != null ? ocorrencia.getEvento().getNrRecibo() : null;
                if (nrRecibo != null && mapaExclusoes.containsKey(nrRecibo)) {
                    Long idExclusao = mapaExclusoes.get(nrRecibo);
                    ocorrencia.setOcorrenciaExclusaoId(idExclusao);
                    atualizada = true;
                }

                // Verificar se esta ocorrência foi retificada
                if (nrRecibo != null && mapaRetificacoes.containsKey(nrRecibo)) {
                    Long idRetificacao = mapaRetificacoes.get(nrRecibo);
                    ocorrencia.setOcorrenciaRetificacaoId(idRetificacao);
                    atualizada = true;
                }

                if (atualizada) {
                    ocorrenciasParaAtualizar.add(ocorrencia);
                }
            }

            if (!ocorrenciasParaAtualizar.isEmpty()) {
                ocorrenciaRepository.saveAll(ocorrenciasParaAtualizar);
                totalAtualizacoes += ocorrenciasParaAtualizar.size();
                LOGGER.info("Atualizadas {} ocorrências neste batch", ocorrenciasParaAtualizar.size());
            }

            page++;
        } while (pagina.hasNext());

        LOGGER.info("Processamento de exclusões e retificações concluído. Total de {} ocorrências atualizadas", totalAtualizacoes);
    }

    public void upgradePeriodoApuracao() {
        Optional<ControleUpgrade> upgrade = upgradeRepository.findById(Upgrade.CAMPO_PERIODO_APURACAO.codUpgrade);
        if (!upgrade.isPresent()) {
            realizaUpgradePeriodoApuracao();
            registrarUpgrade(Upgrade.CAMPO_PERIODO_APURACAO);
        }
    }

    @Async
    public void realizaUpgradePeriodoApuracao() {
        LOGGER.info("Upgrade: " + Upgrade.CAMPO_PERIODO_APURACAO.desUpgrade);

        // Tipos de eventos de folha: S1200, S1202, S1207, S1210, S1298, S1299
        List<TipoEvento> tiposFolha = Arrays.asList(
                TipoEvento.S1200, TipoEvento.S1202, TipoEvento.S1207,
                TipoEvento.S1210, TipoEvento.S1298, TipoEvento.S1299
        );

        final int batchSize = 500;
        int page = 0;
        Page<Ocorrencia> pagina;
        int totalAtualizacoes = 0;

        LOGGER.info("Processando período de apuração em batch...");

        do {
            PageRequest pageRequest = PageRequest.of(page, batchSize, Sort.by("id"));
            pagina = ocorrenciaRepository.findAll(
                    specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                            .and(specs.dosTipos(tiposFolha))
                            .and((root, query, cb) -> cb.isNull(root.get("periodoApuracao"))),
                    pageRequest
            );

            int elemento = page * batchSize + pagina.getNumberOfElements();
            LOGGER.info("Processando batch de período de apuração: {} de {} ocorrências", elemento, pagina.getTotalElements());

            List<Ocorrencia> ocorrenciasParaAtualizar = new ArrayList<>();

            for (Ocorrencia ocorrencia : pagina.getContent()) {
                String periodoApuracao = extrairPeriodoApuracao(ocorrencia);

                if (periodoApuracao != null) {
                    ocorrencia.setPeriodoApuracao(periodoApuracao);
                    ocorrenciasParaAtualizar.add(ocorrencia);
                }
            }

            if (!ocorrenciasParaAtualizar.isEmpty()) {
                ocorrenciaRepository.saveAll(ocorrenciasParaAtualizar);
                totalAtualizacoes += ocorrenciasParaAtualizar.size();
                LOGGER.info("Atualizadas {} ocorrências neste batch", ocorrenciasParaAtualizar.size());
            }

            page++;
        } while (pagina.hasNext());

        LOGGER.info("Processamento de período de apuração concluído. Total de {} ocorrências atualizadas", totalAtualizacoes);
    }

    private String extrairPeriodoApuracao(Ocorrencia ocorrencia) {
        if (ocorrencia.getDadosOcorrencia() == null) {
            return null;
        }

        // Verifica se implementa DadosFolha
        if (ocorrencia.getDadosOcorrencia() instanceof DadosFolha) {
            DadosFolha dadosFolha = (DadosFolha) ocorrencia.getDadosOcorrencia();
            if (dadosFolha.getIdeEvento() != null) {
                return dadosFolha.getIdeEvento().getPerApur();
            }
        }

        // Verifica se implementa DadosFechamentoFolha
        if (ocorrencia.getDadosOcorrencia() instanceof DadosFechamentoFolha) {
            DadosFechamentoFolha dadosFechamentoFolha = (DadosFechamentoFolha) ocorrencia.getDadosOcorrencia();
            if (dadosFechamentoFolha.getIdeEvento() != null) {
                return dadosFechamentoFolha.getIdeEvento().getPerApur();
            }
        }

        return null;
    }

    private static Map<String, Long> criarMapaExclusoes(List<Ocorrencia> exclusoes) {
        Map<String, Long> mapaExclusoes = new HashMap<>();
        for (Ocorrencia exclusao : exclusoes) {
            if (exclusao.getDadosOcorrencia() instanceof Exclusao) {
                Exclusao dadosExclusao = (Exclusao) exclusao.getDadosOcorrencia();
                if (dadosExclusao.getInfoExclusao() != null
                        && dadosExclusao.getInfoExclusao().getNrRecEvt() != null) {
                    String nrRecEvt = dadosExclusao.getInfoExclusao().getNrRecEvt();
                    mapaExclusoes.put(nrRecEvt, exclusao.getId());
                }
            }
        }
        return mapaExclusoes;
    }

    private static Map<String, Long> criarMapaRetificacoes(List<Object[]> retificacoes) {
        Map<String, Long> mapaRetificacoes = new HashMap<>();
        for (Object[] retificacao : retificacoes) {
            Long id = (Long) retificacao[0];
            String retificarRecibo = (String) retificacao[1];
            if (retificarRecibo != null) {
                mapaRetificacoes.put(retificarRecibo, id);
            }
        }
        return mapaRetificacoes;
    }

    private void registrarUpgrade(Upgrade upgrade) {
        ControleUpgrade controleUpgrade = new ControleUpgrade();
        controleUpgrade.codUpgrade = upgrade.codUpgrade;
        controleUpgrade.desUpgrade = upgrade.desUpgrade;
        upgradeRepository.save(controleUpgrade);
    }

}
