package Intermediate.ContagemdePalavras;

import java.util.Map;

public class Program {

	public static void main(String[] args) {
		//Adicionando palavras
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.adicionarPalavra("Suco", 7);
		contagemPalavras.adicionarPalavra("Carro", 15);
		contagemPalavras.adicionarPalavra("Computador", 6);
		contagemPalavras.adicionarPalavra("Montanha", 10);
		contagemPalavras.adicionarPalavra("Felicidade", 9);
		
		System.out.println("--- Exibindo palavras ---");
		contagemPalavras.exibirContagemPalavras();
		System.out.println();
		
		System.out.println("--- Palavras removidas --- ");
		contagemPalavras.removerPalavra("Suco");
		contagemPalavras.removerPalavra("Montanha");
		contagemPalavras.exibirContagemPalavras();
		System.out.println();
		
		System.out.println("--- Palavra com mais ocorrência ---");
		Map.Entry<String, Integer> palavraOcorrencia = contagemPalavras.encontrarPalavraMaisFrequente();
		System.out.println("Palavra: " + palavraOcorrencia.getKey() + ". Ocorrência: " + palavraOcorrencia.getValue());

	}

}
