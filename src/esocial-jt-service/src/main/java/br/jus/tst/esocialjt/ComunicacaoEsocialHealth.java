package br.jus.tst.esocialjt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;

@Component
@Endpoint(id="esocial-health")
public class ComunicacaoEsocialHealth {

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;
	
	@ReadOperation
	public Health doHealthCheck() {
		Health.Builder builder = new Health.Builder();
		
		if(comunicacaoEsocialGov.testarConexaoEsocial()) {
			builder.up();
		} else {
			builder.down();
		}
		
		return builder.build();
	}
}
