package Intermediate.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> numeros;
	
	public SomaNumeros() {
		numeros = new ArrayList<>();
	}

	public List<Integer> getNumeros() {
		return numeros;
	}
	
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int somaTotal = 0;
		for (int n : numeros) {
			somaTotal += n;
		}
		return somaTotal;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = 0;
		for (int n : numeros) {
			if (n > maiorNumero) {
				maiorNumero = n;
			}
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		for (int n : numeros) {
			if (n < menorNumero) {
				menorNumero = n;
			}
		}
		return menorNumero;
	}
	
	public void exibirNumeros() {
		System.out.println("--- Numeros da lista ---");
		for (int n : numeros) {
			System.out.println(n);
		}
	}
}
