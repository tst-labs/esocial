package br.jus.tst.esocialjt.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Component
public class Sequencial {
	private int numero = 0;
	
	public synchronized int proximo() {
		numero = (numero+1)%100000;
		return numero;
	}
}
