package Basic.OrganizandoSeusAtivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ativos = new ArrayList<>();
		
		int quantidadeAtivos = sc.nextInt();
		sc.nextLine();
	
		for (int i = 0; i < quantidadeAtivos; i++) {
			String codigoAtivo = sc.nextLine();
			ativos.add(codigoAtivo);
		}

		Collections.sort(ativos);

		for (String codigoAtivo : ativos) {
			System.out.println(codigoAtivo);
		}
		
		sc.close();
	}
}