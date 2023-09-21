package Intermediate.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefas;

	public ListaTarefas() {
		tarefas = new HashSet<>();
	}

	public Set<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(Set<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefas.remove(t);
			}
		}
	}

	public void exibirTarefas() {
		for (Tarefa t : tarefas) {
			System.out.println(t);
		}
	}

	public int contarTarefas() {
		return tarefas.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : tarefas) {
			if (t.isConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : tarefas) {
			if (!t.isConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
			}
		}
	}

	public void marcarTarefaPendentes(String descricao) {
		for (Tarefa t : tarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(false);
			}
		}

	}

	public void limparListaTarefas() {
		tarefas.clear();
	}

}
