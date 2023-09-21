package Intermediate.CarrinhoCompras;

public class Program {

	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		//Adicionando produtos ao carrinho
		
		carrinhoDeCompras.adicionarItem("Escova", 15.50, 3);
		carrinhoDeCompras.adicionarItem("Pasta de dente", 8, 2);
		carrinhoDeCompras.adicionarItem("Fio dental", 10, 1);
		carrinhoDeCompras.adicionarItem("Enxaguante", 25.99, 1);
		carrinhoDeCompras.adicionarItem("Shampoo", 19.99, 2);
		
		//Listando itens
		
		carrinhoDeCompras.exibirItens();
		
		//Removendo itens do carrinho
		
		carrinhoDeCompras.removerItem("PASTA DE DENTE");
		carrinhoDeCompras.removerItem("Fio Dental");
		
		carrinhoDeCompras.exibirItens();
		
		//Calcular valor total
		
		Double total = carrinhoDeCompras.calcularValorTotal();
		System.out.println("--- Valor total ---");
		System.out.println(total);

	}

}
