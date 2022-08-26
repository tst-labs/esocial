package br.jus.tst.esocialjt.ocorrencia;

import br.jus.tst.esocial.ocorrencia.OcorrenciaDTO;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Estado;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.EntidadeNaoExisteException;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaResource {

	@Autowired
	private OcorrenciaServico ocorrenciaServico;

	@Autowired
	private ExemploOcorrenciaServico exemploServico;

	@Operation(summary ="Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações completas.")
	@GetMapping
	@Deprecated
	public List<Ocorrencia> listarTodos() {
		return ocorrenciaServico.recuperaTodos();
	}

	@Operation(summary ="Consulta todas as ocorrências já recebidas pelo sistema, exibindo informações simplificadas. Esta consulta tende a ser mais rápida que a consulta de dados completos.")
	@GetMapping("/dados-basicos")
	@Deprecated
	public List<OcorrenciaDadosBasicosDTO> listarDadosBasicos() {
		return ocorrenciaServico.recuperaDadosBasicos();
	}

	@GetMapping(value="/sumario/{tipo}", produces = "text/csv")
	@Operation(summary = "Retorna um resumo de todos eventos enviados para um tipo em csv. Pode ser muito lento para um grande volume de dados.")
	public void getSumario(HttpServletResponse response, @PathVariable("tipo") long tipo) throws IOException{
		response.setContentType("text/csv");

		String[] params = {"id", "cpf", "matricula", "referencia", "tipo", "estado", "dataOcorrencia"};
		List<OcorrenciaSumario> sumario = ocorrenciaServico.getSumario(new TipoEvento(tipo));

		CsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		csvWriter.writeHeader(params);
		for (OcorrenciaSumario s : sumario) {
			csvWriter.write(s, params);
		}
 		csvWriter.close();
	}

	@Operation(summary = "Consulta, com paginação, todas as ocorrências já recebidas pelo sistema, exibindo informações completas.")
	@GetMapping("/paginado")
	public OcorrenciaPage listarPaginado(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "20") int size,
			@RequestParam(required = false, defaultValue = "") List<Long> estados,
			@RequestParam(required = false, defaultValue = "") String expressao,
			@RequestParam(required = false, defaultValue = "") List<Long> tipos,
			@RequestParam(required = false, defaultValue = "false") boolean incluirArquivados,
			@RequestParam(required = false, defaultValue = "") String cpf) {
		List<Estado> estadosObj = estados
									.stream()
									.map(Estado::new)
									.collect(Collectors.toList());
		
		List<TipoEvento> tiposObj = tipos
									.stream()
									.map(TipoEvento::new)
									.collect(Collectors.toList());
		
		return ocorrenciaServico.recuperaPaginado(page, size, estadosObj, expressao, tiposObj, incluirArquivados, cpf);
	}
	
	@Operation(summary = "Consulta os tipos já enviados para o esocial.")
	@GetMapping("/tipos")
	public List<Long> listarTiposExistentes() {
		return ocorrenciaServico.buscarTiposEnviados();
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
		return ocorrenciaServico.salvar(ocorrencia);
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
	
	@Operation(summary ="Arquivar uma ocorrência especificada pelo id.")
	@PostMapping("/{id}/acoes/arquivar")
	public int arquivarOcorrenciaPorId(@PathVariable("id") long id) {
		return ocorrenciaServico.arquivar(id);
	}
	
	@Operation(summary ="Desarquivar uma ocorrência especificada pelo id.")
	@PostMapping("/{id}/acoes/desarquivar")
	public int desarquivarOcorrenciaPorId(@PathVariable("id") long id) {
		return ocorrenciaServico.desarquivar(id);
	}

}
