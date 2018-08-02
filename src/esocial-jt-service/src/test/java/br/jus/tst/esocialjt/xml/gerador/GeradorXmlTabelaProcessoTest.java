package br.jus.tst.esocialjt.xml.gerador;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.ocorrencia.ExemploOcorrenciaServico;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlTabelaProcessoTest {

	@Autowired
	GeradorXmlTabelaProcesso gerador;

	@Test
	public void deveGerarXmlInclusao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.INCLUSAO);
		
		String xml = gerador.gerarXml(evento);
		
		assertThat(xml)
			.contains("evtTabProcesso")
			.contains("inclusao")
			.doesNotContain("alteracao")
			.doesNotContain("exclusao");
	}
	
	@Test
	public void deveGerarXmlAlteracao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.ALTERACAO);
		
		String xml = gerador.gerarXml(evento);
		
		assertThat(xml)
			.contains("evtTabProcesso")
			.doesNotContain("inclusao")
			.contains("alteracao")
			.doesNotContain("exclusao");
	}
	
	@Test
	public void deveGerarXmlExclusao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.EXCLUSAO);
		
		String xml = gerador.gerarXml(evento);
		
		assertThat(xml)
			.contains("evtTabProcesso")
			.doesNotContain("inclusao")
			.doesNotContain("alteracao")
			.contains("exclusao");
	}
	
	private Evento getEvento() throws Exception {
		ExemploOcorrenciaServico exemplo = new ExemploOcorrenciaServico();
		Ocorrencia ocorrencia = exemplo.lerOcorrencia(TipoOcorrencia.TABELA_PROCESSO);
		Evento evento = new Evento();
		evento.setOcorrencia(ocorrencia);
		ocorrencia.setEvento(evento);
		
		evento.setId(1l);
		evento.setIdEvento("ID1005099680001482017092708200100001");
		evento.setTipoEvento(TipoEvento.TABELA_PROCESSO);
		evento.getTipoEvento().setGrupoTipoEvento(new GrupoTipoEvento(1l));
		
		return evento;
	}

}
