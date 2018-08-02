package br.jus.tst.esocialjt.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class EmpregadorMapperTest {
	
	@Test
	public void deveMapearInclusao() {
		InformacoesEmpregador informacoesEmpregador = CriadorObjetoAleatorio.criarEPreencher(InformacoesEmpregador.class);
		EvtInfoEmpregador evtInfoEmpregador = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorInclusao(informacoesEmpregador);
		
		MapperAssertion
			.assertThat(evtInfoEmpregador.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtInfoEmpregador.getInfoEmpregador().getInclusao())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getInfoEmpregador());
				
		assertThat(evtInfoEmpregador.getInfoEmpregador().getAlteracao()).isNull();
		assertThat(evtInfoEmpregador.getInfoEmpregador().getExclusao()).isNull();

	}
	
	@Test
	public void deveMapearAlteracao() {
		InformacoesEmpregador informacoesEmpregador = CriadorObjetoAleatorio.criarEPreencher(InformacoesEmpregador.class);
		EvtInfoEmpregador evtInfoEmpregador = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorAlteracao(informacoesEmpregador);
		
		MapperAssertion
			.assertThat(evtInfoEmpregador.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtInfoEmpregador.getInfoEmpregador().getAlteracao())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getInfoEmpregador());
		
		assertThat(evtInfoEmpregador.getInfoEmpregador().getInclusao()).isNull();
		assertThat(evtInfoEmpregador.getInfoEmpregador().getExclusao()).isNull();
	}

	@Test
	public void deveMapearExclusao() {
	
		InformacoesEmpregador informacoesEmpregador = CriadorObjetoAleatorio.criarEPreencher(InformacoesEmpregador.class);
		EvtInfoEmpregador evtInfoEmpregador = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorExclusao(informacoesEmpregador);

		MapperAssertion
			.assertThat(evtInfoEmpregador.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getIdeEmpregador());
		
		MapperAssertion
			.assertThat(evtInfoEmpregador.getInfoEmpregador().getExclusao())
			.isEqualToComparingFieldByFieldRecursively(informacoesEmpregador.getInfoEmpregador());
				
		assertThat(evtInfoEmpregador.getInfoEmpregador().getInclusao()).isNull();
		assertThat(evtInfoEmpregador.getInfoEmpregador().getAlteracao()).isNull();
	}
	
	@Test
	public void naoDeveApagarSeInfoOrgaoInternacionalZero() {
		InformacoesEmpregador informacoesEmpregador = CriadorObjetoAleatorio.criarEPreencher(InformacoesEmpregador.class);
		informacoesEmpregador.getInfoEmpregador().getInfoCadastro().getInfoOrgInternacional().setIndAcordoIsenMulta((byte)0);
		
		EvtInfoEmpregador inclusao = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorInclusao(informacoesEmpregador);
		EvtInfoEmpregador alteracao = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorAlteracao(informacoesEmpregador);
				
		assertThat(inclusao.getInfoEmpregador().getInclusao().getInfoCadastro().getInfoOrgInternacional()).isNotNull();
		assertThat(alteracao.getInfoEmpregador().getAlteracao().getInfoCadastro().getInfoOrgInternacional()).isNotNull();
	}
	
	@Test
	public void deveApagarSeInfoOrgaoInternacionalNulo() {
		InformacoesEmpregador informacoesEmpregador = CriadorObjetoAleatorio.criarEPreencher(InformacoesEmpregador.class);
		informacoesEmpregador.getInfoEmpregador().getInfoCadastro().setInfoOrgInternacional(null);
		
		EvtInfoEmpregador inclusao = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorInclusao(informacoesEmpregador);
		EvtInfoEmpregador alteracao = EmpregadorMapper.INSTANCE.comoEvtInfoEmpregadorAlteracao(informacoesEmpregador);
				
		assertThat(inclusao.getInfoEmpregador().getInclusao().getInfoCadastro().getInfoOrgInternacional()).isNull();
		assertThat(alteracao.getInfoEmpregador().getAlteracao().getInfoCadastro().getInfoOrgInternacional()).isNull();
	}
}
