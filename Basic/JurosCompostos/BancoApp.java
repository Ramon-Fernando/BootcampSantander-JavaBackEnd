package Basic.JurosCompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();    
        double taxaJuros = scanner.nextDouble();      
        int periodo = scanner.nextInt();
        
        double valorFinal = Calculadora.calcularInvestimento(valorInicial, periodo, taxaJuros);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
