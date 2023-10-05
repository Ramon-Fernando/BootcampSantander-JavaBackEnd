package Intermediate.CofresSeguros;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Lê o tipo de cofre (primeira linha da entrada)
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();

		// TODO: Implemente a condição necessário para a verificação dos cofres seguros:
		if (tipoCofre.equalsIgnoreCase("digital")) {
			int senha = scanner.nextInt();
			CofreDigital cofreDigital = new CofreDigital(senha);

			System.out.println("Tipo: " + cofreDigital.tipo);
			System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);

			int confirmacaoSenha = scanner.nextInt();

			if (cofreDigital.validarSenha(confirmacaoSenha)) {
				System.out.println("Cofre aberto!");
			} else {
				System.out.println("Senha incorreta!");
			}
		}

		if (tipoCofre.equalsIgnoreCase("fisico")) {
			CofreFisico cofreFisico = new CofreFisico();
			System.out.println("Tipo: " + cofreFisico.tipo);
			System.out.println("Metodo de abertura: " + cofreFisico.metodoAbertura);
		}

		scanner.close();
	}

}