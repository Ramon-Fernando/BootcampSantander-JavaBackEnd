package Intermediate.OrdenacaoDePessoas;

public class Program {

	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoPessoas
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		ordenacaoPessoas.adicionarPessoa("Alice", 40, 1.85);
		ordenacaoPessoas.adicionarPessoa("David", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("Bob", 17, 1.90);

		// Exibindo a lista de pessoas adicionadas
		System.out.println("--- Lista de pessoas adicionadas ---");
		System.out.println(ordenacaoPessoas.getPessoaList());
		System.out.println();

		// Ordenando e exibindo por idade
		System.out.println("--- Ordenadas por idade ---");
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println();

		// Ordenando e exibindo por altura
		System.out.println("--- Ordenadas por altura ---");
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
		System.out.println();
		
		// Ordenando e exibindo por nome
		System.out.println("--- Ordenadas por nome ---");
		System.out.println(ordenacaoPessoas.ordenarPorNome());
		System.out.println();

	}

}
