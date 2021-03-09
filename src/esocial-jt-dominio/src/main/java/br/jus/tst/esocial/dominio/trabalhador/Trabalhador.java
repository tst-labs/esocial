package br.jus.tst.esocial.dominio.trabalhador;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.br.CPF;

import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.nascimento.Nascimento;

public class Trabalhador {
	
	@NotNull
	@CPF
	private String cpfTrab;
	
	@NotNull
	@Size(min=2, max=70)
	private String nmTrab;
	
	@NotNull
	private Sexo sexo;
	
	@NotNull
	private byte racaCor;
	
	private Byte estCiv;
	
	@NotNull
	@Pattern(regexp="\\d{2}")
	private String grauInstr;
	
	@Size(min=2, max=70)
	private String nmSoc;
	
	@NotNull
	private Nascimento nascimento;
	
	@Valid
	private Endereco endereco;
	
	private TrabImig trabImig;
	
	@Valid
	private InfoDeficiencia infoDeficiencia;
	
	@Valid
	private List<Dependente> dependente;
	
	@Valid
	private Contato contato;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public Trabalhador setCpfTrab(String cpf) {
		this.cpfTrab = cpf;
		return this;
	}

	public String getNmTrab() {
		return nmTrab;
	}

	public Trabalhador setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
		return this;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public Trabalhador setSexo(Sexo sexo) {
		this.sexo = sexo;
		return this;
	}

	public byte getRacaCor() {
		return racaCor;
	}

	public Trabalhador setRacaCor(byte racaCor) {
		this.racaCor = racaCor;
		return this;
	}

	public Byte getEstCiv() {
		return estCiv;
	}

	public Trabalhador setEstCiv(Byte estCiv) {
		this.estCiv = estCiv;
		return this;
	}

	public String getGrauInstr() {
		return grauInstr;
	}

	public Trabalhador setGrauInstr(String grauInstr) {
		this.grauInstr = StringUtils.leftPad(grauInstr, 2, '0');
		return this;
	}

	public String getNmSoc() {
		return nmSoc;
	}

	public Trabalhador setNmSoc(String nmSoc) {
		this.nmSoc = nmSoc;
		return this;
	}

	public Nascimento getNascimento() {
		return nascimento;
	}

	public Trabalhador setNascimento(Nascimento nascimento) {
		this.nascimento = nascimento;
		return this;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Trabalhador setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return this;
	}

	public TrabImig getTrabImig() {
		return trabImig;
	}

	public void setTrabImig(TrabImig trabImig) {
		this.trabImig = trabImig;
	}

	public InfoDeficiencia getInfoDeficiencia() {
		return infoDeficiencia;
	}

	public Trabalhador setInfoDeficiencia(InfoDeficiencia infoDeficiencia) {
		this.infoDeficiencia = infoDeficiencia;
		return this;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public Trabalhador setDependente(List<Dependente> dependentes) {
		this.dependente = dependentes;
		return this;
	}

	public Contato getContato() {
		return contato;
	}

	public Trabalhador setContato(Contato contato) {
		this.contato = contato;
		return this;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Trabalhador)) {
			return false;
		}
		Trabalhador castOther = (Trabalhador) other;
		return new EqualsBuilder().append(cpfTrab, castOther.cpfTrab).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(cpfTrab).toHashCode();
	}

}
