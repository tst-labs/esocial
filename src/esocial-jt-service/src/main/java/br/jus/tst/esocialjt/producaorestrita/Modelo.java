package br.jus.tst.esocialjt.producaorestrita;

import org.springframework.stereotype.Component;

import br.jus.tst.esocial.dominio.empregador.Contato;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.empregador.InfoCadastro;
import br.jus.tst.esocial.dominio.empregador.InfoComplementares;
import br.jus.tst.esocial.dominio.empregador.InfoEmpregador;
import br.jus.tst.esocial.dominio.empregador.SituacaoPJ;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;

@Component
public class Modelo {
	public InformacoesEmpregador obterDadosLimparProducaoRestrita(String cnpj) {
		InformacoesEmpregador informacoesEmpregador = new InformacoesEmpregador();

		informacoesEmpregador.setIdeEmpregador(getEmpregador(cnpj));
		informacoesEmpregador.setInfoEmpregador(getInfoEmpregador());

		return informacoesEmpregador;
	}

	private IdeEmpregador getEmpregador(String cnpj) {
		return new IdeEmpregador()
				.setNrInsc(cnpj)
				.setTpInsc((byte) 1);
	}

	private InfoEmpregador getInfoEmpregador() {
		return new InfoEmpregador()
				.setIdePeriodo(getPeriodo())
				.setInfoCadastro(getInfoCadastro());
	}

	private IdePeriodo getPeriodo() {
		return new IdePeriodo().setIniValid("2010-10");
	}

	private InfoCadastro getInfoCadastro() {
		return new InfoCadastro()
				.setNmRazao("RemoverEmpregadorDaBaseDeDadosDaProducaoRestrita")
				.setClassTrib("00")
				.setIndDesFolha((byte) 0)
				.setIndOptRegEletron((byte) 1)
				.setIndEtt("N")
				.setContato(getContato())
				.setInfoComplementares(getInfoComplementares());
	}

	private Contato getContato() {
		return new Contato()
				.setNmCtt("Nome do Contato")
				.setCpfCtt("73548085121");
	}
	
	private InfoComplementares getInfoComplementares() {
		return new InfoComplementares()
				.setSituacaoPJ(new SituacaoPJ().setIndSitPJ((byte) 0));
	}
}
