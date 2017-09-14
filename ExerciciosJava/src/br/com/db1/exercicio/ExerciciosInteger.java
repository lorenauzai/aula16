package br.com.db1.exercicio;

public class ExerciciosInteger {

	private Integer resposta;
	
	public Integer soma(Integer valor1, Integer valor2){
		return resposta = valor1 + valor2;
	}
	
	public Integer subtrair(Integer valor1, Integer valor2){
		return resposta = valor1 - valor2;
	}
	
	public Integer multiplicacao(Integer valor1, Integer valor2){
		return resposta = valor1 * valor2;
	}
	
	public Integer dividir(Integer valor1, Integer valor2){
		return resposta = valor1 / valor2;
	}
	
	public Integer numeroPar(Integer numeroPar){
		return resposta = numeroPar % 2;
	}
	
	public Integer maiorNumero(Integer valor1, Integer valor2){
		if(valor1 > valor2){
			return resposta = valor1;
		}
			return resposta = valor2;
	}
	
	public void numeroImpares(Integer valor1){
		for(int i = valor1; i <101; i++){
			if (i % 2 != 0){
				System.out.println(i);
			}
		}
	}
	
	public Integer exibirResultado(){
		return resposta;
	}
}
