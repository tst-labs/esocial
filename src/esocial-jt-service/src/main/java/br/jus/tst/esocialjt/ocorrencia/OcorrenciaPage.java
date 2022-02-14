package br.jus.tst.esocialjt.ocorrencia;

import java.util.List;

import org.springframework.data.domain.Page;

import br.jus.tst.esocialjt.dominio.Ocorrencia;

public class OcorrenciaPage {
	public Page<Ocorrencia> pagina;
	public List<ContagemEstado> contagemEstado;
}
