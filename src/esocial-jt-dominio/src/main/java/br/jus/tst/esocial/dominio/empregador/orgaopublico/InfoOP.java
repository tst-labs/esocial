package br.jus.tst.esocial.dominio.empregador.orgaopublico;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * Informações relativas a Órgãos Públicos
 */
public class InfoOP {

	@NotNull
	@Pattern(regexp="\\w{1,6}")
    private String nrSiafi;
	
	@Valid
    private InfoEFR infoEFR;
	
	@Valid
    private InfoEnte infoEnte;

	/**
     * @return the nrSiafi
     */
    public String getNrSiafi() {
        return nrSiafi;
    }

    /**
     * Preencher com o número SIAFI - Sistema Integrado de Administração
     * Financeira.
     *
     * @param nrSiafi the nrSiafi to set
     */
    public InfoOP setNrSiafi(String numeroSIAFI) {
        this.nrSiafi = numeroSIAFI;
        return this;
    }

    /**
     * @return the InfoEFR
     */
    public InfoEFR getInfoEFR() {
        return infoEFR;
    }

    /**
     * Informações relativas a Ente Federativo Responsável - EFR
     *
     * @param InfoEFR the InfoEFR to set
     */
    public InfoOP setInfoEFR(InfoEFR enteFederativo) {
        this.infoEFR = enteFederativo;
        return this;
    }

    /**
     * @return the infoEnte
     */
    public InfoEnte getInfoEnte() {
        return infoEnte;
    }

    /**
     * Informações relativas ao ente federativo estadual, distrital ou municipal
     *
     * @param infoEnte the infoEnte to set
     */
    public InfoOP setInfoEnte(InfoEnte enteFederativoVinculado) {
        this.infoEnte = enteFederativoVinculado;
        return this;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nrSiafi);
        hash = 67 * hash + Objects.hashCode(this.infoEFR);
        hash = 67 * hash + Objects.hashCode(this.infoEnte);
        return hash;
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
        final InfoOP other = (InfoOP) obj;
        
        return new EqualsBuilder()
        	.append(this.nrSiafi, other.nrSiafi)
        	.append(this.infoEFR, other.infoEFR)
        	.append(this.infoEnte, other.infoEnte)
        	.isEquals();
    }
}
