package Intermediate.LivrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPreco implements Comparator<String> {

	private Map<String, Livro> livros;
	
	public ComparatorPreco(Map<String, Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int compare(String o1, String o2) {
		return Double.compare(livros.get(o1).getPreço(), livros.get(o2).getPreço());
	}
	
	
	


	

	

	

}
