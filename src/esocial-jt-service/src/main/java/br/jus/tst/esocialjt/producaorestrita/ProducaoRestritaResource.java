package br.jus.tst.esocialjt.producaorestrita;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocialjt.TipoAmbiente;
import br.jus.tst.esocialjt.dominio.Evento;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/producao-restrita")
public class ProducaoRestritaResource {

	@Value("${esocialjt.ambiente}")
	private TipoAmbiente ambiente;

	@Value("${esocialjt.cnpj-empregador}")
	private String cnpjEmpregador;
	
	@Autowired
	private ProducaoRestritaServico producaoRestritaServico;

	@Operation(summary = "Envia um comando para limpar a base de produção restrita no eSocial-Gov e reinicia a base de dados local.")
	@PostMapping(path="/acoes/limpar", produces = "application/json;charset=UTF-8")
	public Evento limparProducaoRestrita(
			@RequestParam(name = "cnpj", required = false) 
			@Parameter(description = "Se nulo, usa o CNPJ do empregador." )
			String cnpj) {
		if (StringUtils.isBlank(cnpj)) {
			cnpj = cnpjEmpregador;
		}
		return producaoRestritaServico.limparProducaoRestrita(cnpj, ambiente);
	}
}
