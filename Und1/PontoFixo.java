package Und1;

public class PontoFixo {
	  public static double funcao(double x) {
	    // fun��o desejada
	    return x * x * x + x * x + x - 2;
	  }
	  
	  public static double g(double x) {
	    // ponto g, ou seja, a aproxima��o da solu��o
	    return -Math.sqrt(-(x*x*x) - x + 2);
	  }
	  
	  /**
	   * M�todo para calcular a solu��o de uma equa��o de ponto fixo.
	   * x0 Valor inicial para o c�lculo da solu��o.
	   * erro Erro m�ximo desejado.
	   * iteracoes N�mero m�ximo de itera��es.
	   * Valor da solu��o encontrada.
	   */
	  public static double pontoFixo(double x0, double erro, int iteracoes) {
	      double x = x0;
	      // loop que realiza o c�lculo da solu��o
	      for (int i = 0; i < iteracoes; i++) {
	        // calculando o novo x
	        double xNovo = g(x);
	        // verificando se o erro � suficientemente pequeno
	        if (Math.abs(xNovo - x) < erro) {
	          return xNovo;
	        }
	        // atualizando o valor de x
	        x = xNovo;
	      }
	      // retorna o �ltimo valor de x calculado
	      return x;
	    }
	  
	  public static void main(String[] args) {
	    double x0 = -1; // ponto inicial
	    double erro = 0.0000000001; // erro desejado
	    int iteracoes = 100; // n�mero m�ximo de itera��es
	    
	    double x = pontoFixo(x0, erro, iteracoes);
	    
	    System.out.println("Zero da fun��o: " + x);
	  }
	}