package Und1;

public class Secante {

	  public static double funcao(double x) {
	    // aqui é definida a função desejada
	    return x * x * x - x * x + 2;
	  }

	  public static double secante(double x0, double x1, double erro, int iteracoes) {
	    // loop que realiza o cálculo da raiz da função
	    double x2 = 0;
	    for (int i = 0; i < iteracoes; i++) {
	      // calculando o próximo valor de x
	      x2 = x1 - funcao(x1) * (x1 - x0) / (funcao(x1) - funcao(x0));
	      if (Math.abs(funcao(x2)) < erro) {
	        return x2;
	      }
	      // atualizando os valores de x0 e x1
	      x0 = x1;
	      x1 = x2;
	    }
	    return x2;
	  }

	  public static void main(String[] args) {
	    double x0 = -1.5; // valor inicial x0
	    double x1 = -0.5; // valor inicial x1
	    double erro = 0.0000000001; // erro desejado
	    int iteracoes = 100;

	    double x = secante(x0, x1, erro, iteracoes);

	    System.out.println("Zero da função: " + x);
	  }
	}