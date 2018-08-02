package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.cargo.InfoCargo;

/**
 * <p>
 * S-1030 – Tabela de Cargos/Empregos Públicos
 * </p>
 * 
 * <b>Conceito do evento:</b> São as informações de identificação do cargo
 * (inclusive carreiras e patentes), apresentando código e período de validade.
 * É utilizado para inclusão, alteração e exclusão de registros na Tabela de
 * Cargos/Empregos Públicos do empregador/órgão público. As informações
 * consolidadas nesta tabela são utilizadas por todos os obrigados ao eSocial,
 * para validação de diversos eventos, entre os quais o cadastramento inicial,
 * admissão, alteração de dados contratuais, etc.</br>
 * </br>
 * <b>O empregador/órgão público, na primeira vez que utilizar o eSocial, e toda
 * vez que for criado, alterado ou excluído um determinado cargo.</br>
 * </br>
 * <b>Prazo de envio:</b>O evento Tabela de Cargos deve ser enviado antes dos
 * eventos S-2100 - Cadastramento Inicial do Vínculo, “S-2200 - Admissão de
 * Trabalhador” e/ou “S-2300 - Trabalhador Sem Vínculo de Emprego/Estatutário –
 * Início”.</br>
 * </br>
 * <b>Pré-requisitos:</b> O evento exige o cadastro completo do evento “S-1000 -
 * Informações do IdeEmpregador/Contribuinte/Órgão Público/Órgão Público”. <br/>
 * </br>
 * 
 * <b>Informações adicionais:</b> <ui>
 * <li>A Tabela de Cargos guarda as informações de forma histórica, não podendo
 * haver dados diferentes para o mesmo cargo e o mesmo período de validade;</li>
 * <li>Havendo alteração nos dados desta tabela, faz-se necessário informar a
 * data do fim de validade da informação anterior e enviar novo evento com a
 * data de início da nova informação;</li>
 * <li>O empregador/órgão público deve realizar uma análise do seu organograma e
 * definição dos cargos, obedecendo às normas trabalhistas, estatuto dos
 * servidores, legislação de cada ente federativo e suas implicações.</li>
 * <li>Os cargos informados ao eSocial não implicam reconhecimento e validação
 * dos planos internos de Cargos, carreiras e Salários e planos internos de
 * Cargos e Salários adotados pelo empregador/órgão público.</li>
 * <li>Os códigos (codCargo) atribuídos aos cargos são de livre escolha do
 * empregador/órgão público.</li>
 * <li>A Tabela de Cargos/Empregos Públicos guarda relação com a TABELA de
 * Classificação Brasileira de Ocupações - CBO. A estruturação da tabela de
 * Cargos pode ser feita com base nos dados da Tabela CBO.</li>
 * <li>O código CBO deve ser informado no nível Ocupação existente na tabela de
 * CBO, com 6 (seis) dígitos, e corresponder à principal atividade do
 * trabalhador.</li>
 * <li>A utilização do evento S-1040 - Tabela de Funções/Cargos em Comissão é
 * opcional. Caso o empregador/órgão público a utilize, prevalece o código CBO
 * informado para a função.</li>
 */
public class TabelaCargo extends DadosOcorrencia {

	@Valid
	private InfoCargo infoCargo;

	public InfoCargo getInfoCargo() {
		return infoCargo;
	}

	public TabelaCargo setInfoCargo(InfoCargo infoCargo) {
		this.infoCargo = infoCargo;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaCargo)) {
			return false;
		}
		TabelaCargo castOther = (TabelaCargo) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoCargo, castOther.infoCargo)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(infoCargo)
				.toHashCode();
	}

}
