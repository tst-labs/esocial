package br.jus.tst.esocial.dominio.desligamento;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class DetOper {
	
	@NotNull
	@Pattern(regexp="\\d{8,14}")
	private String cnpjOper;
	
	@NotNull
	private String regANS;
	
	@NotNull
	private BigDecimal vrPgTit;
	
	private List<DetPlano> detPlano;

	public String getCnpjOper() {
		return cnpjOper;
	}

	public void setCnpjOper(String cnpjOper) {
		this.cnpjOper = cnpjOper;
	}

	public String getRegANS() {
		return regANS;
	}

	public void setRegANS(String regANS) {
		this.regANS = regANS;
	}

	public BigDecimal getVrPgTit() {
		return vrPgTit;
	}

	public void setVrPgTit(BigDecimal vrPgTit) {
		this.vrPgTit = vrPgTit;
	}

	public List<DetPlano> getDetPlano() {
		return detPlano;
	}

	public void setDetPlano(List<DetPlano> detPlano) {
		this.detPlano = detPlano;
	}
}
