package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.carreira.InfoCarreira;

/**
 * <p>
 * S-1035 – Tabela de Carreiras Públicas
 * </p>
 * 
 * <b>Conceito do evento:</b> São as informações relativas às carreiras públicas
 * em que os servidores públicos estatutários enquadram-se, independentemente do
 * tipo de regime previdenciário ("RGPS ou RPPS). As informações consolidadas
 * nesta tabela serão referenciadas nos eventos “S-2100 – Cadastramento Inicial
 * do Vínculo” e “S-2200 – Admissão de Trabalhador”.</br>
 * </br>
 * <b>Quem está obrigado:</b> O órgão público quando possuir cargos estruturados
 * em carreiras.</br>
 * </br>
 * <b>Prazo de envio:</b> O evento Tabela de Carreiras públicas deve ser enviado
 * antes dos eventos “S-2100 - Cadastramento Inicial do Vínculo” e “S-2200 -
 * Admissão de Trabalhador”.</br>
 * </br>
 * <b>Pré-requisitos:</b> O evento exige o cadastro completo do evento “S-1000 -
 * Informações do IdeEmpregador/Contribuinte/Órgão Público/Órgão Público”. <br/>
 * </br>
 * 
 * <b>Informações adicionais:</b> <ui>
 * <li>A Tabela de Carreiras públicas guarda as informações de forma histórica,
 * não podendo haver dados diferentes para a mesma carreira pública no mesmo
 * período de validade;</li>
 * <li>Havendo alteração nos dados desta tabela, faz-se necessário informar a
 * data do fim de validade da informação anterior e enviar novo evento com a
 * data de início da nova informação;</li>
 * <li>Os códigos {codCarreira} atribuídos às carreiras públicas são de livre
 * escolha do órgão público.</li>
 * <li>As carreiras públicas informadas neste evento não implicam em
 * reconhecimento e validação dos planos de Carreiras, Carreiras e Salários
 * adotados pelo Órgão Público.</li>
 * <li>A utilização do evento “S-1035 – Tabela de Carreiras Públicas” torna-se
 * opcional para os órgãos públicos que não possuam cargos estruturados
 * carreiras.</li>
 */
public class TabelaCarreira extends DadosOcorrencia {

	@Valid
	private InfoCarreira infoCarreira;

	public InfoCarreira getInfoCarreira() {
		return infoCarreira;
	}

	public TabelaCarreira setInfoCarreira(InfoCarreira infoCarreira) {
		this.infoCarreira = infoCarreira;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaCarreira)) {
			return false;
		}
		TabelaCarreira castOther = (TabelaCarreira) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador)
				.append(infoCarreira, castOther.infoCarreira).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoCarreira).toHashCode();
	}

}
