package Und1;

public class Bissecao {

	public static double funcao(double x) {
		// aqui � definida a fun��o desejada
		return x * x * x - x * x + 2;
	}

	public static double bissecao(double a, double b, double erro, int iteracoes) {
		// loop que realiza o c�lculo da raiz da fun��o
		double x = 0;
		for (int i = 0; i < iteracoes; i++) {
			// encontrando o ponto m�dio do intervalo
			x = (a + b) / 2;
			
			if (Math.abs(funcao(x)) < erro) {
				return x;
			}
			// verificando se a raiz est� no intervalo [a, x]
			if (funcao(a) * funcao(x) < 0) {
				// se sim, atualiza o valor de b
				b = x;
			} else {
				// se n�o, atualiza o valor de a
				a = x;
			}
		}
		return x;
		
	}

	public static void main(String[] args) {
		double a = -2; // limite inferior do intervalo
		double b = -1; // limite superior do intervalo
		double erro = 0.0000000001; // erro desejado
		int iteracoes = 100;

		double x = bissecao(a, b, erro, iteracoes);

		System.out.println("Zero da fun��o: " + x);
	}
}