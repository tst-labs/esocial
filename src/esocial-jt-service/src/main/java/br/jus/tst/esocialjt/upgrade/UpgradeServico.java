package br.jus.tst.esocialjt.upgrade;

import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpgradeServico {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpgradeServico.class);
    @Autowired
    ControleUpgradeRepository upgradeRepository;

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public void realizarUpgrades() {
        upgradeCpfMatricula();
    }

    public void upgradeCpfMatricula() {
        Optional<ControleUpgrade> upgrade = upgradeRepository.findById(Upgrade.CAMPO_CPF_MATRICULA.codUpgrade);
        if (!upgrade.isPresent()) {
            realizaUpgradeCpfMatricula();
            ControleUpgrade controleUpgrade = new ControleUpgrade();
            controleUpgrade.codUpgrade = Upgrade.CAMPO_CPF_MATRICULA.codUpgrade;
            controleUpgrade.desUpgrade = Upgrade.CAMPO_CPF_MATRICULA.desUpgrade;
            upgradeRepository.save(controleUpgrade);
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
            LOGGER.info(String.format("Atualização de CPF e Matricula: Evento %d de %d", elemento, pagina.getTotalElements()));

            pagina.getContent().forEach(o -> {
                o.setMatricula(o.getDadosOcorrencia().getMatricula());
                o.setCpf(o.getDadosOcorrencia().getCpf());
            });
            ocorrenciaRepository.saveAll(pagina.getContent());

            page++;
        } while (pagina.hasNext());
    }
}
