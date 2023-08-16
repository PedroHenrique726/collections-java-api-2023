package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private double altura;
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, o.getIdade());
	}	
	
}

	class ComparatorPorAltura implements Comparator<Pessoa>{

		@Override
		public int compare(Pessoa o1, Pessoa o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getAltura(), o2.getAltura());
		}
		
	}
