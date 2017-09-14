package br.com.db1.exercicio;

public class ExercicioDatas {

	private String resposta;
	
	public void anoBisexto(Integer ano){
		if(ano % 400 ==0){
			resposta = "Ano bisexto";
		}else if(ano % 4 ==0  && ano % 100 !=0){
			resposta = "Ano bisexto";
		}else{
			resposta = "Não é bisexto";
		}
	}
	
	
	public String exibirResposta(){
		return resposta;
	}
}
