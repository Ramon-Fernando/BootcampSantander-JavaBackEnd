package Basic.JurosCompostos;

public class Calculadora {

	public static double calcularInvestimento(double valorInicial, int periodo, double taxaJuros) {
	      for (int i = 0; i < periodo; i++) {
	          valorInicial += valorInicial * taxaJuros;
	        }
	      return valorInicial;
	    }
}
