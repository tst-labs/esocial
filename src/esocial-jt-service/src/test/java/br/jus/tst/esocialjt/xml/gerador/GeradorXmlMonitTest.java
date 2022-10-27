package br.jus.tst.esocialjt.xml.gerador;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.ocorrencia.ExemploOcorrenciaServico;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlMonitTest {
	
	@Autowired
	GeradorXmlMonit gerador;

	@Test
	public void deveGerarXmlMonit() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.NORMAL);
		String xml = gerador.gerarXml(evento);
		assertThat(xml).contains("evtMonit");
		assertThat(xml).contains("<indRetif>1</indRetif>");
	}

	@Test
	public void deveGerarXmlMonitRetificacao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia()
			.setOperacao(Operacao.RETIFICACAO)
			.setRetificarRecibo("1.2.0000000000007498277");
		String xml = gerador.gerarXml(evento);
		assertThat(xml).contains("evtMonit");
		assertThat(xml).contains("<indRetif>2</indRetif>");
	}
	
	private Evento getEvento() throws Exception {
		ExemploOcorrenciaServico exemplo = new ExemploOcorrenciaServico();
		Ocorrencia ocorrencia = exemplo.lerOcorrencia(TipoOcorrencia.MONIT);
		Evento evento = new Evento();
		evento.setOcorrencia(ocorrencia);
		ocorrencia.setEvento(evento);
		
		evento.setId(1l);
		evento.setIdEvento("ID1005099680001482017092708200100001");
		evento.setTipoEvento(TipoEvento.MONIT);
		evento.getTipoEvento().setGrupoTipoEvento(new GrupoTipoEvento(2l));
		
		return evento;
	}

}
