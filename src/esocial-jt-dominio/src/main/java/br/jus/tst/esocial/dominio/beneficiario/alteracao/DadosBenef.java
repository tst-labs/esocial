package br.jus.tst.esocial.dominio.beneficiario.alteracao;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente;
import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;

public class DadosBenef {
	@NotNull
	@Size(min=2, max=70)
	private String nmBenefic;
	
	private Sexo sexo;
	
	private byte racaCor;
	
	private Byte estCiv;
	
	@NotNull
	private SimNao incFisMen;
	
	@Valid
	private Endereco endereco;
	
	private List<Dependente> dependente;

	public String getNmBenefic() {
		return nmBenefic;
	}

	public void setNmBenefic(String nmBenefic) {
		this.nmBenefic = nmBenefic;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public byte getRacaCor() {
		return racaCor;
	}

	public void setRacaCor(byte racaCor) {
		this.racaCor = racaCor;
	}

	public Byte getEstCiv() {
		return estCiv;
	}

	public void setEstCiv(Byte estCiv) {
		this.estCiv = estCiv;
	}

	public SimNao getIncFisMen() {
		return incFisMen;
	}

	public void setIncFisMen(SimNao incFisMen) {
		this.incFisMen = incFisMen;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estCiv, incFisMen, nmBenefic, racaCor, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosBenef other = (DadosBenef) obj;
		return Objects.equals(estCiv, other.estCiv) && incFisMen == other.incFisMen
				&& Objects.equals(nmBenefic, other.nmBenefic) && racaCor == other.racaCor && sexo == other.sexo;
	}
}
