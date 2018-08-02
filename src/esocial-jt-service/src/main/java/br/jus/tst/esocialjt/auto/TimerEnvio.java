package br.jus.tst.esocialjt.auto;

import java.util.concurrent.ScheduledFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class TimerEnvio {
	
	@Value("${esocialjt.periodoAutoMilis:0}")
	private Long periodoAuto;
	
	@Autowired
	private TaskScheduler taskScheduler;

	@Autowired
	private CicloEnvio cicloEnvio;

	private ScheduledFuture<?> scheduledFuture;
	
	private static final String TIMER_INFO = "Execucao automatica eSocial-JT";
	
    public void setPeriodo(long periodoAuto) {
    	if(periodoAuto > 0) {
    		this.periodoAuto = periodoAuto;
    	}
	}
    
    public void iniciar() {
    	if(scheduledFuture == null && periodoAuto > 0) {
    		scheduledFuture = taskScheduler.scheduleAtFixedRate(executar(), periodoAuto);
    	}
    }

    public void parar() {
    	if(scheduledFuture != null) {
    		scheduledFuture.cancel(false);
    		scheduledFuture = null;
    	}
    }

    private Runnable executar() {
        return () ->  cicloEnvio.executar();
    }

	public Status getStatus() {
		return new Status(TIMER_INFO, scheduledFuture != null, periodoAuto);
	}
}
