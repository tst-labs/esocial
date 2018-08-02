package br.jus.tst.esocial.dominio.empregador.orgaopublico;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Informações relativas ao ente federativo estadual, distrital ou municipal
 */
public class InfoEnte {

	@NotNull
    private String nmEnte;
    
	@NotNull
	private String uf;
	
    private BigInteger codMunic;
    
    @NotNull
    private String indRPPS;
    
    @NotNull
    private Byte subteto;
    
    @NotNull
    private BigDecimal vrSubteto;

    /**
     * Nome do Ente Federativo ao qual o órgão está vinculado
     *
     * @return the nmEnte
     */
    public String getNmEnte() {
        return nmEnte;
    }

    /**
     * Nome do Ente Federativo ao qual o órgão está vinculado
     *
     * @param nmEnte the nmEnte to set
     */
    public void setNmEnte(String nome) {
        this.nmEnte = nome;
    }

    /**
     * Sigla da Unidade da Federação
     *
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Preencher com a sigla da Unidade da Federação Validação: Deve ser uma UF
     * válida.
     *
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Código do município, conforme tabela do IBGE
     *
     * @return the codMunic
     */
    public BigInteger getCodMunic() {
        return codMunic;
    }

    /**
     * Preencher com o código do município, conforme tabela do IBGE Validação:
     * Se informado, deve ser um código existente na tabela do IBGE
     *
     * @param codMunic the codMunic to set
     */
    public void setCodMunic(BigInteger codigoMunicipio) {
        this.codMunic = codigoMunicipio;
    }

    /**
     * Informar se o ente público possui Regime Próprio de Previdência Social -
     * RPPS.
     *
     * @return the indRPPS
     */
    public String getIndRPPS() {
        return indRPPS;
    }

    /**
     * Informar se o ente público possui Regime Próprio de Previdência Social -
     * RPPS. 
     *
     * @param indRPPS the indRPPS to set
     */
    public void setIndRPPS(String regimeProprioPrevidencia) {
        this.indRPPS = regimeProprioPrevidencia;
    }

    /**
     * Poder a que se refere o subeto: 1 - Executivo; 2 - Judiciário; 3 -
     * Legislativo; 9 - Todos os poderes. Valores Válidos: 1, 2, 3, 9.
     *
     * @return the subteto
     */
    public Byte getSubteto() {
        return subteto;
    }

    /**
     * Preencher com o poder a que se refere o subeto: 1 - Executivo; 2 -
     * Judiciário; 3 - Legislativo; 9 - Todos os poderes. Valores Válidos: 1, 2,
     * 3, 9.
     *
     * @param subteto the subteto to set
     */
    public void setSubteto(Byte subteto) {
        this.subteto = subteto;
    }

    /**
     * Valor do subteto do Ente Federativo.
     *
     * @return the vrSubteto
     */
    public BigDecimal getVrSubteto() {
        return vrSubteto;
    }

    /**
     * Preencher com o valor do subteto do Ente Federativo.
     *
     * @param vrSubteto the vrSubteto to set
     */
    public void setVrSubteto(BigDecimal valorSubTeto) {
        this.vrSubteto = valorSubTeto;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codMunic == null) ? 0 : codMunic.hashCode());
		result = prime * result + ((nmEnte == null) ? 0 : nmEnte.hashCode());
		result = prime * result + ((indRPPS == null) ? 0 : indRPPS.hashCode());
		result = prime * result + subteto;
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		result = prime * result + ((vrSubteto == null) ? 0 : vrSubteto.hashCode());
		return result;
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
        final InfoEnte other = (InfoEnte) obj;
        return new EqualsBuilder()
        	.append(this.codMunic, other.codMunic)
        	.append(this.subteto, other.subteto)
        	.append(this.vrSubteto, other.vrSubteto)
        	.append(this.nmEnte, other.nmEnte)
        	.append(this.uf, other.uf)
        	.append(this.indRPPS, other.indRPPS)
        	.isEquals();
    }
}
