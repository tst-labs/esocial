package br.jus.tst.esocialjt.comunicacaogov;

import org.springframework.stereotype.Component;

import br.jus.esocialjt.comunicacao.lote.eventos.consulta.ESocial;
import br.jus.esocialjt.comunicacao.lote.eventos.consulta.ESocial.ConsultaLoteEventos;
import br.jus.esocialjt.comunicacao.wsdl.ConsultarLoteEventos;
import br.jus.esocialjt.comunicacao.wsdl.ConsultarLoteEventos.Consulta;

@Component
public class GeradorLoteConsulta {

	public ConsultarLoteEventos gerarConsulta(String protocolo) {
		ESocial eSocial = new ESocial();
		ConsultaLoteEventos consultaLote = new ConsultaLoteEventos();
		consultaLote.setProtocoloEnvio(protocolo);
		eSocial.setConsultaLoteEventos(consultaLote);
		
		ConsultarLoteEventos consultarLoteEventos = new ConsultarLoteEventos();
		Consulta consulta = new Consulta();
		consultarLoteEventos.setConsulta(consulta);
		consulta.setAny(eSocial);
		
		return consultarLoteEventos;
	}
}
