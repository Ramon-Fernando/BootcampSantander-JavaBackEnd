package Intermediate.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}

	public List<Pessoa> getPessoaList() {
		return pessoaList;
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		if (!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorIdade, new ComparatorPorIdade());
			return pessoasPorIdade;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		if (!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
			return pessoasPorAltura;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public List<Pessoa> ordenarPorNome() {
		List<Pessoa> pessoasPorNome = new ArrayList<>(pessoaList);
		if (!pessoaList.isEmpty()) {
			Collections.sort(pessoasPorNome, new ComparatorPorNome());
			return pessoasPorNome;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

}
