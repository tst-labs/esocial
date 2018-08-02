package br.jus.tst.esocial.dominio.tabela.horario;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.hibernate.validator.constraints.Length;

import br.jus.tst.esocial.validacao.CheckDate;

/**
 * 
 * Grupo de informações de identificação do horário contratual, apresentando o
 * código e período de validade do registro cujas informações estão sendo
 * incluídas.
 *
 */
public class IdeHorContrat {

	@NotNull
	@Length(min = 1, max = 30)
	private String codHorContrat;

	@NotNull
	@CheckDate(dateFormat = "YYYY-MM")
	private String iniValid;

	@CheckDate(dateFormat = "YYYY-MM")
	private String fimValid;
	
	public String getCodHorContrat() {
		return codHorContrat;
	}

	public void setCodHorContrat(String codHorContrat) {
		this.codHorContrat = codHorContrat;
	}

	public String getIniValid() {
		return iniValid;
	}

	public void setIniValid(String iniValid) {
		this.iniValid = iniValid;
	}

	public String getFimValid() {
		return fimValid;
	}

	public void setFimValid(String fimValid) {
		this.fimValid = fimValid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fimValid == null) ? 0 : fimValid.hashCode());
		result = prime * result + ((iniValid == null) ? 0 : iniValid.hashCode());
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
		IdeHorContrat other = (IdeHorContrat) obj;
		return new EqualsBuilder()
				.append(iniValid, other.iniValid)
				.append(fimValid, other.fimValid)
				.isEquals();
	}
}
