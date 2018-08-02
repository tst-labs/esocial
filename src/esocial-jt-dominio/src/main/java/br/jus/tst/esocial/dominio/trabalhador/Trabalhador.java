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

public class Trabalhador {
	
	@NotNull
	@CPF
	private String cpfTrab;
	
	@NotNull
	@Size(min=11, max=11)
	private String nisTrab;
	
	@NotNull
	@Size(min=2, max=70)
	private String nmTrab;
	
	@NotNull
	@Pattern(regexp="[F|M]")
	private String sexo;
	
	@NotNull
	private byte racaCor;
	
	private Byte estCiv;
	
	@NotNull
	@Pattern(regexp="\\d{2}")
	private String grauInstr;
	
	private String indPriEmpr;
	
	@Size(min=2, max=70)
	private String nmSoc;
	
	@NotNull
	private Nascimento nascimento;
	
	@Valid
	private Documentos documentos;
	
	@Valid
	@NotNull
	private Endereco endereco;
	
	@Valid
	private TrabEstrangeiro trabEstrangeiro;
	
	@Valid
	private InfoDeficiencia infoDeficiencia;
	
	@Valid
	private List<Dependente> dependente;
	
	@Valid
	private Aposentadoria aposentadoria;

	@Valid
	private Contato contato;

	public String getCpfTrab() {
		return cpfTrab;
	}

	public Trabalhador setCpfTrab(String cpf) {
		this.cpfTrab = cpf;
		return this;
	}

	public String getNisTrab() {
		return nisTrab;
	}

	public Trabalhador setNisTrab(String nis) {
		this.nisTrab = nis;
		return this;
	}

	public String getNmTrab() {
		return nmTrab;
	}

	public Trabalhador setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
		return this;
	}

	public String getSexo() {
		return sexo;
	}

	public Trabalhador setSexo(String sexo) {
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

	public String getIndPriEmpr() {
		return indPriEmpr;
	}

	public Trabalhador setIndPriEmpr(String indPrimEmpr) {
		this.indPriEmpr = indPrimEmpr;
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

	public Documentos getDocumentos() {
		return documentos;
	}

	public Trabalhador setDocumentos(Documentos documentos) {
		this.documentos = documentos;
		return this;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Trabalhador setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return this;
	}

	public TrabEstrangeiro getTrabEstrangeiro() {
		return trabEstrangeiro;
	}

	public Trabalhador setTrabEstrangeiro(TrabEstrangeiro trabEstrangeiro) {
		this.trabEstrangeiro = trabEstrangeiro;
		return this;
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

	public Aposentadoria getAposentadoria() {
		return aposentadoria;
	}

	public Trabalhador setAposentadoria(Aposentadoria aposentadoria) {
		this.aposentadoria = aposentadoria;
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
