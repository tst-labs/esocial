package br.jus.tst.esocialjt.xml.gerador;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.negocio.exception.GeracaoXmlException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlFactoryTest {
	
	@Autowired
	private GeradorXmlFactory geradorXmlFactory;

	@Test(expected=GeracaoXmlException.class)
	public void deveLancarGeracaoXmlExceptionSeNaoHaTipoEventoCadastrado() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(10000000000l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlInformacaoEmpregador.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlInformacaoEmpregador() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1000l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlInformacaoEmpregador.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaCargo() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1030l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaCargo.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaEstabelecimento() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1005l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaEstabelecimento.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaRubrica() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1010l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaRubrica.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaLotacao() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1020l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaLotacao.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaCarreira() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1035l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaCarreira.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaFuncao() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1040l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaFuncao.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTabelaProcesso() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1070l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaProcesso.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlAdmissao() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2200l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlAdmissao.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlAlteracaoCadastral() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2205l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlAltCadastral.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlAlteracaoContratual() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2206l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlAltContratual.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlAfastamentoTemporario() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2230l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlAfastTemp.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlDesligamento() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2299l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlDeslig.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlHorario() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(1050l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTabelaHorario.class);
	}
	
	@Test
	public void deveRetornarGeradorXmlTSVInicio() throws GeracaoXmlException {
		Evento evento = new Evento();
		evento.setTipoEvento(new TipoEvento(2300l));
		GeradorXml gerador = geradorXmlFactory.getGerador(evento);
		assertThat(gerador).isInstanceOf(GeradorXmlTSVInicio.class);
	}
	
}
