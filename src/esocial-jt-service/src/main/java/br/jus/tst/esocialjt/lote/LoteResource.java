package br.jus.tst.esocialjt.lote;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoServico;
import br.jus.tst.esocialjt.dominio.Lote;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/lote")
public class LoteResource {

	@Autowired
	private AtualizacaoProcessamentoServico atualizacaoProcessamentoServico;

	@Autowired
	private ComunicacaoServico comunicacaoServico;

	@Operation(summary = "Consulta o xml de resposta de processamento diretamente eSocial-Gov. Esta consulta não causa nenhuma alteração no sistema local.")
	@GetMapping(path = "/consulta/{protocolo:.+}", produces = "text/xml;charset=UTF-8")
	public String consultaProtocolo(
			@Parameter(description = "Número de protocolo retornado pelo eSocial-Gov após o envio de um lote", example = "1.2.201711.0000000000000062303")
			@PathVariable("protocolo") 
			String protocolo
			) throws IOException {
		return comunicacaoServico.consultarLote(protocolo);
	}

	@Operation(summary = "Fornece para outras aplicações o serviço de envio do xml contendo um lote do eSocial para o eSocial-Gov. Este serviço faz o encapsulamento do protocolo SOAP e envia o lote por uma conexão HTTPS usando o certificado digital da aplicação.")
	@PostMapping(value = "/acoes/enviar", consumes = "text/xml;charset=UTF-8", produces = "text/xml;charset=UTF-8")
	public String enviarParaEsocialGov(@RequestBody String lote) throws IOException {
		return comunicacaoServico.enviarLote(lote);
	}
	
	@Operation(summary = "Busca no eSocial-Gov o resultado do processamento de todos os lotes que ainda estão pendentes e registra os sucessos e erros no sistema local. Esta api só deve ser usada quando o processamento automático está desabilitado.")
	@PostMapping("/acoes/atualizar-processamento")
	public List<Lote> atualizarProcessamentoTodosEmProcessamento()
			throws ComunicacaoEsocialGovException {
		return atualizacaoProcessamentoServico.atualizarTodosEmProcessamento();
	}

	@Operation(summary = "Busca no eSocial-Gov o resultado do processamento para um lote com protocolo específico e registra os sucessos e erros no sistema local. Esta api só deve ser usada quando o processamento automático está desabilitado.")
	@PostMapping("/acoes/atualizar-processamento/{protocolo}")
	public List<Lote> atualizarProcessamentoEvento(@PathVariable("protocolo") String protocolo)
			throws ComunicacaoEsocialGovException {
		return atualizacaoProcessamentoServico.atualizarProcessamentoLote(protocolo);
	}
}