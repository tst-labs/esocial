package br.jus.tst.esocialjt.negocio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tst.esocialjt.comunicacaogov.ComunicacaoEsocialGov;
import br.jus.tst.esocialjt.negocio.exception.ComunicacaoEsocialGovException;

@Service
public class ConsultaLoteServico {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaLoteServico.class);

	@Autowired
	private ComunicacaoEsocialGov comunicacaoEsocialGov;

	public String consultarProtocolo(String protocolo) {
		String retornoEnvio = "";
		try {
			retornoEnvio = comunicacaoEsocialGov.consultarLoteEventos(protocolo).getXmlRetorno();
		} catch (ComunicacaoEsocialGovException e) {
			LOGGER.error(e.getMessage(), e);
		}

		return retornoEnvio;
	}



}
