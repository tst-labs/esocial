package br.jus.tst.esocialjt.xml.gerador;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;
import br.jus.tst.esocialjt.ocorrencia.ExemploOcorrenciaServico;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlInformacaoEmpregadorTest {

	@Autowired
	GeradorXmlInformacaoEmpregador gerador;

	@Test
	public void deveGerarXmlInclusao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.INCLUSAO);
		
		String xml = gerador.gerarXml(evento);
		assertThat(xml)
				.contains("evtInfoEmpregador")
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
				.contains("evtInfoEmpregador")
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
				.contains("evtInfoEmpregador")
				.doesNotContain("inclusao")
				.doesNotContain("alteracao")
				.contains("exclusao");
	}

	@Test(expected = GeracaoXmlException.class)
	public void deveLancarGeracaoXmlExceptionSeInvalido() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.INCLUSAO);
		InformacoesEmpregador informacaoEmpregador = (InformacoesEmpregador) evento.getOcorrencia()
				.getDadosOcorrencia();
		informacaoEmpregador.getInfoEmpregador().getInfoCadastro().getContato().setCpfCtt("123");
		gerador.gerarXml(evento);
	}

	private Evento getEvento() throws Exception {
		ExemploOcorrenciaServico exemplo = new ExemploOcorrenciaServico();
		Ocorrencia ocorrencia = exemplo.lerOcorrencia(TipoOcorrencia.INFORMACOES_EMPREGADOR);
		Evento evento = new Evento();
		evento.setOcorrencia(ocorrencia);
		ocorrencia.setEvento(evento);

		evento.setId(1l);
		evento.setIdEvento("ID1005099680001482017092708200100001");
		evento.setTipoEvento(TipoEvento.INFORMACOES_EMPREGADOR);
		evento.getTipoEvento().setGrupoTipoEvento(new GrupoTipoEvento(1l));

		return evento;
	}

}
