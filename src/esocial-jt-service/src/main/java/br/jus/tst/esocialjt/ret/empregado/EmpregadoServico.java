package br.jus.tst.esocialjt.ret.empregado;

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
public class EmpregadoServico {

    @Autowired
    OcorrenciaRepository repository;

    @Autowired
    OcorrenciaSpecs specs;

    private Map<TipoOcorrencia, ProcessadorEmpregado> processadores;

    public List<RetEmpregado> obterRetEmpregado(String cpf) {
        ArrayList<RetEmpregado> listaRetEmpregado = new ArrayList<>();

        List<Ocorrencia> ocorrencias = repository.findAll(
                specs.nosEstados(Collections.singletonList(Estado.PROCESSADO_COM_SUCESSO))
                        .and(specs.dosTipos(Arrays.asList(
                                ADMISSAO_TRABALHADOR,
                                ALTERACAO_CADASTRAL,
                                ALTERACAO_CONTRATUAL,
                                AFASTAMENTO_TEMPORARIO,
                                CESSAO,
                                DESLIGAMENTO,
                                REINTEGRACAO
                        ))).and(specs.comCPF(cpf)));

        List<String> exclusoes = getExclusoes(cpf);
        List<String> retificacoes = getRetificacoes(ocorrencias);

        ocorrencias
                .stream()
                .filter(o -> !exclusoes.contains(o.getEvento().getNrRecibo()))
                .filter(o -> !retificacoes.contains(o.getEvento().getNrRecibo()))
                .sorted(Comparator.comparing(o -> o.getDadosOcorrencia().getDataEvento()))
                .forEach(o -> getProcessadorEmpregado(o.getTipoOcorrencia()).processaRegistro(listaRetEmpregado, o));

        return listaRetEmpregado;
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

    private ProcessadorEmpregado getProcessadorEmpregado(TipoOcorrencia tipo) {
        if (processadores == null) {
            processadores = new HashMap<>();
            processadores.put(TipoOcorrencia.ADMISSAO_TRABALHADOR, new Processador2200());
            processadores.put(TipoOcorrencia.ALTERACAO_CADASTRAL, new Processador2205());
            processadores.put(TipoOcorrencia.ALTERACAO_CONTRATUAL, new Processador2206());
            processadores.put(TipoOcorrencia.AFASTAMENTO_TEMPORARIO, new Processador2230());
            processadores.put(TipoOcorrencia.CESSAO, new Processador2231());
            processadores.put(TipoOcorrencia.REINTEGRACAO, new Processador2298());
            processadores.put(TipoOcorrencia.DESLIGAMENTO, new Processador2299());
        }
        return Optional.of(processadores.get(tipo))
                .orElseThrow(() -> new RuntimeException("Não foi encontrado um processador para o tipo " + tipo));
    }
}
