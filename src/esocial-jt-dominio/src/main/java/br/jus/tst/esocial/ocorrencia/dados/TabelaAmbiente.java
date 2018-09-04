package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.ambiente.InfoAmbiente;

/**
 * <p>
 * S-1060 – Tabela de Ambientes de Trabalho
 * </p>
 * 
 * <b>Conceito do evento:</b> Evento utilizado para inclusão, alteração e exclusão de registros na 
 * tabela de Ambientes de Trabalho do empregador/contribuinte/órgão público. As informações 
 * consolidadas desta tabela são utilizadas para validação do evento de Condições Ambientais do 
 * Trabalho. Devem ser informados na tabela os ambientes de trabalho da empresa e os respectivos 
 * fatores de risco neles existentes constantes na tabela 23 – “Fatores de Riscos do Meio Ambiente 
 * do Trabalho”.</br>
 * </br>
 * <b>Quem está obrigado:</b>O empregador, a cooperativa, o Órgão Gestor de Mão de Obra, a parte
 * concedente de estágio, o sindicato de trabalhadores avulsos e órgãos públicos em relação aos seus
 * empregados e servidores vinculados ao Regime Geral de Previdência Social - RGPS. No caso de 
 * servidores vinculados ao Regime Próprio de Previdência Social - RPPS o envio da informação é 
 * facultativo.</br>
 * </br>
 * <b>Prazo de envio:</b>O evento Tabela de Ambientes de Trabalho deve ser enviado antes dos eventos 
 * “S-2240 – Condições Ambientais do Trabalho – Fatores de Risco” e “S-2241 – Insalubridade,
 * Periculosidade e Aposentadoria Especial”.</br>
 * </br>
 * <b>Pré-requisitos:</b> envio do evento S-1000 – Informações do Empregador/Contribuinte/Órgão 
 * Público, S-1005 – Tabela de Estabelecimentos, Obras ou Unidades de Órgãos Públicos e 
 * S-1020 – Tabela de Lotações Tributárias. <br/>
 * </br>
 * 
 * * <p>
 * Informações adicionais no <strong>Manual de Orientação do eSocial</strong>
 * </p>
 */
public class TabelaAmbiente extends DadosOcorrencia {

	@Valid
	private InfoAmbiente infoAmbiente;

	public InfoAmbiente getInfoAmbiente() {
		return infoAmbiente;
	}

	public TabelaAmbiente setInfoAmbiente(InfoAmbiente infoAmbiente) {
		this.infoAmbiente = infoAmbiente;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaAmbiente)) {
			return false;
		}
		TabelaAmbiente castOther = (TabelaAmbiente) other;
		return new EqualsBuilder()
				.append(ideEmpregador, castOther.ideEmpregador)
				.append(infoAmbiente, castOther.infoAmbiente)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(ideEmpregador)
				.append(infoAmbiente)
				.toHashCode();
	}

}
