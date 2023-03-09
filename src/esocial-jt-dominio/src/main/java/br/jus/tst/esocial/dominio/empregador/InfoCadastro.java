package br.jus.tst.esocial.dominio.empregador;

import br.jus.tst.esocial.dominio.empregador.orgaointernacional.InfoOrgInternacional;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;

/**
 *
 * Informações cadastrais do empregador
 */
public class InfoCadastro {
	
	@NotNull
	@Size(min=2, max=2)
	private String classTrib;
	
	private Byte indCoop;

	private Byte indConstr;

	@NotNull
	private Byte indDesFolha;

	private Byte indOpcCP;

	private String indPorte;

	@NotNull
	private Byte indOptRegEletron;

	@CNPJ
	private String cnpjEFR;

	@Valid
	private DadosIsencao dadosIsencao;

	@Valid
	private InfoOrgInternacional infoOrgInternacional;

	private Calendar dtTrans11096;

	private String indTribFolhaPisCofins;

	/**
	 * @return the classTrib
	 */
	public String getClassTrib() {
		return classTrib;
	}

	/**
	 * <p>
	 * Preencher com o código correspondente à classificação tributária do
	 * contribuinte, conforme tabela 8.
	 * </p>
	 * Validação: Deve ser um dos códigos existentes na tabela. Os códigos [21]
	 * e [22] somente podem ser utilizados se tipo de inscrição for igual a [2].
	 * Para os demais códigos, O tipo de inscrição deve ser igual a [1].
	 *
	 * @param classTrib
	 *            the classTrib to set
	 */
	public InfoCadastro setClassTrib(String classificaoTributaria) {
		this.classTrib = classificaoTributaria;
		return this;
	}

	/**
	 * Indicativo de Cooperativa: 0 - Não é indCoop; 1 - Cooperativa de
	 * Trabalho; 2 - Cooperativa de Produção; 3 - Outras Cooperativas.
	 * Validação: O preenchimento do campo é exclusivo e obrigatório para PJ.
	 * Somente pode ser diferente de ZERO se {natJurid} for igual a [2143] e
	 * {classTrib} for igual a [06, 07, 99]. Para {classTrib} for igual a
	 * [06,07] o campo deverá ser preenchido apenas com [0,2]. Valores Válidos:
	 * 0, 1, 2, 3.
	 *
	 * @return the indCoop
	 */
	public Byte getIndCoop() {
		return indCoop;
	}

	/**
	 * Indicativo de Cooperativa
	 * @param indCoop
	 *            the indCoop to set
	 */
	public InfoCadastro setIndCoop(Byte cooperativa) {
		this.indCoop = cooperativa;
		return this;
	}

	/**
	 * Indicativo de Construtora: 0 - Não é Construtora; 1 - Empresa
	 * Construtora. Validação: O preenchimento do campo é exclusivo e
	 * obrigatório para PJ. Valores Válidos: 0, 1.
	 *
	 * @return the indConstr
	 */
	public Byte getIndConstr() {
		return indConstr;
	}

	/**
	 * Indicativo de Construtora: 0 - Não é Construtora; 1 - Empresa
	 * Construtora. Validação: O preenchimento do campo é exclusivo e
	 * obrigatório para PJ. Valores Válidos: 0, 1.
	 *
	 * @param indConstr
	 *            the indConstr to set
	 */
	public InfoCadastro setIndConstr(Byte construtura) {
		this.indConstr = construtura;
		return this;
	}

	/**
	 * Indicativo de Desoneração da Folha: 0 - Não Aplicável; 1 - Empresa
	 * enquadrada nos art. 7o a 9o da Lei 12.546/2011. Validação: Pode ser igual
	 * a [1] apenas se a classificação tributária for igual a [02,03,99]. Nos
	 * demais casos, deve ser igual a [0]. Valores Válidos: 0, 1.
	 *
	 * @return the indDesFolha
	 */
	public Byte getIndDesFolha() {
		return indDesFolha;
	}

