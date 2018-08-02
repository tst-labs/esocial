package br.jus.tst.esocial.ocorrencia.dados;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEstab;

/**
 * <p>
 * S-1005 – Tabela de Estabelecimentos, Obras ou Unidades de Órgãos Públicos
 * </p>
 * O evento identifica os estabelecimentos e obras de construção civil da
 * empresa, detalhando as informações de cada estabelecimento (matriz e filiais)
 * do empregador/contribuinte, como: informações relativas ao CNAE
 * Preponderante, FAP, alíquota GILRAT, indicativo de substituição da
 * contribuição patronal de obra de construção civil, dentre outras. As pessoas
 * físicas devem cadastrar neste evento seus CAEPF – Cadastro de Atividade
 * Econômica Pessoa Física. As informações prestadas no evento são utilizadas na
 * apuração das contribuições incidentes sobre as remunerações dos trabalhadores
 * dos referidos estabelecimentos, obras e CAEPF. O órgão público informará as
 * suas respectivas unidades, individualizadas por CNPJ, como estabelecimento.
 *
 *
 * <p>
 * Quem está obrigado:
 * </p>
 * O empregador/contribuinte, na implantação do eSocial e toda vez que for
 * criado um estabelecimento ou obra, ou quando for alterada uma determinada
 * informação sobre um estabelecimento/obra. O próprio estabelecimento matriz da
 * empresa deve ser cadastrado nesse evento para correta informação do CNAE
 * Preponderante.
 * 
 * <p>
 * Pré-requisitos:
 * </p>
 * O evento exige o cadastro IdeEmpregador/Contribuinte/Órgão público - Evento
 * S-1000.
 * 
 * 
 */

public class TabelaEstabelecimento extends DadosOcorrencia {

	@Valid
	private InfoEstab infoEstab;

	public InfoEstab getInfoEstab() {
		return infoEstab;
	}

	public TabelaEstabelecimento setInfoEstab(InfoEstab infoEstab) {
		this.infoEstab = infoEstab;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof TabelaEstabelecimento)) {
			return false;
		}
		TabelaEstabelecimento castOther = (TabelaEstabelecimento) other;
		return new EqualsBuilder().append(ideEmpregador, castOther.ideEmpregador).append(infoEstab, castOther.infoEstab)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(ideEmpregador).append(infoEstab).toHashCode();
	}
}
