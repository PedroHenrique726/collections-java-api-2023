package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean concluido;
	
	public Tarefa(String descricao, boolean concluido) {
		this.descricao = descricao;
		this.concluido = concluido;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluido() {
		return concluido;
	}

	
	public  void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", concluido=" + concluido + "]";
	}
	
	
	
	
}
