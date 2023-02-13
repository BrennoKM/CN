package Und1;

public class PontoFixo {
	  public static double funcao(double x) {
	    // função desejada
	    return x * x * x + x * x + x - 2;
	  }
	  
	  public static double g(double x) {
	    // ponto g, ou seja, a aproximação da solução
	    return -Math.sqrt(-(x*x*x) - x + 2);
	  }
	  
	  /**
	   * Método para calcular a solução de uma equação de ponto fixo.
	   * x0 Valor inicial para o cálculo da solução.
	   * erro Erro máximo desejado.
	   * iteracoes Número máximo de iterações.
	   * Valor da solução encontrada.
	   */
	  public static double pontoFixo(double x0, double erro, int iteracoes) {
	      double x = x0;
	      // loop que realiza o cálculo da solução
	      for (int i = 0; i < iteracoes; i++) {
	        // calculando o novo x
	        double xNovo = g(x);
	        // verificando se o erro é suficientemente pequeno
	        if (Math.abs(xNovo - x) < erro) {
	          return xNovo;
	        }
	        // atualizando o valor de x
	        x = xNovo;
	      }
	      // retorna o último valor de x calculado
	      return x;
	    }
	  
	  public static void main(String[] args) {
	    double x0 = -1; // ponto inicial
	    double erro = 0.0000000001; // erro desejado
	    int iteracoes = 100; // número máximo de iterações
	    
	    double x = pontoFixo(x0, erro, iteracoes);
	    
	    System.out.println("Zero da função: " + x);
	  }
	}