package Intermediate.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		itens = new ArrayList<>();
	}

	public List<Item> getItens() {
		return itens;
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<>();
		for (Item i : itens) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itensRemover.add(i);
			}
		}
		itens.removeAll(itensRemover);
	}
	
	public Double calcularValorTotal() {
		Double valorTotal = 0.0;
		for (Item i : itens) {
			valorTotal += i.getPreco() * i.getQuantidade();
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println("--- Itens presentes no carrinho ---");
		
		for(Item i : itens) {
			System.out.println(i);
		}
	}
	
}
