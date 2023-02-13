package Und1;

public class FalsaPosicao {
	public static double funcao(double x) {
		// aqui é definida a função desejada
		return x * x * x + x * x + x - 2;
	}

	public static double falsaPosicao(double a, double b, double erro, int iteracoes) {
		// loop que realiza o cálculo da raiz da função
		double x = 0;
		for (int i = 0; i < iteracoes; i++) {
			x = b - (funcao(b) * (a - b)) / (funcao(a) - funcao(b));
			
			if (Math.abs(funcao(x)) < erro) {
				return x;
			}

			if (funcao(a) * funcao(x) < 0) {
				b = x;
			} else {
				a = x;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		double a = 0; // limite inferior do intervalo
		double b = 1; // limite superior do intervalo
		double erro = 0.0000000001; // erro desejado
		int iteracoes = 100;

		double x = falsaPosicao(a, b, erro, iteracoes);

		System.out.println("Zero da função: " + x);
	}
}