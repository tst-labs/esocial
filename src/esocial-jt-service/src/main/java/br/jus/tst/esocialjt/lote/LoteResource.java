package br.jus.tst.esocialjt.lote;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoServico;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@RestController
@RequestMapping("/lote")
public class LoteResource {

	@Autowired
	private AtualizacaoProcessamentoServico atualizacaoProcessamentoServico;

	@Autowired
	private ComunicacaoServico comunicacaoServico;

	@GetMapping(path = "/consulta/{protocolo:.+}", produces = "text/xml;charset=UTF-8")
	public String consultaProtocolo(@PathVariable("protocolo") String protocolo) throws IOException {
		return comunicacaoServico.consultarLote(protocolo);
	}

	@PostMapping(value = "/acoes/enviar", consumes = "text/xml;charset=UTF-8", produces = "text/xml;charset=UTF-8")
	public String enviarParaEsocialGov(@RequestBody String lote) throws IOException {
		return comunicacaoServico.enviarLote(lote);
	}
	
	@PostMapping("/acoes/atualizar-processamento")
	public Object atualizarProcessamentoTodosEmProcessamento()
			throws ComunicacaoEsocialGovException {
		return atualizacaoProcessamentoServico.atualizarTodosEmProcessamento();
	}

	@PostMapping("/acoes/atualizar-processamento/{protocolo}")
	public Object atualizarProcessamentoEvento(@PathVariable("protocolo") String protocolo)
			throws ComunicacaoEsocialGovException {
		return atualizacaoProcessamentoServico.atualizarProcessamentoLote(protocolo);
	}
}