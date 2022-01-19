package br.jus.tst.esocialjt.auto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/automacao")
public class AutomacaoResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AutomacaoResource.class);
	
	@Autowired
	private TimerEnvio timerEnvio;
	
	@Operation(summary = "Consulta o status do processamento automático da aplicação.")
	@GetMapping(produces = "application/json;charset=UTF-8")
	public Status getStatus( ) {
		return timerEnvio.getStatus();
	}
	
	@Operation(summary = "Configura o processamento automático da aplicação.")
	@PostMapping(produces = "application/json;charset=UTF-8")
	public Status habilitarAutomacao(
			@Parameter (description = "Habilita ou desabilita a execução automática. Valores válidos [true, false]", example = "true")
			@RequestParam(value = "habilitado", required = true, defaultValue = "true") 
			boolean habilitado, 
			
			@Parameter (description = "Período em milisegundos entre cada ciclo de execução", example = "10000")
			@RequestParam(value = "periodo", required = false) 
			Long periodo) {
		
		if(periodo != null) {
			timerEnvio.parar();
			timerEnvio.setPeriodo(periodo);
		}
		
		if(habilitado) {
			timerEnvio.iniciar();
		} else {
			timerEnvio.parar();
		}
		
		LOGGER.info(timerEnvio.getStatus().toString());
		return timerEnvio.getStatus();
	}
}
