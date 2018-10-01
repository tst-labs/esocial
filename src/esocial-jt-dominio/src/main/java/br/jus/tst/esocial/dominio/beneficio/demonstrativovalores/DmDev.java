package br.jus.tst.esocial.dominio.beneficio.demonstrativovalores;

import java.util.List;

import javax.validation.constraints.Size;

public class DmDev {

	private Byte tpBenef;
	
	@Size(min=3, max=20)
	private String nrBenefic;
	
	@Size(min=1, max=30)
	private String ideDmDev;

	private List<Item> itens;

	public Byte getTpBenef() {
		return tpBenef;
	}

	public void setTpBenef(Byte tpBenef) {
		this.tpBenef = tpBenef;
	}

	public String getNrBenefic() {
		return nrBenefic;
	}

	public void setNrBenefic(String nrBenefic) {
		this.nrBenefic = nrBenefic;
	}

	public String getIdeDmDev() {
		return ideDmDev;
	}

	public void setIdeDmDev(String ideDmDev) {
		this.ideDmDev = ideDmDev;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	} 

	
}
