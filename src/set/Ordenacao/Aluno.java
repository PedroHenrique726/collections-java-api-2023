package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private double nota;
	private long matricula;
	public Aluno(String nome, double nota, long matricula) {
		this.nome = nome;
		this.nota = nota;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public double getNota() {
		return nota;
	}
	public long getMatricula() {
		return matricula;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota + ", matricula=" + matricula + "]";
	}
	@Override
	public int compareTo(Aluno o) {
		return nome.compareTo(o.getNome());
	}

	
	
	
}

	class ComparatorPorNota implements Comparator<Aluno>{

		@Override
		public int compare(Aluno o1, Aluno o2) {
			return Double.compare(o1.getNota(), o2.getNota());
		}
		
	}