package Basic.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the agency number: ");
		String agency = sc.next();
		
		System.out.println("Enter the client name: ");
		String clientName = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter the balance: ");
		double balance = sc.nextDouble();
		
		Conta account = new Conta(number, agency, clientName, balance);
		
		System.out.println("Olá " + account.getClientName() + " obrigado por criar uma conta em nosso banco, sua agência é "
				+ account.getAgency() + ", conta " + account.getNumber() + " e seu saldo " + account.getBalance() 
				+ " já está disponível para saque.");
		
		sc.close();

	}

}
