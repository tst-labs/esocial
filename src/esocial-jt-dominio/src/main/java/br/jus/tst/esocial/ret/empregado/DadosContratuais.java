package br.jus.tst.esocial.ret.empregado;

import br.jus.tst.esocial.dominio.vinculo.InfoContrato;
import br.jus.tst.esocial.dominio.vinculo.InfoRegimeTrab;
import br.jus.tst.esocial.dominio.vinculo.SucessaoVinc;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DadosContratuais {
	public String matricula;
	public byte tpRegTrab;
	public byte tpRegPrev;
	public InfoRegimeTrab infoRegimeTrab;
	public InfoContrato infoContrato;
	public SucessaoVinc sucessaoVinc;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public byte getTpRegTrab() {
		return tpRegTrab;
	}

	public void setTpRegTrab(byte tpRegTrab) {
		this.tpRegTrab = tpRegTrab;
	}

	public byte getTpRegPrev() {
		return tpRegPrev;
	}

	public void setTpRegPrev(byte tpRegPrev) {
		this.tpRegPrev = tpRegPrev;
	}

	public InfoRegimeTrab getInfoRegimeTrab() {
		return infoRegimeTrab;
	}

	public void setInfoRegimeTrab(InfoRegimeTrab infoRegimeTrab) {
		this.infoRegimeTrab = infoRegimeTrab;
	}

	public InfoContrato getInfoContrato() {
		return infoContrato;
	}

	public void setInfoContrato(InfoContrato infoContrato) {
		this.infoContrato = infoContrato;
	}

	public SucessaoVinc getSucessaoVinc() {
		return sucessaoVinc;
	}

	public void setSucessaoVinc(SucessaoVinc sucessaoVinc) {
		this.sucessaoVinc = sucessaoVinc;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		DadosContratuais that = (DadosContratuais) o;

		return new EqualsBuilder()
				.append(tpRegTrab, that.tpRegTrab)
				.append(tpRegPrev, that.tpRegPrev)
				.append(matricula, that.matricula)
				.append(infoRegimeTrab, that.infoRegimeTrab)
				.append(infoContrato, that.infoContrato)
				.append(sucessaoVinc, that.sucessaoVinc)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(matricula)
				.append(tpRegTrab)
				.append(tpRegPrev)
				.append(infoRegimeTrab)
				.append(infoContrato)
				.append(sucessaoVinc)
				.toHashCode();
	}
}
