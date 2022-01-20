package br.jus.tst.esocialjt.evento;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.EnvioServico;
import br.jus.tst.esocialjt.negocio.EventoServico;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@Transactional
@RequestMapping("/eventos")
public class EventoResource {

	@Autowired
	private EnvioServico envioServico;

	@Autowired
	private EventoServico eventoServico;

	@Operation(summary = "Envia (ou reenvia) manualmente um evento para o eSocial-Gov.")
	@PostMapping( path = "/acoes/enviar", produces = "application/json;charset=UTF-8" ) 
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
}
