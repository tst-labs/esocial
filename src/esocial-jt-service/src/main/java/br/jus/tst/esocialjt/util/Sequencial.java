package br.jus.tst.esocialjt.util;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Component
public class Sequencial {
	private static AtomicInteger contador = new AtomicInteger();
	
	public synchronized int proximo() {
		contador.compareAndSet(100000, 0);
		return contador.getAndIncrement();
	}
}
