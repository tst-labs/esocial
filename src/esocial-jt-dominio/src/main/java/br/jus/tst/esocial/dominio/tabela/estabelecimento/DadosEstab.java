package br.jus.tst.esocial.dominio.tabela.estabelecimento;

import java.math.BigInteger;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 
 * Detalhamento das informações do estabelecimento, obra ou órgão público que
 * está sendo incluído.
 *
 **/
public class DadosEstab {

	@NotNull
	@Valid
	private BigInteger cnaePrep;

	@Valid
	private AliqGilrat aliqGilrat;

	@Valid
	private InfoCaepf infoCaepf;

	@Valid
	private InfoObra infoObra; 

	@Valid
	private InfoTrab infoTrab;

	public InfoTrab getInfoTrab() {
		return infoTrab;
	}

	/**
	 * Informações Trabalhistas relativas ao estabelecimento
	 * 
	 * @param infoTrab
	 * @return
	 */
	public DadosEstab setInfoTrab(InfoTrab infoTrab) {
		this.infoTrab = infoTrab;
		return this;
	}

	public InfoObra getInfoObra() {
		return infoObra;
	}

	/**
	 * Registro preenchido exclusivamente por empresa construtora enquadrada nos
	 * Arts. 7 a 9 da Lei 12.546/2011, relacionando os estabelecimentos
	 * inscritos no CNO, para indicar a substituição ou não da contribuição
	 * patronal incidente sobre a remuneração dos trabalhadores de obra de
	 * construção civil.
	 * 
	 * @param infoObra
	 */
	public DadosEstab setInfoObra(InfoObra infoObra) {
		this.infoObra = infoObra;
		return this;
	}

	public InfoCaepf getInfoCaepf() {
		return infoCaepf;
	}

	/**
	 * Informações relativas ao Cadastro da Atividade Econômica da Pessoa Física
	 * - CAEPF
	 * 
	 * @param infoCaepf
	 * 
	 */
	public DadosEstab setInfoCaepf(InfoCaepf infoCaepf) {
		this.infoCaepf = infoCaepf;
		return this;
	}

	public AliqGilrat getAliqGilrat() {
		return aliqGilrat;
	}

	/**
	 * Informações de Apuração da alíquota Gilrat do Estabelecimento
	 * 
	 * @param aliqGilrat
	 * @return
	 */
	public DadosEstab setAliqGilrat(AliqGilrat aliqGilrat) {
		this.aliqGilrat = aliqGilrat;
		return this;
	}

	public BigInteger getCnaePrep() {
		return cnaePrep;
	}

	/**
	 * Preencher com o código do CNAE conforme tabela instituída pelo IBGE,
	 * referente a atividade econômica preponderante do estabelecimento.
	 * Validação: Deve ser um número existente na tabela CNAE
	 **/
	public DadosEstab setCnaePrep(BigInteger cnaePrep) {
		this.cnaePrep = cnaePrep;
		return this;
	}

}