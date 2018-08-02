package br.jus.tst.esocial.dominio.empregador;

import java.math.BigInteger;
import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * Informações Complementares - Empresas Isentas - Dados da Isenção
 * <b>APENAS EMPRESAS ISENTAS</b>
 */
public class DadosIsencao {

	@NotNull
	@Size(min=2, max=70)
    private String ideMinLei;
	@NotNull
	@Size(min=1, max=40)
    private String nrCertif;
	@NotNull
    private Calendar dtEmisCertif;
	@NotNull
    private Calendar dtVencCertif;
	@Size(min=1, max=40)
    private String nrProtRenov;
    private Calendar dtProtRenov;
    private Calendar dtDou;
    private BigInteger pagDou;

    /**
     * Sigla e nome do Ministério ou Lei que concedeu o Certificado
     *
     * @return the nome
     */
    public String getIdeMinLei() {
        return ideMinLei;
    }

    /**
     * Sigla e nome do Ministério ou Lei que concedeu o Certificado
     *
     * @param nome the nome to set
     */
    public void setIdeMinLei(String nome) {
        this.ideMinLei = nome;
    }

    /**
     * Número do Certificado de Entidade Beneficente de Assistência Social,
     * número da portaria de concessão do Certificado, ou, no caso de concessão
     * através de Lei específica, o número da Lei
     *
     * @return the nrCertif
     */
    public String getNrCertif() {
        return nrCertif;
    }

    /**
     * Número do Certificado de Entidade Beneficente de Assistência Social,
     * número da portaria de concessão do Certificado, ou, no caso de concessão
     * através de Lei específica, o número da Lei
     *
     * @param nrCertif the nrCertif to set
     */
    public void setNrCertif(String numeroCertificado) {
        this.nrCertif = numeroCertificado;
    }

    /**
     * Data de Emissão do Certificado/publicação da Lei
     *
     * @return the dtEmisCertif
     */
    public Calendar getDtEmisCertif() {
        return dtEmisCertif;
    }

    /**
     * Data de Emissão do Certificado/publicação da Lei
     *
     * @param dtEmisCertif the dtEmisCertif to set
     */
    public void setDtEmisCertif(Calendar dataEmissaoCertificado) {
        this.dtEmisCertif = dataEmissaoCertificado;
    }

    /**
     * Data de Vencimento do Certificado Validação.
     *
     * @return the dtVencCertif
     */
    public Calendar getDtVencCertif() {
        return dtVencCertif;
    }

    /**
     * Data de Vencimento do Certificado Validação: Não pode ser anterior a Data
     * de emissão do certificado
     *
     * @param dtVencCertif the dtVencCertif to set
     */
    public void setDtVencCertif(Calendar dataVencimentoCertificado) {
        this.dtVencCertif = dataVencimentoCertificado;
    }

    /**
     * Protocolo pedido renovação
     *
     * @return the nrProtRenov
     */
    public String getNrProtRenov() {
        return nrProtRenov;
    }

    /**
     * Protocolo pedido renovação
     *
     * @param nrProtRenov the nrProtRenov to set
     */
    public void setNrProtRenov(String protocoloRenovacao) {
        this.nrProtRenov = protocoloRenovacao;
    }

    /**
     * Data do protocolo de renovação
     *
     * @return the dtProtRenov
     */
    public Calendar getDtProtRenov() {
        return dtProtRenov;
    }

    /**
     * Data do protocolo de renovação
     *
     * @param dtProtRenov the dtProtRenov to set
     */
    public void setDtProtRenov(Calendar dataProtocoloRenovacao) {
        this.dtProtRenov = dataProtocoloRenovacao;
    }

    /**
     * Preencher com a data de publicação no Diário Oficial da União
     *
     * @return the dtDou
     */
    public Calendar getDtDou() {
        return dtDou;
    }

    /**
     * Preencher com a data de publicação no Diário Oficial da União
     *
     * @param dtDou the dtDou to set
     */
    public void setDtDou(Calendar dataPublicaoDOU) {
        this.dtDou = dataPublicaoDOU;
    }

    /**
     * Preencher com o número da página no DOU referente à publicação do
     * documento de concessão do certificado.
     *
     * @return the pagDou
     */
    public BigInteger getPagDou() {
        return pagDou;
    }

    /**
     * Preencher com o número da página no DOU referente à publicação do
     * documento de concessão do certificado.
     *
     * @param pagDou the pagDou to set
     */
    public void setPagDou(BigInteger paginaDOU) {
        this.pagDou = paginaDOU;
    }
    

    @Override
    public int hashCode() {
    	return new HashCodeBuilder()
    		.append(this.ideMinLei)
    		.append(this.nrCertif)
    		.append(this.dtEmisCertif)
    		.append(this.dtVencCertif)
    		.append(this.nrProtRenov)
    		.append(this.dtProtRenov)
    		.append(this.dtDou)
    		.append(this.pagDou)
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
        final DadosIsencao other = (DadosIsencao) obj;
        
        return new EqualsBuilder()
        	.append(this.ideMinLei, other.ideMinLei)
        	.append(this.nrCertif, other.nrCertif)
        	.append(this.nrProtRenov, other.nrProtRenov)
        	.append(this.dtEmisCertif, other.dtEmisCertif)
        	.append(this.dtVencCertif, other.dtVencCertif)
        	.append(this.dtProtRenov, other.dtProtRenov)
        	.append(this.dtDou, other.dtDou)
        	.append(this.pagDou, other.pagDou)
        	.isEquals();
    }

}
