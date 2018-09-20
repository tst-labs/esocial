package br.jus.tst.esocial.dominio.pagamento;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PenAlim {
	
	@NotNull
	@Pattern(regexp="\\d{11}")
	private String cpfBenef;
	
	private Calendar dtNasctoBenef;
	
	@NotNull
	@Size(min=2, max=70)
	private String nmBenefic;
	
	@NotNull
	private BigDecimal vlrPensao;

	public String getCpfBenef() {
		return cpfBenef;
	}

	public void setCpfBenef(String cpfBenef) {
		this.cpfBenef = cpfBenef;
	}

	public Calendar getDtNasctoBenef() {
		return dtNasctoBenef;
	}

	public void setDtNasctoBenef(Calendar dtNasctoBenef) {
		this.dtNasctoBenef = dtNasctoBenef;
	}

	public String getNmBenefic() {
		return nmBenefic;
	}

	public void setNmBenefic(String nmBenefic) {
		this.nmBenefic = nmBenefic;
	}

	public BigDecimal getVlrPensao() {
		return vlrPensao;
	}

	public void setVlrPensao(BigDecimal vlrPensao) {
		this.vlrPensao = vlrPensao;
	}
	
}
