package br.jus.tst.esocial.dominio.demonstrativovalores;

import br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot;
import br.jus.tst.esocial.dominio.rra.IndRRA;
import br.jus.tst.esocial.dominio.rra.InfoRRA;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.List;

public class DmDev {
	
	@Size(min=1, max=30)
	private String ideDmDev;
	
	@Valid
	private List<IdeEstabLot> ideEstabLot;

	private BigInteger codCateg;

    @Valid
    private InfoPerApur infoPerApur;

    @Valid
    private InfoPerAnt infoPerAnt;

    private InfoComplCont infoComplCont;

    @Valid
    private List<InfoTrabInterm> infoTrabInterm;

    private IndRRA indRRA;

    private InfoRRA infoRRA;

    public String getIdeDmDev() {
        return ideDmDev;
    }

    public void setIdeDmDev(String ideDmDev) {
        this.ideDmDev = ideDmDev;
    }

    public List<IdeEstabLot> getIdeEstabLot() {
		return ideEstabLot;
	}

	public void setIdeEstabLot(List<IdeEstabLot> ideEstabLot) {
		this.ideEstabLot = ideEstabLot;
	}

	public InfoPerApur getInfoPerApur() {
		return infoPerApur;
	}

	public void setInfoPerApur(InfoPerApur infoPerApur) {
		this.infoPerApur = infoPerApur;
	}

	public InfoPerAnt getInfoPerAnt() {
		return infoPerAnt;
	}

	public void setInfoPerAnt(InfoPerAnt infoPerAnt) {
		this.infoPerAnt = infoPerAnt;
	}

	public List<InfoTrabInterm> getInfoTrabInterm() {
		return infoTrabInterm;
	}

	public void setInfoTrabInterm(List<InfoTrabInterm> infoTrabInterm) {
		this.infoTrabInterm = infoTrabInterm;
	}

	public BigInteger getCodCateg() {
		return codCateg;
	}

	public void setCodCateg(BigInteger codCateg) {
        this.codCateg = codCateg;
    }

    public InfoComplCont getInfoComplCont() {
        return infoComplCont;
    }

    public void setInfoComplCont(InfoComplCont infoComplCont) {
        this.infoComplCont = infoComplCont;
    }

    public IndRRA getIndRRA() {
        return indRRA;
    }

    public void setIndRRA(IndRRA indRRA) {
        this.indRRA = indRRA;
    }

    public InfoRRA getInfoRRA() {
        return infoRRA;
    }

    public void setInfoRRA(InfoRRA infoRRA) {
        this.infoRRA = infoRRA;
    }
}
