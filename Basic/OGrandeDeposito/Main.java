package Basic.OGrandeDeposito;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor > 0) {
			System.out.printf("Deposito realizado com sucesso!%nSaldo atual: R$ %.2f%n", valor);
		} else if (valor == 0) {
			System.out.println("Encerrando o programa...");
		} else {
			System.out.println("Valor invalido! Digite um valor maior que zero.");
		}
		
		sc.close();
	}
}