package br.jus.tst.esocial.dominio.tabela.ambiente;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

/**
 * O registro apresenta o detalhamento do(s) fator(es) de risco(s) presente(s) no
 * ambiente identificado.
 */
public class FatorRisco {
    
	@NotNull
    @Length(min = 1, max = 10)
    @Pattern(regexp="\\d{2}\\.\\d{2}\\.\\d{3}")
    public String codFatRis;

    /**
     * @return codFatRis
     */
    public String getCodFatRis() {
        return codFatRis;
    }

    /**
     * @param codFatRis the codFatRis to set
     * @return FatorRisco
     */
    public FatorRisco setCodFatRis(String codFatRis) {
        this.codFatRis = codFatRis;
        return this;
    }
}
