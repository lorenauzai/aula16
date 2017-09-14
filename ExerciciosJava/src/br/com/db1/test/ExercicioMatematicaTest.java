package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicio.ExercicioMatematica;

public class ExercicioMatematicaTest {

	ExercicioMatematica exercicio = new ExercicioMatematica();
	
	@Test
	public void menorValorTest(){
		exercicio.menorValor(5d, 12d);
		Assert.assertTrue(5d == exercicio.exibirResposta());
	}
	
	@Test
	public void menorValorEntreTresTest(){
		exercicio.menorValorEntreTres(2d, 12d, 3.5d);
		Assert.assertTrue(2d == exercicio.exibirResposta());
	}
	
	@Test
	public void mediaTresValoresTest(){
		exercicio.mediaTresValore(6d, 6d, 6d);
		Assert.assertTrue(6d == exercicio.exibirResposta());
	}
	
	@Test
	public void areaTrianguloTest(){
		exercicio.areaTriangulo(4d, 4d);
		Assert.assertTrue(8d == exercicio.exibirResposta());
	}
}
