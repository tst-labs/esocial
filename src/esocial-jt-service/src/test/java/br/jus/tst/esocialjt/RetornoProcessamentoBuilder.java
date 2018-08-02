package br.jus.tst.esocialjt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.jus.tst.esocialjt.comunicacaogov.RetornoErroProcessamento;
import br.jus.tst.esocialjt.comunicacaogov.RetornoEvento;
import br.jus.tst.esocialjt.comunicacaogov.RetornoLote;
import br.jus.tst.esocialjt.comunicacaogov.RetornoProcessamento;
import br.jus.tst.esocialjt.dominio.EnvioEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.Lote;

public class RetornoProcessamentoBuilder {
	
	private static final int COD_SUCESSO = 201;
	private static final int AGUARDANDO_PROCESSAMENTO = 101;

	private Lote lote;
	private RetornoLote retornoLote;
	private Map<Evento, RetornoEvento> retornosEvento = new HashMap<>();
	
	public RetornoProcessamentoBuilder(Lote lote) {
		this.lote = lote;
		
		loteComSucesso();
		eventosComSucesso();
	}
	
	public RetornoProcessamentoBuilder naoProcessado() {
		retornoLote.setCodigoRespostaProcessamento(AGUARDANDO_PROCESSAMENTO);
		retornosEvento = new HashMap<>();
		return this;
	}
	
	public RetornoProcessamentoBuilder respostaEvento(Evento evento, int codResposta, String desResposta,
			RetornoErroProcessamento... erros) {
		
		RetornoEvento retornoEvento = new RetornoEvento();
		retornoEvento.setIdEvento(evento.getIdEvento());
		retornoEvento.setCodigoRespostaProcessamento(codResposta);
		retornoEvento.setDescricaoRespostaProcessamento(desResposta);
		retornoEvento.setRetornoErrosProcessamento(Arrays.asList(erros));
		
		retornosEvento.put(evento, retornoEvento);
		
		return this;
	}
	
	public RetornoProcessamentoBuilder respostaEvento(String idEvento, int codResposta, String desResposta,
			RetornoErroProcessamento... erros) {
		
		Evento evento = retornosEvento.keySet().stream()
			.filter(ev -> ev.getIdEvento().equals(idEvento))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("Nenhum evento com idEvento: "+ idEvento));
		
		return respostaEvento(evento, codResposta, desResposta, erros);
	}
	
	
	
	public RetornoProcessamentoBuilder respostaLote(int codResposta, String desResposta,
			RetornoErroProcessamento... erros) {
		
		retornoLote.setCodigoRespostaProcessamento(codResposta);
		retornoLote.setDescricaoRespostaProcessamento(desResposta);
		retornoLote.setRetornoErrosProcessamento(Arrays.asList(erros));
		
		return this;
	}
	
	private void loteComSucesso() {
		retornoLote = new RetornoLote();
		retornoLote.setProtocolo(lote.getProtocolo());
		retornoLote.setCodigoRespostaProcessamento(COD_SUCESSO);
		retornoLote.setRetornoErrosProcessamento(new ArrayList<>());
	}
	
	private void eventosComSucesso() {
		lote.getEnviosEvento().stream()
			.map(EnvioEvento::getEvento)
			.forEach(evento -> {
				RetornoEvento retornoEvento = new RetornoEvento();
				retornoEvento.setIdEvento(evento.getIdEvento());
				retornoEvento.setCodigoRespostaProcessamento(COD_SUCESSO);
				retornoEvento.setRetornoErrosProcessamento(new ArrayList<>());
				retornosEvento.put(evento, retornoEvento);
			});
	}

	public RetornoProcessamento criar() {
		RetornoProcessamento retornoProcessamento = new RetornoProcessamento();
		retornoProcessamento.setRetornoLote(retornoLote);
		if(!retornosEvento.isEmpty()) {
			retornoLote.setRetornoEvento(new ArrayList<RetornoEvento>(retornosEvento.values()));
		}
		return retornoProcessamento;
	}
}
