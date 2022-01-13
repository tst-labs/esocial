package br.jus.tst.esocial.dominio.beneficiario.inicio;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;

public class Beneficiario {
	
	@NotNull
	@CPF
	private String cpfBenef;
	
	@NotNull
	@Size(min=2, max=70)
	private String nmBenefic;
	
	@NotNull
	private Calendar dtNascto;
	
	@NotNull
	private Calendar dtInicio;
	
	private Sexo sexo;
	
	private byte racaCor;
	
	private Byte estCiv;
	
	@NotNull
	private SimNao incFisMen;
	
	private Calendar dtIncFisMen;
	
	@Valid
	private Endereco endereco;
	
	private List<Dependente> dependente;
	
	public String getCpfBenef() {
		return cpfBenef;
	}

	public Beneficiario setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
		return this;
	}

	public String getNmBenefic() {
		return nmBenefic;
	}

	public Beneficiario setNmBenefic(String nmBenefic) {
		this.nmBenefic = nmBenefic;
		return this;
	}

	public Calendar getDtNascto() {
		return dtNascto;
	}

	public Beneficiario setDtNascto(Calendar dtNascto) {
		this.dtNascto = dtNascto;
		return this;
	}

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public Beneficiario setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
		return this;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public Beneficiario setSexo(Sexo sexo) {
		this.sexo = sexo;
		return this;
	}

	public byte getRacaCor() {
		return racaCor;
	}

	public Beneficiario setRacaCor(byte racaCor) {
		this.racaCor = racaCor;
		return this;
	}

	public Byte getEstCiv() {
		return estCiv;
	}

	public Beneficiario setEstCiv(Byte estCiv) {
		this.estCiv = estCiv;
		return this;
	}

	public SimNao getIncFisMen() {
		return incFisMen;
	}

	public Beneficiario setIncFisMen(SimNao incFisMen) {
		this.incFisMen = incFisMen;
		return this;
	}

	public Calendar getDtIncFisMen() {
		return dtIncFisMen;
	}

	public Beneficiario setDtIncFisMen(Calendar dtIncFisMen) {
		this.dtIncFisMen = dtIncFisMen;
		return this;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Beneficiario setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return this;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public Beneficiario setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
		return this;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfBenef, dtIncFisMen, dtInicio, dtNascto, estCiv, incFisMen, nmBenefic, racaCor, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beneficiario other = (Beneficiario) obj;
		return Objects.equals(cpfBenef, other.cpfBenef) && Objects.equals(dtIncFisMen, other.dtIncFisMen)
				&& Objects.equals(dtInicio, other.dtInicio) && Objects.equals(dtNascto, other.dtNascto)
				&& Objects.equals(estCiv, other.estCiv) && incFisMen == other.incFisMen
				&& Objects.equals(nmBenefic, other.nmBenefic) && racaCor == other.racaCor && sexo == other.sexo;
	}
	
}
