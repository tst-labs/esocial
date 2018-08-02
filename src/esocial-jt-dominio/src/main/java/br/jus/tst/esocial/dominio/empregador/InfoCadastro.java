package br.jus.tst.esocial.dominio.empregador;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.jus.tst.esocial.dominio.empregador.orgaointernacional.InfoOrgInternacional;
import br.jus.tst.esocial.dominio.empregador.orgaopublico.InfoOP;

/**
 *
 * Informações cadastrais do empregador
 */
public class InfoCadastro {
	
	@NotNull
	@Size(min=1, max=115)
	private String nmRazao;
	
	@NotNull
	@Size(min=2, max=2)
	private String classTrib;
	
	@Size(min=4, max=4)
	private String natJurid;
	
	private Byte indCoop;
	
	private Byte indConstr;
	
	@NotNull
	private Byte indDesFolha;
	
	@NotNull
	private Byte indOptRegEletron;
	
	private String indEntEd;
	
	@NotNull
	private String indEtt;
	
	private String nrRegEtt;
	
	@Valid
	private DadosIsencao dadosIsencao;
	
	@NotNull
	@Valid
	private Contato contato;
	
	@Valid
	private InfoOP infoOP;
	
	@Valid
	private InfoOrgInternacional infoOrgInternacional;
	
	@Valid
	private List<SoftwareHouse> softwareHouse;
	
	@NotNull
	@Valid
	private InfoComplementares infoComplementares;

	/**
	 * @return the nmRazao
	 */
	public String getNmRazao() {
		return nmRazao;
	}

	/**
	 * Informar a razão social, no caso de pessoa jurídica ou órgão público.
	 *
	 * @param nmRazao
	 *            the nmRazao to set
	 */
	public InfoCadastro setNmRazao(String razaoSocial) {
		this.nmRazao = razaoSocial;
		return this;
	}

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
	 * @return the natJurid
	 */
	public String getNatJurid() {
		return natJurid;
	}

