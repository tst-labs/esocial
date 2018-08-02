package br.jus.tst.esocial.dominio.tabela.lotacao;

import java.util.List;

import javax.validation.Valid;

public class InfoProcJudTerceiros {

	@Valid
	private List<ProcJudTerceiro> procJudTerceiro;

	public List<ProcJudTerceiro> getProcJudTerceiro() {
		return procJudTerceiro;
	}

	public void setProcJudTerceiro(List<ProcJudTerceiro> procJudTerceiro) {
		this.procJudTerceiro = procJudTerceiro;
	}
}
