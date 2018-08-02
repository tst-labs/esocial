package br.jus.tst.esocial.dominio.empregador;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * Informações relativas ao desenvolvedor do software que gerou o arquivo xml.
 *
 */
public class SoftwareHouse {

	@NotNull
	@CNPJ
    private String cnpjSoftHouse;
	
	@NotNull
	@Size(min=1, max=115)
    private String nmRazao;
	
	@NotNull
	@Size(min=2, max=70)
    private String nmCont;
	
	@NotNull
	@Size(min=8, max=13)
    private String telefone;
	
	@Email
    private String email;

    /**
     * @return the cnpjSoftHouse
     */
    public String getCnpjSoftHouse() {
        return cnpjSoftHouse;
    }

    /**
     *
     * CNPJ da empresa desenvolvedora do software. Se o software foi
     * desenvolvido pelo próprio empregador, informar o CNPJ do estabelecimento
     * do empregador responsável pelo desenvolvimento. Regra de validação:
     * REGRA_VALIDA_CNPJ
     *
     * @param cnpjSoftHouse the cnpjSoftHouse to set
     */
    public SoftwareHouse setCnpjSoftHouse(String cpnj) {
        this.cnpjSoftHouse = cpnj;
        return this;
    }

    /**
     * @return the nmRazao
     */
    public String getNmRazao() {
        return nmRazao;
    }

    /**
     * Informar a razão social, no caso de pessoa jurídica ou órgão público.
     *
     * @param nmRazao the nmRazao to set
     */
    public SoftwareHouse setNmRazao(String razaoSocial) {
        this.nmRazao = razaoSocial;
        return this;
    }

    /**
     * Nome do nmCont na empresa.
     *
     * @return the nmCont
     */
    public String getNmCont() {
        return nmCont;
    }

    /**
     * Nome do nmCont na empresa. Regra de validação: REGRA_GERAL_VALIDA_NOME
     *
     * @param nmCont the nmCont to set
     */
    public SoftwareHouse setNmCont(String contato) {
        this.nmCont = contato;
        return this;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Informar o número do telefone, com DDD. Validação: Deve conter apenas
     * números, com o mínimo de dez dígitos
     *
     * @param telefone the telefone to set
     */
    public SoftwareHouse setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Endereço eletrônico Validação: O e-mail deve possuir o caractere "@" e
     * este não pode estar no início e no fim do e-mail. Deve possuir no mínimo
     * um caractere "." depois do @ e não pode estar no fim do e-mail.
     *
     * @param email the email to set
     */
    public SoftwareHouse setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cnpjSoftHouse);
        hash = 53 * hash + Objects.hashCode(this.nmRazao);
        hash = 53 * hash + Objects.hashCode(this.nmCont);
        hash = 53 * hash + Objects.hashCode(this.telefone);
        hash = 53 * hash + Objects.hashCode(this.email);
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
        final SoftwareHouse other = (SoftwareHouse) obj;
       
        return new EqualsBuilder()
        	.append(this.cnpjSoftHouse, other.cnpjSoftHouse)
        	.append(this.nmRazao, other.nmRazao)
        	.append(this.nmCont, other.nmCont)
        	.append(this.telefone, other.telefone)
        	.append(this.email, other.email)
        	.isEquals();
    }

}
