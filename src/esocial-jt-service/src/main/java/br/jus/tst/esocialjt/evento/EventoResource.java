package br.jus.tst.esocialjt.evento;

import java.util.List;
import java.util.stream.Collectors;

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

@RestController
@RequestMapping("/eventos")
public class EventoResource {

	@Autowired
	private EnvioServico envioServico;

	@Autowired
	private EventoServico eventoServico;

	@PostMapping( path = "/acoes/enviar", produces = "application/json;charset=UTF-8" ) 
	public Object enviarTodosEventos(
			@RequestParam(value = "id", required = false) Long[] id, 
			@RequestParam(value = "tipo", required = false) List<Long> tipo,
			@RequestParam(value = "estado", required = false) List<Long> estado, 
			@RequestParam(value = "grupo", required = false) List<Long> grupo) {

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
