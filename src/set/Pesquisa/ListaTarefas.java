package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		tarefaSet.add(tarefa);
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for (Tarefa t : tarefaSet) {
	        if (t.getDescricao().equalsIgnoreCase(descricao)) {
	          tarefaParaRemover = t;
	          break;
	        }
		}
	}
	
	public void exibirTarefas(){
		System.out.println(tarefaSet);
	}
	
	public void contarTarefas() {
		
		System.out.println("A lista possui: " + tarefaSet.size() + " tarefas.");
		
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(t.isConcluido()) {
				tarefasConcluidas.add(t);
			}
		}
		
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(!t.isConcluido()) {
				tarefasPendentes.add(t);
			}
		}
		
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluido(true);
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluido(false);
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefaSet.clear();
	}
	
	 public static void main(String[] args) {
		    ListaTarefas listaTarefas = new ListaTarefas();

		    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1", false));
		    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2", false));
		    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3", false));
		    listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4", false));
		    listaTarefas.exibirTarefas();

		    listaTarefas.removerTarefa("Tarefa 55");
		    listaTarefas.exibirTarefas();

		    listaTarefas.contarTarefas();

		    System.out.println(listaTarefas.obterTarefasConcluidas());

		    System.out.println(listaTarefas.obterTarefasPendentes());

		    listaTarefas.marcarTarefaConcluida("Tarefa 2");
		    listaTarefas.marcarTarefaConcluida("Tarefa 1");
		    listaTarefas.exibirTarefas();
		    listaTarefas.limparListaTarefas();
		    listaTarefas.exibirTarefas();
		  }
	
}
