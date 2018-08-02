package br.jus.tst.esocialjt.producaorestrita;

import javax.ws.rs.QueryParam;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tst.esocialjt.TipoAmbiente;

@RestController
@RequestMapping("/producao-restrita")
public class ProducaoRestritaResource {

	@Value("${esocialjt.ambiente}")
	private TipoAmbiente ambiente;

	@Value("${esocialjt.cnpj-empregador}")
	private String cnpjEmpregador;
	
	@Autowired
	private ProducaoRestritaServico producaoRestritaServico;

	@PostMapping(path="/acoes/limpar", produces = "application/json;charset=UTF-8")
	public Object limparProducaoRestrita(@QueryParam("cnpj") String cnpj) {
		if (StringUtils.isBlank(cnpj)) {
			cnpj = cnpjEmpregador;
		}
		return producaoRestritaServico.limparProducaoRestrita(cnpj, ambiente);
	}
}
