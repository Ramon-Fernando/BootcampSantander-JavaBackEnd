package Intermediate.Dicionario;

public class Program {

	public static void main(String[] args) {
		// Adicionando palavras
		
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Amizade", "Relação de carinho, confiança e afeto entre pessoas que se gostam e se apoiam mutuamente");
		dicionario.adicionarPalavra("Casa", "Um edifício ou lugar onde alguém vive; uma residência");
		dicionario.adicionarPalavra("Aventura", "Uma experiência emocionante ou arriscada; uma jornada cheia de desafios e surpresas");
		dicionario.adicionarPalavra("Natureza", "O mundo natural ao nosso redor, incluindo plantas, animais, paisagens e fenômenos naturais, como o clima");
		dicionario.adicionarPalavra("Felicidade", "Um estado emocional de contentamento, alegria e satisfação com a vida e as circunstâncias atuais");
		
		System.out.println("--- Exibindo palavras do dicionário ---");
		dicionario.exibirPalavras();
		System.out.println();
		
		//Removendo palavras
		dicionario.removerPalavra("Aventura");
		dicionario.removerPalavra("Natureza");
		
		System.out.println("--- Exibindo após remoção ---");
		dicionario.exibirPalavras();
		System.out.println();
		
		//Pesquisando por palavra
		System.out.println("--- Pesquisa da palavra Amizade ---");
		System.out.println(dicionario.pesquisarPorPalavra("Amizade"));

		
	}

}
