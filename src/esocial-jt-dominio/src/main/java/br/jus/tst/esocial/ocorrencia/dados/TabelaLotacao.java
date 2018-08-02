package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.lotacao.InfoLotacao;

/**
 * S-1020 - Tabela de Lotações Tributárias</br>
 * <b>Conceito do evento:</b> Identifica a classificação da atividade para fins
 * de atribuição do código FPAS, a obra de construção civil, o contratante de
 * serviço, ou uma condição diferenciada de tributação. A condição diferenciada
 * ocorre quando uma determinada unidade da empresa possui um código de
 * FPAS/Outras Entidades e Fundos distintos. </br>
 * Lotação tem conceito estritamente tributário e não físico. Lotação influi no
 * método de cálculo da contribuição previdenciária para um grupo de segurados
 * específicos, não refletindo, necessariamente, o local de trabalho do
 * empregado. </br>
 * </br>
 * <b>Quem está obrigado:</b> O empregador/contribuinte, na primeira vez que
 * utilizar o eSocial e toda vez que for criada, alterada ou excluída uma
 * determinada lotação. </br>
 * </br>
 * <b>Prazo de envio:</b> O evento Tabela de Lotações deve ser enviado antes dos
 * eventos que utilizem essa informação. </br>
 * </br>
 * <b>Pré-requisitos:</b> Cadastro completo das Informações do
 * IdeEmpregador/Contribuinte/Órgão Público - Evento S-1000, </br>
 * Tabela de Estabelecimentos e Obras de Construção Civil - S-1005 e, </br>
 * no caso de Órgão Gestor de Mão de Obra - OGMO, a Tabela de Operadores
 * Portuários - Evento S-1080.
 *
 */

public class TabelaLotacao extends DadosOcorrencia {

	@Valid
	private InfoLotacao infoLotacao;

	public InfoLotacao getInfoLotacao() {
		return infoLotacao;
	}

	public TabelaLotacao setInfoLotacao(InfoLotacao infoLotacao) {
		this.infoLotacao = infoLotacao;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaLotacao)) {
			return false;
		}
		TabelaLotacao castOther = (TabelaLotacao) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoLotacao, castOther.infoLotacao).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoLotacao).toHashCode();
	}
}
