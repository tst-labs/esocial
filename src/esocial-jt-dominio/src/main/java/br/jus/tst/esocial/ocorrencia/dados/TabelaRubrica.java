package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.rubrica.InfoRubrica;

/**
 * <p>
 * Evento S-1010 – Tabela de Rubricas
 * </p>
 * <p>
 * Apresenta o detalhamento das informações das rubricas constantes da folha de
 * pagamento do empregador/contribuinte/órgão público, permitindo a correlação
 * destas com as constantes da tabela de natureza das rubricas da folha de
 * pagamento do eSocial. É utilizado para inclusão, alteração e exclusão de
 * registros na tabela de RUBRICAS do empregador/contribuinte/órgão público. As
 * informações consolidadas desta tabela são utilizadas para validação do evento
 * de Remuneração dos trabalhadores.
 * </p>
 * <strong>Quem está obrigado:</strong> O empregador/contribuinte/órgão público,
 * na primeira vez que utilizar o eSocial e toda vez que for criada, alterada ou
 * excluída uma determinada rubrica.
 * <p>
 * <strong>Prazo de envio:</strong> O evento Tabela de Rubricas deve ser enviado
 * antes dos eventos relacionados à Remuneração do Trabalhador - Evento “S-1200
 * - Remuneração de Trabalhador vinculado ao Regime Geral de Previdência
 * Social”, “S-1202 - Remuneração de servidor vinculado a Regime Próprio de
 * Previdência Social” e “S-1207 - Benefícios previdenciários – RPPS”, bem como
 * antes dos eventos S-2299 – Desligamento e S-2399 – Trabalhador sem Vínculo de
 * Emprego/Estatutário - Término, que referenciam rubricas pagas na rescisão.
 * </p>
 * <strong>Pré-requisitos:</strong> Cadastro completo das Informações do
 * IdeEmpregador/Contribuinte/órgão Público - Evento S-1000.
 * <p>
 * Informações adicionais no <strong>Manual de Orientação do eSocial</strong>
 * </p>
 */
public class TabelaRubrica extends DadosOcorrencia {

	@Valid
	private InfoRubrica infoRubrica;

	public InfoRubrica getInfoRubrica() {
		return infoRubrica;
	}

	public TabelaRubrica setInfoRubrica(InfoRubrica informacaoRubrica) {
		this.infoRubrica = informacaoRubrica;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaRubrica)) {
			return false;
		}
		TabelaRubrica castOther = (TabelaRubrica) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoRubrica, castOther.infoRubrica).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoRubrica).toHashCode();
	}

}
