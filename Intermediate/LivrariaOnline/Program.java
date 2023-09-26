package Intermediate.LivrariaOnline;

public class Program {

	public static void main(String[] args) {
		//Adicionando livros
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		
		livrariaOnline.adicionarLivro("http://linkteste1.com.br", "O Código Da Vinci", "Dan Brown", 20.50);
		livrariaOnline.adicionarLivro("http://linkteste2.com.br", "A Menina que Roubava Livros", "Markus Zusak", 35.40);
		livrariaOnline.adicionarLivro("http://linkteste3.com.br", "1984", "George Orwell", 27.60);
		livrariaOnline.adicionarLivro("http://linkteste4.com.br", "Orgulho e Preconceito", "Jane Austen", 15.60);
		livrariaOnline.adicionarLivro("http://linkteste5.com.br", "Harry Potter e a Pedra Filosofal", "J.K.Rowling", 30.99);
		livrariaOnline.adicionarLivro("http://linkteste6.com.br", "Harry Potter e o Enigma do Principe", "J.K.Rowling", 14.99);
		
		System.out.println("--- Livros disponíveis ---");
		livrariaOnline.exibirLivroOrdenadosPorPreco();
		System.out.println();
		
		System.out.println("--- Removendo livros ---");
		livrariaOnline.removerLivro("O Código Da Vinci");
		livrariaOnline.exibirLivroOrdenadosPorPreco();
		System.out.println();
		
		System.out.println("--- Livros da J.K --- ");
		System.out.println(livrariaOnline.pesquisarLivrosPorAutor("J.K.Rowling"));
		System.out.println();
		
		System.out.println("--- Livro mais caro ---");
		System.out.println(livrariaOnline.obterLivroMaisCaro());
		System.out.println();
		
		System.out.println("--- Livro mais barato ---");
		System.out.println(livrariaOnline.obterLivroMaisBarato());
		System.out.println();

	}

}
