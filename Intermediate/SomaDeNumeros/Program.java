package Intermediate.SomaDeNumeros;

public class Program {

	public static void main(String[] args) {

		SomaNumeros somaNumeros = new SomaNumeros();
		
		// Adicionando numeros a lista
		
		somaNumeros.adicionarNumero(55);
		somaNumeros.adicionarNumero(68);
		somaNumeros.adicionarNumero(90);
		somaNumeros.adicionarNumero(88);
		somaNumeros.adicionarNumero(45);
		somaNumeros.adicionarNumero(41);
		
		somaNumeros.exibirNumeros();
		
		// Calculando soma
		System.out.println("--- Resultado da soma ---");
		System.out.println(somaNumeros.calcularSoma());
		
		// Encontrando maior numero
		System.out.println("--- Resultado do maior número ---");
		System.out.println(somaNumeros.encontrarMaiorNumero());
		
		// Encontrando menor numero
		
		System.out.println("--- Resultado da soma ---");
		System.out.println(somaNumeros.encontrarMenorNumero());

	}

}
