package br.jus.tst.esocialjt.ret.semvinculo;

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

import static br.jus.tst.esocialjt.dominio.TipoEvento.*;

@Service
public class TrabalhadorSemVinculoServico {

    @Autowired
    OcorrenciaRepository repository;

    @Autowired
    OcorrenciaSpecs specs;

    private Map<TipoOcorrencia, ProcessadorTrabalhadorSemVinculo> processadores;

    public List<RetTrabalhadorSemVinculo> obterRetTrabalhadorSemVinculo(String cpf) {
        ArrayList<RetTrabalhadorSemVinculo> listaRetRetTrabalhadorSemVinculo = new ArrayList<>();

        List<Ocorrencia> ocorrencias = repository.findAll(
                specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                        .and(specs.dosTipos(Arrays.asList(
                                TSV_INICIO,
                                TSV_ALTERACAO_CONTRATUAL,
                                TSV_TERMINO
                        ))).and(specs.comCPF(cpf)));

        List<String> exclusoes = getExclusoes(cpf);
        List<String> retificacoes = getRetificacoes(ocorrencias);

        ocorrencias
                .stream()
                .filter(o -> !exclusoes.contains(o.getEvento().getNrRecibo()))
                .filter(o -> !retificacoes.contains(o.getEvento().getNrRecibo()))
                .sorted(Comparator.comparing(o -> o.getDadosOcorrencia().getDataEvento()))
                .forEach(o -> getProcessadorTrabalhadorSemVinculo(o.getTipoOcorrencia()).processaRegistro(listaRetRetTrabalhadorSemVinculo, o));

        return listaRetRetTrabalhadorSemVinculo;
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
                                .and(specs.dosTipos(Collections.singletonList(EXCLUSAO)))
                                .and(specs.comCPF(cpf))
                )
                .stream()
                .map(o -> (Exclusao) o.getDadosOcorrencia())
                .map(o -> o.getInfoExclusao().getNrRecEvt())
                .collect(Collectors.toList());
    }

    private ProcessadorTrabalhadorSemVinculo getProcessadorTrabalhadorSemVinculo(TipoOcorrencia tipo) {
        if (processadores == null) {
            processadores = new HashMap<>();
            processadores.put(TipoOcorrencia.TSV_INICIO, new Processador2300());
        }
        return Optional.of(processadores.get(tipo))
                .orElseThrow(() -> new RuntimeException("Não foi encontrado um processador para o tipo " + tipo));
    }
}