	/**
	 * <p>
	 * Preencher com o código da Natureza Jurídica do Contribuinte, conforme
	 * tabela 21
	 * </p>
	 * . Validação: O preenchimento do campo é obrigatório e exclusivo para
	 * empregador PJ e administração pública. Neste caso, deve ser um código
	 * existente na tabela 21 e compatível com a informação constante no CNPJ.
	 * Se classificação tributária = [85], o número da natureza jurídica deve
	 * iniciar por 1 (exemplo: 101- 5, 112-0, etc.).
	 *
	 * @param natJurid
	 *            the natJurid to set
	 */
	public InfoCadastro setNatJurid(String naturezaJuridica) {
		this.natJurid = naturezaJuridica;
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
	 * Indicativo de entidade educativa sem fins lucrativos que tenha por
	 * objetivo a assistência ao adolescente e à educação profissional (art.
	 * 430, inciso II, CLT): N - Não é entidade educativa sem fins lucrativos; S
	 * - É entidade educativa sem fins lucrativos. Validação: O preenchimento é
	 * exclusivo e obrigatório para Pessoa Jurídica.
	 *
	 * @return the indEntEd
	 */
	public String getIndEntEd() {
		return indEntEd;
	}

	/**
	 * Indicativo de entidade educativa sem fins lucrativos que tenha por
	 * objetivo a assistência ao adolescente e à educação profissional (art.
	 * 430, inciso II, CLT): N - Não é entidade educativa sem fins lucrativos; S
	 * - É entidade educativa sem fins lucrativos. Validação: O preenchimento é
	 * exclusivo e obrigatório para Pessoa Jurídica. Valores Válidos: S,N.
	 *
	 * @param indEntEd
	 *            the indEntEd to set
	 */
	public InfoCadastro setIndEntEd(String entidadeEducativa) {
		this.indEntEd = entidadeEducativa;
		return this;
	}

	/**
	 * Indicativo de Empresa de Trabalho Temporário (Lei n° 6.019/1974), com
	 * registro no Ministério do Trabalho: N - Não é Empresa de Trabalho
	 * Temporário; S - Empresa de Trabalho Temporário. Valores Válidos: S,N.
	 *
	 * @return the indEtt
	 */
	public String getIndEtt() {
		return indEtt;
	}

	/**
	 * Indicativo de Empresa de Trabalho Temporário (Lei n° 6.019/1974), com
	 * registro no Ministério do Trabalho: N - Não é Empresa de Trabalho
	 * Temporário; S - Empresa de Trabalho Temporário. Valores Válidos: S,N.
	 *
	 * @param indEtt
	 *            the indEtt to set
	 */
	public InfoCadastro setIndEtt(String empresaTrabalhoTemporario) {
		this.indEtt = empresaTrabalhoTemporario;
		return this;
	}

	/**
	 * Número do registro da Empresa de Trabalho Temporário no Ministério do
	 * Trabalho.
	 *
	 * @return the nrRegEtt
	 */
	public String getNrRegEtt() {
		return nrRegEtt;
	}

	/**
	 * Número do registro da Empresa de Trabalho Temporário no Ministério do
	 * Trabalho. Validação: Preenchimento obrigatório se {indEtt} = [S]. Não
	 * pode ser informado nos demais casos.
	 *
	 * @param nrRegEtt
	 *            the nrRegEtt to set
	 */
	public InfoCadastro setNrRegEtt(String numeroRegistroEmpresaTrabalhoTemporario) {
		this.nrRegEtt = numeroRegistroEmpresaTrabalhoTemporario;
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

	/**
	 * @return the contato
	 */
	public Contato getContato() {
		return contato;
	}

	/**
	 * @param contato
	 *            the contato to set
	 */
	public InfoCadastro setContato(Contato contato) {
		this.contato = contato;
		return this;
	}

	/**
	 * @return the infoOP
	 */
	public InfoOP getInfoOP() {
		return infoOP;
	}

	/**
	 * @param infoOP
	 *            the infoOP to set
	 */
	public InfoCadastro setInfoOP(InfoOP informacaoOrgaoPublico) {
		this.infoOP = informacaoOrgaoPublico;
		return this;
	}

	/**
	 * @return the softwareHouse
	 */
	public List<SoftwareHouse> getSoftwareHouse() {
		return softwareHouse;
	}

	/**
	 * @param softwareHouse
	 *            the softwareHouse to set
	 */
	public InfoCadastro setSoftwareHouse(List<SoftwareHouse> softwareHouse) {
		this.softwareHouse = softwareHouse;
		return this;
	}

	/**
	 * @return the infoComplementares
	 */
	public InfoComplementares getInfoComplementares() {
		return infoComplementares;
	}

	/**
	 * @param infoComplementares
	 *            the infoComplementares to set
	 */
	public InfoCadastro setInfoComplementares(InfoComplementares informacaoComplementar) {
		this.infoComplementares = informacaoComplementar;
		return this;
	}
	
	public InfoOrgInternacional getInfoOrgInternacional() {
		return infoOrgInternacional;
	}

	public InfoCadastro setInfoOrgInternacional(InfoOrgInternacional infoOrgInternacional) {
		this.infoOrgInternacional = infoOrgInternacional;
		return this;
	}
	

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.nmRazao)
			.append(this.classTrib)
			.append(this.natJurid)
			.append(this.indCoop)
			.append(this.indConstr)
			.append(this.indDesFolha)
			.append(this.indOptRegEletron)
			.append(this.indEntEd)
			.append(this.indEtt)
			.append(this.nrRegEtt)
			.append(this.dadosIsencao)
			.append(this.contato)
			.append(this.infoOP)
			.append(this.softwareHouse)
			.append(this.infoComplementares)
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
				.append(this.nmRazao, other.nmRazao)
				.append(this.classTrib, other.classTrib)
				.append(this.natJurid, other.natJurid)
				.append(this.indEntEd, other.indEntEd)
				.append(this.indEtt, other.indEtt)
				.append(this.nrRegEtt, other.nrRegEtt)
				.append(this.dadosIsencao, other.dadosIsencao)
				.append(this.contato, other.contato)
				.append(this.infoOP, other.infoOP)
				.append(this.softwareHouse, other.softwareHouse)
				.append(this.infoComplementares, other.infoComplementares)
				.isEquals();
	}
}
