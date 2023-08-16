package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	public void adicionarAluno(String nome, Long matricula, double media) {

		alunoSet.add(new Aluno(nome, media, matricula));

	}

	public void removerAluno(long matricula) {
		Aluno removerAluno = null;

		for (Aluno a : alunoSet) {
			if (a.getMatricula() == matricula) {
				removerAluno = a;
			}
		}
		alunoSet.remove(removerAluno);

	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
		alunoPorNota.addAll(alunoSet);
		return alunoPorNota;
	}
	
	public Set<Aluno> exibirAlunos(){
		return alunoSet;
	}
	
	  public static void main(String[] args) {
		    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

		    gerenciadorAlunos.adicionarAluno("Aluno 1", 123456l, 6d);
		    gerenciadorAlunos.adicionarAluno("Aluno 2", 1234567l, 8d);
		    gerenciadorAlunos.adicionarAluno("Aluno 3", 12345678l, 1d);
		    gerenciadorAlunos.adicionarAluno("Aluno 4", 123456789l, 9d);
		    System.out.println(gerenciadorAlunos.alunoSet);

		    gerenciadorAlunos.removerAluno(000l);
		    gerenciadorAlunos.removerAluno(123456789l);
		    System.out.println(gerenciadorAlunos.alunoSet);

		    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

		    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
		  }	

}
