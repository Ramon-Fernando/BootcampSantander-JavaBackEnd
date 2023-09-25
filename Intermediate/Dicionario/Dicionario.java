package Intermediate.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionario;
	
	public Dicionario() {
		dicionario = new HashMap<>();
	}

	public Map<String, String> getDicionario() {
		return dicionario;
	}

	public void setDicionario(Map<String, String> dicionario) {
		this.dicionario = dicionario;
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		dicionario.remove(palavra);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String palavraPesquisada = null;
		if (dicionario.containsKey(palavra)) {
			palavraPesquisada = dicionario.get(palavra);
		}
		return palavraPesquisada;
	}
	
	public void exibirPalavras() {
		for (Map.Entry<String, String> palavraDefinicao : dicionario.entrySet()) {
			System.out.println("Palavra: " + palavraDefinicao.getKey() + ". Definição: " + palavraDefinicao.getValue());
		}
	}
}
