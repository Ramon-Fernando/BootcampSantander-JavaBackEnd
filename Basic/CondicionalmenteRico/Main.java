package Basic.CondicionalmenteRico;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int saldoTotal = sc.nextInt();
    int valorSaque = sc.nextInt();
    
    if (saldoTotal >= valorSaque) {
      saldoTotal -= valorSaque;
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
    } else {
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }
    
    sc.close();
  }
}
