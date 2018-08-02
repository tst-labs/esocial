package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.funcao.InfoFuncao;

/**
 * <p>
 * Evento S-1040 – Tabela de Funções e Cargos em Comissão
 * </p>
 * <p>
 * São as informações de identificação da função, apresentando código e período
 * de validade do registro. É utilizado para inclusão, alteração e exclusão de
 * registros na tabela de Funções e Cargos em Comissão do empregador/órgão
 * público. As informações consolidadas desta tabela são utilizadas para
 * validação de outros eventos do eSocial (admissão, alteração contratual etc.).
 * </p>
 * <strong>Quem está obrigado:</strong> A sua utilização não é obrigatória.
 * <p>
 * <strong>Prazo de envio:</strong> O evento Tabela de Funções e Cargos em
 * Comissão, se houver, deve ser enviado antes dos eventos S-2100 -
 * Cadastramento Inicial do Vínculo e S-2200 - Admissão de Trabalhador e/ou
 * S-2300 - Trabalhador Sem Vínculo de Emprego/Estatutário - Início.
 * </p>
 * <strong>Pré-requisitos:</strong> O evento exige o cadastro completo das
 * Informações do IdeEmpregador/Órgão Público - Evento S-1000.
 * <p>
 * Informações adicionais no <strong>Manual de Orientação do eSocial</strong>
 * </p>
 */
public class TabelaFuncao extends DadosOcorrencia {
	
	@Valid
	private InfoFuncao infoFuncao;

	public InfoFuncao getInfoFuncao() {
		return infoFuncao;
	}

	public TabelaFuncao setInfoFuncao(InfoFuncao infoFuncao) {
		this.infoFuncao = infoFuncao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaFuncao)) {
			return false;
		}
		TabelaFuncao castOther = (TabelaFuncao) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoFuncao, castOther.infoFuncao).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoFuncao).toHashCode();
	}

}
