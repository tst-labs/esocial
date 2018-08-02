package br.jus.tst.esocialjt.ocorrencia;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.negocio.OcorrenciaServico;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaResource {

	@Autowired
	private OcorrenciaServico ocorrenciaServico;
	
	@Autowired
	private ExemploOcorrenciaServico exemploServico;

	@GetMapping
	public Object listarTodos() {
		return ocorrenciaServico.recuperaTodos();
	}

	@GetMapping("/dados-basicos")
	public Object listarDadosBasicos() {
		return ocorrenciaServico.recuperaDadosBasicos();
	}

	@GetMapping("/{id}")
	public Object getOcorrenciaPorId(@PathVariable("id") long id) throws EntidadeNaoExisteException {
		return ocorrenciaServico.recuperaPorId(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json;charset=UTF-8")
	public Object receber(@RequestBody OcorrenciaDTO ocorrenciaDTO) {

		Ocorrencia ocorrencia = OcorrenciaMapper.INSTANCE.comoOcorrencia(ocorrenciaDTO);
		ocorrencia.setDataRecebimento(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));

		return ocorrenciaServico.salvar(ocorrencia);
	}
	
	@GetMapping("/exemplos")
	public Object getExemplo() {
		return Arrays.stream(TipoOcorrencia.values())
			.map(tipo -> "/ocorrencias/exemplos/" + tipo.toString())
			.collect(Collectors.toList());
	}
	
	@GetMapping("/exemplos/{tipo}")
	public Object getExemplosPorTipo(@PathVariable("tipo") TipoOcorrencia tipo) 
			throws EntidadeNaoExisteException, IOException {
		return exemploServico.lerOcorrenciaDTO(tipo);
	}
}
