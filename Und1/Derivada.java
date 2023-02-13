package Und1;

import java.util.function.Function;

public class Derivada {

	// função para calcular a derivada de uma função f(x)
	public static double derivada(Function<Double, Double> f, double x, double h) {
		// cálculo da derivada usando a fórmula de diferenças finitas
		return (f.apply(x + h) - f.apply(x)) / h;
	}

	public static void main(String[] args) {
		// definição da função f(x)
		Function<Double, Double> f = x -> -( x * x * x) - (x * x) + 2;

		double x = 0.9; // ponto em que se deseja calcular a derivada
		double h = 0.0001; // tamanho do passo usado para o cálculo da derivada

		double df = derivada(f, x, h);

		System.out.println("Derivada da função f(x) em x = " + x + ": " + df);
	}
}
