package br.jus.tst.esocialjt.xml.assinatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/xml/acoes/assinar")
public class AssinaturaXmlResource {
	
	@Autowired
	private AssinaturaXmlServico servico;
	
	@Operation(summary = "Recebe um xml de evento do eSocial e assina usando o certificado digital da aplicação.")
	@PostMapping(consumes = "text/xml;charset=UTF-8", produces = "text/xml;charset=UTF-8")
	public String assinar(@RequestBody String xml) throws AssinaturaResourceNaoDisponivelException{
		return servico.assinar(xml);
	}
	
}
