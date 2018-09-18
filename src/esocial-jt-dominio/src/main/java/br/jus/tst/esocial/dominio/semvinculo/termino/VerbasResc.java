package br.jus.tst.esocial.dominio.semvinculo.termino;

import java.util.List;

import javax.validation.Valid;

import br.jus.tst.esocial.dominio.demonstrativovalores.DmDev;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoMV;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.ProcJudTrab;

public class VerbasResc {
	
	@Valid
	private List<DmDev> dmDev;	
	
	@Valid
	private List<ProcJudTrab> procJudTrab;
	
	@Valid
	private InfoMV infoMV;

	public List<DmDev> getDmDev() {
		return dmDev;
	}

	public void setDmDev(List<DmDev> dmDev) {
		this.dmDev = dmDev;
	}

	public List<ProcJudTrab> getProcJudTrab() {
		return procJudTrab;
	}

	public void setProcJudTrab(List<ProcJudTrab> procJudTrab) {
		this.procJudTrab = procJudTrab;
	}

	public InfoMV getInfoMV() {
		return infoMV;
	}

	public void setInfoMV(InfoMV infoMV) {
		this.infoMV = infoMV;
	}
}
