package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicio.ExerciciosString;

public class ExerciciosStringTest {

	ExerciciosString exercicio = new ExerciciosString();
	
	@Test
	public void letrasMaiusculasTest(){
		exercicio.letrasMaiusculas("fulano");
		Assert.assertTrue(exercicio.exibirResultado().equals("FULANO"));
		Assert.assertEquals("FULANO",exercicio.exibirResultado());
	}
	
	@Test
	public void letrasMinusculasTest(){
		exercicio.letrasMinusculas("FuLanO");
		Assert.assertTrue(exercicio.exibirResultado().equals("fulano"));
	}
	
	@Test
	public void numeroDeLetrasTest(){
		exercicio.numeroDeLetras("DB1START");
		Assert.assertTrue(exercicio.exibirResultado().equals("8"));
	}
	
	@Test
	public void numeroDeLetrasComEspacoTest(){
		exercicio.numeroDeLetras(" DB1START ");
		Assert.assertTrue(exercicio.exibirResultado().equals("10"));
	}
	
	@Test
	public void numeroDeLetrasDiferenteTest(){
		//exercicio.numeroDeLetras(" DB1START ");
		//Assert.assertTrue(exercicio.exibirResultado().equals("8"));
	}
	
	@Test
	public void quatroPrimeirasLetrasTest(){
		exercicio.quatroPrimeirasLetras("Lorena Uzai");
		Assert.assertEquals("Lore", exercicio.exibirResultado());
	}
	
	@Test
	public void terceiraLetraNomeTest(){
		exercicio.terceiraLetraNome("Lorena Uzai");
		Assert.assertEquals("ena Uzai", exercicio.exibirResultado());
	}
	
	
	@Test
	public void quatroUltimasLetrasNomeTest(){
		exercicio.quatroUltimasLetrasNome("Lorena Uzai");
		Assert.assertEquals("Uzai", exercicio.exibirResultado());
	}
	
	@Test
	public void substituirNomeTest(){
		exercicio.substituirNome("Lorena Uzai");
		Assert.assertEquals("Aluna Uzai", exercicio.exibirResultado());
	}
	
	@Test
	public void separarTextoTest(){
		//exercicio.separarTexto("banana, maçã, melancia");
		//Assert.assertEquals("banana, maçã, melancia", exercicio.exibirResultado());
	}
	
	@Test
	public void exibirVogaisTest(){
		exercicio.exibirVogais("Lorena");
		Assert.assertEquals("3", exercicio.exibirResultado());
	}
	
	@Test
	public void textoInvertidoTest(){
		exercicio.textoInvertido("lorena");
		Assert.assertEquals("anerol", exercicio.exibirResultado());
	}
}
