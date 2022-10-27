package br.jus.tst.esocialjt.ret.beneficiario;

import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaRepository;
import br.jus.tst.esocialjt.ocorrencia.OcorrenciaSpecs;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static br.jus.tst.esocialjt.dominio.TipoEvento.CADASTRO_BENEFICIARIO_INI;
import static br.jus.tst.esocialjt.dominio.TipoEvento.EXCLUSAO;

@Service
public class BeneficiarioServico {

    @Autowired
    OcorrenciaRepository repository;

    @Autowired
    OcorrenciaSpecs specs;

    private Map<TipoOcorrencia, ProcessadorBeneficiario> processadores;

    public List<RetBeneficiario> obterRetBeneficiario(String cpf) {
        ArrayList<RetBeneficiario> beneficiarios = new ArrayList<>();

        List<Ocorrencia> ocorrencias = repository.findAll(
                specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                        .and(
                                specs.dosTipos(
                                        Arrays.asList(
                                                CADASTRO_BENEFICIARIO_INI
                                        )
                                )
                        )
                        .and(
                                specs.comCPF(cpf)
                        )
        );

        List<String> exclusoes = getExclusoes(cpf);
        List<String> retificacoes = getRetificacoes(ocorrencias);

        ocorrencias
                .stream()
                .filter(o -> !exclusoes.contains(o.getEvento().getNrRecibo()))
                .filter(o -> !retificacoes.contains(o.getEvento().getNrRecibo()))
                .sorted(Comparator.comparing(o -> o.getDadosOcorrencia().getDataEvento()))
                .forEach(o -> getProcessadorBeneficiario(o.getTipoOcorrencia()).processaRegistro(beneficiarios, o));

        return beneficiarios;
    }

    private static List<String> getRetificacoes(List<Ocorrencia> ocorrencias) {
        return ocorrencias
                .stream()
                .map(Ocorrencia::getRetificarRecibo)
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.toList());
    }

    private List<String> getExclusoes(String cpf) {
        return repository
                .findAll(
                        specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                                .and(
                                        specs.dosTipos(
                                                Collections.singletonList(
                                                        EXCLUSAO
                                                )
                                        )
                                )
                                .and(
                                        specs.comCPF(cpf)
                                )
                )
                .stream()
                .map(o -> (Exclusao) o.getDadosOcorrencia())
                .map(o -> o.getInfoExclusao().getNrRecEvt())
                .collect(Collectors.toList());
    }

    private ProcessadorBeneficiario getProcessadorBeneficiario(TipoOcorrencia tipo) {
        if (processadores == null) {
            processadores = new HashMap<>();
            processadores.put(TipoOcorrencia.CADASTRO_BENEFICIARIO_INI, new Processador2400());
        }
        return Optional.of(processadores.get(tipo))
                .orElseThrow(() -> new RuntimeException("Não foi encontrado um processador para o tipo " + tipo));
    }

}
