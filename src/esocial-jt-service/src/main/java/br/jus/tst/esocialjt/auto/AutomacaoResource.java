package br.jus.tst.esocialjt.auto;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automacao")
public class AutomacaoResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AutomacaoResource.class);
	
	@Autowired
	private TimerEnvio timerEnvio;
	
	@GetMapping(produces = "application/json;charset=UTF-8")
	public Object getStatus(
			@RequestParam(value = "habilitado", required = false) String habilitado,
			@RequestParam(value = "periodo", required = false) String periodo) {
		Object resposta;
		
		if(StringUtils.isBlank(habilitado) && StringUtils.isBlank(periodo)) {
			resposta = timerEnvio.getStatus();
		} else {
			resposta = "{\"erro\":\"Use o método POST para alterar a configuração\"}";
		}
		
		return resposta;
	}
	
	@PostMapping(produces = "application/json;charset=UTF-8")
	public Object habilitarAutomacao(
			@RequestParam(value = "habilitado", required = false, defaultValue = "true") boolean habilitado, 
			@RequestParam(value = "periodo", required = false) Long periodo) {
		
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
