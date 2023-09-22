package Intermediate.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunos;
	
	public GerenciadorAlunos() {
		alunos = new HashSet<>();
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void adicionarAluno(String nome, Long matricula, double media) {
		alunos.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		for (Aluno a : alunos) {
			if (a.getMatricula() == matricula) {
				alunos.remove(a);
				break;
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorNome());
		alunosPorNome.addAll(alunos);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
		alunosPorNota.addAll(alunos);
		return alunosPorNota;
	}
	
	public void exibirAlunos() {
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}
	
	
}
