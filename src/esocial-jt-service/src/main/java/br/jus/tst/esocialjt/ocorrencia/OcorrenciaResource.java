package br.jus.tst.esocialjt.ocorrencia;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaResource {

	@Autowired
	private OcorrenciaServico ocorrenciaServico;
	
	@Autowired
	private ExemploOcorrenciaServico exemploServico;
	
	@Autowired
	OcorrenciaRepository repository;

	@Operation(summary ="Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações completas.")
	@GetMapping
	public List<Ocorrencia> listarTodos() {
		return ocorrenciaServico.recuperaTodos();
	}

	@Operation(summary ="Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações simplificadas. Esta consulta tende a ser mais rápida que a consulta de dados completos.")
	@GetMapping("/dados-basicos")
	public List<OcorrenciaDadosBasicosDTO> listarDadosBasicos() {
		return ocorrenciaServico.recuperaDadosBasicos();
	}
	
	@Operation(summary = "Consulta, com paginação, todas as ocorrências já recebidas pelo sistema, exibindo informações completas.")
	@GetMapping("/paginado")
	public OcorrenciaPage listarPaginado(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "20") int size,
			@RequestParam(required = false, defaultValue = "") List<Long> estados) {
		List<Estado> estadosObj = estados
									.stream()
									.map(id -> new Estado(id))
									.collect(Collectors.toList());
		return ocorrenciaServico.recuperaPaginado(page, size, estadosObj);
	}

	@Operation(summary ="Consulta uma ocorrência especificada pelo id.")
	@GetMapping("/{id}")
	public Ocorrencia getOcorrenciaPorId(@PathVariable("id") long id) throws EntidadeNaoExisteException {
		return ocorrenciaServico.recuperaPorId(id);
	}
	
	@Operation(summary = "Url única para o recebimento de ocorrências. O tipo da ocorrência é passado no próprio json dos dados e deve obedecer "
			+ "ao formato respectivo àquele tipo.")
	@PostMapping(consumes = "application/json", produces = "application/json;charset=UTF-8")
	public Ocorrencia receber(@RequestBody OcorrenciaDTO ocorrenciaDTO) {

		Ocorrencia ocorrencia = OcorrenciaMapper.INSTANCE.comoOcorrencia(ocorrenciaDTO);
		ocorrencia.setDataRecebimento(
				new Date(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));

		Ocorrencia ocorrenciaSalva = ocorrenciaServico.salvar(ocorrencia);
		return ocorrenciaSalva;
	}
	
	@Operation(summary ="Lista URLs com exemplos disponíveis para como uma ocorrência deve ser enviada para o /esocial-jt-service/ocorrencias.")
	@GetMapping("/exemplos")
	public List<String> getExemplo() {
		return Arrays.stream(TipoOcorrencia.values())
			.map(tipo -> "/ocorrencias/exemplos/" + tipo.toString())
			.collect(Collectors.toList());
	}
	
	@Operation(summary ="Retorna o modelo de JSON para cada tipo de ocorrência que deve ser enviada para o /esocial-jt-service/ocorrencias.")
	@GetMapping("/exemplos/{tipo}")
	public OcorrenciaDTO getExemplosPorTipo(@PathVariable("tipo") TipoOcorrencia tipo) 
			throws EntidadeNaoExisteException, IOException {
		return exemploServico.lerOcorrenciaDTO(tipo);
	}

	@GetMapping("/agrupado")
	public List<ContagemEstado> agrupado() {
		return repository.contarTotalPorEstado();
	}
}
