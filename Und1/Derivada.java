package Und1;

import java.util.function.Function;

public class Derivada {

	// fun��o para calcular a derivada de uma fun��o f(x)
	public static double derivada(Function<Double, Double> f, double x, double h) {
		// c�lculo da derivada usando a f�rmula de diferen�as finitas
		return (f.apply(x + h) - f.apply(x)) / h;
	}

	public static void main(String[] args) {
		// defini��o da fun��o f(x)
		Function<Double, Double> f = x -> -( x * x * x) - (x * x) + 2;

		double x = 0.9; // ponto em que se deseja calcular a derivada
		double h = 0.0001; // tamanho do passo usado para o c�lculo da derivada

		double df = derivada(f, x, h);

		System.out.println("Derivada da fun��o f(x) em x = " + x + ": " + df);
	}
}
