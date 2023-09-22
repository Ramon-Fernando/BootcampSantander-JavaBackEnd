package Intermediate.ListaDeAlunos;

public class Program {

	public static void main(String[] args) {
		//Testando
		
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		//Adicionando alunos
		
		gerenciadorAlunos.adicionarAluno("Luan", 457690l, 9.45);
		gerenciadorAlunos.adicionarAluno("Veronica", 457691l, 5.60);
		gerenciadorAlunos.adicionarAluno("Marcela", 457692l, 7.90);
		gerenciadorAlunos.adicionarAluno("Lais", 457693l, 4.80);
		gerenciadorAlunos.adicionarAluno("Ruth", 457694l, 2.76);
		gerenciadorAlunos.adicionarAluno("Joao", 457695l, 10);
		
		System.out.println("--- Alunos ---");
		gerenciadorAlunos.exibirAlunos();
		System.out.println();
		
		//Removendo
		System.out.println("--- Removendo Veronica e Marcela por matrícula ---");
		gerenciadorAlunos.removerAluno(457691l);
		gerenciadorAlunos.removerAluno(457692l);
		gerenciadorAlunos.exibirAlunos();
		System.out.println();
		
		//Exibindo por nome
		System.out.println("--- Alunos por nome ---");
		for (Aluno a : gerenciadorAlunos.exibirAlunosPorNome()) {
			System.out.println(a);
		}
		System.out.println();
		
		//Exibindo por nota
		System.out.println("--- Alunos por nota ---");
		for (Aluno a :gerenciadorAlunos.exibirAlunosPorNota()) {
			System.out.println(a);
		}
		System.out.println();
		

	}

}
