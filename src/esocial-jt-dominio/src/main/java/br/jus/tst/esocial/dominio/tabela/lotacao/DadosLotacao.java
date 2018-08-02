package br.jus.tst.esocial.dominio.tabela.lotacao;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Detalhamento das informações da lotação que está sendo incluída
 *
 */
public class DadosLotacao {

	@NotNull
	private String tpLotacao;
	
	private Byte tpInsc;
	
	@Pattern(regexp = "\\d{8,15}")
	private String nrInsc;
	
	@NotNull
	@Valid
	private FpasLotacao fpasLotacao;
	
	@Valid
	private InfoEmprParcial infoEmprParcial;

	public InfoEmprParcial getInfoEmprParcial() {
		return infoEmprParcial;
	}

	/**
	 * Informação complementar que apresenta identificação do contratante e do
	 * proprietário de obra de construção civil contratada sob regime de
	 * empreitada parcial ou subempreitada. </br>
	 * </br>
	 * A informação é preenchida exclusivamente para lotações cujo tipo de
	 * lotação seja igual a [2].
	 * 
	 * @param informacaoComplementar
	 * @return DadosLotacao
	 */
	public DadosLotacao setInfoEmprParcial(InfoEmprParcial infoEmprParcial) {
		this.infoEmprParcial = infoEmprParcial;
		return this;
	}

	public FpasLotacao getFpasLotacao() {
		return fpasLotacao;
	}

	/**
	 * Informações de FPAS e Terceiros relativas à lotação tributária
	 * 
	 * @param fpasLotacao
	 * @return
	 */
	public DadosLotacao setFpasLotacao(FpasLotacao fpasLotacao) {
		this.fpasLotacao = fpasLotacao;
		return this;
	}

	public String getNrInsc() {
		return nrInsc;
	}

	/**
	 * Preencher com o número de Inscrição (CNPJ, CPF, CNO) ao qual pertence a
	 * lotação tributária, conforme indicado na tabela 10 - Tipos de Lotação
	 * Tributária.</br>
	 * </br>
	 * <b>Validação:</b> </br>
	 * a) Deve ser preenchido de acordo com o conteúdo exigido,conforme
	 * especificado no campo {tpInsc} e na tabela de tipos de Lotação
	 * Tributária.</br>
	 * </br>
	 * b) Deve ser um identificador válido, constante das bases da RFB.
	 * 
	 * @param nrInsc
	 * @return
	 */
	public DadosLotacao setNrInsc(String nrInsc) {
		this.nrInsc = nrInsc;
		return this;
	}

	public Byte getTpInsc() {
		return tpInsc;
	}

	/**
	 * Preencher com o código correspondente ao tipo de inscrição, conforme
	 * tabela 5 </br>
	 * </br>
	 * <b>Validação:</b> O campo não deve ser preenchido se {tpLotacao} for
	 * igual a [01,10, 21, 24, 90].</br>
	 * </br>
	 * Nos demais casos, observar conteúdo exigido para o campo {nrInsc},
	 * conforme Tabela 10 - Tipos de Lotação Tributária.</br>
	 * 
	 * @param tpInscricao
	 * @return
	 */
	public DadosLotacao setTpInsc(Byte tpInsc) {
		this.tpInsc = tpInsc;
		return this;
	}

	public String getTpLotacao() {
		return tpLotacao;
	}

	/**
	 * Preencher com o código correspondente ao tipo de lotação, conforme tabela
	 * 10. <br>
	 * <br>
	 * <b>Validação:</b> Deve ser um código válido, existente na
	 * tabela 10, e compatível com a Classificação Tributária indicada no evento
	 * de Informações Cadastrais do Empregador.
	 * 
	 * @param tpLotacao
	 * @return 
	 */
	public DadosLotacao setTpLotacao(String tpLotacao) {
		this.tpLotacao = tpLotacao;
		return this;
	}

}
