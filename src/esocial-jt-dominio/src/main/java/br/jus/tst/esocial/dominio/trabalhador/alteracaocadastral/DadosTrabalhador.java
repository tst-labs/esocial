package br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import br.jus.tst.esocial.dominio.trabalhador.Aposentadoria;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.trabalhador.Dependente;
import br.jus.tst.esocial.dominio.trabalhador.Documentos;
import br.jus.tst.esocial.dominio.trabalhador.Endereco;
import br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.dominio.trabalhador.Nascimento;
import br.jus.tst.esocial.dominio.trabalhador.TrabEstrangeiro;

public class DadosTrabalhador {

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

	public String getNisTrab() {
		return nisTrab;
	}

	public void setNisTrab(String nisTrab) {
		this.nisTrab = nisTrab;
	}

	public String getNmTrab() {
		return nmTrab;
	}

	public void setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
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

	public Nascimento getNascimento() {
		return nascimento;
	}

	public void setNascimento(Nascimento nascimento) {
		this.nascimento = nascimento;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TrabEstrangeiro getTrabEstrangeiro() {
		return trabEstrangeiro;
	}

	public void setTrabEstrangeiro(TrabEstrangeiro trabEstrangeiro) {
		this.trabEstrangeiro = trabEstrangeiro;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependente == null) ? 0 : dependente.hashCode());
		result = prime * result + ((estCiv == null) ? 0 : estCiv.hashCode());
		result = prime * result + ((grauInstr == null) ? 0 : grauInstr.hashCode());
		result = prime * result + ((nisTrab == null) ? 0 : nisTrab.hashCode());
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
		if (nisTrab == null) {
			if (other.nisTrab != null)
				return false;
		} else if (!nisTrab.equals(other.nisTrab))
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

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

	public Aposentadoria getAposentadoria() {
		return aposentadoria;
	}

	public void setAposentadoria(Aposentadoria aposentadoria) {
		this.aposentadoria = aposentadoria;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}


	
}
