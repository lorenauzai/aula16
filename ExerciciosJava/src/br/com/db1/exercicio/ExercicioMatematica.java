package br.com.db1.exercicio;

public class ExercicioMatematica {

	private Double resposta;

	public void menorValor(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			resposta = valor1;
		} else {
			resposta = valor2;
		}
	}

	public void menorValorEntreTres(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1 < valor3) {
			resposta = valor1;
		} else if (valor2 < valor1 && valor2 < valor3) {
			resposta = valor2;
		} else {
			resposta = valor3;
		}
	}

	public void mediaTresValore(Double valor1, Double valor2, Double valor3) {
		Double resp = (valor1 + valor2 + valor3) / 3;
		resposta = Math.ceil(resp);
	}

	public void areaTriangulo(Double base, Double altura) {
		resposta = (base*altura)/2;
	}

	public Double exibirResposta() {
		return resposta;
	}
}
