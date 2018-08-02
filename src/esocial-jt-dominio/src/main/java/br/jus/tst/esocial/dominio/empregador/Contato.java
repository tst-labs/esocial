package br.jus.tst.esocial.dominio.empregador;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

/**
 * Informações de contato
 *
 */
public class Contato {

	@NotNull
	@Size(min=2, max=70)
    private String nmCtt;

	@NotNull
	@CPF
    private String cpfCtt;
	
	@Size(min=8, max=13)
    private String foneFixo;
    
	@Size(min=8, max=13)
    private String foneCel;
	
    @Email
    private String email;

    /**
     * Nome do contato na empresa. Pessoa responsável por ser o contato do
     * empregador com os órgãos gestores do eSocial
     *
     * @return the nmCtt
     */
    public String getNmCtt() {
        return nmCtt;
    }

    /**
     * Nome do contato na empresa. Pessoa responsável por ser o contato do
     * empregador com os órgãos gestores do eSocial Regra de validação:
     * REGRA_GERAL_VALIDA_NOME
     *
     * @param nmCtt the nmCtt to set
     */
    public Contato setNmCtt(String nome) {
        this.nmCtt = nome;
        return this;
    }

    /**
     * @return the cpfCtt
     */
    public String getCpfCtt() {
        return cpfCtt;
    }

    /**
     * Preencher com o número do CPF do contato. Validação: A inscrição é
     * validada na base de dados do CPF da RFB.
     *
     * @param cpfCtt the cpfCtt to set
     */
    public Contato setCpfCtt(String cpf) {
        this.cpfCtt = cpf;
        return this;
    }

    /**
     * @return the foneFixo
     */
    public String getFoneFixo() {
        return foneFixo;
    }

    /**
     * Informar o número do telefone, com DDD. Validação: O preenchimento é
     * obrigatório se o campo número celular não for preenchido. Se preenchido,
     * deve conter apenas números, com o mínimo de dez dígitos
     *
     * @param foneFixo the foneFixo to set
     */
    public Contato setFoneFixo(String foneFixo) {
        this.foneFixo = foneFixo;
        return this;
    }

    /**
     * @return the foneCel
     */
    public String getFoneCel() {
        return foneCel;
    }

    /**
     * Telefone celular, com DDD Validação: Se preenchido, deve conter apenas
     * números, com o mínimo de dez dígitos.
     *
     * @param foneCel the foneCel to set
     */
    public Contato setFoneCel(String foneCelular) {
        this.foneCel = foneCelular;
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
     * um caractere "." depois do "@" e não pode estar no fim do e-mail
     *
     * @param email the email to set
     */
    public Contato setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nmCtt);
        hash = 29 * hash + Objects.hashCode(this.cpfCtt);
        hash = 29 * hash + Objects.hashCode(this.foneFixo);
        hash = 29 * hash + Objects.hashCode(this.foneCel);
        hash = 29 * hash + Objects.hashCode(this.email);
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
        final Contato other = (Contato) obj;
        return new EqualsBuilder()
        	.append(this.nmCtt, other.nmCtt)
        	.append(this.cpfCtt, other.cpfCtt)
        	.append(this.foneFixo, other.foneFixo)
        	.append(this.foneCel, other.foneCel)
        	.append(this.email, other.email)
        	.isEquals();
    }
}
