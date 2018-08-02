package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.processo.InfoProcesso;

/**
 * <p>
 * S-1070 – Tabela de Processos Administrativos/Judiciais
 * </p>
 * <p>
 * <strong>Conceito do evento:</strong> evento utilizado para inclusão,
 * alteração e exclusão de registros na Tabela de Processos
 * Administrativos/Judiciais do empregador/contribuinte/órgão público, de
 * entidade patronal com representação coletiva, de trabalhador contra um dos
 * órgãos governamentais envolvidos no projeto e que tenha influência no cálculo
 * das contribuições, dos impostos ou do FGTS, e de outras empresas, quando
 * influenciem no cumprimento das suas obrigações principais e acessórias. As
 * informações consolidadas desta tabela são utilizadas para validação de outros
 * eventos do eSocial e influenciam na forma e no cálculo dos tributos devidos e
 * FGTS
 * </p>
 * <strong>Quem está obrigado:</strong> O empregador/contribuinte/órgão público,
 * quando houver decisão em processo administrativo/judicial, que tenha como
 * parte um dos órgãos partícipes do eSocial e que tenha influência na apuração
 * das contribuições, dos impostos ou do FGTS, bem como no cumprimento de
 * obrigações trabalhistas e previdenciárias, e quando houver alteração da
 * decisão durante o andamento do processo.
 * <p>
 * <strong>Prazo de envio:</strong> Deve ser transmitido até o dia 07 do mês
 * subsequente ao do mês de referência informado no evento ou antes do envio de
 * qualquer evento de remuneração que a decisão venha afetar.
 * </p>
 * <strong>Pré-requisitos:</strong> o evento exige a análise prévia da situação
 * do processo administrativo/judicial pelo empregador/contribuinte/órgão
 * público antes do seu cadastramento, devendo estar em um dos indicativos de
 * decisão relacionados acima.
 * <p>
 * Informações adicionais no <strong>Manual de Orientação do eSocial</strong>
 * </p>
 */
public class TabelaProcesso extends DadosOcorrencia {

	@Valid
	private InfoProcesso infoProcesso;

	public InfoProcesso getInfoProcesso() {
		return infoProcesso;
	}

	public TabelaProcesso setInfoProcesso(InfoProcesso infoProcesso) {
		this.infoProcesso = infoProcesso;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaProcesso)) {
			return false;
		}
		TabelaProcesso castOther = (TabelaProcesso) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoProcesso, castOther.infoProcesso).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoProcesso).toHashCode();
	}
}
