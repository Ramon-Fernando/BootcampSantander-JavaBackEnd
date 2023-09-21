package Intermediate.ListaDeTarefas;

public class Program {

	public static void main(String[] args) {
		
		ListaTarefas listaTarefas = new ListaTarefas();
		
		//Adicionando tarefas
		listaTarefas.adicionarTarefa("Limpar a casa");
		listaTarefas.adicionarTarefa("Preparar comida");
		listaTarefas.adicionarTarefa("Estudar");
		listaTarefas.adicionarTarefa("Ir ao mercado");
		listaTarefas.adicionarTarefa("Fazer exercícios");
		listaTarefas.adicionarTarefa("Jogar o lixo fora");
		
		//Mostrando elementos
		System.out.println("--- Lista de tarefas ---");
		listaTarefas.exibirTarefas();
		System.out.println();
		
		//Contando
		System.out.println("Número total de tarefas: ");
		System.out.println(listaTarefas.contarTarefas());
		
		//Marcando tarefas concluídas
		listaTarefas.marcarTarefaConcluida("Ir ao mercado");
		listaTarefas.marcarTarefaConcluida("Preparar comida");
		listaTarefas.marcarTarefaConcluida("Jogar o lixo fora");
		
		//Tarefas concluídas
		System.out.println("--- Tarefas concluídas ---");
		ListaTarefas tarefasConcluidas = new ListaTarefas();
		tarefasConcluidas.setTarefas(listaTarefas.obterTarefasConcluidas());
		tarefasConcluidas.exibirTarefas();
		System.out.println();
		
		//Tarefas pendentes
		System.out.println("--- Tarefas pendentes ---");
		ListaTarefas tarefasPendentes = new ListaTarefas();
		tarefasPendentes.setTarefas(listaTarefas.obterTarefasPendentes());
		tarefasPendentes.exibirTarefas();
		System.out.println();
		
		//Limpando lista
		listaTarefas.limparListaTarefas();

	}

}
