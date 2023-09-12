package Basic.EquilibrandoOSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAtual = sc.nextDouble();
        double valorDeposito = sc.nextDouble();
        double valorRetirada = sc.nextDouble();

       
        saldoAtual += valorDeposito - valorRetirada;
     
      System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtual);
      
      sc.close();
    }
}