	/**
	 * Indicativo de Desoneração da Folha: 0 - Não Aplicável; 1 - Empresa
	 * enquadrada nos art. 7o a 9o da Lei 12.546/2011. Validação: Pode ser igual
	 * a [1] apenas se a classificação tributária for igual a [02,03,99]. Nos
	 * demais casos, deve ser igual a [0]. Valores Válidos: 0, 1.
	 *
	 * @param indDesFolha
	 *            the indDesFolha to set
	 */
	public InfoCadastro setIndDesFolha(Byte desoneracaoFolha) {
		this.indDesFolha = desoneracaoFolha;
		return this;
	}

	/**
	 * Indica se houve opção pelo registro eletrônico de empregados: 0 - Não
	 * optou pelo registro eletrônico de empregados; 1 - Optou pelo registro
	 * eletrônico de empregados. Valores Válidos: 0, 1.
	 *
	 * @return the indOptRegEletron
	 */
	public Byte getIndOptRegEletron() {
		return indOptRegEletron;
	}

	/**
	 * Indica se houve opção pelo registro eletrônico de empregados: 0 - Não
	 * optou pelo registro eletrônico de empregados; 1 - Optou pelo registro
	 * eletrônico de empregados. Valores Válidos: 0, 1.
	 *
	 * @param indOptRegEletron
	 *            the indOptRegEletron to set
	 */
	public InfoCadastro setIndOptRegEletron(Byte registroEletronicoEmpregados) {
		this.indOptRegEletron = registroEletronicoEmpregados;
		return this;
	}

	/**
	 * @return the dadosIsencao
	 */
	public DadosIsencao getDadosIsencao() {
		return dadosIsencao;
	}

	/**
	 * @param dadosIsencao
	 *            the dadosIsencao to set
	 */
	public InfoCadastro setDadosIsencao(DadosIsencao dadosIsencao) {
		this.dadosIsencao = dadosIsencao;
		return this;
	}

	public InfoOrgInternacional getInfoOrgInternacional() {
		return infoOrgInternacional;
	}

	public InfoCadastro setInfoOrgInternacional(InfoOrgInternacional infoOrgInternacional) {
		this.infoOrgInternacional = infoOrgInternacional;
		return this;
	}
	
	public String getIndPorte() {
		return indPorte;
	}

	public void setIndPorte(String indPorte) {
		this.indPorte = indPorte;
	}

	public String getCnpjEFR() {
		return cnpjEFR;
	}

	public void setCnpjEFR(String cnpjEFR) {
		this.cnpjEFR = cnpjEFR;
	}

	public Byte getIndOpcCP() {
		return this.indOpcCP;
	}

	public InfoCadastro setIndOpcCP(Byte indOpcCP) {
		this.indOpcCP = indOpcCP;
		return this;
	}

	public Calendar getDtTrans11096() {
		return dtTrans11096;
	}

	public void setDtTrans11096(Calendar dtTrans11096) {
		this.dtTrans11096 = dtTrans11096;
	}

	public String getIndTribFolhaPisCofins() {
		return indTribFolhaPisCofins;
	}

	public void setIndTribFolhaPisCofins(String indTribFolhaPisCofins) {
		this.indTribFolhaPisCofins = indTribFolhaPisCofins;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.classTrib)
				.append(this.indCoop)
				.append(this.indConstr)
				.append(this.indDesFolha)
				.append(this.indOptRegEletron)
				.append(this.dadosIsencao)
				.append(this.indPorte)
				.append(this.infoOrgInternacional)
				.append(this.cnpjEFR)
				.append(this.indTribFolhaPisCofins)
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final InfoCadastro other = (InfoCadastro) obj;
		
		return new EqualsBuilder()
				.append(this.indCoop, other.indCoop)
				.append(this.indConstr, other.indConstr)
				.append(this.indDesFolha, other.indDesFolha)
				.append(this.indOptRegEletron, other.indOptRegEletron)
				.append(this.classTrib, other.classTrib)
				.append(this.dadosIsencao, other.dadosIsencao)
				.append(this.indPorte, other.indPorte)
				.append(this.infoOrgInternacional, other.infoOrgInternacional)
				.append(this.cnpjEFR, other.cnpjEFR)
				.append(this.indTribFolhaPisCofins, other.indTribFolhaPisCofins)
				.isEquals();
	}
}
