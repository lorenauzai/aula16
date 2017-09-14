package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicio.ExerciciosInteger;

public class ExercicioIntegerTest {

	ExerciciosInteger exercicios = new ExerciciosInteger();

	@Test
	public void somaTest() {
		exercicios.soma(7, 7);
		Assert.assertTrue(14 == exercicios.exibirResultado());
	}
	
	@Test
	public void subtrairTest(){
		exercicios.subtrair(10, 5);
		Assert.assertTrue(5 == exercicios.exibirResultado());
	}
	
	@Test
	public void multiplicacaoTest(){
		exercicios.multiplicacao(2, 6);
		Assert.assertTrue(12 == exercicios.exibirResultado());
	}
	
	@Test
	public void dividirTest(){
		exercicios.dividir(100, 10);
		Assert.assertTrue(10 == exercicios.exibirResultado());
	}
	
	@Test
	public void numeroParTest(){
		exercicios.numeroPar(8);
		Assert.assertTrue(0 == exercicios.exibirResultado());
	}
	
	@Test
	public void maiorNumeroTest(){
		exercicios.maiorNumero(12, 46);
		Assert.assertTrue(46 == exercicios.exibirResultado());
	}
	
	@Test
	public void numeroImparesTest(){
		exercicios.numeroImpares(3);
		
	}
	
	
	
}
