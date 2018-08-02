package br.jus.tst.esocialjt.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class LimpadorNulosTest {
	
	@Test
	public void deveRemoverObjetosNulos() throws Exception{
		ObjetoExemplo objeto_1 = new ObjetoExemplo();
		objeto_1.setPropriedade("objeto_1");
		ObjetoExemplo objeto_1_1 = new ObjetoExemplo();
		ObjetoExemplo objeto_1_2 = new ObjetoExemplo();
		ObjetoExemplo objeto_1_1_1 = new ObjetoExemplo();
		objeto_1_1_1.setPropriedade("objeto_1_1_1");
		ObjetoExemplo objeto_1_1_2 = new ObjetoExemplo();
		objeto_1_1_2.setLista(new ArrayList<>());
		
		
		objeto_1.setObjetoInterno1(objeto_1_1);
		objeto_1.setObjetoInterno2(objeto_1_2);
		objeto_1_1.setObjetoInterno1(objeto_1_1_1);
		objeto_1_1.setObjetoInterno2(objeto_1_1_2);
		
		LimpadorNulos limpadorNulos = new LimpadorNulos();
		limpadorNulos.executarLimpeza(objeto_1);
		
		assertThat(objeto_1).isNotNull();
		assertThat(objeto_1.getObjetoInterno1()).isNotNull();
		assertThat(objeto_1.getObjetoInterno1().getObjetoInterno1()).isNotNull();
		assertThat(objeto_1.getObjetoInterno1().getObjetoInterno2()).isNull();
		assertThat(objeto_1.getObjetoInterno2()).isNull();
		
	}
	
	@Test
	public void naoDeveRemoverSePropriedadeMarcadaParaNaoRemover() throws Exception{
		ObjetoExemplo objeto_1 = new ObjetoExemplo();
		objeto_1.setPropriedade("objeto_1");
		ObjetoExemplo objeto_1_1 = new ObjetoExemplo();
		ObjetoExemplo objeto_1_2 = new ObjetoExemplo();
		ObjetoExemplo objeto_1_1_1 = new ObjetoExemplo();
		objeto_1_1_1.setPropriedade("objeto_1_1_1");
		ObjetoExemplo objeto_1_1_2 = new ObjetoExemplo();
		objeto_1_1_2.setLista(new ArrayList<>());
		
		
		objeto_1.setObjetoInterno1(objeto_1_1);
		objeto_1.setObjetoInterno2(objeto_1_2);
		objeto_1_1.setObjetoInterno1(objeto_1_1_1);
		objeto_1_1.setObjetoInterno2(objeto_1_1_2);
		
		LimpadorNulosConfig config = new LimpadorNulosConfig();
		config.naoLimparPropriedade("objetoInterno2");
		
		LimpadorNulos limpadorNulos = new LimpadorNulos(config);
		limpadorNulos.executarLimpeza(objeto_1);
		
		assertThat(objeto_1).isNotNull();
		assertThat(objeto_1.getObjetoInterno1()).isNotNull();
		assertThat(objeto_1.getObjetoInterno1().getObjetoInterno1()).isNotNull();
		assertThat(objeto_1.getObjetoInterno1().getObjetoInterno2()).isNotNull();
		assertThat(objeto_1.getObjetoInterno2()).isNotNull();
		
	}
}
