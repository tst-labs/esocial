package br.jus.tst.esocialjt.evento;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import br.jus.tst.esocialjt.negocio.EventoTotalizadorServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@Transactional
@RequestMapping("/eventos")
public class EventoResource {

    @Autowired
    private EnvioServico envioServico;

    @Autowired
    private EventoServico eventoServico;

    @Autowired
    private EventoTotalizadorServico eventoTotalizadorServico;

    @Autowired
    private AtualizacaoProcessamentoServico atualizacaoProcessamentoServico;

    @Operation(summary = "Envia (ou reenvia) manualmente um evento para o eSocial-Gov.")
    @PostMapping(path = "/acoes/enviar", produces = "application/json;charset=UTF-8")
    public List<Evento> enviarTodosEventos(
            @Parameter(description = "Id do evento (não confundir com a id da ocorrência)", example = "1")
            @RequestParam(value = "id", required = false, defaultValue = "")
            Long[] id,

            @Parameter(description = "Tipo do evento. [1000, 1005, 1010, 1020, 1030, 1035, 1040, 1050, 1060, 1070, 2200, etc]", example = "1000")
            @RequestParam(value = "tipo", required = false, defaultValue = "")
            List<Long> tipo,

            @Parameter(description = "Estado atual do evento. [1 (EM_FILA), 2 (PROCESSAMENTO), 3 (PROCESSADO_COM_SUCESSO), 4 (PROCESSADO_COM_ERRO), 5 (ERRO)]", example = "1")
            @RequestParam(value = "estado", required = false, defaultValue = "")
            List<Long> estado,

            @Parameter(description = "Grupo do evento. Valores possíveis [1 (TABELA), 2 (NAO_PERIODICO), 3 (PERIODICO)]", example = "1")
            @RequestParam(value = "grupo", required = false, defaultValue = "")
            List<Long> grupo) {

        List<Evento> eventos = eventoServico.criarConsulta()
                .comIds(id)
                .dosTipos(tipo.stream().map(TipoEvento::new).toArray(TipoEvento[]::new))
                .nosEstados(estado.stream().map(Estado::new).toArray(Estado[]::new))
                .dosGrupos(grupo.stream().map(GrupoTipoEvento::new).toArray(GrupoTipoEvento[]::new))
                .buscar();

        List<EnvioEvento> enviosEventos = envioServico.enviarEventosParaESocialGov(eventos);
        return enviosEventos.stream().map(EnvioEvento::getEvento).collect(Collectors.toList());
    }

    @Operation(summary = "Forçar manualmente estado de um evento. ATENÇÃO: esta ação pode gerar inconsistências em relação ao eSocial-Gov, pois o estado aqui pode nãos ser o mesmo estado lá.")
    @PostMapping(path = "/acoes/forcar-estado", produces = "application/json;charset=UTF-8")
    public List<Evento> forcarEstadosEventos(
            @Parameter(description = "Id do evento (não confundir com a id da ocorrência)")
            @RequestParam(value = "id", required = false, defaultValue = "")
            List<Long> id,

            @Parameter(description = "Tipo do evento. [1000, 1005, 1010, 1020, 1030, 1035, 1040, 1050, 1060, 1070, 2200, etc]")
            @RequestParam(value = "tipo", required = false, defaultValue = "")
            List<Long> tipo,

            @Parameter(description = "Estado atual do evento. [1 (EM_FILA), 2 (PROCESSAMENTO), 3 (PROCESSADO_COM_SUCESSO), 4 (PROCESSADO_COM_ERRO), 5 (ERRO)]")
            @RequestParam(value = "estado", required = true, defaultValue = "")
            List<Long> estado,

            @Parameter(description = "Grupo do evento. Valores possíveis [1 (TABELA), 2 (NAO_PERIODICO), 3 (PERIODICO)]")
            @RequestParam(value = "grupo", required = false, defaultValue = "")
            List<Long> grupo,

            @Parameter(description = "Próximo estado do evento. [1 (EM_FILA), 2 (PROCESSAMENTO), 3 (PROCESSADO_COM_SUCESSO), 4 (PROCESSADO_COM_ERRO), 5 (ERRO)]", example = "1")
            @RequestBody Long estadoDestino
    ) {

        boolean todosVazios = Stream.of(id, tipo, estado, grupo).allMatch(List::isEmpty);
        if (todosVazios) {
            throw new IllegalArgumentException("Ao menos um filtro deve ser fornecido.");
        }

        List<Evento> eventos = eventoServico.criarConsulta()
                .comIds(id.toArray(new Long[0]))
                .dosTipos(tipo.stream().map(TipoEvento::new).toArray(TipoEvento[]::new))
                .nosEstados(estado.stream().map(Estado::new).toArray(Estado[]::new))
                .dosGrupos(grupo.stream().map(GrupoTipoEvento::new).toArray(GrupoTipoEvento[]::new))
                .buscar();

        return eventoServico.forcarEstadoEvento(eventos, new Estado(estadoDestino));
    }

    @Operation(summary = "Marca todos os lotes e eventos em processamento como erro. ATENÇÃO: pode causar inconsistência entre o estado desta aplicação com o que está na base do eSocial-Gov.")
    @PostMapping(path = "/acoes/abortar-processamento", produces = "application/json;charset=UTF-8")
    public List<Evento> abortarProcessamento() {
        atualizacaoProcessamentoServico.abortarTodosEmProcessamento();
        return eventoServico.abortarTodosEmProcessamento();
    }

    @GetMapping(value = "/totalizadores/{tipo}/{perApuracao}", produces = "text/csv")
    @Operation(summary = "Retorna resultado de eventos totalizadores por tipo e período de apuração em csv.")
    public StringBuilder getTotalizador(@PathVariable long tipo, @PathVariable String perApuracao) throws IOException {
        return eventoTotalizadorServico.getCSVEventoTotalizador("S" + tipo, perApuracao);
    }
}
