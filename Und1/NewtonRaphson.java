package Und1;

public class NewtonRaphson {
	public static double funcao(double x) {
		// aqui � definida a fun��o desejada
		return x * x * x - x * x + 2;
	}

	public static double derivada(double x) {
		// aqui � definida a derivada da fun��o desejada
		return 3 * x * x + 2 * x;
	}

	public static double newton(double x0, double erro, int iteracoes) {
		// loop que realiza o c�lculo da raiz da fun��o
		double x = x0;
		for (int i = 0; i < iteracoes; i++) {
			// encontrando o pr�ximo valor de x
			double x1 = x - funcao(x) / derivada(x);

			if (Math.abs(x1 - x) < erro) {
				return x1;
			}
			x = x1;
		}
		return x;
	}

	public static void main(String[] args) {
		double x0 = -1; // chute inicial
		double erro = 0.0000000001; // erro desejado
		int iteracoes = 100;

		double x = newton(x0, erro, iteracoes);

		System.out.println("Zero da fun��o: " + x);
	}
}
