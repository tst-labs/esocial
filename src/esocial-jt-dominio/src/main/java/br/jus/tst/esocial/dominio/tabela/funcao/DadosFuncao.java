package br.jus.tst.esocial.dominio.tabela.funcao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DadosFuncao {
	
	@NotNull
	@Size(min = 1, max = 100)
	private String dscFuncao;
	
	@NotNull
	@Size(min = 1, max = 6)
	private String codCBO;

	public String getDscFuncao() {
		return dscFuncao;
	}

	public DadosFuncao setDscFuncao(String dscFuncao) {
		this.dscFuncao = dscFuncao;
		return this;
	}

	public String getCodCBO() {
		return codCBO;
	}

	public DadosFuncao setCodCBO(String codCBO) {
		this.codCBO = codCBO;
		return this;
	}

}
