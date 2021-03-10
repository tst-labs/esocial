package br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.trabalhador.Dependente;
import br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.dominio.trabalhador.TrabImig;

public class DadosTrabalhador {

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
	@Size(min=3, max=3)
	private String paisNac;
	
	@Valid
	@NotNull
	private Endereco endereco;
	
	private TrabImig trabImig;
	
	@Valid
	private InfoDeficiencia infoDeficiencia;
	
	@Valid
	private List<Dependente> dependente;
	
	@Valid
	private Contato contato;

	public String getNmTrab() {
		return nmTrab;
	}

	public void setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
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

	public String getGrauInstr() {
		return grauInstr;
	}

	public void setGrauInstr(String grauInstr) {
		this.grauInstr = grauInstr;
	}

	public String getNmSoc() {
		return nmSoc;
	}

	public void setNmSoc(String nmSoc) {
		this.nmSoc = nmSoc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public InfoDeficiencia getInfoDeficiencia() {
		return infoDeficiencia;
	}

	public void setInfoDeficiencia(InfoDeficiencia infoDeficiencia) {
		this.infoDeficiencia = infoDeficiencia;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getPaisNac() {
		return paisNac;
	}

	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}
	
	public TrabImig getTrabImig() {
		return trabImig;
	}

	public void setTrabImig(TrabImig trabImig) {
		this.trabImig = trabImig;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependente == null) ? 0 : dependente.hashCode());
		result = prime * result + ((estCiv == null) ? 0 : estCiv.hashCode());
		result = prime * result + ((grauInstr == null) ? 0 : grauInstr.hashCode());
		result = prime * result + ((nmSoc == null) ? 0 : nmSoc.hashCode());
		result = prime * result + ((nmTrab == null) ? 0 : nmTrab.hashCode());
		result = prime * result + racaCor;
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosTrabalhador other = (DadosTrabalhador) obj;
		if (dependente == null) {
			if (other.dependente != null)
				return false;
		} else if (!dependente.equals(other.dependente))
			return false;
		if (estCiv == null) {
			if (other.estCiv != null)
				return false;
		} else if (!estCiv.equals(other.estCiv))
			return false;
		if (grauInstr == null) {
			if (other.grauInstr != null)
				return false;
		} else if (!grauInstr.equals(other.grauInstr))
			return false;
		if (nmSoc == null) {
			if (other.nmSoc != null)
				return false;
		} else if (!nmSoc.equals(other.nmSoc))
			return false;
		if (nmTrab == null) {
			if (other.nmTrab != null)
				return false;
		} else if (!nmTrab.equals(other.nmTrab))
			return false;
		if (racaCor != other.racaCor)
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
}
