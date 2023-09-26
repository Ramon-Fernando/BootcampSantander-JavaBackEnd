package Intermediate.LivrariaOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {

	private Map<String, Livro> livrosDisponiveis;

	public LivrariaOnline() {
		livrosDisponiveis = new HashMap<>();
	}

	public Map<String, Livro> getLivrosDisponiveis() {
		return livrosDisponiveis;
	}

	public void setLivrosDisponiveis(Map<String, Livro> livrosDisponiveis) {
		this.livrosDisponiveis = livrosDisponiveis;
	}

	public void adicionarLivro(String link, String titulo, String autor, Double preco) {
		livrosDisponiveis.put(link, new Livro(titulo, autor, preco));
	}

	public void removerLivro(String titulo) {
		for (Map.Entry<String, Livro> livros : livrosDisponiveis.entrySet()) {
			if (livros.getValue().getTitulo().equals(titulo)) {
				livrosDisponiveis.remove(livros.getKey());
				break;
			}
		}
	}

	public void exibirLivroOrdenadosPorPreco() {
		Map<String, Livro> livrosOrdenados = new TreeMap<>(new ComparatorPreco(livrosDisponiveis));
		livrosOrdenados.putAll(livrosDisponiveis);
		for (Livro livro : livrosOrdenados.values()) {
			System.out.println(livro);
		}
	}

	public List<Livro> pesquisarLivrosPorAutor(String autor) {
		List<Livro> livrosDoAutor = new ArrayList<>();
		for (Livro livro : livrosDisponiveis.values()) {
			if (autor.equalsIgnoreCase(livro.getAutor())) {
				livrosDoAutor.add(livro);
			}
		}
		return livrosDoAutor;
	}
	
	public Livro obterLivroMaisCaro() {
		TreeMap<String, Livro> livrosOrdenados = new TreeMap<>(new ComparatorPreco(livrosDisponiveis));
		livrosOrdenados.putAll(livrosDisponiveis);
		return livrosOrdenados.lastEntry().getValue();
	}
	
	public Livro obterLivroMaisBarato() {
		TreeMap<String, Livro> livrosOrdenados = new TreeMap<>(new ComparatorPreco(livrosDisponiveis));
		livrosOrdenados.putAll(livrosDisponiveis);
		return livrosOrdenados.firstEntry().getValue();
	}

}
