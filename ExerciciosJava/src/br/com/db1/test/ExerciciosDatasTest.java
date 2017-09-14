package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicio.ExercicioDatas;

public class ExerciciosDatasTest {

	ExercicioDatas exercicio = new ExercicioDatas();
	
	@Test
	public void anoBisetoTest(){
		exercicio.anoBisexto(2012);
		Assert.assertEquals("Ano bisexto", exercicio.exibirResposta());
	}
}
