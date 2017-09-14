package br.com.db1.exercicio;

public class ExerciciosString {

	private String resposta;
	
	
	public void letrasMaiusculas(String palavra){
		resposta = palavra.toUpperCase();
	}
	
	public void letrasMinusculas(String palavra){
		resposta = palavra.toLowerCase();
	}
	
	public void numeroDeLetras(String palavra){
		resposta = Integer.toString(palavra.length());
	}
	
	public void numeroDeLetrasComEspaco(String palavra){
		resposta = Integer.toString(palavra.length());
	}
	
	public void numeroDeLetrasDiferente(String palavra){
		String novaPalavra = palavra.trim();
		resposta = Integer.toString(novaPalavra.length());
	}
	
	public void quatroPrimeirasLetras(String nome){
		resposta = nome.substring(0, 4);
	}
	
	public void terceiraLetraNome(String nome){
		resposta = nome.substring(3);
	}
	
	public void quatroUltimasLetrasNome(String nome){
		resposta = nome.substring(7, 11);
	}
	
	public void substituirNome(String nome){
		nome = "Lorena Uzai";
		resposta = nome.replace("Lorena", "Aluna");
	}
	
	public void separarTexto(String texto){
		String[] r = texto.split(",");
		for(int i = 0; i < r.length; i++){
			resposta += r[i];
		}
	}
	
	public void exibirVogais(String texto){
		int contarVogais = 0;
		for(int i = 0; i < texto.length(); i++){
			char c = texto.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				contarVogais++;
		}
		resposta = contarVogais+"";
	}
	
	public void textoInvertido(String texto){
		StringBuffer sb = new StringBuffer(texto);
		resposta = sb.reverse().toString();
	}
	
	public String exibirResultado(){
		return resposta;
	}
	
	
}
