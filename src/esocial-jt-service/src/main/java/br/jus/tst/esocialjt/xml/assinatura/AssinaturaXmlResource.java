package br.jus.tst.esocialjt.xml.assinatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/xml/acoes/assinar")
public class AssinaturaXmlResource {
	
	@Autowired
	private AssinaturaXmlServico servico;
	
	@Value("${esocialjt.disponibilizarServicoAssinatura}")
	private boolean disponibilizarServicoAssinatura;
	
	@PostMapping(consumes = "text/xml", produces = "text/xml")
	public Object assinar(@RequestBody String pBody) throws AssinaturaResourceNaoDisponivelException{
		if(!disponibilizarServicoAssinatura) {
			throw new AssinaturaResourceNaoDisponivelException();
		}
		return servico.assinar(pBody);
	}
	
	@ExceptionHandler
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	public void handleAssinaturaResourceNaoDisponivelException(AssinaturaResourceNaoDisponivelException e) {
		
	}
}
