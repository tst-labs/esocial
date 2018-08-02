package br.jus.tst.esocialjt.lote;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.negocio.AtualizacaoProcessamentoServico;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@RestController
@RequestMapping("/lote")
public class LoteResource {

	@Autowired
	private AtualizacaoProcessamentoServico atualizacaoProcessamentoServico;

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	@GetMapping(path = "/consulta/{protocolo:.+}", produces = MediaType.APPLICATION_XML)
	public String consultaProtocolo(@PathVariable("protocolo") String protocolo) throws ComunicacaoEsocialGovException {
		return comunicacaoEsocialGov.consultarLoteEventos(protocolo).getXmlRetorno();
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