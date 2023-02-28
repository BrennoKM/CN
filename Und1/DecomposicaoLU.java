package Und1;

import java.util.Arrays;

public class DecomposicaoLU {

	    public static void main(String[] args) {
	        // Definindo a matriz dos coeficientes
	        double[][] A = {{1, 2, 3}, {2, 5, 2}, {6, 2, 4}};
	        
	        // Aplicando a decomposi��o LU
	        double[][][] LU = decomporLU(A);
	        double[][] L = LU[0];
	        double[][] U = LU[1];
	        
	        // Exibindo as matrizes L e U
	        System.out.println("Matriz L:");
	        exibirMatriz(L);
	        
	        System.out.println("Matriz U:");
	        exibirMatriz(U);
	        
	        // Resolvendo o sistema Ly = b
	        double[] b = {6, 5, 7};
	        double[] y = resolverSistema(L, b);
	        
	        // Resolvendo o sistema Ux = y
	        double[] x = resolverSistema(U, y);
	        
	        // Exibindo a solu��o
	        System.out.println("Solu��o: " + Arrays.toString(x));
	    }

	    // M�todo que executa a decomposi��o LU de uma matriz
	    public static double[][][] decomporLU(double[][] A) {
	        int n = A.length;
	        double[][] L = new double[n][n];
	        double[][] U = new double[n][n];
	        
	        // Inicializando a matriz L com a diagonal principal igual a 1
	        for (int i = 0; i < n; i++) {
	            L[i][i] = 1;
	        }
	        
	        // Executando a decomposi��o LU
	        for (int j = 0; j < n; j++) {
	            for (int i = 0; i <= j; i++) {
	                double soma1 = 0;
	                for (int k = 0; k < i; k++) {
	                    soma1 += L[i][k] * U[k][j];
	                }
	                U[i][j] = A[i][j] - soma1;
	            }
	            for (int i = j + 1; i < n; i++) {
	                double soma2 = 0;
	                for (int k = 0; k < j; k++) {
	                    soma2 += L[i][k] * U[k][j];
	                }
	                L[i][j] = (A[i][j] - soma2) / U[j][j];
	            }
	        }
	        
	        // Retornando as matrizes L e U em um array
	        double[][][] LU = {L, U};
	        return LU;
	    }

	    // M�todo que resolve um sistema linear do tipo Ax = b
	    // onde A � uma matriz triangular e b � um vetor
	    public static double[] resolverSistema(double[][] A, double[] b) {
	        int n = A.length;
	        double[] x = new double[n];
	        
	        // Solucionando o sistema a partir da �ltima linha da matriz
	        for (int i = n - 1; i >= 0; i--) {
	        	double soma = 0;
	        	for (int j = i + 1; j < n; j++) {
	        	soma += A[i][j] * x[j];
	        	}
	        	x[i] = (b[i] - soma) / A[i][i];
	        	}
	        return x;
	    }

	    // M�todo que exibe uma matriz
	    public static void exibirMatriz(double[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
}
