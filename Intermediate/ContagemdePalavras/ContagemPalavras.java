package Intermediate.ContagemdePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> palavrasContagem;
	
	public ContagemPalavras() {
		palavrasContagem = new HashMap<>();
	}

	public Map<String, Integer> getPalavrasContagem() {
		return palavrasContagem;
	}

	public void setPalavrasContagem(Map<String, Integer> palavrasContagem) {
		this.palavrasContagem = palavrasContagem;
	}

	public void adicionarPalavra(String palavra, Integer contagem) {
		palavrasContagem.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		palavrasContagem.remove(palavra);
	}
	
	public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){
		Map.Entry<String, Integer> palavraMaisFrequente = null;
		Integer frequencia = Integer.MIN_VALUE;
		for (Map.Entry<String,Integer> palavraEQuantidade : palavrasContagem.entrySet()) {
			if(palavraEQuantidade.getValue() > frequencia) {
				palavraMaisFrequente = palavraEQuantidade;
				frequencia = palavraEQuantidade.getValue();
			}
		}
		return palavraMaisFrequente;
	}
	
	public void exibirContagemPalavras() {
		for (Map.Entry<String, Integer> palavraEQuantidade : palavrasContagem.entrySet()) {
			System.out.println("Palavra: " + palavraEQuantidade.getKey() + ". Quantidade: " + palavraEQuantidade.getValue());
		}
	}
	
}